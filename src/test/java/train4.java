import cn.accp.entity.District;
import cn.accp.entity.Street;
import cn.accp.entity.User;
import cn.accp.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class train4 {
    public static void main(String[] args) {
        Session session= HibernateUtil.session();
        Transaction tx=session.beginTransaction();
       //统计各个街道房屋的租金高于1000元的房屋信息的条数
       String hql="select h.street.name,count(*) from House h where price>1000 group by h.street.name";
        Query query=session.createQuery(hql);
        List<Object[]> streets=query.list();
        for (Object[] s:streets) {
            System.out.println(s[0] + "  " + s[1]);
        }

        //统计各个街道一室一厅,租金大于1000元的房屋信息的条数
//        String hql="select h.street.name,h.type.name,count(*) from House h where price>1000 and h.type.name='一室一厅' group by h.street.name,h.type.name";
//        Query query=session.createQuery(hql);
//        List<Object[]> streets=query.list();
//        for (Object[] s:streets) {
//            System.out.println(s[0] + "  " + s[1]+"   "+s[2]);
//        }

        //列出房屋信息条数大于2的所有街道
//        String hql="from Street s where 2<(select count(h) from s.houses h)";
//        Query query=session.createQuery(hql);
//        List<Street> streets=query.list();
//        for (Street s:streets){
//            System.out.println(s.getName());
//        }

        tx.commit();

    }
}
