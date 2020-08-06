// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "power-state-transitions-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PowerStateTransitionsCol
constructor(
    var endPowerState: String? = null,
    var startPowerState: String? = null,
    var stateTransitionSeconds: Int? = null
) : AttributeCollection {

    /** Construct an empty [PowerStateTransitionsCol]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            endPowerState?.let { PowerStateTransitionsCol.endPowerState.of(it) },
            startPowerState?.let { PowerStateTransitionsCol.startPowerState.of(it) },
            stateTransitionSeconds?.let { PowerStateTransitionsCol.stateTransitionSeconds.of(it) }
        )
    }

    /** Defines types for each member of [PowerStateTransitionsCol]. */
    companion object : AttributeCollection.Converter<PowerStateTransitionsCol> {
        override fun convert(attributes: List<Attribute<*>>): PowerStateTransitionsCol =
            PowerStateTransitionsCol(
                extractOne(attributes, endPowerState),
                extractOne(attributes, startPowerState),
                extractOne(attributes, stateTransitionSeconds)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val endPowerState = KeywordType("end-power-state")
        @JvmField val startPowerState = KeywordType("start-power-state")
        @JvmField val stateTransitionSeconds = IntType("state-transition-seconds")
    }
    override fun toString() = "PowerStateTransitionsCol(${attributes.joinToString()})"
}
