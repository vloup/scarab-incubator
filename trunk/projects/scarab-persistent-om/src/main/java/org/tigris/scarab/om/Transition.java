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
 * Transition table for the Workflow engine
 */
@Entity
@Table(name = "SCARAB_TRANSITION")
public class Transition {
    public Transition() {
    }
    
    /** Unique ID. */
    @Id
    @Column(name = "TRANSITION_ID", nullable = false)
    private Integer transitionId;
    
    /** Role ID. */
    @Column(name = "ROLE_ID")
    private Integer RoleId;
    
    /** Attribute ID. */
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer AttributeId;
    
    /** From attribute option id. */
    @Column(name = "FROM_OPTION_ID")
    private Integer FromOptionId;
    
    /** to attribute option id */
    @Column(name = "TO_OPTION_ID")
    private Integer ToOptionId;
    
    /** null */
    @Column(name = "DISABLED_IF_BLOCKED")
    private boolean disabledIfBlocked;
    

    /**
     * @return Unique ID.
     */
    public Integer getTransitionId() {
        return this.transitionId;
    }
    
    /**
     * @param transitionId Unique ID.
     */
    public void setTransitionId(Integer transitionId) {
        this.transitionId = transitionId;
    }

    /**
     * @return Role ID.
     */
    public Integer getRoleId() {
        return this.RoleId;
    }
    
    /**
     * @param RoleId Role ID.
     */
    public void setRoleId(Integer RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * @return Attribute ID.
     */
    public Integer getAttributeId() {
        return this.AttributeId;
    }
    
    /**
     * @param AttributeId Attribute ID.
     */
    public void setAttributeId(Integer AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * @return From attribute option id.
     */
    public Integer getFromOptionId() {
        return this.FromOptionId;
    }
    
    /**
     * @param FromOptionId From attribute option id.
     */
    public void setFromOptionId(Integer FromOptionId) {
        this.FromOptionId = FromOptionId;
    }

    /**
     * @return to attribute option id
     */
    public Integer getToOptionId() {
        return this.ToOptionId;
    }
    
    /**
     * @param ToOptionId to attribute option id
     */
    public void setToOptionId(Integer ToOptionId) {
        this.ToOptionId = ToOptionId;
    }

    public boolean getDisabledIfBlocked() {
        return this.disabledIfBlocked;
    }
    
    public void setDisabledIfBlocked(boolean disabledIfBlocked) {
        this.disabledIfBlocked = disabledIfBlocked;
    }


}