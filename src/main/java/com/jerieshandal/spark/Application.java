/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.jerieshandal.spark;

import com.jerieshandal.spark.controller.HomeController;
import com.jerieshandal.spark.controller.IController;
import com.jerieshandal.spark.message.Messages;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.staticFiles;
import spark.servlet.SparkApplication;

/**
 * Application
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public class Application implements SparkApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private final static String STATIC_FILE_LOCATION = "/assets";

    private final IController[] controllers = {
        new HomeController()
    };

    @Override
    public void init() {
        initializeBoostrapProcess();
    }

    private void initializeBoostrapProcess() {
        LOGGER.info(Messages.BS1000.get());
        staticFiles.location(STATIC_FILE_LOCATION);
        Arrays.stream(controllers).forEach(IController::initializeRoutes);
        LOGGER.info(Messages.BS1010.get());
    }
}
