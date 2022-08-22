package com.cbh.tests.web.asserts;

import com.cbh.pages.validator.AmazonSubItemPageValidator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class AmazonSubItemPageAssert extends AbstractAssert<AmazonSubItemPageAssert, AmazonSubItemPageValidator> {

    private final SoftAssertions softAssertions;

    private AmazonSubItemPageAssert(AmazonSubItemPageValidator amazonSubItemPageValidator) {
        super(amazonSubItemPageValidator,AmazonSubItemPageAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static AmazonSubItemPageAssert assertThat(AmazonSubItemPageValidator amazonSubItemPageValidator){
        return new AmazonSubItemPageAssert(amazonSubItemPageValidator);
    }

    public AmazonSubItemPageAssert topTVBrandsHeaderNameEquals(String expectedHeaderName){
        String actualHeaderName = actual.getTopTVBrandsHeader();
        softAssertions.assertThat(actualHeaderName).isEqualTo(expectedHeaderName);
        return this;
    }
}
