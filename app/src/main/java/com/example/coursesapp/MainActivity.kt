package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.DataSource
import com.example.coursesapp.model.Course
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp() {
    CoursesList(courses = DataSource().loadCourses())
}

@Composable
fun CourseCard(course: Course, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.padding(4.dp)
// modifier = Modifier.wrapContentSize()
    ) {
        Row {
            Image(painter = painterResource(id = course.image), contentDescription = stringResource(
                id = course.title),
                modifier = Modifier.height(68.dp),
                contentScale = ContentScale.Crop
            )

            Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = stringResource(id = course.title), modifier = Modifier.padding(top = 16.dp))
                Row (Modifier){
                    Image(painter = painterResource(id = R.drawable.ic_grain), contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = course.number.toString())
                }
            }
        }
    }
}

@Composable
fun CoursesList(courses: List<Course>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(courses){
            CourseCard(it)
        }
    }
}

@Preview
@Composable
fun CourseCardPreview() {
    CoursesList(courses = DataSource().loadCourses())
}
