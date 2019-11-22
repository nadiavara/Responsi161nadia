package com.example.responsi161

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val context: Activity,
                  private val nama: Array<String>,
                  private val gambar: Array<Int>) : ArrayAdapter<String> (context,
    R.layout.activity_list_adapter, nama) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_list_adapter, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView

        titleText.text = nama[position]
        imageView.setImageResource(gambar[position])

        return rowView
    }
}
