package cn.accp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static{
        //加载hibernate配置文件
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
    }

    public static Session session(){
        //获取会话
        return sessionFactory.getCurrentSession();
    }
}
