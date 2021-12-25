package top.apricityoba.forum.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String qqAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.baidu_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String baiduAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weibo_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String weiboAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_create
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_modified
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_id
     *
     * @return the value of user.account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_id
     *
     * @param accountId the value for user.account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq_account_id
     *
     * @return the value of user.qq_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getQqAccountId() {
        return qqAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qq_account_id
     *
     * @param qqAccountId the value for user.qq_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setQqAccountId(String qqAccountId) {
        this.qqAccountId = qqAccountId == null ? null : qqAccountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.baidu_account_id
     *
     * @return the value of user.baidu_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getBaiduAccountId() {
        return baiduAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.baidu_account_id
     *
     * @param baiduAccountId the value for user.baidu_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setBaiduAccountId(String baiduAccountId) {
        this.baiduAccountId = baiduAccountId == null ? null : baiduAccountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weibo_account_id
     *
     * @return the value of user.weibo_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getWeiboAccountId() {
        return weiboAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weibo_account_id
     *
     * @param weiboAccountId the value for user.weibo_account_id
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setWeiboAccountId(String weiboAccountId) {
        this.weiboAccountId = weiboAccountId == null ? null : weiboAccountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_create
     *
     * @return the value of user.gmt_create
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_create
     *
     * @param gmtCreate the value for user.gmt_create
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_modified
     *
     * @return the value of user.gmt_modified
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_modified
     *
     * @param gmtModified the value for user.gmt_modified
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}