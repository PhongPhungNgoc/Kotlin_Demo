package com.example.kotlin_demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var arrayFood: ArrayList<Food>) : BaseAdapter() {

    class ViewHolder(row: View) {
        var tvNameFood: TextView
        var imageViewFood: ImageView

        init {
            tvNameFood = row.findViewById(R.id.tvNameFood) as TextView
            imageViewFood = row.findViewById(R.id.imageFood) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?   // View co the null
        var viewholder: ViewHolder

        if (convertView == null) {
            var inflater: LayoutInflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.item_view, null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        } else {
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }

        var food: Food = getItem(position) as Food

        viewholder.tvNameFood.text = food.name
        viewholder.imageViewFood.setImageResource(food.image)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return arrayFood.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayFood.size
    }
}