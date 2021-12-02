package com.github.albertzyc.fucktemplate.services

import com.intellij.openapi.project.Project
import com.github.albertzyc.fucktemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
