package com.entity.view;

import com.entity.ZhiliaowendangCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 资料文档收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("zhiliaowendang_collection")
public class ZhiliaowendangCollectionView extends ZhiliaowendangCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 所属部门名称
			*/
			private Integer bumenTypes;
				/**
				* 所属部门名称的值
				*/
				private String bumenValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 身份
			*/
			private String yonghuRole;

		//级联表 zhiliaowendang
			/**
			* 文档名称
			*/
			private String zhiliaowendangName;
			/**
			* 文档图片
			*/
			private String zhiliaowendangPhoto;
			/**
			* 文档大小
			*/
			private String zhiliaowendangDaxiao;
			/**
			* 文档下载
			*/
			private String zhiliaowendangFile;
			/**
			* 上传人
			*/
			private Integer yonghuId;
			/**
			* 文档详情
			*/
			private String zhiliaowendangContent;

	public ZhiliaowendangCollectionView() {

	}

	public ZhiliaowendangCollectionView(ZhiliaowendangCollectionEntity zhiliaowendangCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, zhiliaowendangCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 所属部门名称
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 所属部门名称
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 所属部门名称的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 所属部门名称的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 身份
					*/
					public String getYonghuRole() {
						return yonghuRole;
					}
					/**
					* 设置： 身份
					*/
					public void setYonghuRole(String yonghuRole) {
						this.yonghuRole = yonghuRole;
					}


				//级联表的get和set zhiliaowendang
					/**
					* 获取： 文档名称
					*/
					public String getZhiliaowendangName() {
						return zhiliaowendangName;
					}
					/**
					* 设置： 文档名称
					*/
					public void setZhiliaowendangName(String zhiliaowendangName) {
						this.zhiliaowendangName = zhiliaowendangName;
					}
					/**
					* 获取： 文档图片
					*/
					public String getZhiliaowendangPhoto() {
						return zhiliaowendangPhoto;
					}
					/**
					* 设置： 文档图片
					*/
					public void setZhiliaowendangPhoto(String zhiliaowendangPhoto) {
						this.zhiliaowendangPhoto = zhiliaowendangPhoto;
					}
					/**
					* 获取： 文档大小
					*/
					public String getZhiliaowendangDaxiao() {
						return zhiliaowendangDaxiao;
					}
					/**
					* 设置： 文档大小
					*/
					public void setZhiliaowendangDaxiao(String zhiliaowendangDaxiao) {
						this.zhiliaowendangDaxiao = zhiliaowendangDaxiao;
					}
					/**
					* 获取： 文档下载
					*/
					public String getZhiliaowendangFile() {
						return zhiliaowendangFile;
					}
					/**
					* 设置： 文档下载
					*/
					public void setZhiliaowendangFile(String zhiliaowendangFile) {
						this.zhiliaowendangFile = zhiliaowendangFile;
					}
					/**
					* 获取： 上传人
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 上传人
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 文档详情
					*/
					public String getZhiliaowendangContent() {
						return zhiliaowendangContent;
					}
					/**
					* 设置： 文档详情
					*/
					public void setZhiliaowendangContent(String zhiliaowendangContent) {
						this.zhiliaowendangContent = zhiliaowendangContent;
					}







}
