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
 * @param name 
 * @param email 
 * @param phone e.164 compliant phone number
 * @param isAdmin 
 */
@Serializable
data class EditOrganizationInviteInput (
    @SerialName(value = "name") @Required val name: kotlin.String,
    @SerialName(value = "email") @Required val email: kotlin.String,
    /* e.164 compliant phone number */
    @SerialName(value = "phone") @Required val phone: kotlin.String,
    @SerialName(value = "is_admin") @Required val isAdmin: kotlin.Boolean
)

