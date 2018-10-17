/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.Modeldb
import jooq.mysql.gen.tables.records.PipelineViewRecord

import org.jooq.Field
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.impl.TableImpl

import scala.Array


object PipelineView {

  /**
   * The reference instance of <code>modeldb.pipeline_view</code>
   */
  val PIPELINE_VIEW = new PipelineView
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
class PipelineView(alias : String, aliased : Table[PipelineViewRecord], parameters : Array[ Field[_] ]) extends TableImpl[PipelineViewRecord](alias, Modeldb.MODELDB, aliased, parameters, "VIEW") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[PipelineViewRecord] = {
    classOf[PipelineViewRecord]
  }

  /**
   * The column <code>modeldb.pipeline_view.pipelinefitevent</code>.
   */
  val PIPELINEFITEVENT : TableField[PipelineViewRecord, Integer] = createField("pipelinefitevent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.pipeline_view.stagenumber</code>.
   */
  val STAGENUMBER : TableField[PipelineViewRecord, Integer] = createField("stagenumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.pipeline_view.event_id</code>.
   */
  val EVENT_ID : TableField[PipelineViewRecord, Integer] = createField("event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * The column <code>modeldb.pipeline_view.eventtype</code>.
   */
  val EVENTTYPE : TableField[PipelineViewRecord, String] = createField("eventtype", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.pipeline_view.eventid</code>.
   */
  val EVENTID : TableField[PipelineViewRecord, Integer] = createField("eventid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.pipeline_view</code> table reference
   */
  def this() = {
    this("pipeline_view", null, null)
  }

  /**
   * Create an aliased <code>modeldb.pipeline_view</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.PipelineView.PIPELINE_VIEW, null)
  }

  private def this(alias : String, aliased : Table[PipelineViewRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def as(alias : String) : PipelineView = {
    new PipelineView(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : PipelineView = {
    new PipelineView(name, null)
  }
}
