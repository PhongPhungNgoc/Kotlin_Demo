package com.example.kotlin_demo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_view.view.*

class RecycleFoodAdapter(val context: Context, val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<RecycleFoodAdapter.FoodViewHolder>() {

    companion object {
        val TAG: String = RecycleFoodAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): FoodViewHolder {
        return FoodViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(foodViewHolder: FoodViewHolder, position: Int) {
        val food: Food = listFood.get(position)
//        foodViewHolder?.tvNameFood.text = food.name
//        foodViewHolder?.imageViewFood.setImageResource(food.image)
        foodViewHolder.setData(food, position)
    }

    inner class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //        val tvNameFood = view.tvNameFood
//        val imageViewFood = view.imageFood

        var currentFood: Food? = null
        var currentPosition: Int = 0

        fun setData(food: Food?, position: Int) {
            food?.let {
                itemView.tvNameFood.text = it.name
                itemView.imageFood.setImageResource(it.image)
            }

            this.currentFood = food
            this.currentPosition = position
        }

        init {
            itemView.setOnClickListener {
                currentFood?.let {
                   Toast.makeText(context, it!!.name, Toast.LENGTH_SHORT).show()
                }
            }

            itemView.imageFood.setOnLongClickListener {
                Toast.makeText(context, "Long Click", Toast.LENGTH_LONG).show()
                return@setOnLongClickListener true
            }
        }
    }

}