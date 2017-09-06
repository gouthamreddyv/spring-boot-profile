package com.mkyong.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum MyFeatures implements Feature {

	@EnabledByDefault
    @Label("FOO")
    FOO,

    @Label("BAR")
    BAR;
}
