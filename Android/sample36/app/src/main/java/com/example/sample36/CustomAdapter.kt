package com.example.sample36

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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
    private val userName = itemView.findViewById<TextView>(R.id.text1)

    // data -> resource (binding)
    fun bind(dataVo: DataVo, context: Context){


        // TextView 데이터를 세팅
        userName.text = dataVo.text1


        // itemView를 클릭시 이벤트발생
        itemView.setOnClickListener{
            println(dataVo.text1)

            // ProfileDtailActivity로 이동
            Intent(context, DetailActivity::class.java).apply {

                // 짐싸
                putExtra("data", dataVo)

                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run { context.startActivity(this) }
        }
    }
}



