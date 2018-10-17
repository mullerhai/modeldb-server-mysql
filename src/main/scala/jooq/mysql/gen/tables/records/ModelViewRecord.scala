/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.ModelView

import org.jooq.Field
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.TableRecordImpl

import scala.Array


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
class ModelViewRecord extends TableRecordImpl[ModelViewRecord](ModelView.MODEL_VIEW) with Record5[Integer, String, Integer, Integer, Integer] {

  /**
   * Setter for <code>modeldb.model_view.fe_id</code>.
   */
  def setFeId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.model_view.fe_id</code>.
   */
  def getFeId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.model_view.model_type</code>.
   */
  def setModelType(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.model_view.model_type</code>.
   */
  def getModelType : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.model_view.model</code>.
   */
  def setModel(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.model_view.model</code>.
   */
  def getModel : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.model_view.spec_id</code>.
   */
  def setSpecId(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.model_view.spec_id</code>.
   */
  def getSpecId : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.model_view.train_df</code>.
   */
  def setTrainDf(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.model_view.train_df</code>.
   */
  def getTrainDf : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  // -------------------------------------------------------------------------
  // Record5 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row5[Integer, String, Integer, Integer, Integer] = {
    super.fieldsRow.asInstanceOf[ Row5[Integer, String, Integer, Integer, Integer] ]
  }

  override def valuesRow : Row5[Integer, String, Integer, Integer, Integer] = {
    super.valuesRow.asInstanceOf[ Row5[Integer, String, Integer, Integer, Integer] ]
  }
  override def field1 : Field[Integer] = ModelView.MODEL_VIEW.FE_ID
  override def field2 : Field[String] = ModelView.MODEL_VIEW.MODEL_TYPE
  override def field3 : Field[Integer] = ModelView.MODEL_VIEW.MODEL
  override def field4 : Field[Integer] = ModelView.MODEL_VIEW.SPEC_ID
  override def field5 : Field[Integer] = ModelView.MODEL_VIEW.TRAIN_DF
  override def value1 : Integer = getFeId
  override def value2 : String = getModelType
  override def value3 : Integer = getModel
  override def value4 : Integer = getSpecId
  override def value5 : Integer = getTrainDf

  override def value1(value : Integer) : ModelViewRecord = {
    setFeId(value)
    this
  }

  override def value2(value : String) : ModelViewRecord = {
    setModelType(value)
    this
  }

  override def value3(value : Integer) : ModelViewRecord = {
    setModel(value)
    this
  }

  override def value4(value : Integer) : ModelViewRecord = {
    setSpecId(value)
    this
  }

  override def value5(value : Integer) : ModelViewRecord = {
    setTrainDf(value)
    this
  }

  override def values(value1 : Integer, value2 : String, value3 : Integer, value4 : Integer, value5 : Integer) : ModelViewRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this
  }

  /**
   * Create a detached, initialised ModelViewRecord
   */
  def this(feId : Integer, modelType : String, model : Integer, specId : Integer, trainDf : Integer) = {
    this()

    set(0, feId)
    set(1, modelType)
    set(2, model)
    set(3, specId)
    set(4, trainDf)
  }
}
