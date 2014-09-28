/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.test.entiy;


import com.hlex.ondb.anno.MajorKey;
import com.hlex.ondb.anno.MinorKey;
import com.hlex.ondb.entity.AnnotateKeyEntity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author thisadee
 */
public class Activity  extends AnnotateKeyEntity{
    
    @MajorKey
    public String project;
    @MajorKey
    private String tranId;
    @MinorKey
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
    
    
}
