package projekti.modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projekti.model.Kayttaja;


public class KayttajaDAO extends DataAccessObject {
	
	public Kayttaja findByName(String kayttajatunnus) {	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Kayttaja kayttaja = null; 
		try {
			conn = getConnection();
			String sqlSelect = "SELECT id, kayttajatunnus, salasana, rooli FROM Kayttaja WHERE kayttajatunnus= ?";
			stmt = conn.prepareStatement(sqlSelect);
			stmt.setString(1, kayttajatunnus);
			rs = stmt.executeQuery();
			if (rs.next()) {
				kayttaja = readKayttaja(rs);
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn);
		}
	
		return kayttaja;
	}
	
	private Kayttaja readKayttaja(ResultSet rs) {	
		try {
			int id = rs.getInt("id");
			String kayttajatunnus = rs.getString("kayttajatunnus");
			String salasana = rs.getString("salasana");
			String rooli = rs.getString("rooli");
		
			return new Kayttaja(id, kayttajatunnus, salasana, rooli);
		} catch (SQLException e) {
			throw new RuntimeException(e);
			//return new Kayttaja();
		}
	}

}
