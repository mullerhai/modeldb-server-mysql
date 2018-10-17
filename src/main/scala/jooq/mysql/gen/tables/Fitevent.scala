/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.Keys
import jooq.mysql.gen.Modeldb
import jooq.mysql.gen.tables.records.FiteventRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Fitevent {

  /**
   * The reference instance of <code>modeldb.FitEvent</code>
   */
  val FITEVENT = new Fitevent
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.8.4"
  ),
  comments = "This class is generated by jOOQ"
)
class Fitevent(alias : String, aliased : Table[FiteventRecord], parameters : Array[ Field[_] ]) extends TableImpl[FiteventRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[FiteventRecord] = {
    classOf[FiteventRecord]
  }

  /**
   * The column <code>modeldb.FitEvent.id</code>.
   */
  val ID : TableField[FiteventRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.transformerSpec</code>.
   */
  val TRANSFORMERSPEC : TableField[FiteventRecord, Integer] = createField("transformerSpec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.transformer</code>.
   */
  val TRANSFORMER : TableField[FiteventRecord, Integer] = createField("transformer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.df</code>.
   */
  val DF : TableField[FiteventRecord, Integer] = createField("df", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.predictionColumns</code>.
   */
  val PREDICTIONCOLUMNS : TableField[FiteventRecord, String] = createField("predictionColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.labelColumns</code>.
   */
  val LABELCOLUMNS : TableField[FiteventRecord, String] = createField("labelColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[FiteventRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.FitEvent.problemType</code>.
   */
  val PROBLEMTYPE : TableField[FiteventRecord, String] = createField("problemType", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * Create a <code>modeldb.FitEvent</code> table reference
   */
  def this() = {
    this("FitEvent", null, null)
  }

  /**
   * Create an aliased <code>modeldb.FitEvent</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Fitevent.FITEVENT, null)
  }

  private def this(alias : String, aliased : Table[FiteventRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[FiteventRecord, Integer] = {
    Keys.IDENTITY_FITEVENT
  }

  override def getPrimaryKey : UniqueKey[FiteventRecord] = {
    Keys.KEY_FITEVENT_PRIMARY
  }

  override def getKeys : List[ UniqueKey[FiteventRecord] ] = {
    return Arrays.asList[ UniqueKey[FiteventRecord] ](Keys.KEY_FITEVENT_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[FiteventRecord, _] ] = {
    return Arrays.asList[ ForeignKey[FiteventRecord, _] ](Keys.FITEVENT_IBFK_1, Keys.FITEVENT_IBFK_2, Keys.FITEVENT_IBFK_3, Keys.FITEVENT_IBFK_4)
  }

  override def as(alias : String) : Fitevent = {
    new Fitevent(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Fitevent = {
    new Fitevent(name, null)
  }
}
