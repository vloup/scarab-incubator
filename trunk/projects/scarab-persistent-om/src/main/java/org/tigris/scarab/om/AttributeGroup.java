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
 * Groupings in which attributes appear on the page.
 */
@Entity
@Table(name = "SCARAB_ATTRIBUTE_GROUP")
public class AttributeGroup {
    public AttributeGroup() {
    }
    
    /** Unique identifier. */
    @Id
    @Column(name = "ATTRIBUTE_GROUP_ID", nullable = false)
    private Integer attributeGroupId;
    
    /** null */
    @Column(name = "NAME", nullable = false, length = 255)
    private String Name;
    
    /** null */
    @Column(name = "DESCRIPTION", length = 255)
    private String Description;
    
    /** Module. */
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    
    /** Issue type. */
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** null */
    @Column(name = "ACTIVE")
    private boolean active;
    
    /** null */
    @Column(name = "DEDUPE")
    private boolean dedupe;
    
    /** null */
    @Column(name = "PREFERRED_ORDER")
    private Integer Order;
    

    /**
     * @return Unique identifier.
     */
    public Integer getAttributeGroupId() {
        return this.attributeGroupId;
    }
    
    /**
     * @param attributeGroupId Unique identifier.
     */
    public void setAttributeGroupId(Integer attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return this.Description;
    }
    
    public void setDescription(String Description) {
        this.Description = Description;
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

    public boolean getActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getDedupe() {
        return this.dedupe;
    }
    
    public void setDedupe(boolean dedupe) {
        this.dedupe = dedupe;
    }

    public Integer getOrder() {
        return this.Order;
    }
    
    public void setOrder(Integer Order) {
        this.Order = Order;
    }


}