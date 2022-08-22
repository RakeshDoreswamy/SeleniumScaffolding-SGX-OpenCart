package com.cbh.pages.validator;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AmazonSubItemResultPageValidator {

    private String resultsHeader;
    private String aboutThisItem;
}
