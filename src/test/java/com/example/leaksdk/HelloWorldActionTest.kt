package com.example.leaksdk

import com.intellij.testFramework.fixtures.JavaCodeInsightFixtureTestCase

/**
 * @author Evgeny Chumak
 */
class HelloWorldActionTest : JavaCodeInsightFixtureTestCase() {

    // only one test fails with leak sdk, all other tests pass

    fun test1() {
        // test body does not matter
    }

    fun test2() {
        // test body does not matter
    }
}