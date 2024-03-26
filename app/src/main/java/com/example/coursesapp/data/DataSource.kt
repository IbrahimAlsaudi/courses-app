package com.example.coursesapp.data

import com.example.coursesapp.R
import com.example.coursesapp.model.Course

class DataSource() {
    fun loadCourses(): List<Course> {
        return listOf<Course>(
            Course(R.string.architecture, 58, R.drawable.architecture),
            Course(R.string.automotive, 58, R.drawable.automotive),
            Course(R.string.biology, 58, R.drawable.biology),
            Course(R.string.crafts, 121, R.drawable.crafts),
            Course(R.string.business, 78, R.drawable.business),
            Course(R.string.culinary, 118, R.drawable.culinary),
            Course(R.string.design, 423, R.drawable.design),
            Course(R.string.fashion, 92, R.drawable.fashion),
            Course(R.string.film, 165, R.drawable.film),
            Course(R.string.gaming, 164, R.drawable.gaming),
            Course(R.string.drawing, 326, R.drawable.drawing),
            Course(R.string.lifestyle, 305, R.drawable.lifestyle),
            Course(R.string.music, 212, R.drawable.music),
            Course(R.string.painting, 172, R.drawable.painting),
            Course(R.string.photography, 321, R.drawable.photography),
            Course(R.string.tech, 118, R.drawable.tech),
            Course(R.string.ecology , 210, R.drawable.ecology),
            Course(R.string.engineering, 122, R.drawable.engineering),
            Course(R.string.finance, 73, R.drawable.finance),
            Course(R.string.geology, 36, R.drawable.geology),
            Course(R.string.history, 372, R.drawable.history),
            Course(R.string.journalism, 82, R.drawable.journalism),
            Course(R.string.law, 12, R.drawable.law),
            Course(R.string.physics, 60, R.drawable.physics),
        )
    }
}