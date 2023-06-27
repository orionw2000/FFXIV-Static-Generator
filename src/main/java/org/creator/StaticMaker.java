package org.creator;

import org.character.Player;
import org.character.PlayerController;
import org.character.enums.Days;
import org.character.enums.Roles;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class StaticMaker {
    PlayerController controller;
    
    public StaticMaker(PlayerController controller){
        this.controller = controller;
    }

    /**
     * Using the PlayerController object, find 8 suitable players for each other and put them in a static.
     * @return The created static.
     */
    public Static run(){
        Static grp = new Static();
        Player player1 = controller.getRole(Roles.TANK);
        if(player1 == null){
            return null;
        }
        grp.setTank1(player1);
        grp.setDays(player1.getDays());
        grp.setStartTime(player1.getStartAvail());
        grp.setEndTime(player1.getEndAvail());
        boolean compatible = false;
        int counter = controller.getPlayerCount();
        while(!compatible){
            Player player2 = controller.getRole(Roles.TANK, player1.getJob());
            compatible = isCompatible(grp, player2);
            if(compatible){
                grp.setTank2(player2);
            }else{
                controller.addPlayer(player2);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player3 = controller.getRole(Roles.REGEN_HEALER);
            compatible = isCompatible(grp, player3);
            if(compatible){
                grp.setHealer1(player3);
            }else{
                controller.addPlayer(player3);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player4 = controller.getRole(Roles.SHIELD_HEALER);
            compatible = isCompatible(grp, player4);
            if(compatible){
                grp.setHealer2(player4);
            }else{
                controller.addPlayer(player4);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player5 = controller.getRole(Roles.MELEE);
            compatible = isCompatible(grp, player5);
            if(compatible){
                grp.setMelee1(player5);
            }else{
                controller.addPlayer(player5);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player6 = controller.getRole(Roles.MELEE, grp.getMelee1().getJob());
            compatible = isCompatible(grp, player6);
            if(compatible){
                grp.setMelee2(player6);
            }else{
                controller.addPlayer(player6);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player7 = controller.getRole(Roles.RANGED);
            compatible = isCompatible(grp, player7);
            if(compatible){
                grp.setRanged(player7);
            }else{
                controller.addPlayer(player7);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        compatible = false;
        counter = controller.getPlayerCount();
        while(!compatible){
            Player player8 = controller.getRole(Roles.CASTER);
            compatible = isCompatible(grp, player8);
            if(compatible){
                grp.setCaster(player8);
            }else{
                controller.addPlayer(player8);
                counter--;
                if(counter <= -1){
                    putPlayersBack(grp);
                    return null;
                }
            }
        }
        return grp;
    }
    //TODO: Make a method that compares a static with a person.
    // If they are compatible, adjust the static's times accordingly.
    private boolean isCompatible(Static grp, Player player){
        if(player == null){
            return  false;
        }
        LocalTime start = grp.getStartTime();
        LocalTime end = grp.getEndTime();
        Set<Days> days = grp.getDays();
        Set<Days> newDays = new HashSet<>();
        for(Days day : player.getDays()){
            if(days.contains(day)){
                newDays.add(day);
            }
        }
        int howManyDays = newDays.size();
        int startHour = Integer.max(start.getHour(), player.getStartAvail().getHour());
        int endHour = Integer.min(end.getHour(), player.getEndAvail().getHour());
        if((endHour - startHour) * howManyDays < 8){
            return false;
        }else{
            grp.setStartTime(LocalTime.of(startHour, 0));
            grp.setEndTime(LocalTime.of(endHour, 0));
            grp.setDays(newDays);
            return true;
        }
    }
    private void putPlayersBack(Static stat){
        if(stat.getTank1() != null) {
            controller.addPlayer(stat.getTank1());
        }
        if(stat.getTank2() != null) {
            controller.addPlayer(stat.getTank2());
        }
        if(stat.getHealer1() != null) {
            controller.addPlayer(stat.getHealer1());
        }
        if(stat.getHealer2() != null) {
            controller.addPlayer(stat.getHealer2());
        }
        if(stat.getMelee1() != null) {
            controller.addPlayer(stat.getMelee1());
        }
        if(stat.getMelee2() != null) {
            controller.addPlayer(stat.getMelee2());
        }
        if(stat.getRanged() != null) {
            controller.addPlayer(stat.getRanged());
        }
        if(stat.getCaster() != null) {
            controller.addPlayer(stat.getCaster());
        }
    }
}
