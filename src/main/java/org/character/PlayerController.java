package org.character;

import org.character.Player;
import org.character.enums.Jobs;
import org.character.enums.Roles;

import java.util.*;

public class PlayerController {
    private Queue<Player> players;

    public PlayerController() {
        this.players = new LinkedList<>();
    }
    public boolean addPlayer(Player player){
        return players.add(player);
    }
    public Player removePlayer(){
        return players.remove();
    }
    public Queue<Player> getAllPlayers(){
        return players;
    }
    public int getPlayerCount(){
        return players.size();
    }
    /**
    Gets a player from the pile, and removes it from there. That player will be of the role specified, but not the job.
     If no job is given, returns any job of that role.
     @Param role: the role wanted
     @Param job: the job NOT wanted
     @Return a player that fits the criteria
     **/
    public Player getRole(Roles role, Jobs job){
        int times = players.size();
        try{while(times>0){
            Player player = removePlayer();
            if(player.getRole() == role && player.getJob() != job){
                return player;
            }else{
                addPlayer(player);
                times--;
            }
        }
        }catch(NullPointerException e){
            return null;
        }
        return null;
    }
    public Player getRole(Roles role){
        return getRole(role, null);
    }
}
