package com.sgx.pages.validator;

import lombok.Getter;

@Getter
public class OpenCartSubItemPageValidator {

    private String topTVBrandsHeader;

    OpenCartSubItemPageValidator(String topTVBrandsHeader) {
        this.topTVBrandsHeader = topTVBrandsHeader;
    }

    public static OpenCartSubItemPageValidatorBuilder builder() {
        return new OpenCartSubItemPageValidatorBuilder();
    }

    public static class OpenCartSubItemPageValidatorBuilder {
        private String topTVBrandsHeader;

        OpenCartSubItemPageValidatorBuilder() {
        }

        public OpenCartSubItemPageValidatorBuilder topTVBrandsHeader(String topTVBrandsHeader) {
            this.topTVBrandsHeader = topTVBrandsHeader;
            return this;
        }

        public OpenCartSubItemPageValidator build() {
            return new OpenCartSubItemPageValidator(topTVBrandsHeader);
        }

        public String toString() {
            return "AmazonSubItemPageValidator.OpenCartSubItemPageValidatorBuilder(topTVBrandsHeader=" + this.topTVBrandsHeader + ")";
        }
    }
}
