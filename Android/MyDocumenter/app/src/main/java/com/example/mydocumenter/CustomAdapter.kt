package com.example.sample30

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mydocumenter.DetailActivity
import com.example.mydocumenter.R

class CustomAdapter(private val context:Context, private val dataList: ArrayList<DataVo>) : RecyclerView.Adapter<ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_layout, parent, false)
        return  ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataList[position], context)
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }
}

class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    private val userPhoto = itemView.findViewById<ImageView>(R.id.img_profile)
    private val title = itemView.findViewById<TextView>(R.id.titleText)
    private val time = itemView.findViewById<TextView>(R.id.timeText)

    // data -> resource (binding)
    fun bind(dataVo: DataVo, context: Context){
        // 사진
        if(dataVo.photo != ""){
            val resourceId = context.resources.getIdentifier(dataVo.photo, "drawable", context.packageName)

            if(resourceId > 0){
                userPhoto.setImageResource(resourceId)
            }else{
                Glide.with(itemView).load(dataVo.photo).into(userPhoto)
            }
        } else{
            userPhoto.setImageResource(R.mipmap.ic_launcher_round) // 이미지 없다. 아무 이미지나 뿌린다
        }

        // TextView 데이터를 세팅
        title.text = dataVo.title
        time.text = dataVo.regDate

        // itemView 를 클릭시
        itemView.setOnClickListener{
            println(dataVo.title + " " + dataVo.photo)

            // ProfileDetailActivity 로 이동
            Intent(context, DetailActivity::class.java).apply {

                // 짐싸!
                putExtra("data", dataVo)

                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run { context.startActivity(this) }
        }
    }
}









