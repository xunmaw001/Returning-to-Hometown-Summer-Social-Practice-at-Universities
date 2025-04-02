package com.entity.model;

import com.entity.HuodongfabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动发布
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongfabuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动标题
     */
    private String huodongfabuName;


    /**
     * 活动类型
     */
    private Integer huodongfabuTypes;


    /**
     * 活动封面
     */
    private String huodongfabuPhoto;


    /**
     * 活动详情
     */
    private String huodongfabuContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：活动标题
	 */
    public String getHuodongfabuName() {
        return huodongfabuName;
    }


    /**
	 * 设置：活动标题
	 */
    public void setHuodongfabuName(String huodongfabuName) {
        this.huodongfabuName = huodongfabuName;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getHuodongfabuTypes() {
        return huodongfabuTypes;
    }


    /**
	 * 设置：活动类型
	 */
    public void setHuodongfabuTypes(Integer huodongfabuTypes) {
        this.huodongfabuTypes = huodongfabuTypes;
    }
    /**
	 * 获取：活动封面
	 */
    public String getHuodongfabuPhoto() {
        return huodongfabuPhoto;
    }


    /**
	 * 设置：活动封面
	 */
    public void setHuodongfabuPhoto(String huodongfabuPhoto) {
        this.huodongfabuPhoto = huodongfabuPhoto;
    }
    /**
	 * 获取：活动详情
	 */
    public String getHuodongfabuContent() {
        return huodongfabuContent;
    }


    /**
	 * 设置：活动详情
	 */
    public void setHuodongfabuContent(String huodongfabuContent) {
        this.huodongfabuContent = huodongfabuContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
