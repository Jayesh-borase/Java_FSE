package Assignment.IPL.service;
import Assignment.IPL.pojo.Player;
import Assignment.IPL.TeamNotExistException;
import java.util.List;

public interface IPLBoardService {
    boolean addPlayerToTeam(Player p, String teamId) throws TeamNotExistException;
    List<Player> getPlayers(String teamId) throws TeamNotExistException;
}
