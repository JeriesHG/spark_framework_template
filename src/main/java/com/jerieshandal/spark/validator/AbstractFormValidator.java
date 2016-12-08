/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.teamcap.medicproject.validator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * AbstractFormValidator
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public abstract class AbstractFormValidator implements FormValidator {

    private final Map<String, String> invalidFields;

    public AbstractFormValidator() {
        invalidFields = new HashMap<>();
    }

    public void addInvalidField(String key, String value) {
        invalidFields.put(key, value);
    }

    public boolean validate() {
        validateFields();
        return invalidFields.isEmpty();
    }

    public Map<String, String> getInvalidFields() {
        return Collections.unmodifiableMap(invalidFields);
    }
}
