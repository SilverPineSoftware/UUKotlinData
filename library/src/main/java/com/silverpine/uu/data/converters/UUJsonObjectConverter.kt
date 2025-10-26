package com.silverpine.uu.data.converters

import androidx.room.TypeConverter
import com.silverpine.uu.core.UUJson

open class UUJsonObjectConverter<T: Any>(private val objectClass: Class<T>)
{
    @TypeConverter
    fun stringToObject(value: String?): T?
    {
        return UUJson.fromString(value, objectClass)
    }

    @TypeConverter
    fun objectToString(value: T?): String?
    {
        return UUJson.toJson(value, objectClass)
    }
}