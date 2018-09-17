package org.andestech.learning.rfb18.at;

public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname.trim().toUpperCase();
    }

    private String name;
    private String sname;
    private String login;

    public Customer(String name, String sname) {
        setName(name);
        setSname(sname);
        login = this.name.substring(0,1) + this.sname;
    }


    public String getLogin(){
        return login;
    }

    ///....

}
