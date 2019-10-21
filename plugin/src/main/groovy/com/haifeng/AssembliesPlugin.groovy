package com.haifeng

import org.gradle.api.Plugin
import org.gradle.api.Project

class AssembliesPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("apply project : " + project.getName())
        project.task('test1Task') << {
            println "Hello gradle plugin"
        }
    }

    /**
     * 打印
     * @param msg
     */
    void println(String msg) {
        System.out.println("\n"
                + "========================="
                + "\n"
                + "==" + msg
                + "\n"
                + "========================="
                + "\n")
    }

}