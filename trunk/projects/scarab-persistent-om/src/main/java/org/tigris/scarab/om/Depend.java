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
 * Dependency between issues. Example: Issue is a duplicate of another issue. Example: Issue is blocking another issue.
 */
@Entity
@Table(name = "SCARAB_DEPEND")
public class Depend {
    public Depend() {
    }
    
    /** Unique identifier. */
    @Id
    @Column(name = "DEPEND_ID", nullable = false)
    private Integer dependId;
    
    /** Issue that other issue depends upon.  Example: Issue that blocks. Example: Issue that has duplicates. */
    @Column(name = "OBSERVED_ID", nullable = false)
    private Long observedId;
    
    /** Issue that depends on other issue. Example: Issue that is being blocked. Example: Issue that is duplicate. */
    @Column(name = "OBSERVER_ID", nullable = false)
    private Long observerId;
    
    /** Type. */
    @Column(name = "DEPEND_TYPE_ID", nullable = false)
    private Integer TypeId;
    
    /** Flag, which marks that dependency has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    

    /**
     * @return Unique identifier.
     */
    public Integer getDependId() {
        return this.dependId;
    }
    
    /**
     * @param dependId Unique identifier.
     */
    public void setDependId(Integer dependId) {
        this.dependId = dependId;
    }

    /**
     * @return Issue that other issue depends upon.  Example: Issue that blocks. Example: Issue that has duplicates.
     */
    public Long getObservedId() {
        return this.observedId;
    }
    
    /**
     * @param observedId Issue that other issue depends upon.  Example: Issue that blocks. Example: Issue that has duplicates.
     */
    public void setObservedId(Long observedId) {
        this.observedId = observedId;
    }

    /**
     * @return Issue that depends on other issue. Example: Issue that is being blocked. Example: Issue that is duplicate.
     */
    public Long getObserverId() {
        return this.observerId;
    }
    
    /**
     * @param observerId Issue that depends on other issue. Example: Issue that is being blocked. Example: Issue that is duplicate.
     */
    public void setObserverId(Long observerId) {
        this.observerId = observerId;
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
     * @return Flag, which marks that dependency has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that dependency has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}