package com.github.duanhong.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.duanhong.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
