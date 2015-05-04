package com.epam.aa.sportfinder.controller;

import javax.servlet.http.HttpServletRequest;

@ControllerAction(path="/register", method="GET")
public class RegisterGetAction implements Action {
    public String execute(HttpServletRequest request) throws ControllerException {
        return "register";
    }
}