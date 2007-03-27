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
 * Attachment is a piece of information associated with an issue.
 */
@Entity
@Table(name = "SCARAB_ATTACHMENT")
public class Attachment {
    public Attachment() {
    }
    
    /** Unique identifier. */
    @Id
    @Column(name = "ATTACHMENT_ID", nullable = false)
    private Long attachmentId;
    
    /** Issue that attachment is associated with. */
    @Column(name = "ISSUE_ID")
    private Long issueId;
    
    /** Type */
    @Column(name = "ATTACHMENT_TYPE_ID", nullable = false)
    private Integer TypeId;
    
    /** Name that is displayed in the UI. */
    @Column(name = "ATTACHMENT_NAME", nullable = false, length = 255)
    private String Name;
    
    /** Actual information constituting the attachment. */
    @Column(name = "ATTACHMENT_DATA")
    private String Data;
    
    /** Server side location of the file that contains attachment. Location is relative to the central file storage location specified in the application properties. */
    @Column(name = "ATTACHMENT_FILE_PATH", length = 255)
    private String FileName;
    
    /** MIME type of the attachment. Describes type of information constituting an attachment. */
    @Column(name = "ATTACHMENT_MIME_TYPE", nullable = false, length = 255)
    private String MimeType;
    
    /** Person that made last modification to the attachment. */
    @Column(name = "MODIFIED_BY")
    private Integer modifiedBy;
    
    /** Person that associated the attachment with an issue initially. */
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    
    /** Date of the last modification of the attachment. */
    @Column(name = "MODIFIED_DATE")
    private Integer modifiedDate;
    
    /** Date of the initial association of attachment with an issue. */
    @Column(name = "CREATED_DATE")
    private Integer createdDate;
    
    /** Flag, which marks that attachment has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    

    /**
     * @return Unique identifier.
     */
    public Long getAttachmentId() {
        return this.attachmentId;
    }
    
    /**
     * @param attachmentId Unique identifier.
     */
    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * @return Issue that attachment is associated with.
     */
    public Long getIssueId() {
        return this.issueId;
    }
    
    /**
     * @param issueId Issue that attachment is associated with.
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * @return Type
     */
    public Integer getTypeId() {
        return this.TypeId;
    }
    
    /**
     * @param TypeId Type
     */
    public void setTypeId(Integer TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * @return Name that is displayed in the UI.
     */
    public String getName() {
        return this.Name;
    }
    
    /**
     * @param Name Name that is displayed in the UI.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return Actual information constituting the attachment.
     */
    public String getData() {
        return this.Data;
    }
    
    /**
     * @param Data Actual information constituting the attachment.
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return Server side location of the file that contains attachment. Location is relative to the central file storage location specified in the application properties.
     */
    public String getFileName() {
        return this.FileName;
    }
    
    /**
     * @param FileName Server side location of the file that contains attachment. Location is relative to the central file storage location specified in the application properties.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * @return MIME type of the attachment. Describes type of information constituting an attachment.
     */
    public String getMimeType() {
        return this.MimeType;
    }
    
    /**
     * @param MimeType MIME type of the attachment. Describes type of information constituting an attachment.
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * @return Person that made last modification to the attachment.
     */
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    /**
     * @param modifiedBy Person that made last modification to the attachment.
     */
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return Person that associated the attachment with an issue initially.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * @param createdBy Person that associated the attachment with an issue initially.
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return Date of the last modification of the attachment.
     */
    public Integer getModifiedDate() {
        return this.modifiedDate;
    }
    
    /**
     * @param modifiedDate Date of the last modification of the attachment.
     */
    public void setModifiedDate(Integer modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return Date of the initial association of attachment with an issue.
     */
    public Integer getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * @param createdDate Date of the initial association of attachment with an issue.
     */
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return Flag, which marks that attachment has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that attachment has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}