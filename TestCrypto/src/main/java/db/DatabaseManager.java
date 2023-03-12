package db;
import java.sql.*;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import beans.Stockage;

public class DatabaseManager {
	private static final ArrayList<Stockage> stockages = new ArrayList<Stockage>();
	
	private static String url="jdbc:mysql://localhost:3306/crypto_scenario?characterEncoding=latin1&useConfigs=maxPerformance";
	private static String username = "sira";
	private static String password = "Passer00";
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	static {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
		 }catch (SQLException ex){
			 System.out.println("Erreur de connexion à la base de donnée: " + ex.getMessage()) ;
		 }catch(Exception e){
			 System.out.println("Erreur de chargement du driver: " + e.getMessage());
		 }
	}
	
	public static void toConn() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
		 }catch (SQLException ex){
			 System.out.println("Erreur de connexion à la base de donnée: " + ex.getMessage()) ;
		 }catch(Exception e){
			 System.out.println("Erreur de chargement du driver: " + e.getMessage());
		 }
	}
	public static ArrayList<Stockage> getAll () {
		try {
			stockages.clear() ;
			stmt = (Statement) con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM stockage");
			while(rs.next())  {
				int id = rs.getInt("id");
				String champ = rs.getString("champ");
				
				Stockage user = new Stockage(id,champ);
				stockages.add(user);
			}
			return stockages;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		 

	}
	
	
	public static void  add (Stockage stockage) {
		try {
			stmt = (Statement) con.createStatement();
			String sql="INSERT INTO stockage (champ) VALUES (?)";
			PreparedStatement preparedStmt = con.prepareStatement(sql);
			preparedStmt.setString (1, stockage.getChamp());
			preparedStmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
