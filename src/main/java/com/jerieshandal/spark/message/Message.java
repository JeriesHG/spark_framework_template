/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.jerieshandal.spark.message;

/**
 * Message
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public enum Message {

    /**
     * Marks the moment where the routes are getting initialized
     */
    BS1000("code=\"S1000\" type=\"Initialized bootstrap process\""),
    /**
     * Marks the moment where the routes finalized
     */
    BS1010("code=\"BS1010\" type=\"Finalized bootstrap process\"");

    private final String message;

    private Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
