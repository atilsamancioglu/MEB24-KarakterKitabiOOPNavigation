package com.atilsamancioglu.karakterkitabioopnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val secilenKahraman = DetailsFragmentArgs.fromBundle(it).secilenKahraman
            detailsImageView.setImageResource(secilenKahraman.gorsel)
            detailsName.text = secilenKahraman.isim
            detailsCountry.text = secilenKahraman.ulke
            detailsAge.text = secilenKahraman.yas.toString()
        }
    }


}