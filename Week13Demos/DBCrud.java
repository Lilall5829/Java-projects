import java.sql.*;
import java.util.*;

public class DBCrud {
	// Values required to connect to database
	private String userName = "root";
	private String password = "19650220";
	private String serverName = "localhost";
	private int portNumber = 3306;
	private String dbName = "team_s2";
	private List<Staff> staffList = new ArrayList<>();
	
    private Connection conn;
    private Statement stmt;
    
	public DBCrud() {
	}

	public DBCrud(String userName, String password, String serverName, int portNumber,
		String dbName) {
		this.userName = userName;
		this.password = password;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.dbName = dbName;
	}

	// Creates a connection to the database and load the data
	public Connection getConnection() throws SQLException {
		Properties connectionProps = new Properties();

		try {
			connectionProps.put("user", this.userName);
			connectionProps.put("password", this.password);

			conn = DriverManager.getConnection(
				"jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.dbName,
				connectionProps);
            stmt = conn.createStatement();
            loadData();
		} catch (SQLException ex) {
			throw ex;
		}

		return conn;
	}
	
	private void loadData() throws SQLException {

        String query = "SELECT * FROM staff";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            Staff staff = new Staff(
                    rs.getString("id"),
                    rs.getString("lastName"),
                    rs.getString("firstName"),
                    rs.getString("mi"),
                    rs.getInt("age"),
                    rs.getString("address"),
                    rs.getString("city"),
                    rs.getString("state"),
                    rs.getString("telephone"),
                    rs.getString("email")
            );
            staffList.add(staff);
        }

        Collections.sort(staffList);
    }

	// Executes any INSERT, DELETE, or UPDATE SQL commands
	public void executeSQL(Connection conn, String command) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(command); // Throws a SQLException if it fails
		} catch (SQLException ex) {
			throw ex;
		} finally {

			// This will run whether we throw an exception or not
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	// executes a SELECT command to return the results of a table
	public ResultSet executeSelect(Connection conn, String command) throws SQLException {
		Statement stmt = null;
		ResultSet resultSet; // ResultSet holds data from table in db

		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(command); // Throws a SQLException if it fails
			
		} catch (SQLException ex) {
			throw ex;
		}

		return resultSet;
	}
	
	public void viewStaffById(String id) {
        try {
            String query = "SELECT * FROM Staff WHERE id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                Staff staff = new Staff(
                        rs.getString("id"),
                        rs.getString("lastName"),
                        rs.getString("firstName"),
                        rs.getString("mi"),
                        rs.getInt("age"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("telephone"),
                        rs.getString("email")
                );
                System.out.println(staff);
            } else {
                System.out.println("Staff with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllStaff() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    public void insertStaff(Staff staff) {
        if (isStaffAlreadyExists(staff)) {
            System.out.println("Staff with the same first name, last name, and age already exists.");
        } else {
            try {
                String query = "INSERT INTO Staff (id, lastName, firstName, mi, age, address, city, state, telephone, email) " +
                        "VALUES ('" + staff.getId() + "', '" + staff.getLastName() + "', '" + staff.getFirstName() +
                        "', '" + staff.getMi() + "', " + staff.getAge() + ", '" + staff.getAddress() + "', '" +
                        staff.getCity() + "', '" + staff.getState() + "', '" + staff.getTelephone() + "', '" +
                        staff.getEmail() + "')";
                stmt.executeUpdate(query);

                staffList.add(staff);
                Collections.sort(staffList);
                System.out.println("Staff added successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateStaff(String id, Staff updatedStaff) {
        try {
            Staff existingStaff = findStaffById(id);
            if (existingStaff == null) {
                System.out.println("Staff with ID " + id + " not found.");
            } else {
                String query = "UPDATE Staff SET lastName='" + updatedStaff.getLastName() + "', firstName='" +
                        updatedStaff.getFirstName() + "', mi='" + updatedStaff.getMi() + "', age=" +
                        updatedStaff.getAge() + ", address='" + updatedStaff.getAddress() + "', city='" +
                        updatedStaff.getCity() + "', state='" + updatedStaff.getState() + "', telephone='" +
                        updatedStaff.getTelephone() + "', email='" + updatedStaff.getEmail() + "' WHERE id='" + id + "'";
                stmt.executeUpdate(query);

                staffList.remove(existingStaff);
                staffList.add(updatedStaff);
                Collections.sort(staffList);
                System.out.println("Staff updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStaff(String id) {
        try {
            Staff staff = findStaffById(id);
            if (staff == null) {
                System.out.println("Staff with ID " + id + " not found.");
            } else {
                String query = "DELETE FROM Staff WHERE id='" + id + "'";
                stmt.executeUpdate(query);

                staffList.remove(staff);
                System.out.println("Staff deleted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Staff findStaffById(String id) {
        for (Staff staff : staffList) {
            if (staff.getId().equals(id)) {
                return staff;
            }
        }
        return null;
    }

    private boolean isStaffAlreadyExists(Staff staff) {
        for (Staff existingStaff : staffList) {
            if (existingStaff.getFirstName().equals(staff.getFirstName())
                    && existingStaff.getLastName().equals(staff.getLastName())
                    && existingStaff.getAge() == staff.getAge()) {
                return true;
            }
        }
        return false;
    }

}