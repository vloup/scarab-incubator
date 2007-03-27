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
 * A saved user query.
 */
@Entity
@Table(name = "SCARAB_QUERY")
public class Query {
    public Query() {
    }
    
    /** null */
    @Id
    @Column(name = "QUERY_ID", nullable = false)
    private Long queryId;
    
    /** Person who created the query. */
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    /** The name the query will be saved under. */
    @Column(name = "NAME", nullable = false, length = 255)
    private String name;
    
    /** The description of the saved query. */
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    
    /** The query string. */
    @Column(name = "VALUE", nullable = false)
    private String value;
    
    /** Type. */
    @Column(name = "SCOPE_ID", nullable = false)
    private Integer ScopeId;
    
    /** Issue type. */
    @Column(name = "ISSUE_TYPE_ID")
    private Integer issueTypeId;
    
    /** Module. */
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    
    /** List id.  Either issuetype/module id or list_id is used. */
    @Column(name = "LIST_ID")
    private Long listId;
    
    /** null */
    @Column(name = "DELETED")
    private boolean deleted;
    
    /** null */
    @Column(name = "APPROVED")
    private boolean approved;
    
    /** null */
    @Column(name = "CREATED_DATE")
    private Integer createdDate;
    
    /** Default subscription frequency. */
    @Column(name = "SUBSCRIPTION_FREQUENCY_ID")
    private Integer subscriptionFrequencyId;
    
    /** Whether or not this query should show up on the homepage. */
    @Column(name = "HOME_PAGE")
    private boolean HomePage;
    
    /** The order in which the user wants to see the queries in the home page. */
    @Column(name = "PREFERRED_ORDER")
    private Integer Order;
    

    public Long getQueryId() {
        return this.queryId;
    }
    
    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }

    /**
     * @return Person who created the query.
     */
    public Integer getUserId() {
        return this.userId;
    }
    
    /**
     * @param userId Person who created the query.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return The name the query will be saved under.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * @param name The name the query will be saved under.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The description of the saved query.
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * @param description The description of the saved query.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The query string.
     */
    public String getValue() {
        return this.value;
    }
    
    /**
     * @param value The query string.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return Type.
     */
    public Integer getScopeId() {
        return this.ScopeId;
    }
    
    /**
     * @param ScopeId Type.
     */
    public void setScopeId(Integer ScopeId) {
        this.ScopeId = ScopeId;
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
     * @return Module.
     */
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    /**
     * @param moduleId Module.
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return List id.  Either issuetype/module id or list_id is used.
     */
    public Long getListId() {
        return this.listId;
    }
    
    /**
     * @param listId List id.  Either issuetype/module id or list_id is used.
     */
    public void setListId(Long listId) {
        this.listId = listId;
    }

    public boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getApproved() {
        return this.approved;
    }
    
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Integer getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return Default subscription frequency.
     */
    public Integer getSubscriptionFrequencyId() {
        return this.subscriptionFrequencyId;
    }
    
    /**
     * @param subscriptionFrequencyId Default subscription frequency.
     */
    public void setSubscriptionFrequencyId(Integer subscriptionFrequencyId) {
        this.subscriptionFrequencyId = subscriptionFrequencyId;
    }

    /**
     * @return Whether or not this query should show up on the homepage.
     */
    public boolean getHomePage() {
        return this.HomePage;
    }
    
    /**
     * @param HomePage Whether or not this query should show up on the homepage.
     */
    public void setHomePage(boolean HomePage) {
        this.HomePage = HomePage;
    }

    /**
     * @return The order in which the user wants to see the queries in the home page.
     */
    public Integer getOrder() {
        return this.Order;
    }
    
    /**
     * @param Order The order in which the user wants to see the queries in the home page.
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }


}