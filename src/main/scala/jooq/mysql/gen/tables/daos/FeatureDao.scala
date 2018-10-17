/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Double
import java.lang.Integer
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Feature
import jooq.mysql.gen.tables.records.FeatureRecord

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
class FeatureDao(configuration : Configuration) extends DAOImpl[FeatureRecord, jooq.mysql.gen.tables.pojos.Feature, Integer](Feature.FEATURE, classOf[jooq.mysql.gen.tables.pojos.Feature], configuration) {

  /**
   * Create a new FeatureDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Feature) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Feature] = {
    fetch(Feature.FEATURE.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Feature = {
    fetchOne(Feature.FEATURE.ID, value)
  }

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  def fetchByName(values : String*) : List[jooq.mysql.gen.tables.pojos.Feature] = {
    fetch(Feature.FEATURE.NAME, values:_*)
  }

  /**
   * Fetch records that have <code>featureIndex IN (values)</code>
   */
  def fetchByFeatureindex(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Feature] = {
    fetch(Feature.FEATURE.FEATUREINDEX, values:_*)
  }

  /**
   * Fetch records that have <code>importance IN (values)</code>
   */
  def fetchByImportance(values : Double*) : List[jooq.mysql.gen.tables.pojos.Feature] = {
    fetch(Feature.FEATURE.IMPORTANCE, values:_*)
  }

  /**
   * Fetch records that have <code>transformer IN (values)</code>
   */
  def fetchByTransformer(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Feature] = {
    fetch(Feature.FEATURE.TRANSFORMER, values:_*)
  }
}
