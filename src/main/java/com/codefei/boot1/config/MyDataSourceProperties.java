package com.codefei.boot1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "jdbc")
public class MyDataSourceProperties {

//    @Value("${jdbc.url}")
    private  String url;
//    @Value("${jdbc.driverClassName}")
    private  String driverClassName;
//    @Value("${jdbc.username}")
    private  String userName;
//    @Value("${jdbc.password}")
    private  String password;

    private  String name;
    private List<String> ips;
    private Map<String,String> dsMap;
    private Date dsDate;

    @Override
    public String toString() {
        return "MyDataSourceProperties{" +
                "url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", ips=" + ips +
                ", dsMap=" + dsMap +
                ", dsDate=" + dsDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public Map<String, String> getDsMap() {
        return dsMap;
    }

    public void setDsMap(Map<String, String> dsMap) {
        this.dsMap = dsMap;
    }

    public Date getDsDate() {
        return dsDate;
    }

    public void setDsDate(Date dsDate) {
        this.dsDate = dsDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
