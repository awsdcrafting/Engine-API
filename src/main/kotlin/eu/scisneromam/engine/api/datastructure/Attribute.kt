package eu.scisneromam.engine.api.datastructure

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
abstract class Attribute protected constructor(
    val type: Type,
    val subType: SubType
)
{
    abstract fun getValueAsString(): String

    open fun getValueAsInt() : Int
    {
        throw UnsupportedOperationException("getValueAsInt is not supported!")
    }
    open fun getValueAsLong() : Long
    {
        throw UnsupportedOperationException("getValueAsLong is not supported!")
    }
    open fun getValueAsDouble() : Double
    {
        throw UnsupportedOperationException("getValueAsDouble is not supported!")
    }
    open fun getValueAsFloat() : Float
    {
        throw UnsupportedOperationException("getValueAsFloat is not supported!")
    }
    open fun getValueAsByte() : Byte
    {
        throw UnsupportedOperationException("getValueAsByte is not supported!")
    }
    open fun getValueAsBoolean() : Boolean
    {
        throw UnsupportedOperationException("getValueAsBoolean is not supported!")
    }

    open fun setValueFromInt(value : Int)
    {
        throw UnsupportedOperationException("setValueFromInt(value) is not supported!")
    }
    open fun setValueFromLong(value : Long)
    {
        throw UnsupportedOperationException("setValueFromLong(value) is not supported!")
    }
    open fun setValueFromDouble(value : Double)
    {
        throw UnsupportedOperationException("setValueFromDouble(value) is not supported!")
    }
    open fun setValueFromFloat(value : Float)
    {
        throw UnsupportedOperationException("setValueFromFloat(value) is not supported!")
    }
    open fun setValueFromByte(value : Byte)
    {
        throw UnsupportedOperationException("setValueFromByte(value) is not supported!")
    }
    open fun setValueFromBoolean(value : Boolean)
    {
        throw UnsupportedOperationException("setValueFromBoolean(value) is not supported!")
    }



    /**
     * Json string representation
     */
    abstract override fun toString(): String

    open fun listGetValueByIndex(index : Int) : Attribute
    {
        throw UnsupportedOperationException("listGetValueByIndex(index) is not supported!")
    }

    open fun listSetValueByIndex(index : Int, value : Attribute)
    {
        throw UnsupportedOperationException("listSetValueByIndex(index, value) is not supported!")
    }


    open fun listAddValue(value : Any)
    {
        throw UnsupportedOperationException("listAddValue(value) is not supported!")
    }

    open fun listRemoveValueByIndex(index : Int) : Attribute
    {
        throw UnsupportedOperationException("listRemoveValueByIndex(index) is not supported!")
    }

    open fun containerGetAttributeByName(name : String) : Optional<Attribute>
    {
        throw UnsupportedOperationException("containerGetAttributeByName(name) is not supported!")
    }

    open fun containerSetAttribute(name : String, attribute: Attribute) : Optional<Attribute>
    {
        throw UnsupportedOperationException("containerSetAttribute(name, attribute) is not supported!")
    }

    open fun containerRemoveAttributeByName(name : String) : Optional<Attribute>
    {
        throw UnsupportedOperationException("containerRemoveAttributeByName(name) is not supported!")
    }

}