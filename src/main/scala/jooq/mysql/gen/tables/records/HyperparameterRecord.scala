/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Double
import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.Hyperparameter

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record8
import org.jooq.Row8
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
class HyperparameterRecord extends UpdatableRecordImpl[HyperparameterRecord](Hyperparameter.HYPERPARAMETER) with Record8[Integer, Integer, String, String, String, Double, Double, Integer] {

  /**
   * Setter for <code>modeldb.HyperParameter.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.spec</code>.
   */
  def setSpec(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.spec</code>.
   */
  def getSpec : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.paramName</code>.
   */
  def setParamname(value : String) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.paramName</code>.
   */
  def getParamname : String = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.paramType</code>.
   */
  def setParamtype(value : String) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.paramType</code>.
   */
  def getParamtype : String = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.paramValue</code>.
   */
  def setParamvalue(value : String) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.paramValue</code>.
   */
  def getParamvalue : String = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.paramMinValue</code>.
   */
  def setParamminvalue(value : Double) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.paramMinValue</code>.
   */
  def getParamminvalue : Double = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Double]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.paramMaxValue</code>.
   */
  def setParammaxvalue(value : Double) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.paramMaxValue</code>.
   */
  def getParammaxvalue : Double = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[Double]
  }

  /**
   * Setter for <code>modeldb.HyperParameter.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>modeldb.HyperParameter.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(7)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record8 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row8[Integer, Integer, String, String, String, Double, Double, Integer] = {
    super.fieldsRow.asInstanceOf[ Row8[Integer, Integer, String, String, String, Double, Double, Integer] ]
  }

  override def valuesRow : Row8[Integer, Integer, String, String, String, Double, Double, Integer] = {
    super.valuesRow.asInstanceOf[ Row8[Integer, Integer, String, String, String, Double, Double, Integer] ]
  }
  override def field1 : Field[Integer] = Hyperparameter.HYPERPARAMETER.ID
  override def field2 : Field[Integer] = Hyperparameter.HYPERPARAMETER.SPEC
  override def field3 : Field[String] = Hyperparameter.HYPERPARAMETER.PARAMNAME
  override def field4 : Field[String] = Hyperparameter.HYPERPARAMETER.PARAMTYPE
  override def field5 : Field[String] = Hyperparameter.HYPERPARAMETER.PARAMVALUE
  override def field6 : Field[Double] = Hyperparameter.HYPERPARAMETER.PARAMMINVALUE
  override def field7 : Field[Double] = Hyperparameter.HYPERPARAMETER.PARAMMAXVALUE
  override def field8 : Field[Integer] = Hyperparameter.HYPERPARAMETER.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : Integer = getSpec
  override def value3 : String = getParamname
  override def value4 : String = getParamtype
  override def value5 : String = getParamvalue
  override def value6 : Double = getParamminvalue
  override def value7 : Double = getParammaxvalue
  override def value8 : Integer = getExperimentrun

  override def value1(value : Integer) : HyperparameterRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : HyperparameterRecord = {
    setSpec(value)
    this
  }

  override def value3(value : String) : HyperparameterRecord = {
    setParamname(value)
    this
  }

  override def value4(value : String) : HyperparameterRecord = {
    setParamtype(value)
    this
  }

  override def value5(value : String) : HyperparameterRecord = {
    setParamvalue(value)
    this
  }

  override def value6(value : Double) : HyperparameterRecord = {
    setParamminvalue(value)
    this
  }

  override def value7(value : Double) : HyperparameterRecord = {
    setParammaxvalue(value)
    this
  }

  override def value8(value : Integer) : HyperparameterRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : String, value4 : String, value5 : String, value6 : Double, value7 : Double, value8 : Integer) : HyperparameterRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this.value8(value8)
    this
  }

  /**
   * Create a detached, initialised HyperparameterRecord
   */
  def this(id : Integer, spec : Integer, paramname : String, paramtype : String, paramvalue : String, paramminvalue : Double, parammaxvalue : Double, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, spec)
    set(2, paramname)
    set(3, paramtype)
    set(4, paramvalue)
    set(5, paramminvalue)
    set(6, parammaxvalue)
    set(7, experimentrun)
  }
}