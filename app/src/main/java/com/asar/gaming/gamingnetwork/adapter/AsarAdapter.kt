import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asar.gaming.gamingnetwork.databinding.Layout1Binding
import com.asar.gaming.gamingnetwork.model.ModelOne

class AsarAdapter (var list: ArrayList<ModelOne>, var context: Context) :
RecyclerView.Adapter<AsarAdapter.MyViewHolder>() {
    class MyViewHolder(var bind:Layout1Binding): RecyclerView.ViewHolder(bind.root)  {
        fun viewBind(modelOne: ModelOne) {
//            Glide.with(itemView.context)
//                .load(index.image).dontAnimate()
//                .into(bind.imgid)

            bind.img.setImageResource(modelOne.img)
            bind.tv1.text = modelOne.s1
            bind.tv2.text = modelOne.s2
            bind.tv3.text = modelOne.s2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(Layout1Binding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
     return   list.size
    }

    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {
            holder.viewBind(list[position])
    }
}

