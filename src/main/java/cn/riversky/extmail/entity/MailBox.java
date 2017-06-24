package cn.riversky.extmail.entity;

/**
 * Created by admin on 2017/6/22.
 */
public class MailBox {
    private String username;
    private String uid;
    private String password;
    private String clearpwd;
    private String name;
    private String mailhost;
    private String homedir;
    private  String domain;
    private String quota;
    private String netdiskquota;
    private  String question;
    private String answer;

    public MailBox(String username, String uid, String password, String clearpwd, String name, String mailhost, String homedir, String domain, String quota, String netdiskquota, String question, String answer) {
        this.username = username;
        this.uid = uid;
        this.password = password;
        this.clearpwd = clearpwd;
        this.name = name;
        this.mailhost = mailhost;
        this.homedir = homedir;
        this.domain = domain;
        this.quota = quota;
        this.netdiskquota = netdiskquota;
        this.question = question;
        this.answer = answer;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getNetdiskquota() {
        return netdiskquota;
    }

    public void setNetdiskquota(String netdiskquota) {
        this.netdiskquota = netdiskquota;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getClearpwd() {
        return clearpwd;
    }
    public void setClearpwd(String clearpwd) {
        this.clearpwd = clearpwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMailhost() {
        return mailhost;
    }
    public void setMailhost(String mailhost) {
        this.mailhost = mailhost;
    }

    public String getHomedir() {
        return homedir;
    }

    public void setHomedir(String homedir) {
        this.homedir = homedir;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "username='" + username + '\'' +
                ", uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                ", clearpwd='" + clearpwd + '\'' +
                ", name='" + name + '\'' +
                ", mailhost='" + mailhost + '\'' +
                ", homedir='" + homedir + '\'' +
                ", domain='" + domain + '\'' +
                ", quota='" + quota + '\'' +
                ", netdiskquota='" + netdiskquota + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
