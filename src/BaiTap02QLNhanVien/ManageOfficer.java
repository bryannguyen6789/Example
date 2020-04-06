package BaiTap02QLNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageOfficer {
    private List<Officer> officer;

    ArrayList<Engineer> engineerList = new ArrayList<>();
    ArrayList<Worker> workersList = new ArrayList<>();
    ArrayList<Staff> staffList = new ArrayList<>();

    public ManageOfficer(){
        this.officer = new ArrayList<>();
    }

    public void addOfficer(Officer officer){
        this.officer.add(officer);
    }

    public List<Officer> searchOfficerByName(String name){
        return this.officer.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInfoOfficer(){
        for (int i = 0; i < engineerList.size(); i++) {
            engineerList.get(i).showInfo();
        }
        for (int i = 0; i < staffList.size(); i++) {
            staffList.get(i).showInfo();
        }
        for (int i = 0; i < workersList.size(); i++) {
            workersList.get(i).showInfo();
        }
    }

}
