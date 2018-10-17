/**
 * This class is generated by jOOQ
 */
package jooq.mysql.gen.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import jooq.mysql.gen.Keys
import jooq.mysql.gen.Modeldb
import jooq.mysql.gen.tables.records.DataframemetadataRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array


object Dataframemetadata {

  /**
   * The reference instance of <code>modeldb.DataFrameMetadata</code>
   */
  val DATAFRAMEMETADATA = new Dataframemetadata
}

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
class Dataframemetadata(alias : String, aliased : Table[DataframemetadataRecord], parameters : Array[ Field[_] ]) extends TableImpl[DataframemetadataRecord](alias, Modeldb.MODELDB, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[DataframemetadataRecord] = {
    classOf[DataframemetadataRecord]
  }

  /**
   * The column <code>modeldb.DataFrameMetadata.id</code>.
   */
  val ID : TableField[DataframemetadataRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.DataFrameMetadata.dfId</code>.
   */
  val DFID : TableField[DataframemetadataRecord, Integer] = createField("dfId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>modeldb.DataFrameMetadata.metadataKvId</code>.
   */
  val METADATAKVID : TableField[DataframemetadataRecord, Integer] = createField("metadataKvId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * Create a <code>modeldb.DataFrameMetadata</code> table reference
   */
  def this() = {
    this("DataFrameMetadata", null, null)
  }

  /**
   * Create an aliased <code>modeldb.DataFrameMetadata</code> table reference
   */
  def this(alias : String) = {
    this(alias, jooq.mysql.gen.tables.Dataframemetadata.DATAFRAMEMETADATA, null)
  }

  private def this(alias : String, aliased : Table[DataframemetadataRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Modeldb.MODELDB

  override def getIdentity : Identity[DataframemetadataRecord, Integer] = {
    Keys.IDENTITY_DATAFRAMEMETADATA
  }

  override def getPrimaryKey : UniqueKey[DataframemetadataRecord] = {
    Keys.KEY_DATAFRAMEMETADATA_PRIMARY
  }

  override def getKeys : List[ UniqueKey[DataframemetadataRecord] ] = {
    return Arrays.asList[ UniqueKey[DataframemetadataRecord] ](Keys.KEY_DATAFRAMEMETADATA_PRIMARY)
  }

  override def getReferences : List[ ForeignKey[DataframemetadataRecord, _] ] = {
    return Arrays.asList[ ForeignKey[DataframemetadataRecord, _] ](Keys.DATAFRAMEMETADATA_IBFK_1, Keys.DATAFRAMEMETADATA_IBFK_2)
  }

  override def as(alias : String) : Dataframemetadata = {
    new Dataframemetadata(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : Dataframemetadata = {
    new Dataframemetadata(name, null)
  }
}
