package com.devpass.spaceapp.launchList.data.model

import com.google.gson.annotations.SerializedName

data class Thrust(@SerializedName("lbf")
                  val lbf: Int = 0,
                  @SerializedName("kN")
                  val kN: Int = 0)