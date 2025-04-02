package com.example.tripmate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toolbar

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var ToolBar = view.findViewById<Toolbar>(R.id.toolBar)

        var search = view.findViewById<ImageButton>(R.id.search)
        var rl = view.findViewById<RelativeLayout>(R.id.clOneRlOne)
        val cross = view.findViewById<ImageButton>(R.id.cross)

        search.setOnClickListener {
            rl.visibility = View.VISIBLE
            search.visibility = View.GONE
            cross.visibility = View.VISIBLE
        }

        cross.setOnClickListener {
            rl.visibility = View.GONE
            search.visibility = View.VISIBLE
            cross.visibility = View.GONE
        }
    }
}