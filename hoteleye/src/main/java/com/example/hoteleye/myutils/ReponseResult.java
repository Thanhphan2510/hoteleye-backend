package com.example.hoteleye.myutils;

import java.util.HashMap;
import java.util.Map;

public class ReponseResult {
    private static ReponseResult instance;
    private static Exception ex;
    private ReponseResult(){}

    private static class SingletonHelper{
        private static final ReponseResult INSTANCE = new ReponseResult();
    }

    public void getException(Exception e){
        this.ex = e;

    }

    public static ReponseResult getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public Map<String, Object> response(String code){
        Map<String, Object> map = new HashMap<String, Object>();
        switch (code){
            case "200":
                map.put("status", "200");
                map.put("message", "Your record have been saved successfully");
                break;
            case "500":
                map.put("status", "500");
                map.put("message", ex.getMessage());

            default:
                break;
        }
        return map;

    }
}


