/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables;


import edu.mit.csail.db.ml.gen.Keys;
import edu.mit.csail.db.ml.gen.Modeldb;
import edu.mit.csail.db.ml.gen.tables.records.GridcellcrossvalidationRecord;
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
public class Gridcellcrossvalidation extends TableImpl<GridcellcrossvalidationRecord> {

    private static final long serialVersionUID = -1390414173;

    /**
     * The reference instance of <code>modeldb.GridCellCrossValidation</code>
     */
    public static final Gridcellcrossvalidation GRIDCELLCROSSVALIDATION = new Gridcellcrossvalidation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GridcellcrossvalidationRecord> getRecordType() {
        return GridcellcrossvalidationRecord.class;
    }

    /**
     * The column <code>modeldb.GridCellCrossValidation.id</code>.
     */
    public final TableField<GridcellcrossvalidationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.GridCellCrossValidation.gridSearch</code>.
     */
    public final TableField<GridcellcrossvalidationRecord, Integer> GRIDSEARCH = createField("gridSearch", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.GridCellCrossValidation.crossValidation</code>.
     */
    public final TableField<GridcellcrossvalidationRecord, Integer> CROSSVALIDATION = createField("crossValidation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.GridCellCrossValidation.experimentRun</code>.
     */
    public final TableField<GridcellcrossvalidationRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb.GridCellCrossValidation</code> table reference
     */
    public Gridcellcrossvalidation() {
        this("GridCellCrossValidation", null);
    }

    /**
     * Create an aliased <code>modeldb.GridCellCrossValidation</code> table reference
     */
    public Gridcellcrossvalidation(String alias) {
        this(alias, GRIDCELLCROSSVALIDATION);
    }

    private Gridcellcrossvalidation(String alias, Table<GridcellcrossvalidationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gridcellcrossvalidation(String alias, Table<GridcellcrossvalidationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<GridcellcrossvalidationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GRIDCELLCROSSVALIDATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GridcellcrossvalidationRecord> getPrimaryKey() {
        return Keys.KEY_GRIDCELLCROSSVALIDATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GridcellcrossvalidationRecord>> getKeys() {
        return Arrays.<UniqueKey<GridcellcrossvalidationRecord>>asList(Keys.KEY_GRIDCELLCROSSVALIDATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GridcellcrossvalidationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GridcellcrossvalidationRecord, ?>>asList(Keys.GRIDCELLCROSSVALIDATION_IBFK_1, Keys.GRIDCELLCROSSVALIDATION_IBFK_2, Keys.GRIDCELLCROSSVALIDATION_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gridcellcrossvalidation as(String alias) {
        return new Gridcellcrossvalidation(alias, this);
    }

    /**
     * Rename this table
     */
    public Gridcellcrossvalidation rename(String name) {
        return new Gridcellcrossvalidation(name, null);
    }
}