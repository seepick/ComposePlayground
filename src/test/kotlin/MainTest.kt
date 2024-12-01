import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MainTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun textChangesWhenButtonIsClicked(){
        rule.setContent {
            Buttons()
        }
        rule.onNodeWithTag(Tags.ButtonHello).assertTextEquals("Hello, World!")
        rule.onNodeWithTag(Tags.ButtonHello).performClick()
        rule.onNodeWithTag(Tags.ButtonHello).assertTextEquals("Hello, Desktop!")
    }
}