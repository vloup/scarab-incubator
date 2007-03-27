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
 * Transaction is a group of attribute modification that are performed together.
 */
@Entity
@Table(name = "SCARAB_TRANSACTION")
public class ActivitySet {
    public ActivitySet() {
    }
    
    /** Unique ID. */
    @Id
    @Column(name = "TRANSACTION_ID", nullable = false)
    private Long ActivitySetId;
    
    /** Possible enumerated activitySet type. */
    @Column(name = "TYPE_ID")
    private Integer typeId;
    
    /** Comment added to modification. */
    @Column(name = "ATTACHMENT_ID")
    private Long attachmentId;
    
    /** Person that performed the activitySet. */
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    
    /** Date of the activitySet. */
    @Column(name = "CREATED_DATE")
    private Integer createdDate;
    

    /**
     * @return Unique ID.
     */
    public Long getActivitySetId() {
        return this.ActivitySetId;
    }
    
    /**
     * @param ActivitySetId Unique ID.
     */
    public void setActivitySetId(Long ActivitySetId) {
        this.ActivitySetId = ActivitySetId;
    }

    /**
     * @return Possible enumerated activitySet type.
     */
    public Integer getTypeId() {
        return this.typeId;
    }
    
    /**
     * @param typeId Possible enumerated activitySet type.
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * @return Comment added to modification.
     */
    public Long getAttachmentId() {
        return this.attachmentId;
    }
    
    /**
     * @param attachmentId Comment added to modification.
     */
    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * @return Person that performed the activitySet.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * @param createdBy Person that performed the activitySet.
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return Date of the activitySet.
     */
    public Integer getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * @param createdDate Date of the activitySet.
     */
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }


}