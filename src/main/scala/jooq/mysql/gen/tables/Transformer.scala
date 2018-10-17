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
import jooq.mysql.gen.tables.records.TransformerRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Transformer {

  /**
   * The reference instance of <code>modeldb.Transformer</code>
   */
  val TRANSFORMER = new Transformer
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
class Transformer(alias : String, aliased : Table[TransformerRecord], parameters : Array[ Field[_] ]) extends TableImpl[TransformerRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TransformerRecord] = {
    classOf[TransformerRecord]
  }

  /**
   * The column <code>modeldb.Transformer.id</code>.
   */
  val ID : TableField[TransformerRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.Transformer.transformerType</code>.
   */
  val TRANSFORMERTYPE : TableField[TransformerRecord, String] = createField("transformerType", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.Transformer.tag</code>.
   */
  val TAG : TableField[TransformerRecord, String] = createField("tag", org.jooq.impl.SQLDataType.CLOB, "")

  /**
   * The column <code>modeldb.Transformer.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[TransformerRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.Transformer.filepath</code>.
   */
  val FILEPATH : TableField[TransformerRecord, String] = createField("filepath", org.jooq.impl.SQLDataType.CLOB, "")

  /**
   * Create a <code>modeldb.Transformer</code> table reference
   */
  def this() = {
    this("Transformer", null, null)
  }

  /**
   * Create an aliased <code>modeldb.Transformer</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Transformer.TRANSFORMER, null)
  }

  private def this(alias : String, aliased : Table[TransformerRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[TransformerRecord, Integer] = {
    Keys.IDENTITY_TRANSFORMER
  }

  override def getPrimaryKey : UniqueKey[TransformerRecord] = {
    Keys.KEY_TRANSFORMER_PRIMARY
  }

  override def getKeys : List[ UniqueKey[TransformerRecord] ] = {
    return Arrays.asList[ UniqueKey[TransformerRecord] ](Keys.KEY_TRANSFORMER_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[TransformerRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TransformerRecord, _] ](Keys.TRANSFORMER_IBFK_1)
  }

  override def as(alias : String) : Transformer = {
    new Transformer(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Transformer = {
    new Transformer(name, null)
  }
}