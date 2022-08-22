package com.cbh.pages.validator;

import lombok.Getter;

@Getter
public class AmazonSubItemPageValidator {

    private String topTVBrandsHeader;

    AmazonSubItemPageValidator(String topTVBrandsHeader) {
        this.topTVBrandsHeader = topTVBrandsHeader;
    }

    public static AmazonSubItemPageValidatorBuilder builder() {
        return new AmazonSubItemPageValidatorBuilder();
    }

    public static class AmazonSubItemPageValidatorBuilder {
        private String topTVBrandsHeader;

        AmazonSubItemPageValidatorBuilder() {
        }

        public AmazonSubItemPageValidatorBuilder topTVBrandsHeader(String topTVBrandsHeader) {
            this.topTVBrandsHeader = topTVBrandsHeader;
            return this;
        }

        public AmazonSubItemPageValidator build() {
            return new AmazonSubItemPageValidator(topTVBrandsHeader);
        }

        public String toString() {
            return "AmazonSubItemPageValidator.AmazonSubItemPageValidatorBuilder(topTVBrandsHeader=" + this.topTVBrandsHeader + ")";
        }
    }
}
