import cn.accp.entity.*;
import cn.accp.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.List;

public class train5 {
    public static void main(String[] args) {
        Session session= HibernateUtil.session();
        Transaction tx=session.beginTransaction();
        //添加某街道的房屋信息
//        House house=new House();
//        house.setTitle("地铁好房");
//        house.setDescription("地铁物业，出行方便");
//        house.setPrice(3500);
//        house.setPubdate(new Date());
//        house.setFloorage(50);
//        house.setContact("李洋");
//        house.setUser((User)session.get(User.class,2));
//        house.setType((Type)session.get(Type.class,2));
//        house.setStreet((Street)session.get(Street.class,1));
//        session.save(house);

        //查询某街道下的房屋信息
        String hql="from House h where h.street=?";
        Query query=session.createQuery(hql);
        query.setParameter(0,(Street)session.get(Street.class,3));
        List<House> list=query.list();
        for (House house:list){
            System.out.println(house);
        }


        tx.commit();

    }
}
