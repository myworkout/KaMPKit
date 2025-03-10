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

import com.myworkout.kotlin.api.models.FeedActivityActivityData
import com.myworkout.kotlin.api.models.FeedActivityUser

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 * @param uuid 
 * @param activityData 
 * @param type 
 * @param createdAt iso8601 formatted time of when the notification was created
 * @param updatedAt iso8601 formatted time of when the notification was updated
 * @param user 
 */
@Serializable
data class FeedActivity (
    @SerialName(value = "uuid") val uuid: kotlin.String? = null,
    @SerialName(value = "activity_data") val activityData: FeedActivityActivityData? = null,
    @SerialName(value = "type") val type: FeedActivity.Type? = null,
    /* iso8601 formatted time of when the notification was created */
    @SerialName(value = "created_at") val createdAt: kotlin.String? = null,
    /* iso8601 formatted time of when the notification was updated */
    @SerialName(value = "updated_at") val updatedAt: kotlin.String? = null,
    @SerialName(value = "user") val user: FeedActivityUser? = null
) {

    /**
     * 
     * Values: MESSAGE,EVENT_WORKOUT_POINTS,EVENT_GAINED_HANDICAP_POINTS,EVENT_CONTEST_HAS_STARTED,EVENT_CONTEST_HAS_ENDED,EVENT_CONTEST_WEEKLY_BOUT_ENDED,EVENT_TEAM_MEMBER_ADDED,EVENT_TEAM_MEMBER_REMOVED
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "message") MESSAGE("message"),
        @SerialName(value = "event_workout_points") EVENT_WORKOUT_POINTS("event_workout_points"),
        @SerialName(value = "event_gained_handicap_points") EVENT_GAINED_HANDICAP_POINTS("event_gained_handicap_points"),
        @SerialName(value = "event_contest_has_started") EVENT_CONTEST_HAS_STARTED("event_contest_has_started"),
        @SerialName(value = "event_contest_has_ended") EVENT_CONTEST_HAS_ENDED("event_contest_has_ended"),
        @SerialName(value = "event_contest_weekly_bout_ended") EVENT_CONTEST_WEEKLY_BOUT_ENDED("event_contest_weekly_bout_ended"),
        @SerialName(value = "event_team_member_added") EVENT_TEAM_MEMBER_ADDED("event_team_member_added"),
        @SerialName(value = "event_team_member_removed") EVENT_TEAM_MEMBER_REMOVED("event_team_member_removed");
    }
}

