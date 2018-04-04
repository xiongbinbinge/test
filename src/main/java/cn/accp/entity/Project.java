package cn.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private int proid;
    private  String proname;
    private Set<Emp> emps=new HashSet<Emp>();

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }
}
