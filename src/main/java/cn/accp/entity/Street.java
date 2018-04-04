package cn.accp.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_street_id")
    @SequenceGenerator(name = "seq_street_id",sequenceName = "street_id",allocationSize = 10,initialValue = 10)
    private int id;
    @Column
    private String name;

    @ManyToOne(targetEntity = District.class)
    @JoinColumn(name = "district_id")
    private District district;

    @OneToMany(mappedBy = "street",cascade = {CascadeType.ALL})
    private Set<House> houses=new HashSet<House>();

    public Set<House> getHouses() {
        return houses;
    }

    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }

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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
