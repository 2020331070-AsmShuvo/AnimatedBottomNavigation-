package com.example.githubuse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubuse.ui.theme.GitHubUseTheme

/*
* Animated Bottom Nav bar from github: Add dependencies
* Add the tag in activity_Main
* create menu folder: menu
*       add menu tag from github and edit icons
* activity_main er abb_tabs ta change kore - @menu/menu
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
