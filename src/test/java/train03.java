import cn.accp.entity.Emp;
import cn.accp.entity.Project;
import cn.accp.entity.Street;
import cn.accp.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class train03 {
    public static void main(String[] args) {
        Session session= HibernateUtil.session();
        Transaction tx=session.beginTransaction();
        //查询有2条以上房屋信息的街道
        String hql="from Street s where s.houses.size>2";
        Query query=session.createQuery(hql);
        List<Street> streets=query.list();
        for (Street s:streets){
            System.out.println(s.getName());
        }

        //查询所有房屋租金高于1400元的街道
//        String hql="from Street s where 1400<all(select h.price from s.houses h)";
//        Query query=session.createQuery(hql);
//        List<Street> streets=query.list();
//        for (Street s:streets){
//            System.out.println(s.getName());
//        }

        //查询至少有一条房屋的租金低于1000元的街道
//        String hql="from Street s where 1000>any(select h.price from s.houses h)";
//        Query query=session.createQuery(hql);
//        List<Street> streets=query.list();
//        for (Street s:streets){
//            System.out.println(s.getName());
//        }

        //统计各个街道的房屋信息条数
//        String hql="select s.name,s.houses.size from Street s";
//        Query query=session.createQuery(hql);
//        List<Object[]> streets=query.list();
//        for (Object[] s:streets){
//            System.out.println("街道名:"+s[0]+" ,房屋信息条数:"+s[1]);
//        }
        tx.commit();

    }
}
