package cn.accp.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_user")
    @SequenceGenerator(name = "seq_user",sequenceName = "user_id",allocationSize = 10,initialValue = 10)
    private int id;
    private String name;
    private String password;
    private String telephone;
    private String username;
    private String isadmin;

    public User() {
    }

    public User(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", username='" + username + '\'' +
                ", isadmin='" + isadmin + '\'' +
                '}';
    }
}
