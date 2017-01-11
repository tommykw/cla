import javax.swing.SwingUtilities

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        SwingUtilities.invokeLater {
            Keditor().isVisible = true
        }
    }
}