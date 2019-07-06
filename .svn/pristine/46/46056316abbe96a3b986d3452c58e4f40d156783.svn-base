package com.j1635web.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DBUtil {
        private static SqlSessionFactory sessionFactory;
        static {
        	InputStream is=null;
        	String resource="SqlMapConfig.xml";
        	try {
				is=Resources.getResourceAsStream(resource);
				sessionFactory=new SqlSessionFactoryBuilder().build(is);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        }
        public static  SqlSession getSqlSession() {
        	   return  sessionFactory.openSession();
        }
}
