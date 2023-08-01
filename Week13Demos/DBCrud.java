// DBCrud.java
//
// This Class allows you to create a connection to a MySQL DB, 
// as well as perform CRUD, (Create, Remove, Update, and Display), 
// operations on that DB
//
// Created: 2023.07.01

import java.sql.*;
import java.util.*;

public class DBCrud {
	// Values required to connect to database
	private String userName = "root";
	private String password = "19650220";
	private String serverName = "localhost";
	private int portNumber = 3306;
	private String dbName = "team_s2";

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

	// Creates a connection to the database
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties connectionProps = new Properties();

		try {
			connectionProps.put("user", this.userName);
			connectionProps.put("password", this.password);

			conn = DriverManager.getConnection(
				"jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.dbName,
				connectionProps);
		} catch (SQLException ex) {
			throw ex;
		}

		return conn;
	}

	// executes any INSERT, DELETE, or UPDATE SQL commands
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

}