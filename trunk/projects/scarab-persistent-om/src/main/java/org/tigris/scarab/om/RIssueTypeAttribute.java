package org.tigris.scarab.om;

/* ================================================================
 * Copyright (c) 2000-2005 CollabNet.  All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 
 * 3. The end-user documentation included with the redistribution, if
 * any, must include the following acknowlegement: "This product includes
 * software developed by Collab.Net <http://www.Collab.Net/>."
 * Alternately, this acknowlegement may appear in the software itself, if
 * and wherever such third-party acknowlegements normally appear.
 * 
 * 4. The hosted project names must not be used to endorse or promote
 * products derived from this software without prior written
 * permission. For written permission, please contact info@collab.net.
 * 
 * 5. Products derived from this software may not use the "Tigris" or 
 * "Scarab" names nor may "Tigris" or "Scarab" appear in their names without 
 * prior written permission of Collab.Net.
 * 
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL COLLAB.NET OR ITS CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 * 
 * This software consists of voluntary contributions made by many
 * individuals on behalf of Collab.Net.
 */ 

import javax.persistence.*;

/**
 * Attributes that are mapped to a global issue type.
 */
@Entity
@Table(name = "SCARAB_R_ISSUETYPE_ATTRIBUTE")
public class RIssueTypeAttribute {
    public RIssueTypeAttribute() {
    }
    
    /** Attribute. */
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;
    
    /** Issue type. */
    @Id
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** Flag, which marks that module attribute is not used. */
    @Column(name = "ACTIVE", nullable = false)
    private boolean active;
    
    /** Flag, which marks that issues entered for this module must have this attribute set. */
    @Column(name = "REQUIRED", nullable = false)
    private boolean required;
    
    /** Column order. */
    @Column(name = "PREFERRED_ORDER", nullable = false)
    private Integer Order;
    
    /** Flag, which marks this attribute as being eligible for quick search. */
    @Column(name = "QUICK_SEARCH", nullable = false)
    private boolean quickSearch;
    
    /** Flag, which marks that this attribute should be used in the email subject line, when an issue is created. May be used in other contexts as well */
    @Column(name = "DEFAULT_TEXT_FLAG", nullable = false)
    private boolean defaultTextFlag;
    
    /** null */
    @Column(name = "LOCKED")
    private boolean locked;
    

    /**
     * @return Attribute.
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    /**
     * @param attributeId Attribute.
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * @return Issue type.
     */
    public Integer getIssueTypeId() {
        return this.issueTypeId;
    }
    
    /**
     * @param issueTypeId Issue type.
     */
    public void setIssueTypeId(Integer issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    /**
     * @return Flag, which marks that module attribute is not used.
     */
    public boolean getActive() {
        return this.active;
    }
    
    /**
     * @param active Flag, which marks that module attribute is not used.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return Flag, which marks that issues entered for this module must have this attribute set.
     */
    public boolean getRequired() {
        return this.required;
    }
    
    /**
     * @param required Flag, which marks that issues entered for this module must have this attribute set.
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * @return Column order.
     */
    public Integer getOrder() {
        return this.Order;
    }
    
    /**
     * @param Order Column order.
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * @return Flag, which marks this attribute as being eligible for quick search.
     */
    public boolean getQuickSearch() {
        return this.quickSearch;
    }
    
    /**
     * @param quickSearch Flag, which marks this attribute as being eligible for quick search.
     */
    public void setQuickSearch(boolean quickSearch) {
        this.quickSearch = quickSearch;
    }

    /**
     * @return Flag, which marks that this attribute should be used in the email subject line, when an issue is created. May be used in other contexts as well
     */
    public boolean getDefaultTextFlag() {
        return this.defaultTextFlag;
    }
    
    /**
     * @param defaultTextFlag Flag, which marks that this attribute should be used in the email subject line, when an issue is created. May be used in other contexts as well
     */
    public void setDefaultTextFlag(boolean defaultTextFlag) {
        this.defaultTextFlag = defaultTextFlag;
    }

    public boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


}