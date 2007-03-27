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
 * The number of votes a user has cast for an issue.
 */
@Entity
@Table(name = "SCARAB_ISSUE_VOTE")
public class IssueVote {
    public IssueVote() {
    }
    
    /** Module. */
    @Id
    @Column(name = "ISSUE_ID", nullable = false)
    private Long issueId;
    
    /** Person. */
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    /** The votes a user has cast for the issue. */
    @Column(name = "VOTES")
    private Integer votes;
    

    /**
     * @return Module.
     */
    public Long getIssueId() {
        return this.issueId;
    }
    
    /**
     * @param issueId Module.
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * @return Person.
     */
    public Integer getUserId() {
        return this.userId;
    }
    
    /**
     * @param userId Person.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return The votes a user has cast for the issue.
     */
    public Integer getVotes() {
        return this.votes;
    }
    
    /**
     * @param votes The votes a user has cast for the issue.
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }


}