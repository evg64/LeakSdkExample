package com.example.leaksdk

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * @author Evgeny Chumak
 */
internal class HelloWorldAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        println("Hello world")
    }
}