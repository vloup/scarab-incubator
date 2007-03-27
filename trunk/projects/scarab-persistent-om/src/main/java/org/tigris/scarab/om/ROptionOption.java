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
 * Set up relations between options.
 */
@Entity
@Table(name = "SCARAB_R_OPTION_OPTION")
public class ROptionOption {
    public ROptionOption() {
    }
    
    /** Parent Option. */
    @Id
    @Column(name = "OPTION1_ID", nullable = false)
    private Integer option1Id;
    
    /** Child Option. */
    @Id
    @Column(name = "OPTION2_ID", nullable = false)
    private Integer option2Id;
    
    /** The type of relationship. See the SCARAB_OPTION_RELATIONSHIP table for the different types */
    @Column(name = "RELATIONSHIP_ID", nullable = false)
    private Integer relationshipId;
    
    /** This gives "weight" to an option. In other words, it can be used to set the importance of one option vs. another option. P1 can be made more important than P2. This is currently not used in the code. This may become more useful in the future when we have external workflow logic. This is placed here because an Attribute Option may have different weights with different parents. */
    @Column(name = "WEIGHT")
    private Integer weight;
    
    /** The preferred order that these options should be shown in. Each option should have a 1-N ordering for all of its options (regardless of nesting). */
    @Column(name = "PREFERRED_ORDER", nullable = false)
    private Integer preferredOrder;
    

    /**
     * @return Parent Option.
     */
    public Integer getOption1Id() {
        return this.option1Id;
    }
    
    /**
     * @param option1Id Parent Option.
     */
    public void setOption1Id(Integer option1Id) {
        this.option1Id = option1Id;
    }

    /**
     * @return Child Option.
     */
    public Integer getOption2Id() {
        return this.option2Id;
    }
    
    /**
     * @param option2Id Child Option.
     */
    public void setOption2Id(Integer option2Id) {
        this.option2Id = option2Id;
    }

    /**
     * @return The type of relationship. See the SCARAB_OPTION_RELATIONSHIP table for the different types
     */
    public Integer getRelationshipId() {
        return this.relationshipId;
    }
    
    /**
     * @param relationshipId The type of relationship. See the SCARAB_OPTION_RELATIONSHIP table for the different types
     */
    public void setRelationshipId(Integer relationshipId) {
        this.relationshipId = relationshipId;
    }

    /**
     * @return This gives "weight" to an option. In other words, it can be used to set the importance of one option vs. another option. P1 can be made more important than P2. This is currently not used in the code. This may become more useful in the future when we have external workflow logic. This is placed here because an Attribute Option may have different weights with different parents.
     */
    public Integer getWeight() {
        return this.weight;
    }
    
    /**
     * @param weight This gives "weight" to an option. In other words, it can be used to set the importance of one option vs. another option. P1 can be made more important than P2. This is currently not used in the code. This may become more useful in the future when we have external workflow logic. This is placed here because an Attribute Option may have different weights with different parents.
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * @return The preferred order that these options should be shown in. Each option should have a 1-N ordering for all of its options (regardless of nesting).
     */
    public Integer getPreferredOrder() {
        return this.preferredOrder;
    }
    
    /**
     * @param preferredOrder The preferred order that these options should be shown in. Each option should have a 1-N ordering for all of its options (regardless of nesting).
     */
    public void setPreferredOrder(Integer preferredOrder) {
        this.preferredOrder = preferredOrder;
    }


}