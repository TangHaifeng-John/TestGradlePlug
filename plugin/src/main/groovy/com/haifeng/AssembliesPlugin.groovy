package com.haifeng

import org.gradle.api.Plugin
import org.gradle.api.Project

class AssembliesPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("apply project : " + project.getName())


        def haifeng = properties.get("haifeng")

        System.out.println("测试参数" + haifeng)
//        project.dependencies {
//
//
//            debugImplementation 'com.didichuxing.doraemonkit:doraemonkit:1.2.1'
//            releaseImplementation 'com.didichuxing.doraemonkit:doraemonkit-no-op:1.2.0'
//        }

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