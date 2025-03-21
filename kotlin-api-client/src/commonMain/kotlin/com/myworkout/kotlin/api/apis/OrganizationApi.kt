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

import com.myworkout.kotlin.api.models.AcceptOrganizationPermissionsInput
import com.myworkout.kotlin.api.models.CreateContestInput
import com.myworkout.kotlin.api.models.CreateContestResponse
import com.myworkout.kotlin.api.models.CreateGroupInput
import com.myworkout.kotlin.api.models.CreateGroupResponse
import com.myworkout.kotlin.api.models.CreateOrganizationInput
import com.myworkout.kotlin.api.models.CreateOrganizationInviteInput
import com.myworkout.kotlin.api.models.EditOrganizationInviteInput
import com.myworkout.kotlin.api.models.EditOrganizationMemberInput
import com.myworkout.kotlin.api.models.Error
import com.myworkout.kotlin.api.models.GetOrganizationContestCollectionResponse
import com.myworkout.kotlin.api.models.GetOrganizationGroupsResponse
import com.myworkout.kotlin.api.models.GetOrganizationResponse
import com.myworkout.kotlin.api.models.GetOrganizationWhitelistedEmailDomainsResponse
import com.myworkout.kotlin.api.models.InlineResponse200
import com.myworkout.kotlin.api.models.InlineResponse2012
import com.myworkout.kotlin.api.models.InlineResponse2013
import com.myworkout.kotlin.api.models.OrganizationInviteCollectionResponse
import com.myworkout.kotlin.api.models.OrganizationMemberCollectionResponse
import com.myworkout.kotlin.api.models.PutActivateOrganizationActivationTokenInput
import com.myworkout.kotlin.api.models.PutGroupInviteResponse
import com.myworkout.kotlin.api.models.PutGroupMembersResponse
import com.myworkout.kotlin.api.models.SendInviteAsSmsInput
import com.myworkout.kotlin.api.models.SendOrganizationInvitesInput
import com.myworkout.kotlin.api.models.UpdateContestInput
import com.myworkout.kotlin.api.models.UpdateContestResponse
import com.myworkout.kotlin.api.models.UpdateGroupResponse
import com.myworkout.kotlin.api.models.UpdateOrganizationGroupInviteInput
import com.myworkout.kotlin.api.models.UpdateOrganizationGroupMembersInput
import com.myworkout.kotlin.api.models.UpdateOrganizationWhitelistedEmailDomainsResponse

import com.myworkout.kotlin.api.infrastructure.*
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

class OrganizationApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    jsonSerializer: Json
) : ApiClient(baseUrl, httpClientEngine, jsonSerializer) {

    /**
     * Link the user to the Organization User identified by the token
     * 
     * @param token  
     * @param putActivateOrganizationActivationTokenInput  (optional)
     * @return void
     */
    suspend fun activateOrganizationActivationToken(token: kotlin.String, putActivateOrganizationActivationTokenInput: PutActivateOrganizationActivationTokenInput?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = putActivateOrganizationActivationTokenInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/activation/{token}".replace("{" + "token" + "}", "$token"),
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
     * Create an organization
     * 
     * @param createOrganizationInput  
     * @return InlineResponse2012
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun createOrganization(createOrganizationInput: CreateOrganizationInput): HttpResponse<InlineResponse2012> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = createOrganizationInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations",
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
     * Add a contest to the organization
     * 
     * @param organizationId  
     * @param createContestInput  
     * @return CreateContestResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun createOrganizationContest(organizationId: kotlin.Int, createContestInput: CreateContestInput): HttpResponse<CreateContestResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = createContestInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationId}/contests".replace("{" + "organizationId" + "}", "$organizationId"),
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
     * Add a group and connect it to the organization
     * 
     * @param organizationId  
     * @param createGroupInput  
     * @return CreateGroupResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun createOrganizationGroup(organizationId: kotlin.Int, createGroupInput: CreateGroupInput): HttpResponse<CreateGroupResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = createGroupInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationId}/groups".replace("{" + "organizationId" + "}", "$organizationId"),
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
     * Invite someone to become a member of the organization
     * 
     * @param organizationId  
     * @param createOrganizationInviteInput  
     * @return InlineResponse2013
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun createOrganizationInvite(organizationId: kotlin.Int, createOrganizationInviteInput: CreateOrganizationInviteInput): HttpResponse<InlineResponse2013> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = createOrganizationInviteInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationId}/invites".replace("{" + "organizationId" + "}", "$organizationId"),
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
     * Delete organization contest
     * 
     * @param organizationId  
     * @param contestId  
     * @return void
     */
    suspend fun deleteOrganizationContest(organizationId: kotlin.Int, contestId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/organizations/{organizationId}/contests/{contestId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "contestId" + "}", "$contestId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Delete group connected to the organization
     * 
     * @param organizationId  
     * @param groupId  
     * @return void
     */
    suspend fun deleteOrganizationGroup(organizationId: kotlin.Int, groupId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/organizations/{organizationId}/groups/{groupId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "groupId" + "}", "$groupId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Delete a pending invite
     * 
     * @param organizationId  
     * @param inviteId  
     * @return void
     */
    suspend fun deleteOrganizationInvite(organizationId: kotlin.Int, inviteId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/organizations/{organizationId}/invites/{inviteId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "inviteId" + "}", "$inviteId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Delete an member of the organization
     * 
     * @param organizationId  
     * @param memberId  
     * @return void
     */
    suspend fun deleteOrganizationMember(organizationId: kotlin.Int, memberId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/organizations/{organizationId}/members/{memberId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "memberId" + "}", "$memberId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * 
     * 
     * @param organizationId  
     * @param inviteId  
     * @param editOrganizationInviteInput  
     * @return InlineResponse2013
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun editOrganizationInvite(organizationId: kotlin.Int, inviteId: kotlin.Int, editOrganizationInviteInput: EditOrganizationInviteInput): HttpResponse<InlineResponse2013> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = editOrganizationInviteInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/invites/{inviteId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "inviteId" + "}", "$inviteId"),
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
     * @param organizationId  
     * @param memberId  
     * @param editOrganizationMemberInput  
     * @return InlineResponse2013
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun editOrganizationMember(organizationId: kotlin.Int, memberId: kotlin.Int, editOrganizationMemberInput: EditOrganizationMemberInput): HttpResponse<InlineResponse2013> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = editOrganizationMemberInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/members/{memberId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "memberId" + "}", "$memberId"),
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
     * Retrieve invites which is pending on acceptance from user before becoming a member
     * 
     * @param organizationId  
     * @return OrganizationInviteCollectionResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getInvitesForOrganization(organizationId: kotlin.Int): HttpResponse<OrganizationInviteCollectionResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationId}/invites".replace("{" + "organizationId" + "}", "$organizationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get an organization
     * 
     * @param organizationUuid  
     * @return GetOrganizationResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganization(organizationUuid: kotlin.String): HttpResponse<GetOrganizationResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationUuid}".replace("{" + "organizationUuid" + "}", "$organizationUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get token information
     * 
     * @param token  
     * @return InlineResponse200
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganizationByActivationToken(token: kotlin.String): HttpResponse<InlineResponse200> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/activation/{token}".replace("{" + "token" + "}", "$token"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get contest created by organization
     * 
     * @param organizationId  
     * @return GetOrganizationContestCollectionResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganizationContests(organizationId: kotlin.Int): HttpResponse<GetOrganizationContestCollectionResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationId}/contests".replace("{" + "organizationId" + "}", "$organizationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get groups connected to the organization
     * 
     * @param organizationId  
     * @return GetOrganizationGroupsResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganizationGroups(organizationId: kotlin.Int): HttpResponse<GetOrganizationGroupsResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationId}/groups".replace("{" + "organizationId" + "}", "$organizationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get members of an organization
     * 
     * @param organizationId  
     * @return OrganizationMemberCollectionResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganizationMembers(organizationId: kotlin.Int): HttpResponse<OrganizationMemberCollectionResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationId}/members".replace("{" + "organizationId" + "}", "$organizationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get whitelisted email domains of an organization
     * 
     * @param organizationUuid  
     * @return GetOrganizationWhitelistedEmailDomainsResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrganizationWhitelistedEmailDomains(organizationUuid: kotlin.String): HttpResponse<GetOrganizationWhitelistedEmailDomainsResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/organizations/{organizationUuid}/whitelisted-email-domains".replace("{" + "organizationUuid" + "}", "$organizationUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * 
     * 
     * @param organizationId  
     * @param acceptOrganizationPermissionsInput  
     * @return void
     */
    suspend fun grantPermissions(organizationId: kotlin.Int, acceptOrganizationPermissionsInput: AcceptOrganizationPermissionsInput): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = acceptOrganizationPermissionsInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationId}/grants".replace("{" + "organizationId" + "}", "$organizationId"),
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
     * @param organizationId  
     * @return void
     */
    suspend fun rejectPermissions(organizationId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/organizations/{organizationId}/grants".replace("{" + "organizationId" + "}", "$organizationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Sends the invite corresponding to the provided invite token to the provided phone number
     * 
     * @param token  
     * @param sendInviteAsSmsInput  (optional)
     * @return void
     */
    suspend fun sendInviteAsSms(token: kotlin.String, sendInviteAsSmsInput: SendInviteAsSmsInput?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = sendInviteAsSmsInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/activation/{token}/invite-sms".replace("{" + "token" + "}", "$token"),
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
     * Batch operation to send invites for invited persons to the organization
     * 
     * @param organizationId  
     * @param sendOrganizationInvitesInput  
     * @return void
     */
    suspend fun sendOrganizationInvites(organizationId: kotlin.Int, sendOrganizationInvitesInput: SendOrganizationInvitesInput): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = sendOrganizationInvitesInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationId}/actions/send-invites".replace("{" + "organizationId" + "}", "$organizationId"),
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
     * Update contest of the organization
     * 
     * @param organizationId  
     * @param contestId  
     * @param updateContestInput  
     * @return UpdateContestResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun updateOrganizationContest(organizationId: kotlin.Int, contestId: kotlin.Int, updateContestInput: UpdateContestInput): HttpResponse<UpdateContestResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = updateContestInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/contests/{contestId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "contestId" + "}", "$contestId"),
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
     * Update group connected to the organization
     * 
     * @param organizationId  
     * @param groupId  
     * @param createGroupInput  
     * @return UpdateGroupResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun updateOrganizationGroup(organizationId: kotlin.Int, groupId: kotlin.Int, createGroupInput: CreateGroupInput): HttpResponse<UpdateGroupResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = createGroupInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/groups/{groupId}".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "groupId" + "}", "$groupId"),
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
     * Update members invites collection for group connected to the organization
     * 
     * @param organizationId  
     * @param groupId  
     * @param updateOrganizationGroupInviteInput  
     * @return PutGroupInviteResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun updateOrganizationGroupInvites(organizationId: kotlin.Int, groupId: kotlin.Int, updateOrganizationGroupInviteInput: UpdateOrganizationGroupInviteInput): HttpResponse<PutGroupInviteResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = updateOrganizationGroupInviteInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/groups/{groupId}/invites".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "groupId" + "}", "$groupId"),
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
     * Update members collection for group connected to the organization
     * 
     * @param organizationId  
     * @param groupId  
     * @param updateOrganizationGroupMembersInput  
     * @return PutGroupMembersResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun updateOrganizationGroupMembers(organizationId: kotlin.Int, groupId: kotlin.Int, updateOrganizationGroupMembersInput: UpdateOrganizationGroupMembersInput): HttpResponse<PutGroupMembersResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = updateOrganizationGroupMembersInput

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationId}/groups/{groupId}/members".replace("{" + "organizationId" + "}", "$organizationId").replace("{" + "groupId" + "}", "$groupId"),
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
     * Update whitelisted email domains of an organization
     * 
     * @param organizationUuid  
     * @param body  
     * @return UpdateOrganizationWhitelistedEmailDomainsResponse
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun updateOrganizationWhitelistedEmailDomains(organizationUuid: kotlin.String, body: kotlin.collections.List<kotlin.String>): HttpResponse<UpdateOrganizationWhitelistedEmailDomainsResponse> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/organizations/{organizationUuid}/whitelisted-email-domains".replace("{" + "organizationUuid" + "}", "$organizationUuid"),
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
     * Verify that the member is a valid member of the organization
     * 
     * @param organizationUuid  
     * @param memberId  
     * @return void
     */
    suspend fun verifyOrganizationMember(organizationUuid: kotlin.String, memberId: kotlin.Int): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("JWTAuth", "OAuth2", "OAuth2")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/organizations/{organizationUuid}/members/{memberId}/verify".replace("{" + "organizationUuid" + "}", "$organizationUuid").replace("{" + "memberId" + "}", "$memberId"),
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
