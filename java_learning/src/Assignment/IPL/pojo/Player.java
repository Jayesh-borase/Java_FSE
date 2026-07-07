package Assignment.IPL.pojo;

public class Player {
    private int id;
    private String name;
    private String role;
    private double bidAmount;

    public Player() {}

    public Player(String name, String role, double bidAmount) {
        this.name = name;
        this.role = role;
        this.bidAmount = bidAmount;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public double getBidAmount() { return bidAmount; }
    public void setBidAmount(double bidAmount) { this.bidAmount = bidAmount; }

    @Override
    public String toString() {
        return "Player [Name=" + name + ", Role=" + role + ", Bid Amount=" + bidAmount + "]";
    }
}