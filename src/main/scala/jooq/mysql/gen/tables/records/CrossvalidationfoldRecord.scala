/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer

import javax.annotation.Generated

import jooq.mysql.gen.tables.Crossvalidationfold

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
class CrossvalidationfoldRecord extends UpdatableRecordImpl[CrossvalidationfoldRecord](Crossvalidationfold.CROSSVALIDATIONFOLD) with Record4[Integer, Integer, Integer, Integer] {

  /**
   * Setter for <code>modeldb.CrossValidationFold.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationFold.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationFold.metric</code>.
   */
  def setMetric(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationFold.metric</code>.
   */
  def getMetric : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationFold.event</code>.
   */
  def setEvent(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationFold.event</code>.
   */
  def getEvent : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationFold.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationFold.experimentRun</code>.
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

  override def fieldsRow : Row4[Integer, Integer, Integer, Integer] = {
    super.fieldsRow.asInstanceOf[ Row4[Integer, Integer, Integer, Integer] ]
  }

  override def valuesRow : Row4[Integer, Integer, Integer, Integer] = {
    super.valuesRow.asInstanceOf[ Row4[Integer, Integer, Integer, Integer] ]
  }
  override def field1 : Field[Integer] = Crossvalidationfold.CROSSVALIDATIONFOLD.ID
  override def field2 : Field[Integer] = Crossvalidationfold.CROSSVALIDATIONFOLD.METRIC
  override def field3 : Field[Integer] = Crossvalidationfold.CROSSVALIDATIONFOLD.EVENT
  override def field4 : Field[Integer] = Crossvalidationfold.CROSSVALIDATIONFOLD.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : Integer = getMetric
  override def value3 : Integer = getEvent
  override def value4 : Integer = getExperimentrun

  override def value1(value : Integer) : CrossvalidationfoldRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : CrossvalidationfoldRecord = {
    setMetric(value)
    this
  }

  override def value3(value : Integer) : CrossvalidationfoldRecord = {
    setEvent(value)
    this
  }

  override def value4(value : Integer) : CrossvalidationfoldRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : Integer) : CrossvalidationfoldRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this
  }

  /**
   * Create a detached, initialised CrossvalidationfoldRecord
   */
  def this(id : Integer, metric : Integer, event : Integer, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, metric)
    set(2, event)
    set(3, experimentrun)
  }
}