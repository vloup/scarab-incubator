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
 * $javadoc
 */
@Entity
@Table(name = "SCARAB_ISSUE_TYPE")
public class IssueType {
    public IssueType() {
    }
    
    /** Unique identifier used for primary key. */
    @Id
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** Name. */
    @Column(name = "NAME", nullable = false, length = 100)
    private String Name;
    
    /** Description. */
    @Column(name = "DESCRIPTION", length = 255)
    private String Description;
    
    /** If this issue type is a template, the id of the issue type it corresponds to. If is not, parent id is 0. */
    @Column(name = "PARENT_ID", nullable = false)
    private Integer parentId;
    
    /** Deduping on/off for this issue type. */
    @Column(name = "DEDUPE")
    private boolean dedupe;
    
    /** null */
    @Column(name = "DELETED")
    private boolean deleted;
    
    /** null */
    @Column(name = "LOCKED")
    private boolean locked;
    
    /** This issue type will be added automatically to any new  modules that are created. */
    @Column(name = "ISDEFAULT")
    private boolean isdefault;
    

    /**
     * @return Unique identifier used for primary key.
     */
    public Integer getIssueTypeId() {
        return this.issueTypeId;
    }
    
    /**
     * @param issueTypeId Unique identifier used for primary key.
     */
    public void setIssueTypeId(Integer issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    /**
     * @return Name.
     */
    public String getName() {
        return this.Name;
    }
    
    /**
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return Description.
     */
    public String getDescription() {
        return this.Description;
    }
    
    /**
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return If this issue type is a template, the id of the issue type it corresponds to. If is not, parent id is 0.
     */
    public Integer getParentId() {
        return this.parentId;
    }
    
    /**
     * @param parentId If this issue type is a template, the id of the issue type it corresponds to. If is not, parent id is 0.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return Deduping on/off for this issue type.
     */
    public boolean getDedupe() {
        return this.dedupe;
    }
    
    /**
     * @param dedupe Deduping on/off for this issue type.
     */
    public void setDedupe(boolean dedupe) {
        this.dedupe = dedupe;
    }

    public boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * @return This issue type will be added automatically to any new  modules that are created.
     */
    public boolean getIsdefault() {
        return this.isdefault;
    }
    
    /**
     * @param isdefault This issue type will be added automatically to any new  modules that are created.
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }


}