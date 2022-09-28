package kr.ac.kumoh.s20180489.w04compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20180489.w04compose.ui.theme.W04ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    W04ComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MyLinearLayout()
        }
    }
}

@Composable
fun MyLinearLayout() {
    Column {
        Row{
            Text(
                text = "안녕하세요",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
            Text(
                text = "컴퓨터공학과",
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(8.dp)
            )
        }
        Text(
            text = "어디서 본 것 같은 예제",
            modifier = Modifier
                .background(Color.Magenta)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}


// app compact library : 하위 버전 sdk에서 상위 버전의 변경된 함수를 포함한 어플을 실행시키기 위해 매핑 시켜주는 라이브러리
// jetpack library : compose를 위한 별도의 라이브러리
// databinding : mvvm을 위해 사용