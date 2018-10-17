/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Transformer
import jooq.mysql.gen.tables.records.TransformerRecord

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
class TransformerDao(configuration : Configuration) extends DAOImpl[TransformerRecord, jooq.mysql.gen.tables.pojos.Transformer, Integer](Transformer.TRANSFORMER, classOf[jooq.mysql.gen.tables.pojos.Transformer], configuration) {

  /**
   * Create a new TransformerDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Transformer) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Transformer] = {
    fetch(Transformer.TRANSFORMER.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Transformer = {
    fetchOne(Transformer.TRANSFORMER.ID, value)
  }

  /**
   * Fetch records that have <code>transformerType IN (values)</code>
   */
  def fetchByTransformertype(values : String*) : List[jooq.mysql.gen.tables.pojos.Transformer] = {
    fetch(Transformer.TRANSFORMER.TRANSFORMERTYPE, values:_*)
  }

  /**
   * Fetch records that have <code>tag IN (values)</code>
   */
  def fetchByTag(values : String*) : List[jooq.mysql.gen.tables.pojos.Transformer] = {
    fetch(Transformer.TRANSFORMER.TAG, values:_*)
  }

  /**
   * Fetch records that have <code>experimentRun IN (values)</code>
   */
  def fetchByExperimentrun(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Transformer] = {
    fetch(Transformer.TRANSFORMER.EXPERIMENTRUN, values:_*)
  }

  /**
   * Fetch records that have <code>filepath IN (values)</code>
   */
  def fetchByFilepath(values : String*) : List[jooq.mysql.gen.tables.pojos.Transformer] = {
    fetch(Transformer.TRANSFORMER.FILEPATH, values:_*)
  }
}