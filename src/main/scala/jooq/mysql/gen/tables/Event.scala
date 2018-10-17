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
import jooq.mysql.gen.tables.records.EventRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Event {

  /**
   * The reference instance of <code>modeldb.Event</code>
   */
  val EVENT = new Event
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
class Event(alias : String, aliased : Table[EventRecord], parameters : Array[ Field[_] ]) extends TableImpl[EventRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[EventRecord] = {
    classOf[EventRecord]
  }

  /**
   * The column <code>modeldb.Event.id</code>.
   */
  val ID : TableField[EventRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.Event.eventType</code>.
   */
  val EVENTTYPE : TableField[EventRecord, String] = createField("eventType", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

  /**
   * The column <code>modeldb.Event.eventId</code>.
   */
  val EVENTID : TableField[EventRecord, Integer] = createField("eventId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.Event.experimentRun</code>.
   */
  val EXPERIMENTRUN : TableField[EventRecord, Integer] = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.Event</code> table reference
   */
  def this() = {
    this("Event", null, null)
  }

  /**
   * Create an aliased <code>modeldb.Event</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Event.EVENT, null)
  }

  private def this(alias : String, aliased : Table[EventRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[EventRecord, Integer] = {
    Keys.IDENTITY_EVENT
  }

  override def getPrimaryKey : UniqueKey[EventRecord] = {
    Keys.KEY_EVENT_PRIMARY
  }

  override def getKeys : List[ UniqueKey[EventRecord] ] = {
    return Arrays.asList[ UniqueKey[EventRecord] ](Keys.KEY_EVENT_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[EventRecord, _] ] = {
    return Arrays.asList[ ForeignKey[EventRecord, _] ](Keys.EVENT_IBFK_1)
  }

  override def as(alias : String) : Event = {
    new Event(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Event = {
    new Event(name, null)
  }
}
