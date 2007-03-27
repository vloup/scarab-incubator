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
 * Mapping between modules and issue types.
 */
@Entity
@Table(name = "SCARAB_R_MODULE_ISSUE_TYPE")
public class RModuleIssueType {
    public RModuleIssueType() {
    }
    
    /** Module. */
    @Id
    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;
    
    /** Artifact type. */
    @Id
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** Flag, which marks that the issue type is not used. */
    @Column(name = "ACTIVE", nullable = false)
    private boolean active;
    
    /** Whether or not the issue type shows up in left hand nav. */
    @Column(name = "DISPLAY", nullable = false)
    private boolean display;
    
    /** Order the issue types appear in the left nav. */
    @Column(name = "PREFERRED_ORDER")
    private Integer Order;
    
    /** Deduping on/off for this module/issuetype. */
    @Column(name = "DEDUPE")
    private boolean dedupe;
    
    /** Default number of history entries. */
    @Column(name = "HISTORY")
    private Integer history;
    
    /** Default number of comments. */
    @Column(name = "COMMENTS")
    private Integer comments;
    
    /** Value that represents the name of the issue type in the UI. */
    @Column(name = "DISPLAY_NAME", length = 255)
    private String displayName;
    
    /** Value that represents the description of the issue type in the UI. */
    @Column(name = "DISPLAY_DESCRIPTION", length = 255)
    private String displayDescription;
    

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
     * @return Artifact type.
     */
    public Integer getIssueTypeId() {
        return this.issueTypeId;
    }
    
    /**
     * @param issueTypeId Artifact type.
     */
    public void setIssueTypeId(Integer issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    /**
     * @return Flag, which marks that the issue type is not used.
     */
    public boolean getActive() {
        return this.active;
    }
    
    /**
     * @param active Flag, which marks that the issue type is not used.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return Whether or not the issue type shows up in left hand nav.
     */
    public boolean getDisplay() {
        return this.display;
    }
    
    /**
     * @param display Whether or not the issue type shows up in left hand nav.
     */
    public void setDisplay(boolean display) {
        this.display = display;
    }

    /**
     * @return Order the issue types appear in the left nav.
     */
    public Integer getOrder() {
        return this.Order;
    }
    
    /**
     * @param Order Order the issue types appear in the left nav.
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * @return Deduping on/off for this module/issuetype.
     */
    public boolean getDedupe() {
        return this.dedupe;
    }
    
    /**
     * @param dedupe Deduping on/off for this module/issuetype.
     */
    public void setDedupe(boolean dedupe) {
        this.dedupe = dedupe;
    }

    /**
     * @return Default number of history entries.
     */
    public Integer getHistory() {
        return this.history;
    }
    
    /**
     * @param history Default number of history entries.
     */
    public void setHistory(Integer history) {
        this.history = history;
    }

    /**
     * @return Default number of comments.
     */
    public Integer getComments() {
        return this.comments;
    }
    
    /**
     * @param comments Default number of comments.
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * @return Value that represents the name of the issue type in the UI.
     */
    public String getDisplayName() {
        return this.displayName;
    }
    
    /**
     * @param displayName Value that represents the name of the issue type in the UI.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return Value that represents the description of the issue type in the UI.
     */
    public String getDisplayDescription() {
        return this.displayDescription;
    }
    
    /**
     * @param displayDescription Value that represents the description of the issue type in the UI.
     */
    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }


}