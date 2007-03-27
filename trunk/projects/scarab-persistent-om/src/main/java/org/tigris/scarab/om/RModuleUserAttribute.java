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
 * User's choice of attributes to appear on the Issue List screen.
 */
@Entity
@Table(name = "SCARAB_R_MODULE_USER_ATTRIBUTE")
public class RModuleUserAttribute {
    public RModuleUserAttribute() {
    }
    
    /** Unique ID. */
    @Id
    @Column(name = "RMUA_ID", nullable = false)
    private Long rmuaId;
    
    /** MITList . */
    @Column(name = "LIST_ID")
    private Long listId;
    
    /** Module. */
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    
    /** Person. */
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    /** Artifact type. */
    @Column(name = "ISSUE_TYPE_ID")
    private Integer issueTypeId;
    
    /** Attribute. */
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;
    
    /** Name of an internal attribute. Possible values are currently: CREATION_DATE, CREATION_USER, MODIFICATION_DATE or MODIFICATION_USER */
    @Column(name = "INTERNAL_ATTRIBUTE", length = 20)
    private String internalAttribute;
    
    /** Column order. */
    @Column(name = "PREFERRED_ORDER", nullable = false)
    private Integer Order;
    

    /**
     * @return Unique ID.
     */
    public Long getRmuaId() {
        return this.rmuaId;
    }
    
    /**
     * @param rmuaId Unique ID.
     */
    public void setRmuaId(Long rmuaId) {
        this.rmuaId = rmuaId;
    }

    /**
     * @return MITList .
     */
    public Long getListId() {
        return this.listId;
    }
    
    /**
     * @param listId MITList .
     */
    public void setListId(Long listId) {
        this.listId = listId;
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
     * @return Name of an internal attribute. Possible values are currently: CREATION_DATE, CREATION_USER, MODIFICATION_DATE or MODIFICATION_USER
     */
    public String getInternalAttribute() {
        return this.internalAttribute;
    }
    
    /**
     * @param internalAttribute Name of an internal attribute. Possible values are currently: CREATION_DATE, CREATION_USER, MODIFICATION_DATE or MODIFICATION_USER
     */
    public void setInternalAttribute(String internalAttribute) {
        this.internalAttribute = internalAttribute;
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


}