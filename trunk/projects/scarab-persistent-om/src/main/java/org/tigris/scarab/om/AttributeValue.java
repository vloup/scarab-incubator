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
 * Actual attribute of the issue with its value.
 */
@Entity
@Table(name = "SCARAB_ISSUE_ATTRIBUTE_VALUE")
public class AttributeValue {
    public AttributeValue() {
    }
    
    /** Unique ID. */
    @Id
    @Column(name = "VALUE_ID", nullable = false)
    private Long valueId;
    
    /** Issue that attribute belongs to. */
    @Column(name = "ISSUE_ID", nullable = false)
    private Long issueId;
    
    /** Attribute. */
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;
    
    /** Some attributes are better saved in numeric format, so this column can be used in place of VALUE  */
    @Column(name = "NUMERIC_VALUE")
    private Integer numericValue;
    
    /** Option that is the value of the attribute if attribute is option based. */
    @Column(name = "OPTION_ID")
    private Integer optionId;
    
    /** Person that is the value of the attribute if attribute is person based. */
    @Column(name = "USER_ID")
    private Integer userId;
    
    /** null */
    @Column(name = "VALUE")
    private String value;
    
    /** Flag, which marks that attribute has been deleted. */
    @Column(name = "DELETED")
    private boolean deleted;
    

    /**
     * @return Unique ID.
     */
    public Long getValueId() {
        return this.valueId;
    }
    
    /**
     * @param valueId Unique ID.
     */
    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    /**
     * @return Issue that attribute belongs to.
     */
    public Long getIssueId() {
        return this.issueId;
    }
    
    /**
     * @param issueId Issue that attribute belongs to.
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * @return Attribute.
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    /**
     * @param attributeId Attribute.
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * @return Some attributes are better saved in numeric format, so this column can be used in place of VALUE 
     */
    public Integer getNumericValue() {
        return this.numericValue;
    }
    
    /**
     * @param numericValue Some attributes are better saved in numeric format, so this column can be used in place of VALUE 
     */
    public void setNumericValue(Integer numericValue) {
        this.numericValue = numericValue;
    }

    /**
     * @return Option that is the value of the attribute if attribute is option based.
     */
    public Integer getOptionId() {
        return this.optionId;
    }
    
    /**
     * @param optionId Option that is the value of the attribute if attribute is option based.
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * @return Person that is the value of the attribute if attribute is person based.
     */
    public Integer getUserId() {
        return this.userId;
    }
    
    /**
     * @param userId Person that is the value of the attribute if attribute is person based.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return Flag, which marks that attribute has been deleted.
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    
    /**
     * @param deleted Flag, which marks that attribute has been deleted.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}