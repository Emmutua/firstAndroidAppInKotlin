import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test1.ui.theme.Test1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container that uses the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {

                   GreetingWithBirthdayText(name = "Emmanuel","Imelda")
               }
            }
        }
    }
}
@Composable
fun GreetingWithBirthdayText(name:String,from:String){
    Column{
        Text(text = "Hello, Happy birthday -$name", fontSize =26.sp)
        Text(text = "From $from", fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
    }
}
@Preview(showBackground = true)
@Composable
fun defaultPreview(){
    Test1Theme {
        GreetingWithBirthdayText("Emmanuel","Imeldah")
    }
}
