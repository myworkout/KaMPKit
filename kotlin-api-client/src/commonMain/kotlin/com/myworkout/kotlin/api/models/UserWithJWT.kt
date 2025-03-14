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

import com.myworkout.kotlin.api.models.User

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 * @param user 
 * @param jwt JTW token for auth
 */
@Serializable
data class UserWithJWT (
    @SerialName(value = "user") val user: User? = null,
    /* JTW token for auth */
    @SerialName(value = "jwt") val jwt: kotlin.String? = null
)

