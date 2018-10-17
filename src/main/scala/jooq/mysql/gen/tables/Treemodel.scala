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
import jooq.mysql.gen.tables.records.TreemodelRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Treemodel {

  /**
   * The reference instance of <code>modeldb.TreeModel</code>
   */
  val TREEMODEL = new Treemodel
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
class Treemodel(alias : String, aliased : Table[TreemodelRecord], parameters : Array[ Field[_] ]) extends TableImpl[TreemodelRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TreemodelRecord] = {
    classOf[TreemodelRecord]
  }

  /**
   * The column <code>modeldb.TreeModel.id</code>.
   */
  val ID : TableField[TreemodelRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.TreeModel.model</code>.
   */
  val MODEL : TableField[TreemodelRecord, Integer] = createField("model", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.TreeModel.modelType</code>.
   */
  val MODELTYPE : TableField[TreemodelRecord, String] = createField("modelType", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * Create a <code>modeldb.TreeModel</code> table reference
   */
  def this() = {
    this("TreeModel", null, null)
  }

  /**
   * Create an aliased <code>modeldb.TreeModel</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Treemodel.TREEMODEL, null)
  }

  private def this(alias : String, aliased : Table[TreemodelRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[TreemodelRecord, Integer] = {
    Keys.IDENTITY_TREEMODEL
  }

  override def getPrimaryKey : UniqueKey[TreemodelRecord] = {
    Keys.KEY_TREEMODEL_PRIMARY
  }

  override def getKeys : List[ UniqueKey[TreemodelRecord] ] = {
    return Arrays.asList[ UniqueKey[TreemodelRecord] ](Keys.KEY_TREEMODEL_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[TreemodelRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TreemodelRecord, _] ](Keys.TREEMODEL_IBFK_1)
  }

  override def as(alias : String) : Treemodel = {
    new Treemodel(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Treemodel = {
    new Treemodel(name, null)
  }
}
