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
 * Options that are applicable to issues of the particular module.
 */
@Entity
@Table(name = "SCARAB_R_MODULE_OPTION")
public class RModuleOption {
    public RModuleOption() {
    }
    
    /** Module. */
    @Id
    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;
    
    /** Issue Type. */
    @Id
    @Column(name = "ISSUE_TYPE_ID", nullable = false)
    private Integer issueTypeId;
    
    /** Option. */
    @Id
    @Column(name = "OPTION_ID", nullable = false)
    private Integer optionId;
    
    /** Value that represents the option in the UI. */
    @Column(name = "DISPLAY_VALUE", length = 255)
    private String displayValue;
    
    /** Flag, which marks that option has been deleted within the module. */
    @Column(name = "ACTIVE", nullable = false)
    private boolean active;
    
    /** Allows the template engineer and module owner some means to order option listings. */
    @Column(name = "PREFERRED_ORDER")
    private Integer Order;
    
    /** null */
    @Column(name = "WEIGHT")
    private Integer Weight;
    

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
     * @return Issue Type.
     */
    public Integer getIssueTypeId() {
        return this.issueTypeId;
    }
    
    /**
     * @param issueTypeId Issue Type.
     */
    public void setIssueTypeId(Integer issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    /**
     * @return Option.
     */
    public Integer getOptionId() {
        return this.optionId;
    }
    
    /**
     * @param optionId Option.
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * @return Value that represents the option in the UI.
     */
    public String getDisplayValue() {
        return this.displayValue;
    }
    
    /**
     * @param displayValue Value that represents the option in the UI.
     */
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * @return Flag, which marks that option has been deleted within the module.
     */
    public boolean getActive() {
        return this.active;
    }
    
    /**
     * @param active Flag, which marks that option has been deleted within the module.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return Allows the template engineer and module owner some means to order option listings.
     */
    public Integer getOrder() {
        return this.Order;
    }
    
    /**
     * @param Order Allows the template engineer and module owner some means to order option listings.
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    public Integer getWeight() {
        return this.Weight;
    }
    
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }


}