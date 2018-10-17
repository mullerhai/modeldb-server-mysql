/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.String
import java.sql.Timestamp

import javax.annotation.Generated

import jooq.mysql.gen.tables.Experimentrun

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
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
class ExperimentrunRecord extends UpdatableRecordImpl[ExperimentrunRecord](Experimentrun.EXPERIMENTRUN) with Record5[Integer, Integer, String, String, Timestamp] {

  /**
   * Setter for <code>modeldb.ExperimentRun.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.ExperimentRun.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.ExperimentRun.experiment</code>.
   */
  def setExperiment(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.ExperimentRun.experiment</code>.
   */
  def getExperiment : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.ExperimentRun.description</code>.
   */
  def setDescription(value : String) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.ExperimentRun.description</code>.
   */
  def getDescription : String = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.ExperimentRun.sha</code>.
   */
  def setSha(value : String) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.ExperimentRun.sha</code>.
   */
  def getSha : String = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.ExperimentRun.created</code>.
   */
  def setCreated(value : Timestamp) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.ExperimentRun.created</code>.
   */
  def getCreated : Timestamp = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Timestamp]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record5 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row5[Integer, Integer, String, String, Timestamp] = {
    super.fieldsRow.asInstanceOf[ Row5[Integer, Integer, String, String, Timestamp] ]
  }

  override def valuesRow : Row5[Integer, Integer, String, String, Timestamp] = {
    super.valuesRow.asInstanceOf[ Row5[Integer, Integer, String, String, Timestamp] ]
  }
  override def field1 : Field[Integer] = Experimentrun.EXPERIMENTRUN.ID
  override def field2 : Field[Integer] = Experimentrun.EXPERIMENTRUN.EXPERIMENT
  override def field3 : Field[String] = Experimentrun.EXPERIMENTRUN.DESCRIPTION
  override def field4 : Field[String] = Experimentrun.EXPERIMENTRUN.SHA
  override def field5 : Field[Timestamp] = Experimentrun.EXPERIMENTRUN.CREATED
  override def value1 : Integer = getId
  override def value2 : Integer = getExperiment
  override def value3 : String = getDescription
  override def value4 : String = getSha
  override def value5 : Timestamp = getCreated

  override def value1(value : Integer) : ExperimentrunRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : ExperimentrunRecord = {
    setExperiment(value)
    this
  }

  override def value3(value : String) : ExperimentrunRecord = {
    setDescription(value)
    this
  }

  override def value4(value : String) : ExperimentrunRecord = {
    setSha(value)
    this
  }

  override def value5(value : Timestamp) : ExperimentrunRecord = {
    setCreated(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : String, value4 : String, value5 : Timestamp) : ExperimentrunRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this
  }

  /**
   * Create a detached, initialised ExperimentrunRecord
   */
  def this(id : Integer, experiment : Integer, description : String, sha : String, created : Timestamp) = {
    this()

    set(0, id)
    set(1, experiment)
    set(2, description)
    set(3, sha)
    set(4, created)
  }
}