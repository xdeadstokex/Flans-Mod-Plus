package com.flansmod.common.sync;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Annotation to use to tell GSON to skip serialization of these fields.
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface SyncExclude {
  // Field tag only annotation
}
