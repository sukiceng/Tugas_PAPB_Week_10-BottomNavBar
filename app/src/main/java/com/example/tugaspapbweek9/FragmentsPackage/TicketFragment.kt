package com.example.tugaspapbweek9.FragmentsPackage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugaspapbweek9.R
import com.example.tugaspapbweek9.databinding.FragmentProfileBinding
import com.example.tugaspapbweek9.databinding.FragmentTicketBinding

class TicketFragment : Fragment() {
    private lateinit var binding: FragmentTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTicketBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
}