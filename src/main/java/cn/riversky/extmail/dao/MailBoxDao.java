package cn.riversky.extmail.dao;

import cn.riversky.extmail.entity.MailBox;

import java.util.List;

/**
 * Created by admin on 2017/6/22.
 */
public interface MailBoxDao {
    public List<MailBox> listMailBox();
    public MailBox getMailBoxByname();
    public void addMailBox(MailBox mailBox);
    public  void updateMailBox(MailBox mailBox);
    public void deleteMailBox();

}
