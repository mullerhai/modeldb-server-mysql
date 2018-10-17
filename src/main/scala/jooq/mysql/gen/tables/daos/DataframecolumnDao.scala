/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.lang.String
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Dataframecolumn
import jooq.mysql.gen.tables.records.DataframecolumnRecord

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
class DataframecolumnDao(configuration : Configuration) extends DAOImpl[DataframecolumnRecord, jooq.mysql.gen.tables.pojos.Dataframecolumn, Integer](Dataframecolumn.DATAFRAMECOLUMN, classOf[jooq.mysql.gen.tables.pojos.Dataframecolumn], configuration) {

  /**
   * Create a new DataframecolumnDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Dataframecolumn) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Dataframecolumn] = {
    fetch(Dataframecolumn.DATAFRAMECOLUMN.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Dataframecolumn = {
    fetchOne(Dataframecolumn.DATAFRAMECOLUMN.ID, value)
  }

  /**
   * Fetch records that have <code>dfId IN (values)</code>
   */
  def fetchByDfid(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Dataframecolumn] = {
    fetch(Dataframecolumn.DATAFRAMECOLUMN.DFID, values:_*)
  }

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  def fetchByName(values : String*) : List[jooq.mysql.gen.tables.pojos.Dataframecolumn] = {
    fetch(Dataframecolumn.DATAFRAMECOLUMN.NAME, values:_*)
  }

  /**
   * Fetch records that have <code>type IN (values)</code>
   */
  def fetchByType(values : String*) : List[jooq.mysql.gen.tables.pojos.Dataframecolumn] = {
    fetch(Dataframecolumn.DATAFRAMECOLUMN.TYPE, values:_*)
  }
}
