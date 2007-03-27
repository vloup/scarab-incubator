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
 * Possible attributes of an issue. Example: Operating System. Example: Severity
 */
@Entity
@Table(name = "SCARAB_ATTRIBUTE")
public class Attribute {
    public Attribute() {
    }
    
    /** Unique identifier. */
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;
    
    /** Name. */
    @Column(name = "ATTRIBUTE_NAME", nullable = false, length = 255)
    private String Name;
    
    /** Type. */
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer TypeId;
    
    /** A permission related to this attribute. */
    @Column(name = "PERMISSION", length = 255)
    private String permission;
    
    /** A required option for this attribute to be active. */
    @Column(name = "REQUIRED_OPTION_ID")
    private Integer requiredOptionId;
    
    /** Description. */
    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String Description;
    
    /** For user attributes, whether the user will be emailed, cc'd, or neither. */
    @Column(name = "ACTION", length = 255)
    private String action;
    
    /** Person that set value to the column of the table initially. */
    @Column(name = "CREATED_BY")
    private Integer CreatedBy;
    
    /** Date of the initial set of the column of the table. */
    @Column(name = "CREATED_DATE")
    private Integer CreatedDate;
    
    /** Flag, which marks that attribute has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    

    /**
     * @return Unique identifier.
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    /**
     * @param attributeId Unique identifier.
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
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
     * @return Type.
     */
    public Integer getTypeId() {
        return this.TypeId;
    }
    
    /**
     * @param TypeId Type.
     */
    public void setTypeId(Integer TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * @return A permission related to this attribute.
     */
    public String getPermission() {
        return this.permission;
    }
    
    /**
     * @param permission A permission related to this attribute.
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * @return A required option for this attribute to be active.
     */
    public Integer getRequiredOptionId() {
        return this.requiredOptionId;
    }
    
    /**
     * @param requiredOptionId A required option for this attribute to be active.
     */
    public void setRequiredOptionId(Integer requiredOptionId) {
        this.requiredOptionId = requiredOptionId;
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
     * @return For user attributes, whether the user will be emailed, cc'd, or neither.
     */
    public String getAction() {
        return this.action;
    }
    
    /**
     * @param action For user attributes, whether the user will be emailed, cc'd, or neither.
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return Person that set value to the column of the table initially.
     */
    public Integer getCreatedBy() {
        return this.CreatedBy;
    }
    
    /**
     * @param CreatedBy Person that set value to the column of the table initially.
     */
    public void setCreatedBy(Integer CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * @return Date of the initial set of the column of the table.
     */
    public Integer getCreatedDate() {
        return this.CreatedDate;
    }
    
    /**
     * @param CreatedDate Date of the initial set of the column of the table.
     */
    public void setCreatedDate(Integer CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * @return Flag, which marks that attribute has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that attribute has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}