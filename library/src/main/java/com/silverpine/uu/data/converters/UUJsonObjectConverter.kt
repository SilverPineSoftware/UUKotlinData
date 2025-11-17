package com.silverpine.uu.data.converters

import androidx.room.TypeConverter
import com.silverpine.uu.core.UUJson

open class UUJsonObjectConverter<T: Any>(private val objectClass: Class<T>)
{
    @TypeConverter
    fun stringToObject(value: String?): T?
    {
        val actualValue = value ?: return null
        return UUJson.fromString(actualValue, objectClass).getOrNull()
    }

    @TypeConverter
    fun objectToString(value: T?): String?
    {
        val actualValue = value ?: return null
        return UUJson.toJson(actualValue, objectClass).getOrNull()
    }
}