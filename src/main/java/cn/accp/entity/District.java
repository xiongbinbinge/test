package cn.accp.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_district_id")
    @SequenceGenerator(name = "seq_district_id",sequenceName = "district_id",allocationSize = 10,initialValue = 10)
    private int id;
    @Column
    private String name;
    @OneToMany(mappedBy = "district",cascade = {CascadeType.ALL})
    private Set<Street> streets=new HashSet<Street>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Street> getStreets() {
        return streets;
    }

    public void setStreets(Set<Street> streets) {
        this.streets = streets;
    }
}
