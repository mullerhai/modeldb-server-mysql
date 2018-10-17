/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer

import javax.annotation.Generated

import jooq.mysql.gen.tables.Pipelinestage

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
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
class PipelinestageRecord extends UpdatableRecordImpl[PipelinestageRecord](Pipelinestage.PIPELINESTAGE) with Record6[Integer, Integer, Integer, Integer, Integer, Integer] {

  /**
   * Setter for <code>modeldb.PipelineStage.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.PipelineStage.pipelineFitEvent</code>.
   */
  def setPipelinefitevent(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.pipelineFitEvent</code>.
   */
  def getPipelinefitevent : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.PipelineStage.transformOrFitEvent</code>.
   */
  def setTransformorfitevent(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.transformOrFitEvent</code>.
   */
  def getTransformorfitevent : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.PipelineStage.isFit</code>.
   */
  def setIsfit(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.isFit</code>.
   */
  def getIsfit : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.PipelineStage.stageNumber</code>.
   */
  def setStagenumber(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.stageNumber</code>.
   */
  def getStagenumber : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.PipelineStage.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>modeldb.PipelineStage.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row6[Integer, Integer, Integer, Integer, Integer, Integer] = {
    super.fieldsRow.asInstanceOf[ Row6[Integer, Integer, Integer, Integer, Integer, Integer] ]
  }

  override def valuesRow : Row6[Integer, Integer, Integer, Integer, Integer, Integer] = {
    super.valuesRow.asInstanceOf[ Row6[Integer, Integer, Integer, Integer, Integer, Integer] ]
  }
  override def field1 : Field[Integer] = Pipelinestage.PIPELINESTAGE.ID
  override def field2 : Field[Integer] = Pipelinestage.PIPELINESTAGE.PIPELINEFITEVENT
  override def field3 : Field[Integer] = Pipelinestage.PIPELINESTAGE.TRANSFORMORFITEVENT
  override def field4 : Field[Integer] = Pipelinestage.PIPELINESTAGE.ISFIT
  override def field5 : Field[Integer] = Pipelinestage.PIPELINESTAGE.STAGENUMBER
  override def field6 : Field[Integer] = Pipelinestage.PIPELINESTAGE.EXPERIMENTRUN
  override def value1 : Integer = getId
  override def value2 : Integer = getPipelinefitevent
  override def value3 : Integer = getTransformorfitevent
  override def value4 : Integer = getIsfit
  override def value5 : Integer = getStagenumber
  override def value6 : Integer = getExperimentrun

  override def value1(value : Integer) : PipelinestageRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : PipelinestageRecord = {
    setPipelinefitevent(value)
    this
  }

  override def value3(value : Integer) : PipelinestageRecord = {
    setTransformorfitevent(value)
    this
  }

  override def value4(value : Integer) : PipelinestageRecord = {
    setIsfit(value)
    this
  }

  override def value5(value : Integer) : PipelinestageRecord = {
    setStagenumber(value)
    this
  }

  override def value6(value : Integer) : PipelinestageRecord = {
    setExperimentrun(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : Integer, value5 : Integer, value6 : Integer) : PipelinestageRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this
  }

  /**
   * Create a detached, initialised PipelinestageRecord
   */
  def this(id : Integer, pipelinefitevent : Integer, transformorfitevent : Integer, isfit : Integer, stagenumber : Integer, experimentrun : Integer) = {
    this()

    set(0, id)
    set(1, pipelinefitevent)
    set(2, transformorfitevent)
    set(3, isfit)
    set(4, stagenumber)
    set(5, experimentrun)
  }
}
