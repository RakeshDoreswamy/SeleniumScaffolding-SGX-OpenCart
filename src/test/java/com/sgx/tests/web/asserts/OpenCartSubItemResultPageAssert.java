package com.sgx.tests.web.asserts;

import com.sgx.pages.validator.OpenCartSubItemResultPageValidator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class OpenCartSubItemResultPageAssert extends AbstractAssert<OpenCartSubItemResultPageAssert, OpenCartSubItemResultPageValidator> {

    private final SoftAssertions softAssertions;

    private OpenCartSubItemResultPageAssert(OpenCartSubItemResultPageValidator openCartSubItemResultPageValidator) {
        super(openCartSubItemResultPageValidator, OpenCartSubItemResultPageAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static OpenCartSubItemResultPageAssert assertThat(OpenCartSubItemResultPageValidator openCartSubItemResultPageValidator){
        return new OpenCartSubItemResultPageAssert(openCartSubItemResultPageValidator);
    }

    public OpenCartSubItemResultPageAssert resultHeaderNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getResultsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }

    public OpenCartSubItemResultPageAssert aboutThisItemNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getResultsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }
}
