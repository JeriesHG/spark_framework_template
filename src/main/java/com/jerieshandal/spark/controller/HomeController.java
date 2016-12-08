/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */

package com.jerieshandal.spark.controller;

import com.jerieshandal.spark.Routes;
import static spark.Spark.get;

/**
 * HomeController
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public class HomeController implements IController{

    @Override
    public void initializeRoutes() {
        get(Routes.HOME.route(), (request, response)->{
           return "Hello World!"; 
        });
    }
}
