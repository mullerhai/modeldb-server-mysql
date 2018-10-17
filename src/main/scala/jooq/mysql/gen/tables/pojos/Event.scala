/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.pojos


import java.io.Serializable
import java.lang.Integer
import java.lang.String
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
class Event(
    private var id : Integer
  , private var eventtype : String 
  , private var eventid : Integer
  , private var experimentrun : Integer
) extends Serializable {

  def this() = {
    this(null, null, null, null)
  }

  def this (value : Event) = {
    this(
        value.id
      , value.eventtype
      , value.eventid
      , value.experimentrun
    )
  }

  def getId : Integer = {
    this.id
  }

  def setId(id : Integer) : Unit = {
    this.id = id
  }

  def getEventtype : String = {
    this.eventtype
  }

  def setEventtype(eventtype : String) : Unit = {
    this.eventtype = eventtype
  }

  def getEventid : Integer = {
    this.eventid
  }

  def setEventid(eventid : Integer) : Unit = {
    this.eventid = eventid
  }

  def getExperimentrun : Integer = {
    this.experimentrun
  }

  def setExperimentrun(experimentrun : Integer) : Unit = {
    this.experimentrun = experimentrun
  }

  override def toString : String = {
    val sb = new StringBuilder("Event (")

    sb.append(id)
    sb.append(", ").append(eventtype)
    sb.append(", ").append(eventid)
    sb.append(", ").append(experimentrun)

    sb.append(")");
    return sb.toString
  }
}