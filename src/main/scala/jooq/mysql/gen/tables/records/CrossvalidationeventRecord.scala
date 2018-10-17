/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.Long
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.Crossvalidationevent

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
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
class CrossvalidationeventRecord extends UpdatableRecordImpl[CrossvalidationeventRecord](Crossvalidationevent.CROSSVALIDATIONEVENT) with Record7[Integer, Integer, Integer, Integer, Long, String, Integer] {

  /**
   * Setter for <code>modeldb.CrossValidationEvent.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.df</code>.
   */
  def setDf(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.df</code>.
   */
  def getDf : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.spec</code>.
   */
  def setSpec(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.spec</code>.
   */
  def getSpec : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.numFolds</code>.
   */
  def setNumfolds(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.numFolds</code>.
   */
  def getNumfolds : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.randomSeed</code>.
   */
  def setRandomseed(value : Long) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.randomSeed</code>.
   */
  def getRandomseed : Long = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Long]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.evaluator</code>.
   */
  def setEvaluator(value : String) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.evaluator</code>.
   */
  def getEvaluator : String = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.CrossValidationEvent.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>modeldb.CrossValidationEvent.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record7 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row7[Integer, Integer, Integer, Integer, Long, String, Integer] = {
    super.fieldsRow.asInstanceOf[ Row7[Integer, Integer, Integer, Integer, Long, String, Integer] ]
  }

  override def valuesRow : Row7[Integer, Integer, Integer, Integer, Long, String, Integer] = {
    super.valuesRow.asInstanceOf[ Row7[Integer, Integer, Integer, Integer, Long, String, Integer] ]
  }
  override def field1 : Field[Integer] = Crossvalidationevent.CROSSVALIDATIONEVENT.ID
  override def field2 : Field[Integer] = Crossvalidationevent.CROSSVALIDATIONEVENT.DF
  override def field3 : Field[Integer] = Crossvalidationevent.CROSSVALIDATIONEVENT.SPEC
  override def field4 : Field[Integer] = Crossvalidationevent.CROSSVALIDATIONEVENT.NUMFOLDS
  override def field5 : Field[Long] = Crossvalidationevent.CROSSVALIDATIONEVENT.RANDOMSEED
  override def field6 : Field[String] = Crossvalidationevent.CROSSVALIDATIONEVENT.EVALUATOR
  override def field7 : Field[Integer] = Crossvalidationevent.CROSSVALIDATIONEVENT.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : Integer = getDf
  override def value3 : Integer = getSpec
  override def value4 : Integer = getNumfolds
  override def value5 : Long = getRandomseed
  override def value6 : String = getEvaluator
  override def value7 : Integer = getExperimentrun

  override def value1(value : Integer) : CrossvalidationeventRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : CrossvalidationeventRecord = {
    setDf(value)
    this
  }

  override def value3(value : Integer) : CrossvalidationeventRecord = {
    setSpec(value)
    this
  }

  override def value4(value : Integer) : CrossvalidationeventRecord = {
    setNumfolds(value)
    this
  }

  override def value5(value : Long) : CrossvalidationeventRecord = {
    setRandomseed(value)
    this
  }

  override def value6(value : String) : CrossvalidationeventRecord = {
    setEvaluator(value)
    this
  }

  override def value7(value : Integer) : CrossvalidationeventRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : Integer, value5 : Long, value6 : String, value7 : Integer) : CrossvalidationeventRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this
  }

  /**
   * Create a detached, initialised CrossvalidationeventRecord
   */
  def this(id : Integer, df : Integer, spec : Integer, numfolds : Integer, randomseed : Long, evaluator : String, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, df)
    set(2, spec)
    set(3, numfolds)
    set(4, randomseed)
    set(5, evaluator)
    set(6, experimentrun)
  }
}
