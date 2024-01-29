package edu.virginia.cs.inclassjan29

import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.virginia.cs.inclassjan29.ui.theme.InClassJan29Theme


/**
 * Class definition for an activity
 */
class MainActivity : ComponentActivity() {

    /**
     * This method is invoked when the activity is created
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InClassJan29Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageCard(Message(
                        "Author name",
                        Uri.parse("android.resource://"+R.drawable.profile_picture),
                        "message text"),
                        modifier = Modifier)
                }
            }
        }
    }
}

/**
 * A Composable function is a function that is used to build
 * UI elements/components at the code level. The advantage of
 * this decomposition is that now, anywhere else in our app, we
 * can *reuse* this Greeting method as a generic way to render
 * a greeting (so, for instance, if we want a Greeting at the
 * top of every page, we simply call this function).
 *
 * In general, you should write all Composable functions
 * to take in a Modifier
 */
@Composable
fun MessageCard(message: Message, modifier: Modifier = Modifier) {
    Surface {
        Row {
            Image(
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Profile picture",
                modifier = modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column() {
                Text(
                    text = message.author,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
                Spacer(modifier = modifier.height(4.dp))

                Surface(
                    shape = MaterialTheme.shapes.medium,
                    shadowElevation = 1.dp
                ) {
                    Text(
                        text = message.text,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = modifier.padding(all = 4.dp)
                    )
                }
            }
        }
    }
}


/**
 * The "Preview" is used explicitly as a developer tool within the
 * Android Studio IDE to preview a generated view of the IDE without
 * needing to boot up an entire Android emulator.
 *
 * Preview methods must be composable, and must take in exactly
 * ZERO arguments. Typically, you will create "example data" in the
 * Preview method before invoking what you wish to show
 */
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    name = "LightMode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkMode")
@Composable
fun GreetingPreview() {
    val previewMessage = Message(
        "Author name",
        Uri.parse("android.resource://"+R.drawable.profile_picture),
        "message text")

    InClassJan29Theme {
        MessageCard(previewMessage)
    }
}