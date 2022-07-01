package com.devpass.spaceapp.launchList.data.model

import com.google.gson.annotations.SerializedName

data class LandingLegs(@SerializedName("number")
                       val number: Int = 0,
                       @SerializedName("material")
                       val material: String = "")