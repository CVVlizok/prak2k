package com.example.prak2k
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.prak2k.R

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        val buttonNext: Button = view.findViewById(R.id.btn_next)
        val buttonBack: Button = view.findViewById(R.id.btn_back)

        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }

        buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return view
    }
}