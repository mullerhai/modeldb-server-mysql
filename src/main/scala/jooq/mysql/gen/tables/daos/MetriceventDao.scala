/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Double
import java.lang.Integer
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Metricevent
import jooq.mysql.gen.tables.records.MetriceventRecord

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
class MetriceventDao(configuration : Configuration) extends DAOImpl[MetriceventRecord, jooq.mysql.gen.tables.pojos.Metricevent, Integer](Metricevent.METRICEVENT, classOf[jooq.mysql.gen.tables.pojos.Metricevent], configuration) {

  /**
   * Create a new MetriceventDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Metricevent) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Metricevent = {
    fetchOne(Metricevent.METRICEVENT.ID, value)
  }

  /**
   * Fetch records that have <code>transformer IN (values)</code>
   */
  def fetchByTransformer(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.TRANSFORMER, values:_*)
  }

  /**
   * Fetch records that have <code>df IN (values)</code>
   */
  def fetchByDf(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.DF, values:_*)
  }

  /**
   * Fetch records that have <code>metricType IN (values)</code>
   */
  def fetchByMetrictype(values : String*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.METRICTYPE, values:_*)
  }

  /**
   * Fetch records that have <code>metricValue IN (values)</code>
   */
  def fetchByMetricvalue(values : Double*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.METRICVALUE, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Metricevent] = {
    fetch(Metricevent.METRICEVENT.EXPERIMENTRUN, values:_*)
  }
}