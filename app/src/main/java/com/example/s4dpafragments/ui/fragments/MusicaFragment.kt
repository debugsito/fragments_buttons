package com.example.s4dpafragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.s4dpafragments.R
import com.example.s4dpafragments.ui.fragments.adapter.SongAdapter
import com.example.s4dpafragments.ui.fragments.model.SongModel


class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(listSong())

        return view
    }

    private fun listSong(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()
        lstSong.add(SongModel(1,R.drawable.eltesoro, "El tesoro","La Síntesis O'konor","20 mil rep.","3:36"))
        lstSong.add(SongModel(2,R.drawable.dinastiaescorpio, "Chica de oro","La Dinastía Escorpio","35 mil rep.","3:20"))
        lstSong.add(SongModel(3,R.drawable.one_piece, "¡We Are!","Openings","55 mil rep.","2:50"))
        lstSong.add(SongModel(4,R.drawable.suertecampeon, "Rayo lento","Suerte campeón","28 mil rep.","3:16"))
        lstSong.add(SongModel(5,R.drawable.violencia, "Violencia","Violencia","28 mil rep.","2:56"))
        return  lstSong;
    }

}