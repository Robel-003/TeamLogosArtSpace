package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.data.Datasource
import com.example.artspace.model.Teams
import com.example.artspace.ui.theme.ArtSpaceTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasketballTeamsApp()
                }
            }
        }
    }
}


@Composable
fun BasketballTeamsApp(modifier: Modifier = Modifier) {

    val teamLogo: List<Teams> = remember { Datasource().loadTeams() }
    var teamLogoIdx by remember { mutableStateOf(0) }
    var basketballTeams: Teams = teamLogo[teamLogoIdx]

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(basketballTeams.imageResourceId),
            contentDescription = stringResource(basketballTeams.stringResourceId),
            contentScale= ContentScale.Companion.FillWidth,
            modifier = Modifier.wrapContentSize()
                .size(500.dp)
                .padding(2.dp)
        )
        TeamInfo(teams = basketballTeams, modifier = modifier)
        Navigate(
            prev = {
                if (teamLogoIdx > 0) {
                    teamLogoIdx -= 1
                } else teamLogoIdx = teamLogo.size-1 },
            next = {
                if (teamLogoIdx < teamLogo.size-1) {
                    teamLogoIdx += 1
                } else teamLogoIdx = 0 },
            modifier = modifier
        )
    }
}


@Composable
fun TeamInfo(teams: Teams, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(100.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(teams.stringResourceId),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )

            Text(
                text = stringResource(teams.stringResourceId),
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Composable
fun Navigate(prev: () -> Unit, next: () -> Unit,
             modifier: Modifier = Modifier) {
    Row(
        modifier.fillMaxWidth()
    ) {
        Button(
            onClick = prev,
            modifier = modifier.weight(26f).padding(4.dp)
        ) {
            Text(
                text = "Previous",
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Button(
            onClick = next,
            modifier = modifier.weight(26f).padding(4.dp)
        ) {
            Text(
                text = "Next",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BasketballTeamsLogoPreview() {
    ArtSpaceTheme {
        BasketballTeamsApp()
    }
}