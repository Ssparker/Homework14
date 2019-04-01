package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.List;

public class UpdateWebsite {
    public List <String> softwareUpdate;
    public List <String> newFunctionality;
    public List<String> leagueSite;

    public UpdateWebsite() {
        this.softwareUpdate = new ArrayList<>();
        this.newFunctionality = new ArrayList<>();
        this.leagueSite = new ArrayList<>();
    }
    public UpdateWebsite(List<String> softwareUpdate, List<String> newFunctionality, List<String> leagueSite) {
        this.softwareUpdate =  softwareUpdate;
        this.newFunctionality = newFunctionality;
        this.leagueSite = leagueSite;

    }

    @Override
    public String toString() {
        return "UpdateWebsite{" +
                "softwareUpdate='" + softwareUpdate + '\'' +
                ", newFunctionality='" + newFunctionality + '\'' +
                ", leagueSite='" + leagueSite + '\'' +
                '}';
    }

    public List<String> getSoftwareUpdate() {
        return softwareUpdate;
    }

    public void setSoftwareUpdate(List<String> softwareUpdate) {
        this.softwareUpdate = softwareUpdate;
    }

    public List<String> getNewFunctionality() {
        return newFunctionality;
    }

    public void setNewFunctionality(List<String> newFunctionality) {
        this.newFunctionality = newFunctionality;
    }

    public List<String> getLeagueSite() {
        return leagueSite;
    }

    public void setLeagueSite(List<String> leagueSite) {
        this.leagueSite = leagueSite;
    }
}

