/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.records


import java.lang.Double
import java.lang.Integer

import javax.annotation.Generated

import jooq.mysql.gen.tables.Treenode

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
class TreenodeRecord extends UpdatableRecordImpl[TreenodeRecord](Treenode.TREENODE) with Record7[Integer, Integer, Double, Double, Double, Integer, Integer] {

  /**
   * Setter for <code>modeldb.TreeNode.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.TreeNode.isLeaf</code>.
   */
  def setIsleaf(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.isLeaf</code>.
   */
  def getIsleaf : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.TreeNode.prediction</code>.
   */
  def setPrediction(value : Double) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.prediction</code>.
   */
  def getPrediction : Double = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Double]
  }

  /**
   * Setter for <code>modeldb.TreeNode.impurity</code>.
   */
  def setImpurity(value : Double) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.impurity</code>.
   */
  def getImpurity : Double = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Double]
  }

  /**
   * Setter for <code>modeldb.TreeNode.gain</code>.
   */
  def setGain(value : Double) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.gain</code>.
   */
  def getGain : Double = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Double]
  }

  /**
   * Setter for <code>modeldb.TreeNode.splitIndex</code>.
   */
  def setSplitindex(value : Integer) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.splitIndex</code>.
   */
  def getSplitindex : Integer = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>modeldb.TreeNode.rootNode</code>.
   */
  def setRootnode(value : Integer) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>modeldb.TreeNode.rootNode</code>.
   */
  def getRootnode : Integer = {
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

  override def fieldsRow : Row7[Integer, Integer, Double, Double, Double, Integer, Integer] = {
    super.fieldsRow.asInstanceOf[ Row7[Integer, Integer, Double, Double, Double, Integer, Integer] ]
  }

  override def valuesRow : Row7[Integer, Integer, Double, Double, Double, Integer, Integer] = {
    super.valuesRow.asInstanceOf[ Row7[Integer, Integer, Double, Double, Double, Integer, Integer] ]
  }
  override def field1 : Field[Integer] = Treenode.TREENODE.ID
  override def field2 : Field[Integer] = Treenode.TREENODE.ISLEAF
  override def field3 : Field[Double] = Treenode.TREENODE.PREDICTION
  override def field4 : Field[Double] = Treenode.TREENODE.IMPURITY
  override def field5 : Field[Double] = Treenode.TREENODE.GAIN
  override def field6 : Field[Integer] = Treenode.TREENODE.SPLITINDEX
  override def field7 : Field[Integer] = Treenode.TREENODE.ROOTNODE
  override def value1 : Integer = getId
  override def value2 : Integer = getIsleaf
  override def value3 : Double = getPrediction
  override def value4 : Double = getImpurity
  override def value5 : Double = getGain
  override def value6 : Integer = getSplitindex
  override def value7 : Integer = getRootnode

  override def value1(value : Integer) : TreenodeRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : TreenodeRecord = {
    setIsleaf(value)
    this
  }

  override def value3(value : Double) : TreenodeRecord = {
    setPrediction(value)
    this
  }

  override def value4(value : Double) : TreenodeRecord = {
    setImpurity(value)
    this
  }

  override def value5(value : Double) : TreenodeRecord = {
    setGain(value)
    this
  }

  override def value6(value : Integer) : TreenodeRecord = {
    setSplitindex(value)
    this
  }

  override def value7(value : Integer) : TreenodeRecord = {
    setRootnode(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Double, value4 : Double, value5 : Double, value6 : Integer, value7 : Integer) : TreenodeRecord = {
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
   * Create a detached, initialised TreenodeRecord
   */
  def this(id : Integer, isleaf : Integer, prediction : Double, impurity : Double, gain : Double, splitindex : Integer, rootnode : Integer) = {
    this()

    set(0, id)
    set(1, isleaf)
    set(2, prediction)
    set(3, impurity)
    set(4, gain)
    set(5, splitindex)
    set(6, rootnode)
  }
}