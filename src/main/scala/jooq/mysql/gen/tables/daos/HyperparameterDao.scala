/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Double
import java.lang.Integer
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Hyperparameter
import jooq.mysql.gen.tables.records.HyperparameterRecord

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
class HyperparameterDao(configuration : Configuration) extends DAOImpl[HyperparameterRecord, jooq.mysql.gen.tables.pojos.Hyperparameter, Integer](Hyperparameter.HYPERPARAMETER, classOf[jooq.mysql.gen.tables.pojos.Hyperparameter], configuration) {

  /**
   * Create a new HyperparameterDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Hyperparameter) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Hyperparameter = {
    fetchOne(Hyperparameter.HYPERPARAMETER.ID, value)
  }

  /**
   * Fetch records that have <code>spec IN (values)</code>
   */
  def fetchBySpec(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.SPEC, values:_*)
  }

  /**
   * Fetch records that have <code>paramName IN (values)</code>
   */
  def fetchByParamname(values : String*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.PARAMNAME, values:_*)
  }

  /**
   * Fetch records that have <code>paramType IN (values)</code>
   */
  def fetchByParamtype(values : String*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.PARAMTYPE, values:_*)
  }

  /**
   * Fetch records that have <code>paramValue IN (values)</code>
   */
  def fetchByParamvalue(values : String*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.PARAMVALUE, values:_*)
  }

  /**
   * Fetch records that have <code>paramMinValue IN (values)</code>
   */
  def fetchByParamminvalue(values : Double*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.PARAMMINVALUE, values:_*)
  }

  /**
   * Fetch records that have <code>paramMaxValue IN (values)</code>
   */
  def fetchByParammaxvalue(values : Double*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.PARAMMAXVALUE, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Hyperparameter] = {
    fetch(Hyperparameter.HYPERPARAMETER.EXPERIMENTRUN, values:_*)
  }
}
