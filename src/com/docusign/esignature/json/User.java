/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 * <p/>
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * <p/>
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 * <p/>
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */

package com.docusign.esignature.json;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
        "userName",
        "email",
        "userId",
        "uri"
})
public class User {

    private String username;
    private String email;
    private String userId;
    private String uri;

    @JsonProperty("userName")
    public String getUsername() {
        return username;
    }

    @JsonProperty("userName")
    public void setUsername(String username) {
        this.username = username;
    }

    public User withUserName(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public User withUri(String uri) {
        this.uri = uri;
        return this;
    }
}