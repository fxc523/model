package com.model.util.mysql;

/**
 * 用于存放创建表的字段信息
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午3:53:52]
 * @version 1.0
 ******************************************
 */
public class CreateTableParam{
	
	/**
	 * 字段名
	 */
	private String	fieldName;

	/**
	 * 字段类型
	 */
	private String	fieldType;

	/**
	 * 类型长度
	 */
	private int		fieldLength;

	/**
	 * 类型小数长度
	 */
	private int		fieldDecimalLength;

	/**
	 * 字段是否非空
	 */
	private boolean	fieldIsNull;

	/**
	 * 字段是否是主键
	 */
	private boolean	fieldIsKey;

	/**
	 * 主键是否自增
	 */
	private boolean	fieldIsAutoIncrement;

	/**
	 * 字段默认值
	 */
	private String	fieldDefaultValue;

	/**
	 * 该类型需要几个长度（例如，需要小数位数的，那么总长度和小数长度就是2个长度）一版只有0、1、2三个可选值，自动从配置的类型中获取的
	 */
	private int fileTypeLength;

	/**
	 * 值是否唯一
	 */
	private boolean	fieldIsUnique;

	/**
	 * 获取 fieldName
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * 设置 fieldName
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * 获取 fieldType
	 * @return the fieldType
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * 设置 fieldType
	 * @param fieldType the fieldType to set
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * 获取 fieldLength
	 * @return the fieldLength
	 */
	public int getFieldLength() {
		return fieldLength;
	}

	/**
	 * 设置 fieldLength
	 * @param fieldLength the fieldLength to set
	 */
	public void setFieldLength(int fieldLength) {
		this.fieldLength = fieldLength;
	}

	/**
	 * 获取 fieldDecimalLength
	 * @return the fieldDecimalLength
	 */
	public int getFieldDecimalLength() {
		return fieldDecimalLength;
	}

	/**
	 * 设置 fieldDecimalLength
	 * @param fieldDecimalLength the fieldDecimalLength to set
	 */
	public void setFieldDecimalLength(int fieldDecimalLength) {
		this.fieldDecimalLength = fieldDecimalLength;
	}

	/**
	 * 获取 fieldIsNull
	 * @return the fieldIsNull
	 */
	public boolean isFieldIsNull() {
		return fieldIsNull;
	}

	/**
	 * 设置 fieldIsNull
	 * @param fieldIsNull the fieldIsNull to set
	 */
	public void setFieldIsNull(boolean fieldIsNull) {
		this.fieldIsNull = fieldIsNull;
	}

	/**
	 * 获取 fieldIsKey
	 * @return the fieldIsKey
	 */
	public boolean isFieldIsKey() {
		return fieldIsKey;
	}

	/**
	 * 设置 fieldIsKey
	 * @param fieldIsKey the fieldIsKey to set
	 */
	public void setFieldIsKey(boolean fieldIsKey) {
		this.fieldIsKey = fieldIsKey;
	}

	/**
	 * 获取 fieldIsAutoIncrement
	 * @return the fieldIsAutoIncrement
	 */
	public boolean isFieldIsAutoIncrement() {
		return fieldIsAutoIncrement;
	}

	/**
	 * 设置 fieldIsAutoIncrement
	 * @param fieldIsAutoIncrement the fieldIsAutoIncrement to set
	 */
	public void setFieldIsAutoIncrement(boolean fieldIsAutoIncrement) {
		this.fieldIsAutoIncrement = fieldIsAutoIncrement;
	}

	/**
	 * 获取 fieldDefaultValue
	 * @return the fieldDefaultValue
	 */
	public String getFieldDefaultValue() {
		return fieldDefaultValue;
	}

	/**
	 * 设置 fieldDefaultValue
	 * @param fieldDefaultValue the fieldDefaultValue to set
	 */
	public void setFieldDefaultValue(String fieldDefaultValue) {
		this.fieldDefaultValue = fieldDefaultValue;
	}

	/**
	 * 获取 fileTypeLength
	 * @return the fileTypeLength
	 */
	public int getFileTypeLength() {
		return fileTypeLength;
	}

	/**
	 * 设置 fileTypeLength
	 * @param fileTypeLength the fileTypeLength to set
	 */
	public void setFileTypeLength(int fileTypeLength) {
		this.fileTypeLength = fileTypeLength;
	}

	/**
	 * 获取 fieldIsUnique
	 * @return the fieldIsUnique
	 */
	public boolean isFieldIsUnique() {
		return fieldIsUnique;
	}

	/**
	 * 设置 fieldIsUnique
	 * @param fieldIsUnique the fieldIsUnique to set
	 */
	public void setFieldIsUnique(boolean fieldIsUnique) {
		this.fieldIsUnique = fieldIsUnique;
	}
	
}
