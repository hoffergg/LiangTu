package com.dailycation.liangtu.ui.enter;

/**
 * @author hehu
 * @version 1.0 2016/1/7
 */
public interface LoginInterface {
    public void login(String phone,String password);
    public void goRegister();
    public void register(String phone,String password,String verifyCode);
}

