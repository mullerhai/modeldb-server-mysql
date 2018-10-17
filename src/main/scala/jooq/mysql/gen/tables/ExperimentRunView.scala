/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.Modeldb
import jooq.mysql.gen.tables.records.ExperimentRunViewRecord

import org.jooq.Field
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.impl.TableImpl

import scala.Array


object ExperimentRunView {

  /**
   * The reference instance of <code>modeldb.experiment_run_view</code>
   */
  val EXPERIMENT_RUN_VIEW = new ExperimentRunView
}

/**
 * VIEW
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.8.4"
  ),
  comments = "This class is generated by jOOQ"
)
class ExperimentRunView(alias : String, aliased : Table[ExperimentRunViewRecord], parameters : Array[ Field[_] ]) extends TableImpl[ExperimentRunViewRecord](alias, Modeldb.MODELDB, aliased, parameters, "VIEW") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[ExperimentRunViewRecord] = {
    classOf[ExperimentRunViewRecord]
  }

  /**
   * The column <code>modeldb.experiment_run_view.experimentRunId</code>.
   */
  val EXPERIMENTRUNID : TableField[ExperimentRunViewRecord, Integer] = createField("experimentRunId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * The column <code>modeldb.experiment_run_view.experimentId</code>.
   */
  val EXPERIMENTID : TableField[ExperimentRunViewRecord, Integer] = createField("experimentId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * The column <code>modeldb.experiment_run_view.projectId</code>.
   */
  val PROJECTID : TableField[ExperimentRunViewRecord, Integer] = createField("projectId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * Create a <code>modeldb.experiment_run_view</code> table reference
   */
  def this() = {
    this("experiment_run_view", null, null)
  }

  /**
   * Create an aliased <code>modeldb.experiment_run_view</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.ExperimentRunView.EXPERIMENT_RUN_VIEW, null)
  }

  private def this(alias : String, aliased : Table[ExperimentRunViewRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def as(alias : String) : ExperimentRunView = {
    new ExperimentRunView(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : ExperimentRunView = {
    new ExperimentRunView(name, null)
  }
}
