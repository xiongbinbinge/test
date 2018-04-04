package cn.accp.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_house")
    @SequenceGenerator(name = "seq_house",sequenceName = "house_id",allocationSize = 10,initialValue = 10)
    private int id;

    private String title;             //标题
    private String description;      //描述
    private int price;                  //价格
    private Date pubdate;                    //发布时间
    private int floorage;              //面积
    private String contact;          //联系人
    //private int user_id;
    //private int type_id;
    //private int street_id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(targetEntity = Street.class)
    @JoinColumn(name = "street_id")
    private Street street;

    @ManyToOne(targetEntity = Type.class)
    @JoinColumn(name = "type_id")
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public int getFloorage() {
        return floorage;
    }

    public void setFloorage(int floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

//    public int getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(int user_id) {
//        this.user_id = user_id;
//    }

//    public int getType_id() {
//        return type_id;
//    }
//
//    public void setType_id(int type_id) {
//        this.type_id = type_id;
//    }

//    public int getStreet_id() {
//        return street_id;
//    }
//
//    public void setStreet_id(int street_id) {
//        this.street_id = street_id;
//    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", pubdate=" + pubdate +
                ", floorage=" + floorage +
                ", contact='" + contact + '\'' +
                //", user_id=" + user_id +
                //", type_id=" + type_id +
               // ", street_id=" + street_id +
                '}';
    }
}
