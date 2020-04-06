package com.codefei.boot1.sys.entity;

public class Sysuser {
    private  int uid;
    private  String uname;
    private  String uphone;

    @Override
    public String toString() {
        return "Sysuser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }
}
