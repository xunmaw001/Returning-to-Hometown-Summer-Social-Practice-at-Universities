package com.entity.vo;

import com.entity.XueshengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuesheng")
public class XueshengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学号
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 学生姓名
     */

    @TableField(value = "xuesheng_name")
    private String xueshengName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份证号
     */

    @TableField(value = "xuesheng_id_number")
    private String xueshengIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "xuesheng_phone")
    private String xueshengPhone;


    /**
     * 年级
     */

    @TableField(value = "xuesheng_nianji")
    private String xueshengNianji;


    /**
     * 照片
     */

    @TableField(value = "xuesheng_photo")
    private String xueshengPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学号
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：学号
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：学生姓名
	 */
    public String getXueshengName() {
        return xueshengName;
    }


    /**
	 * 获取：学生姓名
	 */

    public void setXueshengName(String xueshengName) {
        this.xueshengName = xueshengName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getXueshengIdNumber() {
        return xueshengIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setXueshengIdNumber(String xueshengIdNumber) {
        this.xueshengIdNumber = xueshengIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getXueshengPhone() {
        return xueshengPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setXueshengPhone(String xueshengPhone) {
        this.xueshengPhone = xueshengPhone;
    }
    /**
	 * 设置：年级
	 */
    public String getXueshengNianji() {
        return xueshengNianji;
    }


    /**
	 * 获取：年级
	 */

    public void setXueshengNianji(String xueshengNianji) {
        this.xueshengNianji = xueshengNianji;
    }
    /**
	 * 设置：照片
	 */
    public String getXueshengPhoto() {
        return xueshengPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setXueshengPhoto(String xueshengPhoto) {
        this.xueshengPhoto = xueshengPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
