package com.spring.demo;

import java.time.Instant;
import java.util.Date;


public class BaseEntity{

    private Date createDate = Date.from(Instant.now());
    private Date updateDate = Date.from(Instant.now());

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
