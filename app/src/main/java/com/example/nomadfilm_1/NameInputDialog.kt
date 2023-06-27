import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class NameInputDialog : DialogFragment() {
    private lateinit var listener: NameInputDialogListener

    interface NameInputDialogListener {
        fun onNameEntered(name: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            listener = context as NameInputDialogListener
        } catch (e: ClassCastException) {
            throw ClassCastException("$context must implement NameInputDialogListener")
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val input = EditText(requireContext())
            builder.setTitle("Напишите имя пользователя")
                .setView(input)
                .setPositiveButton("Сохранить") { dialog, id ->
                    val name = input.text.toString().trim()
                    if (name.isNotEmpty()) {
                        listener.onNameEntered(name)
                    }
                }
                .setNegativeButton("Назад") { dialog, id ->
                    dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
