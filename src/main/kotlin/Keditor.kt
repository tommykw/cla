import javax.swing.JFrame
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;
import java.awt.BorderLayout
import javax.swing.JPanel

class Keditor : JFrame() {
    init {
        val panel = JPanel(BorderLayout())
        panel.add(
            RTextScrollPane(RSyntaxTextArea(20, 60).apply {
                syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
                isCodeFoldingEnabled = true
            })
        )

        contentPane = panel
        title = "Demo"
        defaultCloseOperation = EXIT_ON_CLOSE
        pack()
        setLocationRelativeTo(null)
    }
}