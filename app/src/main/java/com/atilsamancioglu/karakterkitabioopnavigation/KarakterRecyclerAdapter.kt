package com.atilsamancioglu.karakterkitabioopnavigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class KarakterRecyclerAdapter (val superKahramanListesi : ArrayList<Superkahraman>) : RecyclerView.Adapter<KarakterRecyclerAdapter.SuperKahramanHolder>() {
    class SuperKahramanHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanHolder(view)
    }

    override fun onBindViewHolder(holder: SuperKahramanHolder, position: Int) {
        val imageView = holder.itemView.findViewById<ImageView>(R.id.recyclerImageView)
        val nameText = holder.itemView.findViewById<TextView>(R.id.recyclerNameText)
        val countryText = holder.itemView.findViewById<TextView>(R.id.recyclerCountryText)

        nameText.text = superKahramanListesi.get(position).isim
        countryText.text = superKahramanListesi.get(position).ulke
        //Picasso.get().load(superKahramanListesi.get(position).gorsel).into(imageView)
        imageView.setImageResource(superKahramanListesi.get(position).gorsel)

        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailsFragment(superKahramanListesi.get(position))
            holder.itemView.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return superKahramanListesi.size
    }

}