import java.util.*;
import java.sql.*;
public class DBExamples {

	public static void main(String[] args) throws SQLException {
		// 1a.
		//
		// Create a DBCrud Object and a Connection to database
		DBCrud db = new DBCrud();
		Connection connection = db.getConnection();
		
		//2.
		//
		// Insert a new player
		//db.executeSQL(connection, "INSERT INTO players (id, name, goals, assists) VALUES ('4', 'Tony', '32' ,'74')");
		
		//3.
		//
		// Delete exist players
		//db.executeSQL(connection, "DELETE FROM players WHERE id = '4'");
		
		//4.
		//
		// Update a player
		//db.executeSQL(connection,"UPDATE players SET goals = '122' WHERE name = 'li'");
		
		//1b.
		//
		//Display all the values in as

		
		//5
		//
		//Create a table, add 2 records, and display it.
		db.executeSQL(connection, "CREATE TABLE game (id char(9) not null,\r\n"
				+ "  lastName varchar(15),\r\n"
				+ "  firstName varchar(15),\r\n"
				+ "  mi char(1),\r\n"
				+ "  age int,\r\n"
				+ "  address varchar(20),\r\n"
				+ "  city varchar(20),\r\n"
				+ "  state char(2),\r\n"
				+ "  telephone char(10),\r\n"
				+ "  email varchar(40),\r\n"
				+ "  primary key (id)\r\n"
				+ ")");
		ResultSet rs = db.executeSelect(connection, "SELECT * FROM game");
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
	}

}
