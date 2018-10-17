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
import jooq.mysql.gen.tables.records.TransformerspecRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Transformerspec {

  /**
   * The reference instance of <code>modeldb.TransformerSpec</code>
   */
  val TRANSFORMERSPEC = new Transformerspec
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
class Transformerspec(alias : String, aliased : Table[TransformerspecRecord], parameters : Array[ Field[_] ]) extends TableImpl[TransformerspecRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TransformerspecRecord] = {
    classOf[TransformerspecRecord]
  }

  /**
   * The column <code>modeldb.TransformerSpec.id</code>.
   */
  val ID : TableField[TransformerspecRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.TransformerSpec.transformerType</code>.
   */
  val TRANSFORMERTYPE : TableField[TransformerspecRecord, String] = createField("transformerType", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.TransformerSpec.tag</code>.
   */
  val TAG : TableField[TransformerspecRecord, String] = createField("tag", org.jooq.impl.SQLDataType.CLOB, "")

  /**
   * The column <code>modeldb.TransformerSpec.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[TransformerspecRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.TransformerSpec</code> table reference
   */
  def this() = {
    this("TransformerSpec", null, null)
  }

  /**
   * Create an aliased <code>modeldb.TransformerSpec</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Transformerspec.TRANSFORMERSPEC, null)
  }

  private def this(alias : String, aliased : Table[TransformerspecRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[TransformerspecRecord, Integer] = {
    Keys.IDENTITY_TRANSFORMERSPEC
  }

  override def getPrimaryKey : UniqueKey[TransformerspecRecord] = {
    Keys.KEY_TRANSFORMERSPEC_PRIMARY
  }

  override def getKeys : List[ UniqueKey[TransformerspecRecord] ] = {
    return Arrays.asList[ UniqueKey[TransformerspecRecord] ](Keys.KEY_TRANSFORMERSPEC_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[TransformerspecRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TransformerspecRecord, _] ](Keys.TRANSFORMERSPEC_IBFK_1)
  }

  override def as(alias : String) : Transformerspec = {
    new Transformerspec(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Transformerspec = {
    new Transformerspec(name, null)
  }
}