package com.github.samadipour.commentlogplugin.services

import com.github.samadipour.commentlogplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
