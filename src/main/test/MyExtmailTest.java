import cn.riversky.extmail.dao.MailBoxDao;
import cn.riversky.extmail.dao.impl.MailBoxDaoImpl;
import cn.riversky.extmail.entity.MailBox;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2017/6/22.
 */
public class MyExtmailTest  {
    private MailBoxDao mailBoxDao=null;
    @Before
    public void before(){
        mailBoxDao=new MailBoxDaoImpl();
    }
    @Test
    public void testAddBox(){
        for (int i=111;i<120;i++){
            String uid =Integer.toString(i);
            String domain="ha.cn";
            String username=uid+"@"+domain;
            String password="$1$UJjoD/hL$rzi8yqELboyFPmUecFgSk/";
            String clearpwd="";
            String name="";
            String mailhost=domain+"/"+uid+"/Maildir/";
            String homedir =domain+"/"+uid;
            String quota="5242880S";
            String netdiskquota="5242880S";
            String question="123";
            String answer="567";
            MailBox mailBox=new MailBox( username,  uid,  password,  clearpwd,  name,  mailhost,  homedir,  domain,  quota,  netdiskquota,  question,  answer);
            mailBoxDao.addMailBox(mailBox);
        }


    }
    @Test
    public void deleteAll(){
        mailBoxDao.deleteMailBox();
    }
}
