package com.creativeitinstitute.quizappdatabinding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.creativeitinstitute.quizappdatabinding.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    lateinit var binding: FragmentGameWonBinding

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentGameWonBinding.inflate(layoutInflater, container, false)

        val score = GameWonFragmentArgs.fromBundle(requireArguments()).score
        val numberOfQuestion= GameWonFragmentArgs.fromBundle(requireArguments()).numberOfQuestion

        binding.apply {
            txtScore.text = "Your Score is $score out of $numberOfQuestion questions"
        }

        return binding.root
    }


}