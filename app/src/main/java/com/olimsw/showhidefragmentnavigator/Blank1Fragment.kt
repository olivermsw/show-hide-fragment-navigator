package com.olimsw.showhidefragmentnavigator

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Blank1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_blank1, container, false)
        val btn1 = inflate.findViewById<Button>(R.id.button)
        val btn2 = inflate.findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            findNavController().navigate(R.id.action_blank1Fragment_to_blank2Fragment)
        }
        btn2.setOnClickListener {
            findNavController().navigate(R.id.action_blank1Fragment_to_blank3Fragment)
        }
        Log.e("msw", "onCreateView")
        return inflate
    }

    override fun onStart() {
        super.onStart()
        Log.e("msw", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("msw", "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("msw", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("msw", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("msw", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("msw", "onDestroyView")
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        Log.e("msw", "onHiddenChanged:$hidden")
    }

}