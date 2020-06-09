package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop7;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:15
 * @Description:
 */
public class SynchornizedObject {
    private String uaername = "a";
    private String password = "aa";

    public String getUaername() {
        return uaername;
    }

    public void setUaername(String uaername) {
        this.uaername = uaername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            this.uaername = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
