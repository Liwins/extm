package cn.riversky.extmail.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by admin on 2017/6/22.
 */
public class MybatisUtils {
    public static   SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() {
        try {
            InputStream io = Resources.getResourceAsStream("mybatis.xml");

            if(sqlSessionFactory==null){
                sqlSessionFactory=new  SqlSessionFactoryBuilder().build(io);
            }
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
