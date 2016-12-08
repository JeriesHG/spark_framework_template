/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.jerieshandal.spark;

/**
 * Routes
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public enum Routes {

    HOME("/");

    private final String route;

    Routes(String route) {
        this.route = route;
    }

    public String get() {
        return route;
    }
}
