package com.aeon.flsservicesystem_test.user_manager


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DeviceData (
    @PrimaryKey var imei: String
)