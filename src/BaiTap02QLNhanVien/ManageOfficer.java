package BaiTap02QLNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficerManage {
    private List<Officer> officer;

    public OfficerManage(){
        this.officer = new ArrayList<>();
    }

    public void addOfficer(Officer officer){
        this.officer.add(officer);
    }

    public List<Officer> seachOfficerByName(String name){
        return this.officer.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInfoOfficer(){
        this.officer.forEach(o -> System.out.println(o.toString()));
    }

}
