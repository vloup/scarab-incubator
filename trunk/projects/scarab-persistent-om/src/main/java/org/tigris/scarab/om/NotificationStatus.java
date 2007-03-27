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

import java.util.Date;

import javax.persistence.*;

/**
 * Notification Status table. Needed by NotificationManager.
 */
@Entity
@Table(name = "SCARAB_NOTIFICATION_STATUS")
public class NotificationStatus {
    public NotificationStatus() {
    }
    
    /** Unique identifier. The ACTIVITY_ID is also a foreign key to SCARAB_ACTIVITY. */
    @Id
    @Column(name = "ACTIVITY_ID", nullable = false)
    private Long activityId;
    
    /** null */
    @Id
    @Column(name = "CREATOR_ID", nullable = false)
    private Integer CreatorId;
    
    /** User to be notified */
    @Id
    @Column(name = "RECEIVER_ID", nullable = false)
    private Integer ReceiverId;
    
    /** Notification status. 1=WAIT 2=SCHEDULED 3=DEFERRED 4=FAIL 5=SENT. */
    @Column(name = "STATUS", nullable = false)
    private Integer Status;
    
    /** Creation date of this record. */
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    
    /** Date of last status change. */
    @Column(name = "CHANGE_DATE")
    private Date changeDate;
    
    /** Optional comment (mainly used for error messages) */
    @Column(name = "STATUS_COMMENT", length = 255)
    private String Comment;
    

    /**
     * @return Unique identifier. The ACTIVITY_ID is also a foreign key to SCARAB_ACTIVITY.
     */
    public Long getActivityId() {
        return this.activityId;
    }
    
    /**
     * @param activityId Unique identifier. The ACTIVITY_ID is also a foreign key to SCARAB_ACTIVITY.
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Integer getCreatorId() {
        return this.CreatorId;
    }
    
    public void setCreatorId(Integer CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * @return User to be notified
     */
    public Integer getReceiverId() {
        return this.ReceiverId;
    }
    
    /**
     * @param ReceiverId User to be notified
     */
    public void setReceiverId(Integer ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * @return Notification status. 1=WAIT 2=SCHEDULED 3=DEFERRED 4=FAIL 5=SENT.
     */
    public Integer getStatus() {
        return this.Status;
    }
    
    /**
     * @param Status Notification status. 1=WAIT 2=SCHEDULED 3=DEFERRED 4=FAIL 5=SENT.
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * @return Creation date of this record.
     */
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    /**
     * @param creationDate Creation date of this record.
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return Date of last status change.
     */
    public Date getChangeDate() {
        return this.changeDate;
    }
    
    /**
     * @param changeDate Date of last status change.
     */
    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    /**
     * @return Optional comment (mainly used for error messages)
     */
    public String getComment() {
        return this.Comment;
    }
    
    /**
     * @param Comment Optional comment (mainly used for error messages)
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }


}