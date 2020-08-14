package com.kenruizinoue.recyclerviewtemplate03

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(inflatedView: View) :
// uses the item.xml layout to inflate the row item
    RecyclerView.ViewHolder(inflatedView), View.OnClickListener {

    private lateinit var label: String

    init {
        inflatedView.setOnClickListener(this)
    }

    var mTextView: TextView = itemView.findViewById(R.id.itemTextView)
    fun bind(label: String) {
        this.label = label
        mTextView.text = label
    }

    override fun onClick(v: View) {
        val context = itemView.context
        val showDetailIntent = Intent(context, DetailActivity::class.java)
        showDetailIntent.putExtra("EXTRA", this.label)
        context.startActivity(showDetailIntent)
    }
}