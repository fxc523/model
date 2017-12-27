/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	SysMysqlColumns.java
 * @package		com.model.system.createtable.constant
 * @author		fuxianchao
 * @Date		2017年12月22日 上午9:33:44
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.createtable.constant;

/**
 * 用于查询表中字段结构详细信息
 ******************************************
 * @author fuxianchao  [2017年12月22日 上午9:33:44]
 * @version 1.0
 ******************************************
 */
public class SysMysqlColumns {

	/**
	 * 字段名
	 */
	public static final String COLUMN_NAME_KEY = "column_name";
	/**
	 * 默认值
	 */
	public static final String COLUMN_DEFAULT_KEY = "column_default";
	/**
	 * 是否可为null，值：(YES,NO)
	 */
	public static final String IS_NULLABLE_KEY = "is_nullable";
	/**
	 * 数据类型
	 */
	public static final String DATA_TYPE_KEY = "data_type";
	/**
	 * 长度，如果是0的话是null
	 */
	public static final String NUMERIC_PRECISION_KEY = "numeric_precision";
	/**
	 * 小数点数
	 */
	public static final String NUMERIC_SCALE_KEY = "numeric_scale";
	/**
	 * 是否为主键，是的话是PRI
	 */
	public static final String COLUMN_KEY_KEY = "column_key";
	/**
	 * 是否为自动增长，是的话为auto_increment
	 */
	public static final String EXTRA_KEY = "extra";

	private String table_catalog;
	/**
	 * 库名
	 */
	private String table_schema;
	/**
	 * 表名
	 */
	private String table_name;
	/**
	 * 字段名
	 */
	private String column_name;
	/**
	 * 字段位置的排序
	 */
	private String ordinal_position;
	/**
	 * 字段默认值
	 */
	private String column_default;
	/**
	 * 是否可以为null
	 */
	private String is_nullable;
	/**
	 * 字段类型
	 */
	private String data_type;
	private String character_maximum_length;
	private String character_octet_length;
	/**
	 * 长度
	 */
	private String numeric_precision;
	/**
	 * 小数点数
	 */
	private String numeric_scale;
	private String character_set_name;
	private String collation_name;
	/**
	 * 类型加长度拼接的字符串，例如varchar(100)
	 */
	private String column_type;
	/**
	 * 主键:PRI；唯一键:UNI
	 */
	private String column_key;
	/**
	 * 是否为自动增长，是的话为auto_increment
	 */
	private String extra;
	private String privileges;
	private String column_comment;
	/**
	 * 获取 table_catalog
	 * @return the table_catalog
	 */
	public String getTable_catalog() {
		return table_catalog;
	}
	/**
	 * 设置 table_catalog
	 * @param table_catalog the table_catalog to set
	 */
	public void setTable_catalog(String table_catalog) {
		this.table_catalog = table_catalog;
	}
	/**
	 * 获取 table_schema
	 * @return the table_schema
	 */
	public String getTable_schema() {
		return table_schema;
	}
	/**
	 * 设置 table_schema
	 * @param table_schema the table_schema to set
	 */
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	/**
	 * 获取 table_name
	 * @return the table_name
	 */
	public String getTable_name() {
		return table_name;
	}
	/**
	 * 设置 table_name
	 * @param table_name the table_name to set
	 */
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	/**
	 * 获取 column_name
	 * @return the column_name
	 */
	public String getColumn_name() {
		return column_name;
	}
	/**
	 * 设置 column_name
	 * @param column_name the column_name to set
	 */
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	/**
	 * 获取 ordinal_position
	 * @return the ordinal_position
	 */
	public String getOrdinal_position() {
		return ordinal_position;
	}
	/**
	 * 设置 ordinal_position
	 * @param ordinal_position the ordinal_position to set
	 */
	public void setOrdinal_position(String ordinal_position) {
		this.ordinal_position = ordinal_position;
	}
	/**
	 * 获取 column_default
	 * @return the column_default
	 */
	public String getColumn_default() {
		return column_default;
	}
	/**
	 * 设置 column_default
	 * @param column_default the column_default to set
	 */
	public void setColumn_default(String column_default) {
		this.column_default = column_default;
	}
	/**
	 * 获取 is_nullable
	 * @return the is_nullable
	 */
	public String getIs_nullable() {
		return is_nullable;
	}
	/**
	 * 设置 is_nullable
	 * @param is_nullable the is_nullable to set
	 */
	public void setIs_nullable(String is_nullable) {
		this.is_nullable = is_nullable;
	}
	/**
	 * 获取 data_type
	 * @return the data_type
	 */
	public String getData_type() {
		return data_type;
	}
	/**
	 * 设置 data_type
	 * @param data_type the data_type to set
	 */
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	/**
	 * 获取 character_maximum_length
	 * @return the character_maximum_length
	 */
	public String getCharacter_maximum_length() {
		return character_maximum_length;
	}
	/**
	 * 设置 character_maximum_length
	 * @param character_maximum_length the character_maximum_length to set
	 */
	public void setCharacter_maximum_length(String character_maximum_length) {
		this.character_maximum_length = character_maximum_length;
	}
	/**
	 * 获取 character_octet_length
	 * @return the character_octet_length
	 */
	public String getCharacter_octet_length() {
		return character_octet_length;
	}
	/**
	 * 设置 character_octet_length
	 * @param character_octet_length the character_octet_length to set
	 */
	public void setCharacter_octet_length(String character_octet_length) {
		this.character_octet_length = character_octet_length;
	}
	/**
	 * 获取 numeric_precision
	 * @return the numeric_precision
	 */
	public String getNumeric_precision() {
		return numeric_precision;
	}
	/**
	 * 设置 numeric_precision
	 * @param numeric_precision the numeric_precision to set
	 */
	public void setNumeric_precision(String numeric_precision) {
		this.numeric_precision = numeric_precision;
	}
	/**
	 * 获取 numeric_scale
	 * @return the numeric_scale
	 */
	public String getNumeric_scale() {
		return numeric_scale;
	}
	/**
	 * 设置 numeric_scale
	 * @param numeric_scale the numeric_scale to set
	 */
	public void setNumeric_scale(String numeric_scale) {
		this.numeric_scale = numeric_scale;
	}
	/**
	 * 获取 character_set_name
	 * @return the character_set_name
	 */
	public String getCharacter_set_name() {
		return character_set_name;
	}
	/**
	 * 设置 character_set_name
	 * @param character_set_name the character_set_name to set
	 */
	public void setCharacter_set_name(String character_set_name) {
		this.character_set_name = character_set_name;
	}
	/**
	 * 获取 collation_name
	 * @return the collation_name
	 */
	public String getCollation_name() {
		return collation_name;
	}
	/**
	 * 设置 collation_name
	 * @param collation_name the collation_name to set
	 */
	public void setCollation_name(String collation_name) {
		this.collation_name = collation_name;
	}
	/**
	 * 获取 column_type
	 * @return the column_type
	 */
	public String getColumn_type() {
		return column_type;
	}
	/**
	 * 设置 column_type
	 * @param column_type the column_type to set
	 */
	public void setColumn_type(String column_type) {
		this.column_type = column_type;
	}
	/**
	 * 获取 column_key
	 * @return the column_key
	 */
	public String getColumn_key() {
		return column_key;
	}
	/**
	 * 设置 column_key
	 * @param column_key the column_key to set
	 */
	public void setColumn_key(String column_key) {
		this.column_key = column_key;
	}
	/**
	 * 获取 extra
	 * @return the extra
	 */
	public String getExtra() {
		return extra;
	}
	/**
	 * 设置 extra
	 * @param extra the extra to set
	 */
	public void setExtra(String extra) {
		this.extra = extra;
	}
	/**
	 * 获取 privileges
	 * @return the privileges
	 */
	public String getPrivileges() {
		return privileges;
	}
	/**
	 * 设置 privileges
	 * @param privileges the privileges to set
	 */
	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}
	/**
	 * 获取 column_comment
	 * @return the column_comment
	 */
	public String getColumn_comment() {
		return column_comment;
	}
	/**
	 * 设置 column_comment
	 * @param column_comment the column_comment to set
	 */
	public void setColumn_comment(String column_comment) {
		this.column_comment = column_comment;
	}
	
	
}
