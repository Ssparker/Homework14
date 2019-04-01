package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.List;

public class people {

    public List<String> men;
    public List<String> women;
    public List<String> leagueOfficers;
    public List<String> developer;
    public List<String> golfCourseOwner;

    public people(){
        this.men = new ArrayList<>();
        this.women = new ArrayList<>();
        this.leagueOfficers = new ArrayList<>();
        this.developer = new ArrayList<>();
        this.golfCourseOwner = new ArrayList<>();
    }

    public people(List<String> men, List<String> women, List<String> leagueOfficers, List <String> developer, List<String> golfCourseOwner) {
        this.men = men ;
        this.women = women ;
        this.leagueOfficers = leagueOfficers;
        this.developer = developer;
        this.golfCourseOwner = golfCourseOwner;
    }

    @Override
    public String toString() {
        return "people{" +
                "men='" + men + '\'' +
                ", women='" + women + '\'' +
                ", leagueOfficers='" + leagueOfficers + '\'' +
                ", developer='" + developer + '\'' +
                ", golfCourseOwner='" + golfCourseOwner + '\'' +
                '}';
    }

    public List<String> getMen() {
        return men;
    }

    public void setMen(List<String> men) {
        this.men = men;
    }

    public List<String> getWomen() {
        return women;
    }

    public void setWomen(List<String> women) {
        this.women = women;
    }

    public List<String> getLeagueOfficers() {
        return leagueOfficers;
    }

    public void setLeagueOfficers(List<String> leagueOfficers) {
        this.leagueOfficers = leagueOfficers;
    }

    public List<String> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<String> developer) {
        this.developer = developer;
    }

    public List<String> getGolfCourseOwner() {
        return golfCourseOwner;
    }

    public void setGolfCourseOwner(List<String> golfCourseOwner) {
        this.golfCourseOwner = golfCourseOwner;
    }
}


