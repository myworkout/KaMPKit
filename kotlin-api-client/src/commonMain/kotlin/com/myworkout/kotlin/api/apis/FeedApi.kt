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
package com.myworkout.kotlin.api.apis

import com.myworkout.kotlin.api.models.CreateFeedActivityInput
import com.myworkout.kotlin.api.models.CreateFeedActivityResponse
import com.myworkout.kotlin.api.models.Error
import com.myworkout.kotlin.api.models.GetFeedActivitiesResponse

import com.myworkout.kotlin.api.infrastructure.*
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

class FeedApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    jsonSerializer: Json
) : ApiClient(baseUrl, httpClientEngine, jsonSerializer) {

    /**
     * 
     * 
     * @param feedId uuid 
     * @param createFeedActivityInput  
     * @return CreateFeedActivityResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun createFeedActivity(feedId: kotlin.String, createFeedActivityInput: CreateFeedActivityInput): HttpResponse<CreateFeedActivityResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = createFeedActivityInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/feeds/{feedId}/activities".replace("{" + "feedId" + "}", "$feedId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * 
     * @param feedId uuid 
     * @return GetFeedActivitiesResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getFeedActivities(feedId: kotlin.String): HttpResponse<GetFeedActivitiesResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/feeds/{feedId}/activities".replace("{" + "feedId" + "}", "$feedId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
