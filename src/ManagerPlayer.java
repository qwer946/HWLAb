import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPlayer {

    ArrayList<Players> player;
    Scanner scan = new Scanner(System.in);

    public ManagerPlayer() {

        this.player = new ArrayList<Players>();

    }

    public void createPlayer() {
        System.out.println("what is the players name?");
        String name = scan.nextLine();
        System.out.println("what is the players position?");
        String position = scan.nextLine();
        System.out.println("what is the players age?");
        Integer age = Integer.parseInt(scan.nextLine());
        System.out.println("what is the players value?");
        Double value = Double.parseDouble(scan.nextLine());
        System.out.println("what is the players ID?");
        Integer id = Integer.parseInt(scan.nextLine());
        // add players
        Players playerz = new Players(id, name, position, age, value);
        player.add(playerz);

    }

    public void readPlayers() {
        AllPlayers();

    }

    public void updatePlayer(int id) {
        Players updatePlayer;
        for (Players players : player) {
            if (players.getId() == id) {
                updatePlayer = players;
                System.out.println("what is the players name?");
                updatePlayer.setName(scan.nextLine());
                System.out.println("what is the players position?");
                updatePlayer.setPosition(scan.nextLine());
                System.out.println("what is the players age?");
                updatePlayer.setAge(Integer.parseInt(scan.nextLine()));
                System.out.println("what is the players value?");
                updatePlayer.setValue(Double.parseDouble(scan.nextLine()));

            }
        }
    }

    public void deletePlayer(int id) {
        for (int i = 0; i < player.size(); i++) {
            if (player.get(i).getId() == id) {
                player.remove(i);
                // gotta connect it to the array list


            }
        }
    }


    public void SellFc() {
        System.out.println("Welcome to the Transfer Market! \n Are you a Owner or Director?");
        String begin = scan.nextLine();
        while (begin.equalsIgnoreCase("Owner")) {
            System.out.println("Welcome Owner,\nPress B, to sell your player \nPress L to look at all bids,\nPress U to change players offer\nPress D to to cancel your transfer offer \nPress T to go to Transfer Window,\n");
            String create = scan.nextLine();
            while (begin.equalsIgnoreCase("Director")) {
                System.out.println("Welcome To the transfer Market");
                AllPlayers();
            }
            if (create.equalsIgnoreCase("B")) {
                createPlayer();
                System.out.println("You have successfully listed a player!\nDo you want to add another one? Press B");
            } else if (create.equalsIgnoreCase("L")) {
                System.out.println("Transfer List");
                AllPlayers();
            } else if (create.equalsIgnoreCase("U")) {
                System.out.println("whats the players ID to Update..");
                int id = Integer.parseInt(scan.nextLine());
                updatePlayer(id);

            } else if (create.equalsIgnoreCase("D")) {
                System.out.println("whats the players ID to delete..");
                int id = Integer.parseInt(scan.nextLine());
                deletePlayer(id);
                System.out.println("You have successfully cancelled your player offer");
            }
        }
    }


    public void AllPlayers() {
        for (int i = 0; i < player.size(); i++) {
            player.get(i).print();
        }


    }
}






