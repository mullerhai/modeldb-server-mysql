/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import jooq.mysql.gen.tables.Annotationfragment

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record9
import org.jooq.Row9
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
class AnnotationfragmentRecord extends UpdatableRecordImpl[AnnotationfragmentRecord](Annotationfragment.ANNOTATIONFRAGMENT) with Record9[Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String] {

  /**
   * Setter for <code>modeldb.AnnotationFragment.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.annotation</code>.
   */
  def setAnnotation(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.annotation</code>.
   */
  def getAnnotation : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.transformer</code>.
   */
  def setTransformer(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.transformer</code>.
   */
  def getTransformer : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.DataFrame</code>.
   */
  def setDataframe(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.DataFrame</code>.
   */
  def getDataframe : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.spec</code>.
   */
  def setSpec(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.spec</code>.
   */
  def getSpec : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.experimentRun</code>.
   */
  def setExperimentrun(value : Integer) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.experimentRun</code>.
   */
  def getExperimentrun : Integer = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.fragmentIndex</code>.
   */
  def setFragmentindex(value : Integer) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.fragmentIndex</code>.
   */
  def getFragmentindex : Integer = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.type</code>.
   */
  def setType(value : String) : Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.type</code>.
   */
  def getType : String = {
    val r = get(7)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>modeldb.AnnotationFragment.message</code>.
   */
  def setMessage(value : String) : Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>modeldb.AnnotationFragment.message</code>.
   */
  def getMessage : String = {
    val r = get(8)
    if (r == null) null else r.asInstanceOf[String]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key() : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record9 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row9[Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String] = {
    super.fieldsRow.asInstanceOf[ Row9[Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String] ]
  }

  override def valuesRow : Row9[Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String] = {
    super.valuesRow.asInstanceOf[ Row9[Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String] ]
  }
  override def field1 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.ID
  override def field2 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.ANNOTATION
  override def field3 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.TRANSFORMER
  override def field4 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.DATAFRAME
  override def field5 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.SPEC
  override def field6 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.EXPERIMENTRUN
  override def field7 : Field[Integer] = Annotationfragment.ANNOTATIONFRAGMENT.FRAGMENTINDEX
  override def field8 : Field[String] = Annotationfragment.ANNOTATIONFRAGMENT.TYPE
  override def field9 : Field[String] = Annotationfragment.ANNOTATIONFRAGMENT.MESSAGE
  override def value1 : Integer = getId
  override def value2 : Integer = getAnnotation
  override def value3 : Integer = getTransformer
  override def value4 : Integer = getDataframe
  override def value5 : Integer = getSpec
  override def value6 : Integer = getExperimentrun
  override def value7 : Integer = getFragmentindex
  override def value8 : String = getType
  override def value9 : String = getMessage

  override def value1(value : Integer) : AnnotationfragmentRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : AnnotationfragmentRecord = {
    setAnnotation(value)
    this
  }

  override def value3(value : Integer) : AnnotationfragmentRecord = {
    setTransformer(value)
    this
  }

  override def value4(value : Integer) : AnnotationfragmentRecord = {
    setDataframe(value)
    this
  }

  override def value5(value : Integer) : AnnotationfragmentRecord = {
    setSpec(value)
    this
  }

  override def value6(value : Integer) : AnnotationfragmentRecord = {
    setExperimentrun(value)
    this
  }

  override def value7(value : Integer) : AnnotationfragmentRecord = {
    setFragmentindex(value)
    this
  }

  override def value8(value : String) : AnnotationfragmentRecord = {
    setType(value)
    this
  }

  override def value9(value : String) : AnnotationfragmentRecord = {
    setMessage(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : Integer, value5 : Integer, value6 : Integer, value7 : Integer, value8 : String, value9 : String) : AnnotationfragmentRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this.value8(value8)
    this.value9(value9)
    this
  }

  /**
   * Create a detached, initialised AnnotationfragmentRecord
   */
  def this(id : Integer, annotation : Integer, transformer : Integer, dataframe : Integer, spec : Integer, experimentrun : Integer, fragmentindex : Integer, `type` : String, message : String) = {
    this()

    set(0, id)
    set(1, annotation)
    set(2, transformer)
    set(3, dataframe)
    set(4, spec)
    set(5, experimentrun)
    set(6, fragmentindex)
    set(7, `type`)
    set(8, message)
  }
}
