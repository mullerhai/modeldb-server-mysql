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
import jooq.mysql.gen.tables.records.GridcellcrossvalidationRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Gridcellcrossvalidation {

  /**
   * The reference instance of <code>modeldb.GridCellCrossValidation</code>
   */
  val GRIDCELLCROSSVALIDATION = new Gridcellcrossvalidation
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
class Gridcellcrossvalidation(alias : String, aliased : Table[GridcellcrossvalidationRecord], parameters : Array[ Field[_] ]) extends TableImpl[GridcellcrossvalidationRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[GridcellcrossvalidationRecord] = {
    classOf[GridcellcrossvalidationRecord]
  }

  /**
   * The column <code>modeldb.GridCellCrossValidation.id</code>.
   */
  val ID : TableField[GridcellcrossvalidationRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.GridCellCrossValidation.gridSearch</code>.
   */
  val GRIDSEARCH : TableField[GridcellcrossvalidationRecord, Integer] = createField("gridSearch", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.GridCellCrossValidation.crossValidation</code>.
   */
  val CROSSVALIDATION : TableField[GridcellcrossvalidationRecord, Integer] = createField("crossValidation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.GridCellCrossValidation.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[GridcellcrossvalidationRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.GridCellCrossValidation</code> table reference
   */
  def this() = {
    this("GridCellCrossValidation", null, null)
  }

  /**
   * Create an aliased <code>modeldb.GridCellCrossValidation</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION, null)
  }

  private def this(alias : String, aliased : Table[GridcellcrossvalidationRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[GridcellcrossvalidationRecord, Integer] = {
    Keys.IDENTITY_GRIDCELLCROSSVALIDATION
  }

  override def getPrimaryKey : UniqueKey[GridcellcrossvalidationRecord] = {
    Keys.KEY_GRIDCELLCROSSVALIDATION_PRIMARY
  }

  override def getKeys : List[ UniqueKey[GridcellcrossvalidationRecord] ] = {
    return Arrays.asList[ UniqueKey[GridcellcrossvalidationRecord] ](Keys.KEY_GRIDCELLCROSSVALIDATION_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[GridcellcrossvalidationRecord, _] ] = {
    return Arrays.asList[ ForeignKey[GridcellcrossvalidationRecord, _] ](Keys.GRIDCELLCROSSVALIDATION_IBFK_1, Keys.GRIDCELLCROSSVALIDATION_IBFK_2, Keys.GRIDCELLCROSSVALIDATION_IBFK_3)
  }

  override def as(alias : String) : Gridcellcrossvalidation = {
    new Gridcellcrossvalidation(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Gridcellcrossvalidation = {
    new Gridcellcrossvalidation(name, null)
  }
}
