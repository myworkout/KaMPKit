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

import com.myworkout.kotlin.api.models.TeamsByUuidInput

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 * @param name 
 * @param startAt iso8601
 * @param finishAt iso8601
 * @param visibility 
 * @param teams 
 */
@Serializable
data class UpdateContestInput (
    @SerialName(value = "name") val name: kotlin.String? = null,
    /* iso8601 */
    @SerialName(value = "start_at") val startAt: kotlin.String? = null,
    /* iso8601 */
    @SerialName(value = "finish_at") val finishAt: kotlin.String? = null,
    @SerialName(value = "visibility") val visibility: UpdateContestInput.Visibility? = null,
    @SerialName(value = "teams") val teams: kotlin.collections.List<TeamsByUuidInput>? = null
) {

    /**
     * 
     * Values: PUBLIC,CONTESTANTS
     */
    @Serializable
    enum class Visibility(val value: kotlin.String) {
        @SerialName(value = "public") PUBLIC("public"),
        @SerialName(value = "contestants") CONTESTANTS("contestants");
    }
}

