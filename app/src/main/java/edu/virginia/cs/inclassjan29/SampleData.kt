import android.net.Uri
import edu.virginia.cs.inclassjan29.Message
import edu.virginia.cs.inclassjan29.R

/**
 * SampleData for Jetpack Compose Tutorial 
 */
object SampleData {
    // Sample conversation data
    private val profilePicture: Uri = Uri.parse("android.resource://"+ R.drawable.profile_picture)

    val conversationSample = listOf(
        Message(
            "Lexi",
            profilePicture,
            "Test...Test...Test..."
        ),
        Message(
            "Lexi",
            profilePicture,
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim()
        ),
        Message(
            "Lexi",
            profilePicture,
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trim()
        ),
        Message(
            "Lexi",
            profilePicture,
            "Searching for alternatives to XML layouts..."
        ),
        Message(
            "Lexi",
            profilePicture,
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        Message(
            "Lexi",
            profilePicture,
            "It's available from API 21+ :)"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Android Studio next version's name is Arctic Fox"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message(
            "Lexi",
            profilePicture,
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message(
            "Lexi",
            profilePicture,
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
