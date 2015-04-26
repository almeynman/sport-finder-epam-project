package com.epam.aa.sportfinder.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private static final Map<String, Action> actions = initActionFactory();

    public static Action getAction(HttpServletRequest request) {
        return actions.get(request.getMethod() + request.getPathInfo());
    }

    private static Map<String, Action> initActionFactory() {
        Map<String, Action> actions = new HashMap<>();
        actions.put("GET/login", (request, response) -> "login");
        actions.put("POST/login", new LoginAction());
        actions.put("GET/manager-register", (request, response) -> "manager-register");
        actions.put("POST/manager-register", new ManagerRegisterAction());
//        actions.put("GET/logout", new LogoutAction());
        return actions;
    }
}
