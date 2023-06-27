import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nomadfilm_1.databinding.FilmItemBinding
import com.example.nomadfilm_1.ui.ActualFilms
import com.example.nomadfilm_1.ui.home.HomeFragment


class FilmAdapter : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {
    private val filmList = ArrayList<ActualFilms>()
    private var itemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun getFilmList(): List<ActualFilms> {
        return filmList
    }

    fun setOnItemClickListener(listener: HomeFragment) {
        itemClickListener = listener
    }

    fun updateData(newData: List<ActualFilms>) {
        filmList.clear()
        filmList.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val binding = FilmItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilmViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bind(filmList[position], position)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    inner class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {

        init {
            binding.root.setOnClickListener(this)
        }

        fun bind(actualFilms: ActualFilms, position: Int) {
            binding.im.setImageResource(actualFilms.imageId)
            binding.tvTitle.text = actualFilms.title
            binding.root.setOnClickListener {
                itemClickListener?.onItemClick(adapterPosition)
            }
        }

        override fun onClick(v: View) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                itemClickListener?.onItemClick(position)
            }
        }
    }
}
