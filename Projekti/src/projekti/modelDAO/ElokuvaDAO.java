package projekti.modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projekti.model.Elokuva;
import projekti.modelDAO.DataAccessObject;

public class ElokuvaDAO extends DataAccessObject {
	
	public void addElokuva(Elokuva elokuva) throws SQLException{
		Connection connection = null;
		PreparedStatement stmtInsert = null;
		
		try{
			connection = getConnection();
			String sqlInsert = "INSERT INTO Elokuva(id, nimi, star, genre, ohjaaja) VALUES(?,?,?,?,?)";
			stmtInsert = connection.prepareStatement(sqlInsert);
			stmtInsert.setInt(1, elokuva.getId());
			stmtInsert.setString(2, elokuva.getNimi());
			stmtInsert.setInt(3, elokuva.getStar());
			stmtInsert.setString(4, elokuva.getGenre());
			stmtInsert.setString(5, elokuva.getOhjaaja());
			stmtInsert.executeUpdate();
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtInsert, connection);
		}
	}
	
	public ArrayList<Elokuva> findAll() {	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Elokuva> elokuvat = new ArrayList<Elokuva>();
		Elokuva elokuva = null; 
		try {
			conn = getConnection();
			String sqlSelect = "SELECT id, nimi, star, genre, ohjaaja FROM Elokuva;";
			stmt = conn.prepareStatement(sqlSelect);
			rs = stmt.executeQuery(sqlSelect);
			while (rs.next()) {
				elokuva = readElokuva(rs);
				elokuvat.add(elokuva);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn);
		}
	
		return elokuvat;
	}
	
	private Elokuva readElokuva(ResultSet rs) {	
		try {
			int id = rs.getInt("id");
			String nimi = rs.getString("nimi");
			int star = rs.getInt("star");
			String genre = rs.getString("genre");
			String ohjaaja = rs.getString("ohjaaja");
		
			return new Elokuva(id, nimi, star, genre, ohjaaja);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
