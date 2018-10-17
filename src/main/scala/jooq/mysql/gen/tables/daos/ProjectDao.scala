/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables.daos


import java.lang.Integer
import java.lang.String
import java.sql.Timestamp
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.tables.Project
import jooq.mysql.gen.tables.records.ProjectRecord

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
class ProjectDao(configuration : Configuration) extends DAOImpl[ProjectRecord, jooq.mysql.gen.tables.pojos.Project, Integer](Project.PROJECT, classOf[jooq.mysql.gen.tables.pojos.Project], configuration) {

  /**
   * Create a new ProjectDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : jooq.mysql.gen.tables.pojos.Project) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[jooq.mysql.gen.tables.pojos.Project] = {
    fetch(Project.PROJECT.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : jooq.mysql.gen.tables.pojos.Project = {
    fetchOne(Project.PROJECT.ID, value)
  }

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  def fetchByName(values : String*) : List[jooq.mysql.gen.tables.pojos.Project] = {
    fetch(Project.PROJECT.NAME, values:_*)
  }

  /**
   * Fetch records that have <code>author IN (values)</code>
   */
  def fetchByAuthor(values : String*) : List[jooq.mysql.gen.tables.pojos.Project] = {
    fetch(Project.PROJECT.AUTHOR, values:_*)
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  def fetchByDescription(values : String*) : List[jooq.mysql.gen.tables.pojos.Project] = {
    fetch(Project.PROJECT.DESCRIPTION, values:_*)
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  def fetchByCreated(values : Timestamp*) : List[jooq.mysql.gen.tables.pojos.Project] = {
    fetch(Project.PROJECT.CREATED, values:_*)
  }
}
