/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.lang.Long
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Crossvalidationevent
import jooq.mysql.gen.tables.records.CrossvalidationeventRecord

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
class CrossvalidationeventDao(configuration : Configuration) extends DAOImpl[CrossvalidationeventRecord, jooq.mysql.gen.tables.pojos.Crossvalidationevent, Integer](Crossvalidationevent.CROSSVALIDATIONEVENT, classOf[jooq.mysql.gen.tables.pojos.Crossvalidationevent], configuration) {

  /**
   * Create a new CrossvalidationeventDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Crossvalidationevent) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Crossvalidationevent = {
    fetchOne(Crossvalidationevent.CROSSVALIDATIONEVENT.ID, value)
  }

  /**
   * Fetch records that have <code>df IN (values)</code>
   */
  def fetchByDf(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.DF, values:_*)
  }

  /**
   * Fetch records that have <code>spec IN (values)</code>
   */
  def fetchBySpec(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.SPEC, values:_*)
  }

  /**
   * Fetch records that have <code>numFolds IN (values)</code>
   */
  def fetchByNumfolds(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.NUMFOLDS, values:_*)
  }

  /**
   * Fetch records that have <code>randomSeed IN (values)</code>
   */
  def fetchByRandomseed(values : Long*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.RANDOMSEED, values:_*)
  }

  /**
   * Fetch records that have <code>evaluator IN (values)</code>
   */
  def fetchByEvaluator(values : String*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.EVALUATOR, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Crossvalidationevent] = {
    fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.EXPERIMENTRUN, values:_*)
  }
}