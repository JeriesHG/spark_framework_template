/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.jerieshandal.spark;

import com.jerieshandal.spark.controller.HomeController;
import com.jerieshandal.spark.controller.IController;
import java.util.Arrays;
import spark.servlet.SparkApplication;

/**
 * Application
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public class Application implements SparkApplication {

    private final IController[] controllers = {
        new HomeController()
    };
    
    @Override
    public void init() {
        Arrays.stream(controllers).forEach(IController::initializeRoutes);
    }
}
