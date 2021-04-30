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

import com.myworkout.kotlin.api.models.TeamCaptain
import com.myworkout.kotlin.api.models.TeamFeed

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 * @param id Deprecated, use uuid instead
 * @param uuid 
 * @param name 
 * @param feed 
 * @param inviteUrl Link to the public invite to join the team which is only accessible to the team captain
 * @param captain 
 */
@Serializable
data class Team (
    /* Deprecated, use uuid instead */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "id") val id: kotlin.Int? = null,
    @SerialName(value = "uuid") val uuid: kotlin.String? = null,
    @SerialName(value = "name") val name: kotlin.String? = null,
    @SerialName(value = "feed") val feed: TeamFeed? = null,
    /* Link to the public invite to join the team which is only accessible to the team captain */
    @SerialName(value = "invite_url") val inviteUrl: kotlin.String? = null,
    @SerialName(value = "captain") val captain: TeamCaptain? = null
)

