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
 * @param vo2max 
 * @param biologicalAge 
 * @param hash Short base64 encoded string that can be used to reference the shared evaluation in urls
 */
@Serializable
data class SharedEvaluation (
    @SerialName(value = "vo2max") val vo2max: kotlin.Int? = null,
    @SerialName(value = "biological_age") val biologicalAge: kotlin.Int? = null,
    /* Short base64 encoded string that can be used to reference the shared evaluation in urls */
    @SerialName(value = "hash") val hash: kotlin.String? = null
)

