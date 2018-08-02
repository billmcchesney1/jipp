// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-volume-supported" collection as defined in:
 * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterVolumeSupported
@JvmOverloads constructor(
    var xDimension: Int? = null,
    var yDimension: Int? = null,
    var zDimension: Int? = null
) : AttributeCollection {

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            xDimension?.let { Types.xDimension.of(it) },
            yDimension?.let { Types.yDimension.of(it) },
            zDimension?.let { Types.zDimension.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<PrinterVolumeSupported>(PrinterVolumeSupported)

    /** All member names as strings. */
    object Name {
        /** "x-dimension" member name */
        const val xDimension = "x-dimension"
        /** "y-dimension" member name */
        const val yDimension = "y-dimension"
        /** "z-dimension" member name */
        const val zDimension = "z-dimension"
    }

    /** Types for each member attribute. */
    object Types {
        val xDimension = IntType(Name.xDimension)
        val yDimension = IntType(Name.yDimension)
        val zDimension = IntType(Name.zDimension)
    }

    /** Defines types for each member of [PrinterVolumeSupported] */
    companion object : AttributeCollection.Converter<PrinterVolumeSupported> {
        override fun convert(attributes: List<Attribute<*>>): PrinterVolumeSupported =
            PrinterVolumeSupported(
                extractOne(attributes, Types.xDimension),
                extractOne(attributes, Types.yDimension),
                extractOne(attributes, Types.zDimension)
            )
    }
}
