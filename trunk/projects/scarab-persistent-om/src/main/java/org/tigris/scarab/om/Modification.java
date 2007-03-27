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
 * Modification information for table. Not currently used.
 */
@Entity
@Table(name = "SCARAB_MODIFICATION")
public class Modification {
    public Modification() {
    }
    
    /** Table. */
    @Id
    @Column(name = "TABLE_ID", nullable = false)
    private Integer tableId;
    
    /** Column of the table. */
    @Id
    @Column(name = "COLUMN_ID", nullable = false)
    private Integer columnId;
    
    /** Person that made last modification to the column of the table. */
    @Column(name = "MODIFIED_BY")
    private Integer modifiedBy;
    
    /** Person that set value to the column of the table initially. */
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    
    /** Date of the last modification of the column of the table. */
    @Column(name = "MODIFIED_DATE")
    private Integer modifiedDate;
    
    /** Date of the initial set of the column of the table. */
    @Column(name = "CREATED_DATE")
    private Integer createdDate;
    

    /**
     * @return Table.
     */
    public Integer getTableId() {
        return this.tableId;
    }
    
    /**
     * @param tableId Table.
     */
    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    /**
     * @return Column of the table.
     */
    public Integer getColumnId() {
        return this.columnId;
    }
    
    /**
     * @param columnId Column of the table.
     */
    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    /**
     * @return Person that made last modification to the column of the table.
     */
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    /**
     * @param modifiedBy Person that made last modification to the column of the table.
     */
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return Person that set value to the column of the table initially.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * @param createdBy Person that set value to the column of the table initially.
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return Date of the last modification of the column of the table.
     */
    public Integer getModifiedDate() {
        return this.modifiedDate;
    }
    
    /**
     * @param modifiedDate Date of the last modification of the column of the table.
     */
    public void setModifiedDate(Integer modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return Date of the initial set of the column of the table.
     */
    public Integer getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * @param createdDate Date of the initial set of the column of the table.
     */
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }


}