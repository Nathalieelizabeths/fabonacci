package com.tali.fibotwo

import android.view.LayoutInflater

class FibonacciAdapter(private val numbers: List<Int>) :
    RecyclerView.Adapter<FibonacciAdapter.FibonacciViewHolder>() {

    inner class FibonacciViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_item, parent, false)
        return FibonacciViewHolder(view)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        val number = numbers[position]
        holder.numberTextView.text = number.toString()
    }

    override fun getItemCount() = numbers.size
}

