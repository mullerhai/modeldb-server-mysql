/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.pojos


import java.io.Serializable
import java.lang.Double
import java.lang.Integer
import java.lang.StringBuilder

import javax.annotation.Generated

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
class Treenode(
    private var id : Integer
  , private var isleaf : Integer
  , private var prediction : Double 
  , private var impurity : Double 
  , private var gain : Double 
  , private var splitindex : Integer
  , private var rootnode : Integer
) extends Serializable {

  def this() = {
    this(null, null, null, null, null, null, null)
  }

  def this (value : Treenode) = {
    this(
        value.id
      , value.isleaf
      , value.prediction
      , value.impurity
      , value.gain
      , value.splitindex
      , value.rootnode
    )
  }

  def getId : Integer = {
    this.id
  }

  def setId(id : Integer) : Unit = {
    this.id = id
  }

  def getIsleaf : Integer = {
    this.isleaf
  }

  def setIsleaf(isleaf : Integer) : Unit = {
    this.isleaf = isleaf
  }

  def getPrediction : Double = {
    this.prediction
  }

  def setPrediction(prediction : Double) : Unit = {
    this.prediction = prediction
  }

  def getImpurity : Double = {
    this.impurity
  }

  def setImpurity(impurity : Double) : Unit = {
    this.impurity = impurity
  }

  def getGain : Double = {
    this.gain
  }

  def setGain(gain : Double) : Unit = {
    this.gain = gain
  }

  def getSplitindex : Integer = {
    this.splitindex
  }

  def setSplitindex(splitindex : Integer) : Unit = {
    this.splitindex = splitindex
  }

  def getRootnode : Integer = {
    this.rootnode
  }

  def setRootnode(rootnode : Integer) : Unit = {
    this.rootnode = rootnode
  }

  override def toString : String = {
    val sb = new StringBuilder("Treenode (")

    sb.append(id)
    sb.append(", ").append(isleaf)
    sb.append(", ").append(prediction)
    sb.append(", ").append(impurity)
    sb.append(", ").append(gain)
    sb.append(", ").append(splitindex)
    sb.append(", ").append(rootnode)

    sb.append(")");
    return sb.toString
  }
}