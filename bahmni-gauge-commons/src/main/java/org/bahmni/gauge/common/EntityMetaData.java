package org.bahmni.gauge.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by atmaramn on 17/10/2016.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityMetaData {
    String mrs_name();
}

