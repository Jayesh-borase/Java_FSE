package Assignment.IPL.dao;

import Assignment.IPL.pojo.Player;

public interface playerDao {
	boolean save(Player p);
	Player find(String PlayerName);
	boolean delete(String PlayerName);
}
