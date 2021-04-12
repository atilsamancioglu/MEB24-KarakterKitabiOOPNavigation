package com.atilsamancioglu.karakterkitabioopnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    val superkahramanListesi = ArrayList<Superkahraman>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Data
        val superman = Superkahraman("Superman","Kripton",50,R.drawable.superman)
        val batman = Superkahraman("Batman","Gotham",39,R.drawable.batman)
        val aquaman = Superkahraman("Aquaman","Atlantis",100,R.drawable.aquaman)
        val spiderman = Superkahraman("Spiderman","New York",20,R.drawable.spiderman)
        superkahramanListesi.add(superman)
        superkahramanListesi.add(batman)
        superkahramanListesi.add(aquaman)
        superkahramanListesi.add(spiderman)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //RecyclerView

        val layoutManager = LinearLayoutManager(this.context)
        recyclerView.layoutManager = layoutManager
        val recyclerAdapter = KarakterRecyclerAdapter(superkahramanListesi)
        recyclerView.adapter = recyclerAdapter
        recyclerAdapter.notifyDataSetChanged()


    }


}