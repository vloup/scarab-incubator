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
 * A saved report.
 */
@Entity
@Table(name = "SCARAB_REPORT")
public class Report {
    public Report() {
    }
    
    /** null */
    @Id
    @Column(name = "REPORT_ID", nullable = false)
    private Integer reportId;
    
    /** Person. */
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    /** Module. */
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    
    /** Issue type. */
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** The name the report will be saved under. */
    @Column(name = "NAME", nullable = false, length = 255)
    private String name;
    
    /** The description of the saved report. */
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    
    /** The report string. */
    @Column(name = "QUERY_STRING", nullable = false)
    private String queryString;
    
    /** Type. */
    @Column(name = "SCOPE_ID", nullable = false)
    private Integer ScopeId;
    
    /** null */
    @Column(name = "DELETED")
    private boolean deleted;
    
    /** null */
    @Column(name = "CREATED_DATE")
    private Integer createdDate;
    

    public Integer getReportId() {
        return this.reportId;
    }
    
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * @return Person.
     */
    public Integer getUserId() {
        return this.userId;
    }
    
    /**
     * @param userId Person.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return The name the report will be saved under.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * @param name The name the report will be saved under.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The description of the saved report.
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * @param description The description of the saved report.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The report string.
     */
    public String getQueryString() {
        return this.queryString;
    }
    
    /**
     * @param queryString The report string.
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
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

    public boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }


}