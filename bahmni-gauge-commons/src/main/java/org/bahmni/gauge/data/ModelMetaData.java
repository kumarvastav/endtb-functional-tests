package org.bahmni.gauge.data;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by atmaramn on 17/10/2016.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ModelMetaData {
    String mrs_name();
}

