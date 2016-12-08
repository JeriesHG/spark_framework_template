/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.jerieshandal.spark.message;

/**
 * ValidationMessages
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public enum ValidationMessages {
    
    INVALID_FIELD("Please fill the highlighted field."),
    
    INVALID_CREDENTIALS("Hmm, it seems we cannot find the user or maybe the password is incorrect. Please try again.");

    private final String message;

    private ValidationMessages(String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }
}
