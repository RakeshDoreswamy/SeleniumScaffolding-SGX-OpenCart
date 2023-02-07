package com.sgx.tests.web.asserts;

import com.sgx.pages.validator.OpenCartSubItemPageValidator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class OpenCartSubItemPageAssert extends AbstractAssert<OpenCartSubItemPageAssert, OpenCartSubItemPageValidator> {

    private final SoftAssertions softAssertions;

    private OpenCartSubItemPageAssert(OpenCartSubItemPageValidator amazonSubItemPageValidator) {
        super(amazonSubItemPageValidator, OpenCartSubItemPageAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static OpenCartSubItemPageAssert assertThat(OpenCartSubItemPageValidator amazonSubItemPageValidator){
        return new OpenCartSubItemPageAssert(amazonSubItemPageValidator);
    }

    public OpenCartSubItemPageAssert monitorHeaderNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getTopTVBrandsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }
}
