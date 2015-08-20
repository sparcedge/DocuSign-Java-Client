package com.docusign.esignature.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
        "envelopeTemplateDefinition",
        "documents",
        "recipients",
        "emailSubject",
        "emailBlurb",
        "signingLocation",
        "authoritativeCopy",
        "enforceSignerVisibility",
        "enableWetSign",
        "allowMarkup",
        "allowReassign"
})

public class TemplateInformation {

        @JsonProperty("envelopeTemplateDefinition")
        private EnvelopeTemplateDefinition envelopeTemplateDefinition;
        @JsonProperty("documents")
        private List<Document> documents = new ArrayList<Document>();
        @JsonProperty("recipients")
        private Recipients recipients;
        @JsonProperty("emailSubject")
        private String emailSubject;
        @JsonProperty("emailBlurb")
        private String emailBlurb;
        @JsonProperty("signingLocation")
        private String signingLocation;
        @JsonProperty("authoritativeCopy")
        private Boolean authoritativeCopy;
        @JsonProperty("enforceSignerVisibility")
        private Boolean enforceSignerVisibility;
        @JsonProperty("enableWetSign")
        private Boolean enableWetSign;
        @JsonProperty("allowMarkup")
        private Boolean allowMarkup;
        @JsonProperty("allowReassign")
        private Boolean allowReassign;

        public EnvelopeTemplateDefinition getEnvelopeTemplateDefinition() {
                return envelopeTemplateDefinition;
        }

        public void setEnvelopeTemplateDefinition(EnvelopeTemplateDefinition envelopeTemplateDefinition) {
                this.envelopeTemplateDefinition = envelopeTemplateDefinition;
        }

        public List<Document> getDocuments() {
                return documents;
        }

        public void setDocuments(List<Document> documents) {
                this.documents = documents;
        }

        public Recipients getRecipients() {
                return recipients;
        }

        public void setRecipients(Recipients recipients) {
                this.recipients = recipients;
        }

        public String getEmailSubject() {
                return emailSubject;
        }

        public void setEmailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
        }

        public String getEmailBlurb() {
                return emailBlurb;
        }

        public void setEmailBlurb(String emailBlurb) {
                this.emailBlurb = emailBlurb;
        }

        public String getSigningLocation() {
                return signingLocation;
        }

        public void setSigningLocation(String signingLocation) {
                this.signingLocation = signingLocation;
        }

        public Boolean getAuthoritativeCopy() {
                return authoritativeCopy;
        }

        public void setAuthoritativeCopy(Boolean authoritativeCopy) {
                this.authoritativeCopy = authoritativeCopy;
        }

        public Boolean getEnforceSignerVisibility() {
                return enforceSignerVisibility;
        }

        public void setEnforceSignerVisibility(Boolean enforceSignerVisibility) {
                this.enforceSignerVisibility = enforceSignerVisibility;
        }

        public Boolean getEnableWetSign() {
                return enableWetSign;
        }

        public void setEnableWetSign(Boolean enableWetSign) {
                this.enableWetSign = enableWetSign;
        }

        public Boolean getAllowMarkup() {
                return allowMarkup;
        }

        public void setAllowMarkup(Boolean allowMarkup) {
                this.allowMarkup = allowMarkup;
        }

        public Boolean getAllowReassign() {
                return allowReassign;
        }

        public void setAllowReassign(Boolean allowReassign) {
                this.allowReassign = allowReassign;
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
