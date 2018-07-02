package com.cogniance.izhaldak.navigationtryout.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.cogniance.izhaldak.navigationtryout.R

class MainFragment : Fragment() {
    private lateinit var  button: Button

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val root = inflater.inflate(R.layout.main_fragment, container, false)
        button = root.findViewById(R.id.button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment2) }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }

}
