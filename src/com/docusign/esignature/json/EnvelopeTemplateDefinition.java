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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
        "templateId",
        "name",
        "shared",
        "password",
        "description",
        "lastModified",
        "lastModifiedBy",
        "pageCount",
        "uri",
        "folderName",
        "folderId",
        "owner",
        "emailSubject",
        "emailBlurb",
        "signingLocation",
        "authoritativeCopy",
        "enableWetSign",
        "allowMarkup",
        "allowReassign"
})
public class EnvelopeTemplateDefinition {
    @JsonProperty("templateId")
    private String templateId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("password")
    private String password;
    @JsonProperty("description")
    private String description;
    @JsonProperty("lastModifed")
    private String lastModified;
    @JsonProperty("lastModifiedBy")
    private User lastModifiedBy;
    @JsonProperty("pageCount")
    private String pageCount;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("folderName")
    private String folderName;
    @JsonProperty("folderId")
    private String folderId;
    @JsonProperty("folderUri")
    private String folderUri;
    @JsonProperty("owner")
    private User owner;
    @JsonProperty("emailSubject")
    private String emailSubject;
    @JsonProperty("emailBlurb")
    private String emailBlurb;
    @JsonProperty("signingLocation")
    private String signingLocation;
    @JsonProperty("authoritativeCopy")
    private Boolean authoritativeCopy;
    @JsonProperty("enableWetSign")
    private Boolean enableWetSign;
    @JsonProperty("allowMarkup")
    private Boolean allowMarkup;
    @JsonProperty("allowReassign")
    private Boolean allowReassign;

    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public EnvelopeTemplateDefinition withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EnvelopeTemplateDefinition withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public EnvelopeTemplateDefinition withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public EnvelopeTemplateDefinition withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EnvelopeTemplateDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public EnvelopeTemplateDefinition withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public EnvelopeTemplateDefinition withLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    @JsonProperty("pageCount")
    public String getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public EnvelopeTemplateDefinition withPageCount(String pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public EnvelopeTemplateDefinition withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @JsonProperty("folderName")
    public String getFolderName() {
        return folderName;
    }

    @JsonProperty("folderName")
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public EnvelopeTemplateDefinition withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    @JsonProperty("folderId")
    public String getFolderId() {
        return folderId;
    }

    @JsonProperty("folderId")
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public EnvelopeTemplateDefinition withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }

    @JsonProperty("folderUri")
    public String getFolderUri() {
        return folderUri;
    }

    @JsonProperty("folderUri")
    public void setFolderUri(String folderUri) {
        this.folderUri = folderUri;
    }

    public EnvelopeTemplateDefinition withFolderUri(String folderUri) {
        this.folderUri = folderUri;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return owner;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.owner = user;
    }

    public EnvelopeTemplateDefinition withOwner(User user) {
        this.owner = user;
        return this;
    }

    @JsonProperty("emailSubject")
    public String getEmailSubject() {
        return emailSubject;
    }

    @JsonProperty("emailSubject")
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public EnvelopeTemplateDefinition withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    @JsonProperty("emailBlurb")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    @JsonProperty("emailBlurb")
    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    public EnvelopeTemplateDefinition withEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
        return this;
    }


    @JsonProperty("signingLocation")
    public String getSigningLocation() {
        return signingLocation;
    }

    @JsonProperty("signingLocation")
    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }

    public EnvelopeTemplateDefinition withSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
        return this;
    }

    @JsonProperty("authoritativeCopy")
    public Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }

    @JsonProperty("authoritativeCopy")
    public void setAuthoritativeCopy(Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }

    public EnvelopeTemplateDefinition withAuthoritativeCopy(Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
        return this;
    }

    @JsonProperty("enableWetSign")
    public Boolean getEnableWetSign() {
        return enableWetSign;
    }

    @JsonProperty("enableWetSign")
    public void setEnableWetSign(Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
    }

    public EnvelopeTemplateDefinition withEnableWetSign(Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
        return this;
    }

    @JsonProperty("allowMarkup")
    public Boolean getAllowMarkup() {
        return allowMarkup;
    }

    @JsonProperty("allowMarkup")
    public void setAllowMarkup(Boolean allowMarkup) {
        this.allowMarkup = allowMarkup;
    }

    public EnvelopeTemplateDefinition withAllowMarkup(Boolean allowMarkup) {
        this.allowMarkup = allowMarkup;
        return this;
    }

    @JsonProperty("allowReassign")
    public Boolean getAllowReassign() {
        return allowReassign;
    }

    @JsonProperty("allowReassign")
    public void setAllowReassign(Boolean allowReassign) {
        this.allowReassign = allowReassign;
    }

    public EnvelopeTemplateDefinition withAllowReassign(Boolean allowReassign) {
        this.allowReassign = allowReassign;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }


}
