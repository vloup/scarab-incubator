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
 * History of changes made to the attributes of an issue.
 */
@Entity
@Table(name = "SCARAB_ACTIVITY")
public class Activity {
    public Activity() {
    }
    
    /** PK (ID generated via IDBROKER). */
    @Id
    @Column(name = "ACTIVITY_ID", nullable = false)
    private Long activityId;
    
    /** Issue attribute of which has been modified. */
    @Column(name = "ISSUE_ID", nullable = false)
    private Long issueId;
    
    /** Attribute that has been modified. */
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;
    
    /** ActivitySet to which the attribute modification belongs. */
    @Column(name = "TRANSACTION_ID", nullable = false)
    private Long transactionId;
    
    /** Value of integer attribute before modification. */
    @Column(name = "OLD_NUMERIC_VALUE")
    private Integer oldNumericValue;
    
    /** Value of integer attribute after modification. */
    @Column(name = "NEW_NUMERIC_VALUE")
    private Integer newNumericValue;
    
    /** Value of user attribute before modification. */
    @Column(name = "OLD_USER_ID")
    private Integer oldUserId;
    
    /** Value of user attribute after modification. */
    @Column(name = "NEW_USER_ID")
    private Integer newUserId;
    
    /** Value of option attribute before modification. */
    @Column(name = "OLD_OPTION_ID")
    private Integer oldOptionId;
    
    /** Value of option attribute after modification. */
    @Column(name = "NEW_OPTION_ID")
    private Integer newOptionId;
    
    /** Value of attribute before modification. */
    @Column(name = "OLD_VALUE")
    private String oldValue;
    
    /** Value of attribute after modification. */
    @Column(name = "NEW_VALUE")
    private String newValue;
    
    /** Value of the dependency change. */
    @Column(name = "DEPEND_ID")
    private Integer dependId;
    
    /** System-generated description of modification (deprecated since b21, kept for backward compatibility). */
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    
    /** Date this Activity is no longer the current value of the Attribute. */
    @Column(name = "END_DATE")
    private Date endDate;
    
    /**  If an attachment is associated to the activity, store it here. Note: there is also attachments associated to the activitySet which 'contains' the activity. These are generally the result of multiple activity records being  created via the modification of several attributes at one time. */
    @Column(name = "ATTACHMENT_ID")
    private Long attachmentId;
    
    /** Type of activity, useful when generating the activity description. */
    @Column(name = "ACTIVITY_TYPE", length = 30)
    private String activityType;
    

    /**
     * @return PK (ID generated via IDBROKER).
     */
    public Long getActivityId() {
        return this.activityId;
    }
    
    /**
     * @param activityId PK (ID generated via IDBROKER).
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * @return Issue attribute of which has been modified.
     */
    public Long getIssueId() {
        return this.issueId;
    }
    
    /**
     * @param issueId Issue attribute of which has been modified.
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * @return Attribute that has been modified.
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    /**
     * @param attributeId Attribute that has been modified.
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * @return ActivitySet to which the attribute modification belongs.
     */
    public Long getTransactionId() {
        return this.transactionId;
    }
    
    /**
     * @param transactionId ActivitySet to which the attribute modification belongs.
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return Value of integer attribute before modification.
     */
    public Integer getOldNumericValue() {
        return this.oldNumericValue;
    }
    
    /**
     * @param oldNumericValue Value of integer attribute before modification.
     */
    public void setOldNumericValue(Integer oldNumericValue) {
        this.oldNumericValue = oldNumericValue;
    }

    /**
     * @return Value of integer attribute after modification.
     */
    public Integer getNewNumericValue() {
        return this.newNumericValue;
    }
    
    /**
     * @param newNumericValue Value of integer attribute after modification.
     */
    public void setNewNumericValue(Integer newNumericValue) {
        this.newNumericValue = newNumericValue;
    }

    /**
     * @return Value of user attribute before modification.
     */
    public Integer getOldUserId() {
        return this.oldUserId;
    }
    
    /**
     * @param oldUserId Value of user attribute before modification.
     */
    public void setOldUserId(Integer oldUserId) {
        this.oldUserId = oldUserId;
    }

    /**
     * @return Value of user attribute after modification.
     */
    public Integer getNewUserId() {
        return this.newUserId;
    }
    
    /**
     * @param newUserId Value of user attribute after modification.
     */
    public void setNewUserId(Integer newUserId) {
        this.newUserId = newUserId;
    }

    /**
     * @return Value of option attribute before modification.
     */
    public Integer getOldOptionId() {
        return this.oldOptionId;
    }
    
    /**
     * @param oldOptionId Value of option attribute before modification.
     */
    public void setOldOptionId(Integer oldOptionId) {
        this.oldOptionId = oldOptionId;
    }

    /**
     * @return Value of option attribute after modification.
     */
    public Integer getNewOptionId() {
        return this.newOptionId;
    }
    
    /**
     * @param newOptionId Value of option attribute after modification.
     */
    public void setNewOptionId(Integer newOptionId) {
        this.newOptionId = newOptionId;
    }

    /**
     * @return Value of attribute before modification.
     */
    public String getOldValue() {
        return this.oldValue;
    }
    
    /**
     * @param oldValue Value of attribute before modification.
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * @return Value of attribute after modification.
     */
    public String getNewValue() {
        return this.newValue;
    }
    
    /**
     * @param newValue Value of attribute after modification.
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * @return Value of the dependency change.
     */
    public Integer getDependId() {
        return this.dependId;
    }
    
    /**
     * @param dependId Value of the dependency change.
     */
    public void setDependId(Integer dependId) {
        this.dependId = dependId;
    }

    /**
     * @return System-generated description of modification (deprecated since b21, kept for backward compatibility).
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * @param description System-generated description of modification (deprecated since b21, kept for backward compatibility).
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Date this Activity is no longer the current value of the Attribute.
     */
    public Date getEndDate() {
        return this.endDate;
    }
    
    /**
     * @param endDate Date this Activity is no longer the current value of the Attribute.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return  If an attachment is associated to the activity, store it here. Note: there is also attachments associated to the activitySet which 'contains' the activity. These are generally the result of multiple activity records being  created via the modification of several attributes at one time.
     */
    public Long getAttachmentId() {
        return this.attachmentId;
    }
    
    /**
     * @param attachmentId  If an attachment is associated to the activity, store it here. Note: there is also attachments associated to the activitySet which 'contains' the activity. These are generally the result of multiple activity records being  created via the modification of several attributes at one time.
     */
    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * @return Type of activity, useful when generating the activity description.
     */
    public String getActivityType() {
        return this.activityType;
    }
    
    /**
     * @param activityType Type of activity, useful when generating the activity description.
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }


}