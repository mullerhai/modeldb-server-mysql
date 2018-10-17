/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.Event

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl

import scala.Array


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
class EventRecord extends UpdatableRecordImpl[EventRecord](Event.EVENT) with Record4[Integer, String, Integer, Integer] {

  /**
   * Setter for <code>modeldb.Event.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.Event.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.Event.eventType</code>.
   */
  def setEventtype(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.Event.eventType</code>.
   */
  def getEventtype : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.Event.eventId</code>.
   */
  def setEventid(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.Event.eventId</code>.
   */
  def getEventid : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.Event.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.Event.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record4 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row4[Integer, String, Integer, Integer] = {
    super.fieldsRow.asInstanceOf[ Row4[Integer, String, Integer, Integer] ]
  }

  override def valuesRow : Row4[Integer, String, Integer, Integer] = {
    super.valuesRow.asInstanceOf[ Row4[Integer, String, Integer, Integer] ]
  }
  override def field1 : Field[Integer] = Event.EVENT.ID
  override def field2 : Field[String] = Event.EVENT.EVENTTYPE
  override def field3 : Field[Integer] = Event.EVENT.EVENTID
  override def field4 : Field[Integer] = Event.EVENT.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : String = getEventtype
  override def value3 : Integer = getEventid
  override def value4 : Integer = getExperimentrun

  override def value1(value : Integer) : EventRecord = {
    setId(value)
    this
  }

  override def value2(value : String) : EventRecord = {
    setEventtype(value)
    this
  }

  override def value3(value : Integer) : EventRecord = {
    setEventid(value)
    this
  }

  override def value4(value : Integer) : EventRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : String, value3 : Integer, value4 : Integer) : EventRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this
  }

  /**
   * Create a detached, initialised EventRecord
   */
  def this(id : Integer, eventtype : String, eventid : Integer, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, eventtype)
    set(2, eventid)
    set(3, experimentrun)
  }
}
