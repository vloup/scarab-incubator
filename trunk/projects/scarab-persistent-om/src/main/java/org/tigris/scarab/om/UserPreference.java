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
 * This table is used to store user preferences and other information relating to a specific user.
 */
@Entity
@Table(name = "SCARAB_USER_PREFERENCE")
public class UserPreference {
    public UserPreference() {
    }
    
    /** Unique ID. */
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    /** This is a column that Scarab standalone needs. Torque doesn't do anything with it at this point because this is an aliased table. Leaving it in here just as an FYI and in the hope that one day, Torque will generate the right methods even for aliased tables. */
    @Column(name = "PASSWORD_EXPIRE")
    private Integer passwordExpire;
    
    /** null */
    @Column(name = "ENTER_ISSUE_REDIRECT")
    private Integer enterIssueRedirect;
    
    /** null */
    @Column(name = "HOME_PAGE", length = 32)
    private String homePage;
    
    /** Currently stores information in a format which conforms to the definition of the HTTP Accept-Language header. Real world examples:   de-at,de;q=0.8,en-us;q=0.5,en;q=0.3 | en-us,en;q=0.5 | en-gb,en-us;q=0.5 | zh-cn | de-de,de-ch;q=0.8,en-us;q=0.5,en;q=0.3 [ en-us, en;q=0.50. If this value cannot be parsed or is null, the current Module's default locale will be used.  If the Module does not have a default locale, the LocalizationService's default language will be used. */
    @Column(name = "LOCALE", length = 255)
    private String locale;
    

    /**
     * @return Unique ID.
     */
    public Integer getUserId() {
        return this.userId;
    }
    
    /**
     * @param userId Unique ID.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return This is a column that Scarab standalone needs. Torque doesn't do anything with it at this point because this is an aliased table. Leaving it in here just as an FYI and in the hope that one day, Torque will generate the right methods even for aliased tables.
     */
    public Integer getPasswordExpire() {
        return this.passwordExpire;
    }
    
    /**
     * @param passwordExpire This is a column that Scarab standalone needs. Torque doesn't do anything with it at this point because this is an aliased table. Leaving it in here just as an FYI and in the hope that one day, Torque will generate the right methods even for aliased tables.
     */
    public void setPasswordExpire(Integer passwordExpire) {
        this.passwordExpire = passwordExpire;
    }

    public Integer getEnterIssueRedirect() {
        return this.enterIssueRedirect;
    }
    
    public void setEnterIssueRedirect(Integer enterIssueRedirect) {
        this.enterIssueRedirect = enterIssueRedirect;
    }

    public String getHomePage() {
        return this.homePage;
    }
    
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    /**
     * @return Currently stores information in a format which conforms to the definition of the HTTP Accept-Language header. Real world examples:   de-at,de;q=0.8,en-us;q=0.5,en;q=0.3 | en-us,en;q=0.5 | en-gb,en-us;q=0.5 | zh-cn | de-de,de-ch;q=0.8,en-us;q=0.5,en;q=0.3 [ en-us, en;q=0.50. If this value cannot be parsed or is null, the current Module's default locale will be used.  If the Module does not have a default locale, the LocalizationService's default language will be used.
     */
    public String getLocale() {
        return this.locale;
    }
    
    /**
     * @param locale Currently stores information in a format which conforms to the definition of the HTTP Accept-Language header. Real world examples:   de-at,de;q=0.8,en-us;q=0.5,en;q=0.3 | en-us,en;q=0.5 | en-gb,en-us;q=0.5 | zh-cn | de-de,de-ch;q=0.8,en-us;q=0.5,en;q=0.3 [ en-us, en;q=0.50. If this value cannot be parsed or is null, the current Module's default locale will be used.  If the Module does not have a default locale, the LocalizationService's default language will be used.
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }


}