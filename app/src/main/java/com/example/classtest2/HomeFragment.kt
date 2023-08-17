package com.example.classtest2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_home, container, false)

        val firstProduct=rowView.findViewById<ImageView>(R.id.people_product)
        val secondProduct=rowView.findViewById<RelativeLayout>(R.id.second_product)

        firstProduct.setOnClickListener {
            Toast.makeText(activity, "Your product is selected", Toast.LENGTH_SHORT).show()
        }
        secondProduct.setOnClickListener {
            Toast.makeText(requireContext(), "Your product is selected", Toast.LENGTH_SHORT).show()
        }
        return rowView
    }


}