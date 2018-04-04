import cn.accp.entity.District;
import cn.accp.entity.House;
import cn.accp.entity.Street;
import cn.accp.entity.User;
import cn.accp.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class train02_01 {
    public static void main(String[] args) {
        //添加区县的同时添加该区县下的两个街道
        Session session=HibernateUtil.session();
        Transaction tx=session.beginTransaction();
       //统计所有房屋的平均价格、最高价格、最低价格
        String hql="select avg(price),max(price),min(price) from House";
        Query query=session.createQuery(hql);
        Object[] o=(Object[])query.uniqueResult();
        System.out.println(o[0]+"   "+o[1]+"  "+o[2]);

        //统计各个街道的房屋的平均价格、最高价格、最低价格
//        String hql="select h.street.name,avg(price),max(price),min(price) from House h group by h.street.name";
//        Query query=session.createQuery(hql);
//        List<Object[]> list=query.list();
//        for (Object[] o:list           ) {
//            System.out.println(o[0]+"   "+o[1]+"  "+o[2]);
//        }


        //统计各个区县的房屋的平均价格、最高价格、最低价格
//        String hql="select s.district.name,avg(h.price),max(h.price),min(h.price) from Street s,House h where s.id=h.street.id group by s.district.name";
//
//        Query query=session.createQuery(hql);
//        List<Object[]> list=query.list();
//        for (Object[] o:list           ) {
//            System.out.println(o[0]+"   "+o[1]+"  "+o[2]);
//        }
        //提交事务
        tx.commit();

    }
}