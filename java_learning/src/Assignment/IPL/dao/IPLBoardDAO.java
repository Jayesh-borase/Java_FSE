package Assignment.IPL.dao;

import Assignment.IPL.pojo.Player;
import java.util.List;
import java.sql.SQLException;

public interface IPLBoardDAO {
    boolean isTeamExists(String teamId) throws SQLException;
    boolean savePlayer(Player player, String teamId) throws SQLException;
    List<Player> fetchPlayersByTeam(String teamId) throws SQLException;
}