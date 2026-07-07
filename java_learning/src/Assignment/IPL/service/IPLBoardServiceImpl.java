package Assignment.IPL.service;

import Assignment.IPL.dao.IPLBoardDAO;
import Assignment.IPL.dao.IPLBoardDAOImpl;
import Assignment.IPL.pojo.Player;
import Assignment.IPL.TeamNotExistException;

import java.sql.SQLException;
import java.util.List;

public class IPLBoardServiceImpl implements IPLBoardService {

    private final IPLBoardDAO dao = new IPLBoardDAOImpl();

    @Override
    public boolean addPlayerToTeam(Player p, String teamId) throws TeamNotExistException {
        try {
            if (!dao.isTeamExists(teamId)) {
                throw new TeamNotExistException("Team with ID: " + teamId + " does not exist in the board!");
            }
            return dao.savePlayer(p, teamId);
        } catch (SQLException e) {
            System.err.println("Database error processing request: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Player> getPlayers(String teamId) throws TeamNotExistException {
        try {
            if (!dao.isTeamExists(teamId)) {
                throw new TeamNotExistException("Team with ID: " + teamId + " does not exist in the board!");
            }
            return dao.fetchPlayersByTeam(teamId);
        } catch (SQLException e) {
            System.err.println("Database error processing request: " + e.getMessage());
            return List.of();
        }
    }
}
