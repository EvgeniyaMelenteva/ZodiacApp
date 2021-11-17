package com.example.zodiacapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

val zodiacList: List<Zodiac> = listOf(
    Zodiac("Овен", "21 марта – 20 апреля", "огонь"),
    Zodiac("Телец", "21 апреля – 20 мая", "земля"),
    Zodiac("Близнецы", "21 мая – 21 июня", "воздух"),
    Zodiac("Рак", "22 июня – 22 июля", "вода"),
    Zodiac("Лев", "23 июля – 23 августа", "огонь"),
    Zodiac("Дева", "24 августа – 23 сентября", "земля"),
    Zodiac("Весы", "24 сентября – 23 октября", "воздух"),
    Zodiac("Скорпион", "24 октября – 22 ноября", "вода"),
    Zodiac("Стрелец", "23 ноября – 21 декабря", "огонь"),
    Zodiac("Козерог", "22 декабря – 20 января", "земля"),
    Zodiac("Водолей", "21 января – 20 февраля", "воздух"),
    Zodiac("Рыбы", "21 февраля – 20 марта", "вода")
)

val zodiacRecyclerView: RecyclerView = findViewById(R.id.zodiac_recycler_view)
zodiacRecyclerView.layoutManager =
LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
zodiacRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
)

zodiacRecyclerView.adapter = ZodiacAdapter(zodiacList)

class ZodiacFragment : Fragment() {


}

