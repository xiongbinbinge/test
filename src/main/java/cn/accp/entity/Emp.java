package cn.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class Emp {
    private  int empno;
    private  String ename;
    private Set<Project> projects=new HashSet<Project>();

    public Emp() {
    }

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;

    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
