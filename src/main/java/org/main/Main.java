package org.main;

import org.character.Player;
import org.character.PlayerController;
import org.character.enums.Days;
import org.character.enums.Jobs;
import org.character.enums.Servers;
import org.creator.Static;
import org.creator.StaticMaker;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        Player player1 = new Player("1", Servers.HYPERION, Jobs.GUNBREAKER, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player1);
        Player player2 = new Player("2", Servers.HYPERION, Jobs.PALADIN, LocalTime.of(11, 0), LocalTime.of(15, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player2);
        Player player3 = new Player("3", Servers.HYPERION, Jobs.SAGE, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player3);
        Player player4 = new Player("4", Servers.HYPERION, Jobs.WHITE_MAGE, LocalTime.of(12, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player4);
        Player player5 = new Player("5", Servers.HYPERION, Jobs.SAMURAI, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player5);
        Player player6 = new Player("6", Servers.HYPERION, Jobs.MONK, LocalTime.of(13, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player6);
        Player player7 = new Player("7", Servers.HYPERION, Jobs.BARD, LocalTime.of(11, 0), LocalTime.of(20, 0), new HashSet<>(Arrays.asList(Days.SATURDAY, Days.FRIDAY, Days.SUNDAY)));
        playerController.addPlayer(player7);
        Player player8 = new Player("8", Servers.HYPERION, Jobs.SUMMONER, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player8);
        Player player9 = new Player("9", Servers.HYPERION, Jobs.GUNBREAKER, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player9);
        Player player10 = new Player("10", Servers.HYPERION, Jobs.SAGE, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player10);
        Player player11 = new Player("11", Servers.HYPERION, Jobs.ASTROLOGIAN, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player11);
        Player player12 = new Player("12", Servers.HYPERION, Jobs.WHITE_MAGE, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player12);
        Player player13 = new Player("13", Servers.HYPERION, Jobs.NINJA, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player13);
        Player player14 = new Player("14", Servers.HYPERION, Jobs.MONK, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player14);
        Player player15 = new Player("15", Servers.HYPERION, Jobs.RED_MAGE, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player15);
        Player player16 = new Player("16", Servers.HYPERION, Jobs.BLACK_MAGE, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player16);
        Player player17 = new Player("17", Servers.HYPERION, Jobs.GUNBREAKER, LocalTime.of(15, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.WEDNESDAY, Days.FRIDAY)));
        playerController.addPlayer(player17);
        Player player18 = new Player("18", Servers.HYPERION, Jobs.DARK_KNIGHT, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY)));
        playerController.addPlayer(player18);
        Player player19 = new Player("19", Servers.HYPERION, Jobs.MACHINIST, LocalTime.of(12, 0), LocalTime.of(15, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY, Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player19);
        Player player20 = new Player("20", Servers.HYPERION, Jobs.DANCER, LocalTime.of(11, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player20);
        Player player = new Player("21", Servers.HYPERION, Jobs.SAMURAI, LocalTime.of(16, 0), LocalTime.of(18, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY, Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("22", Servers.HYPERION, Jobs.GUNBREAKER, LocalTime.of(8, 0), LocalTime.of(14, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("23", Servers.HYPERION, Jobs.WARRIOR, LocalTime.of(3, 0), LocalTime.of(11, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY)));
        playerController.addPlayer(player);
        player = new Player("24", Servers.HYPERION, Jobs.ASTROLOGIAN, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("25", Servers.HYPERION, Jobs.REAPER, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("26", Servers.HYPERION, Jobs.SCHOLAR, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("27", Servers.HYPERION, Jobs.SCHOLAR, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("28", Servers.HYPERION, Jobs.DANCER, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("29", Servers.HYPERION, Jobs.MONK, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("30", Servers.HYPERION, Jobs.PALADIN, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("31", Servers.HYPERION, Jobs.DRAGOON, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("32", Servers.HYPERION, Jobs.SUMMONER, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        player = new Player("33", Servers.HYPERION, Jobs.RED_MAGE, LocalTime.of(0, 0), LocalTime.of(23, 0), new HashSet<>(Arrays.asList(Days.SUNDAY, Days.SATURDAY,Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY)));
        playerController.addPlayer(player);
        StaticMaker maker = new StaticMaker(playerController);
        Set<Static> statics = new HashSet<>();
        Static recentStatic = new Static();
        while(recentStatic != null){
            recentStatic = maker.run();
            statics.add(recentStatic);
        }
        for(Static atic : statics){
            System.out.println("\n" + atic);
        }
        System.out.println("\nStatic not found for:");
        for(Player playr : playerController.getAllPlayers()){
            if(playr == null){
                continue;
            }
            System.out.println("\n" + playr);
        }
    }
}