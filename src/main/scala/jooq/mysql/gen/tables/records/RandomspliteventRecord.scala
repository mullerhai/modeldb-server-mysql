/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.Long

import javax.annotation.Generated

import jooq.mysql.gen.tables.Randomsplitevent

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
class RandomspliteventRecord extends UpdatableRecordImpl[RandomspliteventRecord](Randomsplitevent.RANDOMSPLITEVENT) with Record4[Integer, Integer, Long, Integer] {

  /**
   * Setter for <code>modeldb.RandomSplitEvent.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.RandomSplitEvent.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.RandomSplitEvent.inputDataFrameId</code>.
   */
  def setInputdataframeid(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.RandomSplitEvent.inputDataFrameId</code>.
   */
  def getInputdataframeid : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.RandomSplitEvent.randomSeed</code>.
   */
  def setRandomseed(value : Long) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.RandomSplitEvent.randomSeed</code>.
   */
  def getRandomseed : Long = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Long]
  }

  /**
   * Setter for <code>modeldb.RandomSplitEvent.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.RandomSplitEvent.experimentRun</code>.
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

  override def fieldsRow : Row4[Integer, Integer, Long, Integer] = {
    super.fieldsRow.asInstanceOf[ Row4[Integer, Integer, Long, Integer] ]
  }

  override def valuesRow : Row4[Integer, Integer, Long, Integer] = {
    super.valuesRow.asInstanceOf[ Row4[Integer, Integer, Long, Integer] ]
  }
  override def field1 : Field[Integer] = Randomsplitevent.RANDOMSPLITEVENT.ID
  override def field2 : Field[Integer] = Randomsplitevent.RANDOMSPLITEVENT.INPUTDATAFRAMEID
  override def field3 : Field[Long] = Randomsplitevent.RANDOMSPLITEVENT.RANDOMSEED
  override def field4 : Field[Integer] = Randomsplitevent.RANDOMSPLITEVENT.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : Integer = getInputdataframeid
  override def value3 : Long = getRandomseed
  override def value4 : Integer = getExperimentrun

  override def value1(value : Integer) : RandomspliteventRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : RandomspliteventRecord = {
    setInputdataframeid(value)
    this
  }

  override def value3(value : Long) : RandomspliteventRecord = {
    setRandomseed(value)
    this
  }

  override def value4(value : Integer) : RandomspliteventRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Long, value4 : Integer) : RandomspliteventRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this
  }

  /**
   * Create a detached, initialised RandomspliteventRecord
   */
  def this(id : Integer, inputdataframeid : Integer, randomseed : Long, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, inputdataframeid)
    set(2, randomseed)
    set(3, experimentrun)
  }
}
