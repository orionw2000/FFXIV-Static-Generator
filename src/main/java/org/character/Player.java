package org.character;

import org.character.enums.Days;
import org.character.enums.Jobs;
import org.character.enums.Roles;
import org.character.enums.Servers;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Set;

public class Player {
    private String name;
    private Servers server;
    private Jobs job;
    private Roles role;
    private LocalTime startAvail;
    private LocalTime endAvail;
    private Set<Days> days;

    public Player(String name, Servers server, Jobs job, LocalTime startAvail, LocalTime endAvail, Set<Days> days) {
        this.name = name;
        this.server = server;
        this.job = job;
        switch(job){
            case PALADIN:
            case WARRIOR:
            case DARK_KNIGHT:
            case GUNBREAKER:
                this.role = Roles.TANK;
                break;
            case WHITE_MAGE:
            case ASTROLOGIAN:
                this.role = Roles.REGEN_HEALER;
                break;
            case SCHOLAR:
            case SAGE:
                this.role = Roles.SHIELD_HEALER;
                break;
            case MONK:
            case DRAGOON:
            case NINJA:
            case SAMURAI:
            case REAPER:
                this.role = Roles.MELEE;
                break;
            case BARD:
            case MACHINIST:
            case DANCER:
                this.role = Roles.RANGED;
                break;
            case SUMMONER:
            case BLACK_MAGE:
            case RED_MAGE:
                this.role = Roles.CASTER;
                break;
        }
        this.startAvail = startAvail;
        this.endAvail = endAvail;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public Servers getServer() {
        return server;
    }

    public Jobs getJob() {
        return job;
    }

    public Roles getRole() {
        return role;
    }

    public LocalTime getStartAvail() {
        return startAvail;
    }

    public LocalTime getEndAvail() {
        return endAvail;
    }

    public Set<Days> getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", server=" + server +
                ", job=" + job +
                '}';
    }
}
