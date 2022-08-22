package com.cbh.tests.web.asserts;

import com.cbh.pages.validator.AmazonSubItemResultPageValidator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class AmazonSubItemResultPageAssert extends AbstractAssert<AmazonSubItemResultPageAssert, AmazonSubItemResultPageValidator> {

    private final SoftAssertions softAssertions;

    private AmazonSubItemResultPageAssert(AmazonSubItemResultPageValidator amazonSubItemResultPageValidator) {
        super(amazonSubItemResultPageValidator, AmazonSubItemResultPageAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static AmazonSubItemResultPageAssert assertThat(AmazonSubItemResultPageValidator amazonSubItemResultPageValidator){
        return new AmazonSubItemResultPageAssert(amazonSubItemResultPageValidator);
    }

    public AmazonSubItemResultPageAssert resultHeaderNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getResultsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }

    public AmazonSubItemResultPageAssert aboutThisItemNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getResultsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }
}
