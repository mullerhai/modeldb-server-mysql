/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.Dataframe

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
class DataframeRecord extends UpdatableRecordImpl[DataframeRecord](Dataframe.DATAFRAME) with Record5[Integer, String, Integer, Integer, String] {

  /**
   * Setter for <code>modeldb.DataFrame.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.DataFrame.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.DataFrame.tag</code>.
   */
  def setTag(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.DataFrame.tag</code>.
   */
  def getTag : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.DataFrame.numRows</code>.
   */
  def setNumrows(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.DataFrame.numRows</code>.
   */
  def getNumrows : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.DataFrame.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.DataFrame.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.DataFrame.filepath</code>.
   */
  def setFilepath(value : String) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.DataFrame.filepath</code>.
   */
  def getFilepath : String = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[String]
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

  override def fieldsRow : Row5[Integer, String, Integer, Integer, String] = {
    super.fieldsRow.asInstanceOf[ Row5[Integer, String, Integer, Integer, String] ]
  }

  override def valuesRow : Row5[Integer, String, Integer, Integer, String] = {
    super.valuesRow.asInstanceOf[ Row5[Integer, String, Integer, Integer, String] ]
  }
  override def field1 : Field[Integer] = Dataframe.DATAFRAME.ID
  override def field2 : Field[String] = Dataframe.DATAFRAME.TAG
  override def field3 : Field[Integer] = Dataframe.DATAFRAME.NUMROWS
  override def field4 : Field[Integer] = Dataframe.DATAFRAME.EXPERIMENTRUN
  override def field5 : Field[String] = Dataframe.DATAFRAME.FILEPATH
  override def value1 : Integer = getId
  override def value2 : String = getTag
  override def value3 : Integer = getNumrows
  override def value4 : Integer = getExperimentrun
  override def value5 : String = getFilepath

  override def value1(value : Integer) : DataframeRecord = {
    setId(value)
    this
  }

  override def value2(value : String) : DataframeRecord = {
    setTag(value)
    this
  }

  override def value3(value : Integer) : DataframeRecord = {
    setNumrows(value)
    this
  }

  override def value4(value : Integer) : DataframeRecord = {
    setExperimentrun(value)
    this
  }

  override def value5(value : String) : DataframeRecord = {
    setFilepath(value)
    this
  }

  override def values(value1 : Integer, value2 : String, value3 : Integer, value4 : Integer, value5 : String) : DataframeRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this
  }

  /**
   * Create a detached, initialised DataframeRecord
   */
  def this(id : Integer, tag : String, numrows : Integer, experimentrun : Integer, filepath : String) = {
    this()

    set(0, id)
    set(1, tag)
    set(2, numrows)
    set(3, experimentrun)
    set(4, filepath)
  }
}