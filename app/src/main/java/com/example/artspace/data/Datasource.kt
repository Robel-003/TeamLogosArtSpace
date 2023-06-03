package com.example.artspace.data

import com.example.artspace.R
import com.example.artspace.model.Teams

class Datasource {
    fun loadTeams(): List<Teams> {
        return listOf<Teams>(
            Teams(R.string.Hawks, R.drawable.atlanta_hawks),
            Teams(R.string.Celtics, R.drawable.boston_celtics),
            Teams(R.string.Nets, R.drawable.brooklyn_nets),
            Teams(R.string.Hornets, R.drawable.charlotte_hornets),
            Teams(R.string.Bulls, R.drawable.chicago_bulls),
            Teams(R.string.Cavaliers, R.drawable.cleveland_cavaliers),
            Teams(R.string.Mavericks, R.drawable.dallas_mavericks),
            Teams(R.string.Nuggets, R.drawable.denver_nuggets),
            Teams(R.string.Pistons, R.drawable.detroit_pistons),
            Teams(R.string.Warriors, R.drawable.golden_state_warriors),
            Teams(R.string.Rockets, R.drawable.houston_rockets),
            Teams(R.string.Pacers, R.drawable.indiana__pacers),
            Teams(R.string.Clippers, R.drawable.losangeles_clippers),
            Teams(R.string.Lakers, R.drawable.losangeles_lakers),

            Teams(R.string.Grizzlies, R.drawable.memphis_grizzlies),
            Teams(R.string.Heat, R.drawable.miami_heat),
            Teams(R.string.Bucks, R.drawable.milwaukee_bucks),
            Teams(R.string.Timberwolves, R.drawable.minnesota_timberwolves),
            Teams(R.string.Pelicans, R.drawable.neworleans_pelicans),
            Teams(R.string.Knicks, R.drawable.newyork_knicks),
            Teams(R.string.Thunder, R.drawable.oklahoma_city_thunder),
            Teams(R.string.Magic, R.drawable.orlando_magic),
            Teams(R.string.Sixers, R.drawable.philadelphia_76ers),
            Teams(R.string.Suns, R.drawable.phoenix_suns),
            Teams(R.string.Blazers, R.drawable.portland_blazers),
            Teams(R.string.Kings, R.drawable.sacramento_kings),
            Teams(R.string.Spurs, R.drawable.sanantonio_spurs),
            Teams(R.string.Raptors, R.drawable.toronto_raptors),
            Teams(R.string.Jazz, R.drawable.utah_jazz),
            Teams(R.string.Wizards, R.drawable.washington_wizards),
        )
    }

}