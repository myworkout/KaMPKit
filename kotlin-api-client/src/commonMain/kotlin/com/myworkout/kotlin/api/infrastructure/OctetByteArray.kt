package com.myworkout.kotlin.api.infrastructure

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
class OctetByteArray(val value: ByteArray) {
    @Serializer(OctetByteArray::class)
    companion object : KSerializer<OctetByteArray> {
        override val descriptor = PrimitiveSerialDescriptor("OctetByteArray", PrimitiveKind.STRING)
        override fun serialize(encoder: Encoder, obj: OctetByteArray) = encoder.encodeString(hex(obj.value))
        override fun deserialize(decoder: Decoder) = OctetByteArray(hex(decoder.decodeString()))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as OctetByteArray
        return value.contentEquals(other.value)
    }

    override fun hashCode(): Int {
        return value.contentHashCode()
    }

    override fun toString(): String {
        return "OctetByteArray(${hex(value)})"
    }
}