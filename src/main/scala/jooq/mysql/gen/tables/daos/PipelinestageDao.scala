/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Pipelinestage
import jooq.mysql.gen.tables.records.PipelinestageRecord

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
class PipelinestageDao(configuration : Configuration) extends DAOImpl[PipelinestageRecord, jooq.mysql.gen.tables.pojos.Pipelinestage, Integer](Pipelinestage.PIPELINESTAGE, classOf[jooq.mysql.gen.tables.pojos.Pipelinestage], configuration) {

  /**
   * Create a new PipelinestageDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Pipelinestage) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Pipelinestage = {
    fetchOne(Pipelinestage.PIPELINESTAGE.ID, value)
  }

  /**
   * Fetch records that have <code>pipelineFitEvent IN (values)</code>
   */
  def fetchByPipelinefitevent(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.PIPELINEFITEVENT, values:_*)
  }

  /**
   * Fetch records that have <code>transformOrFitEvent IN (values)</code>
   */
  def fetchByTransformorfitevent(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.TRANSFORMORFITEVENT, values:_*)
  }

  /**
   * Fetch records that have <code>isFit IN (values)</code>
   */
  def fetchByIsfit(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.ISFIT, values:_*)
  }

  /**
   * Fetch records that have <code>stageNumber IN (values)</code>
   */
  def fetchByStagenumber(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.STAGENUMBER, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Pipelinestage] = {
    fetch(Pipelinestage.PIPELINESTAGE.EXPERIMENTRUN, values:_*)
  }
}
