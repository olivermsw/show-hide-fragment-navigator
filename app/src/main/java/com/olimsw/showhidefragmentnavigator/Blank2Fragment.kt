package com.olimsw.showhidefragmentnavigator

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Blank2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.e("msw2", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("msw2", "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("msw2", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("msw2", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("msw2", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("msw2", "onDestroyView")
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        Log.e("msw2", "onHiddenChanged:$hidden")
    }
}