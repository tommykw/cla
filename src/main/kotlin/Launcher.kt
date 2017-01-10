import javax.swing.SwingUtilities

class Launcher {
    companion object {
        fun main(args: Array<String>) {
            SwingUtilities.invokeLater {
                Keditor().isVisible = true
            }
        }
    }
}