package com.example.android.diceroller.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.diceroller.R
import com.example.android.diceroller.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =
            DataBindingUtil.inflate<FragmentGameOverBinding>(
                inflater,
                R.layout.fragment_game_over,
                container,
                false
            )

        binding.tryAgainButton.setOnClickListener {
            it.findNavController()
                .navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
        (activity as AppCompatActivity).supportActionBar?.title =
            getString(R.string.android_trivia)
        return binding.root
    }
}
