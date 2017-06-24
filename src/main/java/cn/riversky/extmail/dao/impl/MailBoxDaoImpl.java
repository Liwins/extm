package cn.riversky.extmail.dao.impl;

import cn.riversky.extmail.dao.MailBoxDao;
import cn.riversky.extmail.entity.MailBox;
import cn.riversky.extmail.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by admin on 2017/6/22.
 */
public class MailBoxDaoImpl implements MailBoxDao {
    private SqlSession sqlSession;
    public List<MailBox> listMailBox() {
        return null;
    }

    public MailBox getMailBoxByname() {
        return null;
    }

    public void addMailBox(MailBox mailBox) {
        try {
            sqlSession= MybatisUtils.getSqlSession();
            sqlSession.insert("insertMailBox",mailBox);
            sqlSession.commit();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    public void updateMailBox(MailBox mailBox) {

    }

    public void deleteMailBox() {
        try {
            sqlSession= MybatisUtils.getSqlSession();
            sqlSession.delete("deleteAllmailBox");
            sqlSession.commit();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
