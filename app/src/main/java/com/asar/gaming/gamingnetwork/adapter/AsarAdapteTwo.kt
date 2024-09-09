import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asar.gaming.gamingnetwork.databinding.RowItemLayoutBinding
import com.asar.gaming.gamingnetwork.model.ModelTwo

class AsarAdapteTwo (var list: ArrayList<ModelTwo>, var context: Context) :
RecyclerView.Adapter<AsarAdapteTwo.MyViewHolder>() {
    class MyViewHolder(var bind:RowItemLayoutBinding): RecyclerView.ViewHolder(bind.root)  {
        fun viewBind(modelTwo: ModelTwo) {
//            Glide.with(itemView.context)
//                .load(index.image).dontAnimate()
//                .into(bind.imgid)

            bind.img.setImageResource(modelTwo.img)
            bind.tv1.text = modelTwo.title
            bind.tv2.text = modelTwo.subtitleData
            bind.yesbtn.text = modelTwo.y1
            bind.nobtn.text = modelTwo.N2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RowItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
     return   list.size
    }

    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {
            holder.viewBind(list[position])
    }
}

