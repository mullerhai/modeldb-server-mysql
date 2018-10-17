/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables;


import edu.mit.csail.db.ml.gen.Keys;
import edu.mit.csail.db.ml.gen.Modeldb;
import edu.mit.csail.db.ml.gen.tables.records.PipelinestageRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pipelinestage extends TableImpl<PipelinestageRecord> {

    private static final long serialVersionUID = 1447726536;

    /**
     * The reference instance of <code>modeldb.PipelineStage</code>
     */
    public static final Pipelinestage PIPELINESTAGE = new Pipelinestage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PipelinestageRecord> getRecordType() {
        return PipelinestageRecord.class;
    }

    /**
     * The column <code>modeldb.PipelineStage.id</code>.
     */
    public final TableField<PipelinestageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.PipelineStage.pipelineFitEvent</code>.
     */
    public final TableField<PipelinestageRecord, Integer> PIPELINEFITEVENT = createField("pipelineFitEvent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.PipelineStage.transformOrFitEvent</code>.
     */
    public final TableField<PipelinestageRecord, Integer> TRANSFORMORFITEVENT = createField("transformOrFitEvent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.PipelineStage.isFit</code>.
     */
    public final TableField<PipelinestageRecord, Integer> ISFIT = createField("isFit", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.PipelineStage.stageNumber</code>.
     */
    public final TableField<PipelinestageRecord, Integer> STAGENUMBER = createField("stageNumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.PipelineStage.experimentRun</code>.
     */
    public final TableField<PipelinestageRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb.PipelineStage</code> table reference
     */
    public Pipelinestage() {
        this("PipelineStage", null);
    }

    /**
     * Create an aliased <code>modeldb.PipelineStage</code> table reference
     */
    public Pipelinestage(String alias) {
        this(alias, PIPELINESTAGE);
    }

    private Pipelinestage(String alias, Table<PipelinestageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pipelinestage(String alias, Table<PipelinestageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Modeldb.MODELDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PipelinestageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PIPELINESTAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PipelinestageRecord> getPrimaryKey() {
        return Keys.KEY_PIPELINESTAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PipelinestageRecord>> getKeys() {
        return Arrays.<UniqueKey<PipelinestageRecord>>asList(Keys.KEY_PIPELINESTAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PipelinestageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PipelinestageRecord, ?>>asList(Keys.PIPELINESTAGE_IBFK_1, Keys.PIPELINESTAGE_IBFK_2, Keys.PIPELINESTAGE_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pipelinestage as(String alias) {
        return new Pipelinestage(alias, this);
    }

    /**
     * Rename this table
     */
    public Pipelinestage rename(String name) {
        return new Pipelinestage(name, null);
    }
}
