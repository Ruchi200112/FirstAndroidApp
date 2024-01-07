package com.example.firstapp

// ItemAdapter.kt
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val context: Context) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.productName.text = context.getString(R.string.login)
        holder.button.setOnClickListener {
        val intent = Intent (context,SecondActivity::class.java)
        context.startActivity(intent)

        }

        holder.orderid.text = "Akash $position"
    }

    override fun getItemCount(): Int {
        return 20
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName : TextView = itemView.findViewById(R.id.tvProductName)
        val button : Button = itemView.findViewById(R.id.btnClickHere)
        val orderid : TextView =  itemView.findViewById(R.id.tvOrderId)
    }
}
