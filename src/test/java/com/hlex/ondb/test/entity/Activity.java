/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hlex.ondb.test.entity;

import java.util.Date;
import javax.persistence.EmbeddedId;


import javax.persistence.Id;

/**
 *
 * @author thisadee
 */
public class Activity {
    
    @Id
    public String project;
    @Id
    private String tranId;
        
    @EmbeddedId
    private String acitvityId;
    
    
    private String jsonId;
    private String nodeType;
    private String nodeName;
    private String code;
    private String namespace;
    private String description;
    private String request;
    private String response;
    private long process_msec;
    private Date create_dt;
    private long create_msec;
    public Activity(String project, String tranId) {
        this.project = project;
        this.tranId = tranId;
    }

    public Activity(String project, String tranId, String acitvityId) {
        this.project = project;
        this.tranId = tranId;
        this.acitvityId = acitvityId;
    }

    
    
    
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    
    
    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getAcitvityId() {
        return acitvityId;
    }

    public void setAcitvityId(String acitvityId) {
        this.acitvityId = acitvityId;
    }

    public String getJsonId() {
        return jsonId;
    }

    public void setJsonId(String jsonId) {
        this.jsonId = jsonId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public long getProcess_msec() {
        return process_msec;
    }

    public void setProcess_msec(long process_msec) {
        this.process_msec = process_msec;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    public long getCreate_msec() {
        return create_msec;
    }

    public void setCreate_msec(long create_msec) {
        this.create_msec = create_msec;
    }

    @Override
    public String toString() {
        return "Activity{" + "project=" + project + ", tranId=" + tranId + ", acitvityId=" + acitvityId + ", jsonId=" + jsonId + ", nodeType=" + nodeType + ", nodeName=" + nodeName + ", code=" + code + ", namespace=" + namespace + ", description=" + description + ", request=" + request + ", response=" + response + ", process_msec=" + process_msec + ", create_dt=" + create_dt + ", create_msec=" + create_msec + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.project != null ? this.project.hashCode() : 0);
        hash = 89 * hash + (this.tranId != null ? this.tranId.hashCode() : 0);
        hash = 89 * hash + (this.acitvityId != null ? this.acitvityId.hashCode() : 0);
        hash = 89 * hash + (this.jsonId != null ? this.jsonId.hashCode() : 0);
        hash = 89 * hash + (this.nodeType != null ? this.nodeType.hashCode() : 0);
        hash = 89 * hash + (this.nodeName != null ? this.nodeName.hashCode() : 0);
        hash = 89 * hash + (this.code != null ? this.code.hashCode() : 0);
        hash = 89 * hash + (this.namespace != null ? this.namespace.hashCode() : 0);
        hash = 89 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 89 * hash + (this.request != null ? this.request.hashCode() : 0);
        hash = 89 * hash + (this.response != null ? this.response.hashCode() : 0);
        hash = 89 * hash + (int) (this.process_msec ^ (this.process_msec >>> 32));
        hash = 89 * hash + (this.create_dt != null ? this.create_dt.hashCode() : 0);
        hash = 89 * hash + (int) (this.create_msec ^ (this.create_msec >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Activity other = (Activity) obj;
        if ((this.project == null) ? (other.project != null) : !this.project.equals(other.project)) {
            return false;
        }
        if ((this.tranId == null) ? (other.tranId != null) : !this.tranId.equals(other.tranId)) {
            return false;
        }
        if ((this.acitvityId == null) ? (other.acitvityId != null) : !this.acitvityId.equals(other.acitvityId)) {
            return false;
        }
        if ((this.jsonId == null) ? (other.jsonId != null) : !this.jsonId.equals(other.jsonId)) {
            return false;
        }
        if ((this.nodeType == null) ? (other.nodeType != null) : !this.nodeType.equals(other.nodeType)) {
            return false;
        }
        if ((this.nodeName == null) ? (other.nodeName != null) : !this.nodeName.equals(other.nodeName)) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if ((this.namespace == null) ? (other.namespace != null) : !this.namespace.equals(other.namespace)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.request == null) ? (other.request != null) : !this.request.equals(other.request)) {
            return false;
        }
        if ((this.response == null) ? (other.response != null) : !this.response.equals(other.response)) {
            return false;
        }
        if (this.process_msec != other.process_msec) {
            return false;
        }
        if (this.create_dt != other.create_dt && (this.create_dt == null || !this.create_dt.equals(other.create_dt))) {
            return false;
        }
        if (this.create_msec != other.create_msec) {
            return false;
        }
        return true;
    }
    
    
    
    
}
