/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Crossvalidationfold
import jooq.mysql.gen.tables.records.CrossvalidationfoldRecord

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
class CrossvalidationfoldDao(configuration : Configuration) extends DAOImpl[CrossvalidationfoldRecord, jooq.mysql.gen.tables.pojos.Crossvalidationfold, Integer](Crossvalidationfold.CROSSVALIDATIONFOLD, classOf[jooq.mysql.gen.tables.pojos.Crossvalidationfold], configuration) {

  /**
   * Create a new CrossvalidationfoldDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Crossvalidationfold) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationfold] = {
    fetch(Crossvalidationfold.CROSSVALIDATIONFOLD.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Crossvalidationfold = {
    fetchOne(Crossvalidationfold.CROSSVALIDATIONFOLD.ID, value)
  }

  /**
   * Fetch records that have <code>metric IN (values)</code>
   */
  def fetchByMetric(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationfold] = {
    fetch(Crossvalidationfold.CROSSVALIDATIONFOLD.METRIC, values:_*)
  }

  /**
   * Fetch records that have <code>event IN (values)</code>
   */
  def fetchByEvent(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationfold] = {
    fetch(Crossvalidationfold.CROSSVALIDATIONFOLD.EVENT, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationfold] = {
    fetch(Crossvalidationfold.CROSSVALIDATIONFOLD.EXPERIMENTRUN, values:_*)
  }
}