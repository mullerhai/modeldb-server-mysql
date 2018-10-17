/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables


import java.lang.Class
import java.lang.Integer
import java.lang.Long
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.Keys
import jooq.mysql.gen.Modeldb
import jooq.mysql.gen.tables.records.RandomspliteventRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Randomsplitevent {

  /**
   * The reference instance of <code>modeldb.RandomSplitEvent</code>
   */
  val RANDOMSPLITEVENT = new Randomsplitevent
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
class Randomsplitevent(alias : String, aliased : Table[RandomspliteventRecord], parameters : Array[ Field[_] ]) extends TableImpl[RandomspliteventRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[RandomspliteventRecord] = {
    classOf[RandomspliteventRecord]
  }

  /**
   * The column <code>modeldb.RandomSplitEvent.id</code>.
   */
  val ID : TableField[RandomspliteventRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.RandomSplitEvent.inputDataFrameId</code>.
   */
  val INPUTDATAFRAMEID : TableField[RandomspliteventRecord, Integer] = createField("inputDataFrameId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.RandomSplitEvent.randomSeed</code>.
   */
  val RANDOMSEED : TableField[RandomspliteventRecord, Long] = createField("randomSeed", org.jooq.impl.SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>modeldb.RandomSplitEvent.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[RandomspliteventRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.RandomSplitEvent</code> table reference
   */
  def this() = {
    this("RandomSplitEvent", null, null)
  }

  /**
   * Create an aliased <code>modeldb.RandomSplitEvent</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Randomsplitevent.RANDOMSPLITEVENT, null)
  }

  private def this(alias : String, aliased : Table[RandomspliteventRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[RandomspliteventRecord, Integer] = {
    Keys.IDENTITY_RANDOMSPLITEVENT
  }

  override def getPrimaryKey : UniqueKey[RandomspliteventRecord] = {
    Keys.KEY_RANDOMSPLITEVENT_PRIMARY
  }

  override def getKeys : List[ UniqueKey[RandomspliteventRecord] ] = {
    return Arrays.asList[ UniqueKey[RandomspliteventRecord] ](Keys.KEY_RANDOMSPLITEVENT_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[RandomspliteventRecord, _] ] = {
    return Arrays.asList[ ForeignKey[RandomspliteventRecord, _] ](Keys.RANDOMSPLITEVENT_IBFK_1, Keys.RANDOMSPLITEVENT_IBFK_2)
  }

  override def as(alias : String) : Randomsplitevent = {
    new Randomsplitevent(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Randomsplitevent = {
    new Randomsplitevent(name, null)
  }
}
