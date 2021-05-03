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

import com.myworkout.kotlin.api.models.ConnectUsingIdentityProviderInput
import com.myworkout.kotlin.api.models.Error
import com.myworkout.kotlin.api.models.LoginUsingIdentityProviderInput
import com.myworkout.kotlin.api.models.LoginUsingIdentityProviderResponse

import com.myworkout.kotlin.api.infrastructure.*
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

class IdentityProviderApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    jsonSerializer: Json
) : ApiClient(baseUrl, httpClientEngine, jsonSerializer) {

    /**
     * Connect a user with an identity provider using a token from the IdP
     * 
     * @param identityProvider Name of the Identity Provider 
     * @param connectUsingIdentityProviderInput  (optional)
     * @return void
     */
    suspend fun connectUsingIdentityProvider(identityProvider: kotlin.String, connectUsingIdentityProviderInput: ConnectUsingIdentityProviderInput?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = connectUsingIdentityProviderInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/idp/{identityProvider}/connect".replace("{" + "identityProvider" + "}", "$identityProvider"),
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
     * Exchange a request token from a IdP to a OAuth 2.0 access tokens
     * 
     * @param identityProvider Name of the Identity Provider 
     * @param loginUsingIdentityProviderInput  (optional)
     * @return LoginUsingIdentityProviderResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun loginUsingIdentityProvider(identityProvider: kotlin.String, loginUsingIdentityProviderInput: LoginUsingIdentityProviderInput?): HttpResponse<LoginUsingIdentityProviderResponse> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = loginUsingIdentityProviderInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/idp/{identityProvider}/login".replace("{" + "identityProvider" + "}", "$identityProvider"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



}
