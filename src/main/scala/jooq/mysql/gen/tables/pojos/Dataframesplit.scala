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
class Dataframesplit(
    private var id : Integer
  , private var spliteventid : Integer
  , private var weight : Double 
  , private var dataframeid : Integer
  , private var experimentrun : Integer
) extends Serializable {

  def this() = {
    this(null, null, null, null, null)
  }

  def this (value : Dataframesplit) = {
    this(
        value.id
      , value.spliteventid
      , value.weight
      , value.dataframeid
      , value.experimentrun
    )
  }

  def getId : Integer = {
    this.id
  }

  def setId(id : Integer) : Unit = {
    this.id = id
  }

  def getSpliteventid : Integer = {
    this.spliteventid
  }

  def setSpliteventid(spliteventid : Integer) : Unit = {
    this.spliteventid = spliteventid
  }

  def getWeight : Double = {
    this.weight
  }

  def setWeight(weight : Double) : Unit = {
    this.weight = weight
  }

  def getDataframeid : Integer = {
    this.dataframeid
  }

  def setDataframeid(dataframeid : Integer) : Unit = {
    this.dataframeid = dataframeid
  }

  def getExperimentrun : Integer = {
    this.experimentrun
  }

  def setExperimentrun(experimentrun : Integer) : Unit = {
    this.experimentrun = experimentrun
  }

  override def toString : String = {
    val sb = new StringBuilder("Dataframesplit (")

    sb.append(id)
    sb.append(", ").append(spliteventid)
    sb.append(", ").append(weight)
    sb.append(", ").append(dataframeid)
    sb.append(", ").append(experimentrun)

    sb.append(")");
    return sb.toString
  }
}
