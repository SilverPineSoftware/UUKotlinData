package com.silverpine.uu.data.converters

import android.text.TextUtils
import androidx.room.TypeConverter

class UUIntSetConverter
{
    @TypeConverter
    fun stringToObject(value: String?): Set<Int>?
    {
        val actualValue = value ?: return null
        return TextUtils.split(actualValue, ",").mapNotNull { it.toInt() }.toSet()
    }

    @TypeConverter
    fun objectToString(value: Set<Int>?): String?
    {
        val actualValue = value ?: return null
        return TextUtils.join(",", actualValue)
    }
}