/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.teamcap.medicproject.json;

import java.util.HashMap;
import java.util.Map;

/**
 * JSONResponse
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public class JSONResponse {
    
    private static final long serialVersionUID = 2522945721629777210L;
    
    private final Map<String, Object> results;
    private ResponseStatus response;
    private String message;
    
    public JSONResponse() {
        response = ResponseStatus.success;
        results = new HashMap<>();
    }
    
    public JSONResponse(ResponseStatus response) {
        this.response = response;
        results = new HashMap<>();
    }
    
    public void put(String key, Object value) {
        results.put(key, value);
    }
    
    public void setStatus(ResponseStatus response) {
        this.response = response;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
