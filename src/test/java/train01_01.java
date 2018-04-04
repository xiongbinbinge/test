import cn.accp.entity.District;
import cn.accp.entity.House;
import cn.accp.entity.Street;
import cn.accp.entity.User;
import cn.accp.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class train01_01 {
    public static void main(String[] args) {
        Session session= HibernateUtil.session();
        Transaction tx=session.beginTransaction();
       //使用左外连接查询所有用户及其发布的房屋信息
        String hql="from House h left join h.user";
        Query query=session.createQuery(hql);
        List<Object[]> list=query.list();
        for (Object[] o:list){
            System.out.println(o[0] +"  "+o[1]);
        }

        //使用迫切左外连接查询所有用户及其发布的房屋信息
//        String hql="from House h left join fetch h.user";
//        Query query=session.createQuery(hql);
//        List<House> list=query.list();
//        for (House h:list){
//            System.out.println(h+"    "+h.getUser());
//        }

        //使用隐式内连接查询某用户发布的房屋信息
//        String hql="from House h where h.user.name=?";
//        Query query=session.createQuery(hql);
//        query.setParameter(0,"王五");
//        List<House> list=query.list();
//        for (House o:list){
//            System.out.println(o+"    "+o.getUser());
//        }

        //提交事务
        tx.commit();

    }
}
