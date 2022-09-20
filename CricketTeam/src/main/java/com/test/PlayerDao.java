package com.test;

import java.sql.Statement;

public class PlayerDao {
	public int savePlayer(Player player) {
		Statement st = null;
		try {
			String sql = "insert into cricket values("+player.getId()+", '"+player.getName()+"',"+player.getMatches()+","+player.getSocre()+","+player.getWickets()+","+player.getDucks()+",'"+player.getPlayers()+"')";
			st = Util2.getConnection().createStatement();
			return st.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
