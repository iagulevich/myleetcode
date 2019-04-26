package org.gula.myleetcode.hard

import spock.lang.Specification

class RegularExpressionMatchingTest extends Specification {
    def "should be match"() {
        expect:
        new RegularExpressionMatching().isMatch(string, pattern) == result
        where:
        string        || pattern      || result
        "a"           || "b"          || false
        "aaa"         || ".*"         || true
        "aa"          || "aa"         || true
        "aa"          || "a"          || false
        "aa"          || "a*"         || true
        "aaa"         || "a*b"        || false
        "ab"          || ".*"         || true
        "aab"         || "c*a*b"      || true
        "mississippi" || "mis*is*p*." || true
        "mississippi" || "mis*is*ip*."|| true
    }
}
