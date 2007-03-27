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
 * Notification Status table. Used by NotificationManager.
 */
@Entity
@Table(name = "SCARAB_NOTIFICATION_FILTER")
public class NotificationFilter {
    public NotificationFilter() {
    }
    
    /** Unique identifier. The MODULE_ID is also a foreign key to SCARAB_MODULE. */
    @Id
    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;
    
    /** null */
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Integer UserId;
    
    /** null */
    @Id
    @Column(name = "ACTIVITY_TYPE", nullable = false, length = 30)
    private String activityType;
    
    /** We currently have only one manager (the Notificationmanager). This may change in the future. Currently following values are allowed: 1 = handle notifications via the Scarab NotificationManager. For convenience: If no filter is defined for a specific filter type, notifications are handled by NotificationManager. */
    @Id
    @Column(name = "MANAGER_ID", nullable = false)
    private Integer managerId;
    
    /** The filter state is either 0 = do not handle activites  or 1 = handle activities. NOTE: If no filter is defined for a specific ActivityType, Scarab by default handles all notifications via the Scarab Notification manager. If you want to discard notifications of a specific activity type, you must create a NotificationFilter and set the FILTER_STATE to 0. */
    @Column(name = "FILTER_STATE", nullable = false)
    private boolean filterState;
    
    /** Notifications, which have been triggered by User X will not be sent to self (User X) by default. But if the SELF_SEND flag is set to true (1), user X gets self notified by the Notification Manager. */
    @Column(name = "SEND_SELF", nullable = false)
    private boolean sendSelf;
    
    /** For Notifications, which could NOT be sent to a receiver, the Notification Manager generates an online notification by default. But if the SEND_FAILURES flag is set to false (0) failures will be omitted silently. */
    @Column(name = "SEND_FAILURES", nullable = false)
    private boolean sendFailures;
    

    /**
     * @return Unique identifier. The MODULE_ID is also a foreign key to SCARAB_MODULE.
     */
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    /**
     * @param moduleId Unique identifier. The MODULE_ID is also a foreign key to SCARAB_MODULE.
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getUserId() {
        return this.UserId;
    }
    
    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public String getActivityType() {
        return this.activityType;
    }
    
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**
     * @return We currently have only one manager (the Notificationmanager). This may change in the future. Currently following values are allowed: 1 = handle notifications via the Scarab NotificationManager. For convenience: If no filter is defined for a specific filter type, notifications are handled by NotificationManager.
     */
    public Integer getManagerId() {
        return this.managerId;
    }
    
    /**
     * @param managerId We currently have only one manager (the Notificationmanager). This may change in the future. Currently following values are allowed: 1 = handle notifications via the Scarab NotificationManager. For convenience: If no filter is defined for a specific filter type, notifications are handled by NotificationManager.
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * @return The filter state is either 0 = do not handle activites  or 1 = handle activities. NOTE: If no filter is defined for a specific ActivityType, Scarab by default handles all notifications via the Scarab Notification manager. If you want to discard notifications of a specific activity type, you must create a NotificationFilter and set the FILTER_STATE to 0.
     */
    public boolean getFilterState() {
        return this.filterState;
    }
    
    /**
     * @param filterState The filter state is either 0 = do not handle activites  or 1 = handle activities. NOTE: If no filter is defined for a specific ActivityType, Scarab by default handles all notifications via the Scarab Notification manager. If you want to discard notifications of a specific activity type, you must create a NotificationFilter and set the FILTER_STATE to 0.
     */
    public void setFilterState(boolean filterState) {
        this.filterState = filterState;
    }

    /**
     * @return Notifications, which have been triggered by User X will not be sent to self (User X) by default. But if the SELF_SEND flag is set to true (1), user X gets self notified by the Notification Manager.
     */
    public boolean getSendSelf() {
        return this.sendSelf;
    }
    
    /**
     * @param sendSelf Notifications, which have been triggered by User X will not be sent to self (User X) by default. But if the SELF_SEND flag is set to true (1), user X gets self notified by the Notification Manager.
     */
    public void setSendSelf(boolean sendSelf) {
        this.sendSelf = sendSelf;
    }

    /**
     * @return For Notifications, which could NOT be sent to a receiver, the Notification Manager generates an online notification by default. But if the SEND_FAILURES flag is set to false (0) failures will be omitted silently.
     */
    public boolean getSendFailures() {
        return this.sendFailures;
    }
    
    /**
     * @param sendFailures For Notifications, which could NOT be sent to a receiver, the Notification Manager generates an online notification by default. But if the SEND_FAILURES flag is set to false (0) failures will be omitted silently.
     */
    public void setSendFailures(boolean sendFailures) {
        this.sendFailures = sendFailures;
    }


}