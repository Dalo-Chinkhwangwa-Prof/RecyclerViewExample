package com.example.rvexample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.rvexample.R
import com.example.rvexample.model.Customer

class RestaurantAdapter(val customerList: List<Customer>) :
    RecyclerView.Adapter<RestaurantAdapter.MyCustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item_view_layout, parent, false)
        return MyCustomViewHolder(view)

    }

    override fun getItemCount(): Int = customerList.size


    override fun onBindViewHolder(viewHolder: MyCustomViewHolder, position: Int) {

        viewHolder.apply {
            nameTextView.text = customerList.get(position).customerName
            mealTextView.text = customerList.get(position).meal
            dessertTextView.text = customerList.get(position).dessert
        }
    }


    class MyCustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.customer_name_textview)
        val mealTextView: TextView = itemView.findViewById(R.id.meal_textview)
        val dessertTextView: TextView = itemView.findViewById(R.id.dessert_textview)
    }
}