package Assignment.IPL;

import Assignment.IPL.pojo.Player;
import Assignment.IPL.service.IPLBoardService;
import Assignment.IPL.service.IPLBoardServiceImpl;
import Assignment.IPL.TeamNotExistException;

import java.util.List;
import java.util.Scanner;

public class TestIPL {

    public static void main(String[] args) {
        IPLBoardService iplService = new IPLBoardServiceImpl();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Welcome to the Industry Standard IPL Dashboard ===");
        
        while (true) {
            System.out.println("\n--- Dashboard Menu ---");
            System.out.println("1. Add Player to Team");
            System.out.println("2. View Team Roster");
            System.out.println("3. Exit");
            System.out.print("Select an option (1-3): ");
            
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a valid number choice.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Team ID (e.g., MI, CSK): ");
                    String teamId = scanner.nextLine().trim().toUpperCase();
                    
                    System.out.print("Enter Player Name: ");
                    String name = scanner.nextLine().trim();
                    
                    System.out.print("Enter Player Role: ");
                    String role = scanner.nextLine().trim();
                    
                    System.out.print("Enter Bid Amount: ");
                    double bidAmount = 0;
                    if (scanner.hasNextDouble()) {
                        bidAmount = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        System.out.println("Invalid amount. Player addition aborted.");
                        scanner.nextLine();
                        break;
                    }
                    
                    try {
                        Player player = new Player(name, role, bidAmount);
                        boolean isAdded = iplService.addPlayerToTeam(player, teamId);
                        if (isAdded) {
                            System.out.println("Success: Player registered to team successfully!");
                        }
                    } catch (TeamNotExistException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter Team ID to fetch roster: ");
                    String fetchTeamId = scanner.nextLine().trim().toUpperCase();
                    
                    try {
                        List<Player> roster = iplService.getPlayers(fetchTeamId);
                        if (roster.isEmpty()) {
                            System.out.println("No players currently signed to team: " + fetchTeamId);
                        } else {
                            System.out.println("\n--- " + fetchTeamId + " Player Roster ---");
                            roster.forEach(System.out::println);
                        }
                    } catch (TeamNotExistException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Shutting down core engine dashboard systems. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Unknown command processing logic context.");
            }
        }
    }
}