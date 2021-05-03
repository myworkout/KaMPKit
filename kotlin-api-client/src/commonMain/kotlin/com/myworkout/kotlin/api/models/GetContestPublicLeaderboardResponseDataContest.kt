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
 * @param publicId public ID of contest
 * @param name name of the contest
 * @param startAt ISO8601 time of when the contest is starting
 * @param finishAt ISO8601 time of when the contest is finishing
 * @param dailyScoreLimit Score limit per user per day. If not set, no score limit is in effect.
 * @param rules Localized list of rules that is applicable to the contest that the user needs to be aware of.
 */
@Serializable
data class GetContestPublicLeaderboardResponseDataContest (
    /* public ID of contest */
    @SerialName(value = "public_id") val publicId: kotlin.String? = null,
    /* name of the contest */
    @SerialName(value = "name") val name: kotlin.String? = null,
    /* ISO8601 time of when the contest is starting */
    @SerialName(value = "start_at") val startAt: kotlin.String? = null,
    /* ISO8601 time of when the contest is finishing */
    @SerialName(value = "finish_at") val finishAt: kotlin.String? = null,
    /* Score limit per user per day. If not set, no score limit is in effect. */
    @SerialName(value = "daily_score_limit") val dailyScoreLimit: kotlin.Int? = null,
    /* Localized list of rules that is applicable to the contest that the user needs to be aware of. */
    @SerialName(value = "rules") val rules: kotlin.collections.List<kotlin.String>? = null
)

