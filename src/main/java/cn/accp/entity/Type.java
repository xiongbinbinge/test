package cn.accp.entity;

import javax.persistence.*;

@Entity
@Table
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_type")
    @SequenceGenerator(name = "seq_type",sequenceName = "type_id",allocationSize = 10,initialValue = 10)
    private int id;
    private String name;

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
}
