package org.creator;

import org.character.Player;
import org.character.enums.Days;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Static {
    private Player tank1;
    private Player tank2;
    private Player regenHealer;
    private Player shieldHealer;
    private Player melee1;
    private Player melee2;
    private Player ranged;
    private Player caster;
    private LocalTime startTime;
    private LocalTime endTime;
    private Set<Days> days;
    
    public Static(){
        
    }

    public Player getTank1() {
        return tank1;
    }

    public void setTank1(Player tank1) {
        this.tank1 = tank1;
    }

    public Player getTank2() {
        return tank2;
    }

    public void setTank2(Player tank2) {
        this.tank2 = tank2;
    }

    public Player getHealer1() {
        return regenHealer;
    }

    public void setHealer1(Player healer1) {
        this.regenHealer = healer1;
    }

    public Player getHealer2() {
        return shieldHealer;
    }

    public void setHealer2(Player healer2) {
        this.shieldHealer = healer2;
    }

    public Player getMelee1() {
        return melee1;
    }

    public void setMelee1(Player melee1) {
        this.melee1 = melee1;
    }

    public Player getMelee2() {
        return melee2;
    }

    public void setMelee2(Player melee2) {
        this.melee2 = melee2;
    }

    public Player getRanged() {
        return ranged;
    }

    public void setRanged(Player ranged) {
        this.ranged = ranged;
    }

    public Player getCaster() {
        return caster;
    }

    public void setCaster(Player caster) {
        this.caster = caster;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Set<Days> getDays() {
        return days;
    }

    public void setDays(Set<Days> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        List<Days> orderedDays = new ArrayList<>();
        if(days.contains(Days.SUNDAY)){
            orderedDays.add(Days.SUNDAY);
        }
        if(days.contains(Days.MONDAY)){
            orderedDays.add(Days.MONDAY);
        }
        if(days.contains(Days.TUESDAY)){
            orderedDays.add(Days.TUESDAY);
        }
        if(days.contains(Days.WEDNESDAY)){
            orderedDays.add(Days.WEDNESDAY);
        }
        if(days.contains(Days.THURSDAY)){
            orderedDays.add(Days.THURSDAY);
        }
        if(days.contains(Days.FRIDAY)){
            orderedDays.add(Days.FRIDAY);
        }
        if(days.contains(Days.SATURDAY)){
            orderedDays.add(Days.SATURDAY);
        }
        return "Static{" +
                "tank1=" + tank1 +
                ", \ntank2=" + tank2 +
                ", \nregenHealer=" + regenHealer +
                ", \nshieldHealer=" + shieldHealer +
                ", \nmelee1=" + melee1 +
                ", \nmelee2=" + melee2 +
                ", \nranged=" + ranged +
                ", \ncaster=" + caster +
                ", \nstartTime=" + startTime +
                ", \nendTime=" + endTime +
                ", \ndays=" + orderedDays +
                '}';
    }
}
