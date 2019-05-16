package org.gula.myleetcode.easy

import spock.lang.Specification

class ExcelSheetColumnTitleTest extends Specification {
    def "ConvertToTitle"() {
        expect:
        new ExcelSheetColumnTitle().convertToTitle(number) == title
        where:
        number | title
        1      | "A"
        28     | "AB"
        701    | "ZY"
        52     | "AZ"
    }
}
