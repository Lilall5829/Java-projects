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
		db.executeSQL(connection,"UPDATE players SET goals = '122' WHERE name = 'li'");
		
		//1b.
		//
		//Display all the values in as
		ResultSet rs = db.executeSelect(connection, "SELECT * FROM players");
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
	}

}
