/**
* Myworkout API
* Documentation for Myworkout API 2.  Basic concepts are explained in this section.  # Localization The API supports localization for error messages like validation errors. The preferred way to request language is to set proper `Accept-Language` header, but this can be overriden by adding a `lang` query parameter to the request.  - _Example 1_: `Accept-Language: no` - _Example 2_: `en-GB,en-US;q=0.9,en;q=0.8` 
*
* The version of the OpenAPI document: <%= ENV[\"API_VERSION\"] %>
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.myworkout.kotlin.api.models


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 * @param time iso8601
 * @param relativeAltitude Relative change in meters
 * @param pressure Pressure in kilopascal (kPa)
 */
@Serializable
data class Altitude (
    /* iso8601 */
    @SerialName(value = "time") @Required val time: kotlin.String,
    /* Relative change in meters */
    @SerialName(value = "relative_altitude") @Required val relativeAltitude: kotlin.Double,
    /* Pressure in kilopascal (kPa) */
    @SerialName(value = "pressure") val pressure: kotlin.Double? = null
)

