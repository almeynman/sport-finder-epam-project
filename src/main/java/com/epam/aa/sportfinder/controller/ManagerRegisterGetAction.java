package com.epam.aa.sportfinder.controller;

import javax.servlet.http.HttpServletRequest;

@ControllerAction(path="/manager/register", method="GET")
public class ManagerRegisterGetAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        return "manager/register";
    }
}
