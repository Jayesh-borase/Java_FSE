package Assignment.IPL.dao;

import Assignment.IPL.pojo.Player;
import Assignment.IPL.JDBCFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IPLBoardDAOImpl implements IPLBoardDAO {

    @Override
    public boolean isTeamExists(String teamId) throws SQLException {
        String query = "SELECT 1 FROM teams WHERE team_id = ?";
        try (Connection conn = JDBCFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, teamId);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    @Override
    public boolean savePlayer(Player player, String teamId) throws SQLException {
        String query = "INSERT INTO players (player_name, player_role, bid_amount, team_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = JDBCFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, player.getName());
            ps.setString(2, player.getRole());
            ps.setDouble(3, player.getBidAmount());
            ps.setString(4, teamId);
            
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public List<Player> fetchPlayersByTeam(String teamId) throws SQLException {
        List<Player> players = new ArrayList<>();
        String query = "SELECT player_name, player_role, bid_amount FROM players WHERE team_id = ?";
        
        try (Connection conn = JDBCFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, teamId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Player p = new Player();
                    p.setName(rs.getString("player_name"));
                    p.setRole(rs.getString("player_role"));
                    p.setBidAmount(rs.getDouble("bid_amount"));
                    players.add(p);
                }
            }
        }
        return players;
    }
}
