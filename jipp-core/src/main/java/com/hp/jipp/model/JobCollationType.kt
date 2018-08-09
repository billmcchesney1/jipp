// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "job-collation-type" enum as defined in:
 *   * [APPLE20150505-1](http://www.pwg.org/pipermail/ipp/2015/018517.html)
 *   * [RFC3381](http://www.iana.org/go/rfc3381)
 */
data class JobCollationType(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An attribute type for [JobCollationType] attributes */
    class Type(name: String) : EnumType<JobCollationType>(name, { get(it) })

    object Code {
        const val uncollatedSheets = 3
        const val collatedDocuments = 4
        const val uncollatedDocuments = 5
    }

    companion object {
        @JvmField val uncollatedSheets = JobCollationType(Code.uncollatedSheets, "uncollated-sheets")
        @JvmField val collatedDocuments = JobCollationType(Code.collatedDocuments, "collated-documents")
        @JvmField val uncollatedDocuments = JobCollationType(Code.uncollatedDocuments, "uncollated-documents")

        @JvmField val all = listOf(
            uncollatedSheets,
            collatedDocuments,
            uncollatedDocuments
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): JobCollationType =
            all[value] ?: JobCollationType(value, "???")
    }
}