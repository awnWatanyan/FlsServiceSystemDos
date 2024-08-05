package com.aeon.flsservicesystem_test.user_manager

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DeviceData::class], version = 1)
abstract class DeviceDatabase : RoomDatabase() {
    abstract fun deviceDao(): DeviceDao
}