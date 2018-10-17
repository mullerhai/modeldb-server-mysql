/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Double
import java.lang.Integer
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Linearmodelterm
import jooq.mysql.gen.tables.records.LinearmodeltermRecord

import org.jooq.Configuration
import org.jooq.impl.DAOImpl

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
class LinearmodeltermDao(configuration : Configuration) extends DAOImpl[LinearmodeltermRecord, jooq.mysql.gen.tables.pojos.Linearmodelterm, Integer](Linearmodelterm.LINEARMODELTERM, classOf[jooq.mysql.gen.tables.pojos.Linearmodelterm], configuration) {

  /**
   * Create a new LinearmodeltermDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Linearmodelterm) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Linearmodelterm = {
    fetchOne(Linearmodelterm.LINEARMODELTERM.ID, value)
  }

  /**
   * Fetch records that have <code>model IN (values)</code>
   */
  def fetchByModel(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.MODEL, values:_*)
  }

  /**
   * Fetch records that have <code>termIndex IN (values)</code>
   */
  def fetchByTermindex(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.TERMINDEX, values:_*)
  }

  /**
   * Fetch records that have <code>coefficient IN (values)</code>
   */
  def fetchByCoefficient(values : Double*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.COEFFICIENT, values:_*)
  }

  /**
   * Fetch records that have <code>tStat IN (values)</code>
   */
  def fetchByTstat(values : Double*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.TSTAT, values:_*)
  }

  /**
   * Fetch records that have <code>stdErr IN (values)</code>
   */
  def fetchByStderr(values : Double*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.STDERR, values:_*)
  }

  /**
   * Fetch records that have <code>pValue IN (values)</code>
   */
  def fetchByPvalue(values : Double*) : List[jooq.mysql.gen.tables.pojos.Linearmodelterm] = {
    fetch(Linearmodelterm.LINEARMODELTERM.PVALUE, values:_*)
  }
}
