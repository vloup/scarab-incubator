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
 * Information about artifact under processing in tracking system. Example: Particular defect. Example: Particular inquiry
 */
@Entity
@Table(name = "SCARAB_ISSUE")
public class Issue {
    public Issue() {
    }
    
    /** Unique identifier used for primary key. */
    @Id
    @Column(name = "ISSUE_ID", nullable = false)
    private Long issueId;
    
    /** Part of Id related to module. */
    @Column(name = "ID_PREFIX", nullable = false, length = 4)
    private String idPrefix;
    
    /** Part of Id which is an integer. */
    @Column(name = "ID_COUNT", nullable = false)
    private Integer idCount;
    
    /** The instance of scarab the issue was originally reported to. This field could be null for the normal instance where the issue is local to this database. */
    @Column(name = "ID_DOMAIN", length = 127)
    private String idDomain;
    
    /** Type : Issue, or Enter Issue Template */
    @Column(name = "TYPE_ID")
    private Integer typeId;
    
    /** Module that issue relates to. */
    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;
    
    /** ActivitySets that contain creation and last-modification info for the issue. This is redundant as we can get this info using Activity table to join ActivitySet and Issue.  But this will make some queries more straightforward and performant. */
    @Column(name = "CREATED_TRANS_ID")
    private Long createdTransId;
    
    /** null */
    @Column(name = "LAST_TRANS_ID")
    private Long lastTransId;
    
    /** Flag, which marks that issue has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    
    /** Flag, which marks that issue has been moved (and so its uniqueId  changed) */
    @Column(name = "MOVED")
    private boolean moved;
    

    /**
     * @return Unique identifier used for primary key.
     */
    public Long getIssueId() {
        return this.issueId;
    }
    
    /**
     * @param issueId Unique identifier used for primary key.
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * @return Part of Id related to module.
     */
    public String getIdPrefix() {
        return this.idPrefix;
    }
    
    /**
     * @param idPrefix Part of Id related to module.
     */
    public void setIdPrefix(String idPrefix) {
        this.idPrefix = idPrefix;
    }

    /**
     * @return Part of Id which is an integer.
     */
    public Integer getIdCount() {
        return this.idCount;
    }
    
    /**
     * @param idCount Part of Id which is an integer.
     */
    public void setIdCount(Integer idCount) {
        this.idCount = idCount;
    }

    /**
     * @return The instance of scarab the issue was originally reported to. This field could be null for the normal instance where the issue is local to this database.
     */
    public String getIdDomain() {
        return this.idDomain;
    }
    
    /**
     * @param idDomain The instance of scarab the issue was originally reported to. This field could be null for the normal instance where the issue is local to this database.
     */
    public void setIdDomain(String idDomain) {
        this.idDomain = idDomain;
    }

    /**
     * @return Type : Issue, or Enter Issue Template
     */
    public Integer getTypeId() {
        return this.typeId;
    }
    
    /**
     * @param typeId Type : Issue, or Enter Issue Template
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * @return Module that issue relates to.
     */
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    /**
     * @param moduleId Module that issue relates to.
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return ActivitySets that contain creation and last-modification info for the issue. This is redundant as we can get this info using Activity table to join ActivitySet and Issue.  But this will make some queries more straightforward and performant.
     */
    public Long getCreatedTransId() {
        return this.createdTransId;
    }
    
    /**
     * @param createdTransId ActivitySets that contain creation and last-modification info for the issue. This is redundant as we can get this info using Activity table to join ActivitySet and Issue.  But this will make some queries more straightforward and performant.
     */
    public void setCreatedTransId(Long createdTransId) {
        this.createdTransId = createdTransId;
    }

    public Long getLastTransId() {
        return this.lastTransId;
    }
    
    public void setLastTransId(Long lastTransId) {
        this.lastTransId = lastTransId;
    }

    /**
     * @return Flag, which marks that issue has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that issue has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return Flag, which marks that issue has been moved (and so its uniqueId  changed)
     */
    public boolean getMoved() {
        return this.moved;
    }
    
    /**
     * @param moved Flag, which marks that issue has been moved (and so its uniqueId  changed)
     */
    public void setMoved(boolean moved) {
        this.moved = moved;
    }


}