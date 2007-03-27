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
 * Logical category of issues.  Usually corresponds to the software project.  Example: Scarab
 */
@Entity
@Table(name = "SCARAB_MODULE")
public class ScarabModule {
    public ScarabModule() {
    }
    
    /** Unique identifier. */
    @Id
    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;
    
    /** Name. It is RealName because Module implements the Turbine Group interface and having it as Name would clash with that interface. Please note that  the result of group.getName() needs to be unique for each SCARAB_MODULE. */
    @Column(name = "MODULE_NAME", nullable = false, length = 255)
    private String RealName;
    
    /** The instance name of scarab the module is located within. */
    @Column(name = "DOMAIN", length = 127)
    private String domain;
    
    /** Abbreviation whose primary use to identify related issues. */
    @Column(name = "MODULE_CODE", nullable = false, length = 4)
    private String Code;
    
    /** Description. */
    @Column(name = "MODULE_DESCRIPTION", nullable = false, length = 255)
    private String Description;
    
    /** URL pointing to the information on the module. */
    @Column(name = "MODULE_URL", length = 255)
    private String Url;
    
    /** An email address that all emails generated for this module will be sent to. */
    @Column(name = "ARCHIVE_EMAIL", length = 99)
    private String archiveEmail;
    
    /** Parent module containing the module. Allows for hierarchical structure of modules. */
    @Column(name = "PARENT_ID", nullable = false)
    private Integer parentId;
    
    /** Person that is responsible for the module. @deprecated */
    @Column(name = "OWNER_ID")
    private Integer ownerId;
    
    /** Key quality assurance person for the module. @deprecated */
    @Column(name = "QA_CONTACT_ID")
    private Integer qaContactId;
    
    /** Flag, which marks that module has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    
    /** null */
    @Column(name = "LOCKED")
    private boolean locked;
    
    /** null */
    @Column(name = "CLASS_KEY")
    private Integer classKey;
    

    /**
     * @return Unique identifier.
     */
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    /**
     * @param moduleId Unique identifier.
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return Name. It is RealName because Module implements the Turbine Group interface and having it as Name would clash with that interface. Please note that  the result of group.getName() needs to be unique for each SCARAB_MODULE.
     */
    public String getRealName() {
        return this.RealName;
    }
    
    /**
     * @param RealName Name. It is RealName because Module implements the Turbine Group interface and having it as Name would clash with that interface. Please note that  the result of group.getName() needs to be unique for each SCARAB_MODULE.
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * @return The instance name of scarab the module is located within.
     */
    public String getDomain() {
        return this.domain;
    }
    
    /**
     * @param domain The instance name of scarab the module is located within.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return Abbreviation whose primary use to identify related issues.
     */
    public String getCode() {
        return this.Code;
    }
    
    /**
     * @param Code Abbreviation whose primary use to identify related issues.
     */
    public void setCode(String Code) {
        this.Code = Code;
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
     * @return URL pointing to the information on the module.
     */
    public String getUrl() {
        return this.Url;
    }
    
    /**
     * @param Url URL pointing to the information on the module.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * @return An email address that all emails generated for this module will be sent to.
     */
    public String getArchiveEmail() {
        return this.archiveEmail;
    }
    
    /**
     * @param archiveEmail An email address that all emails generated for this module will be sent to.
     */
    public void setArchiveEmail(String archiveEmail) {
        this.archiveEmail = archiveEmail;
    }

    /**
     * @return Parent module containing the module. Allows for hierarchical structure of modules.
     */
    public Integer getParentId() {
        return this.parentId;
    }
    
    /**
     * @param parentId Parent module containing the module. Allows for hierarchical structure of modules.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return Person that is responsible for the module. @deprecated
     */
    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    /**
     * @param ownerId Person that is responsible for the module. @deprecated
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return Key quality assurance person for the module. @deprecated
     */
    public Integer getQaContactId() {
        return this.qaContactId;
    }
    
    /**
     * @param qaContactId Key quality assurance person for the module. @deprecated
     */
    public void setQaContactId(Integer qaContactId) {
        this.qaContactId = qaContactId;
    }

    /**
     * @return Flag, which marks that module has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that module has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Integer getClassKey() {
        return this.classKey;
    }
    
    public void setClassKey(Integer classKey) {
        this.classKey = classKey;
    }


}