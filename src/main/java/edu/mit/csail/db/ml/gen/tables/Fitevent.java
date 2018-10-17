/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables;


import edu.mit.csail.db.ml.gen.Keys;
import edu.mit.csail.db.ml.gen.Modeldb;
import edu.mit.csail.db.ml.gen.tables.records.FiteventRecord;
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
public class Fitevent extends TableImpl<FiteventRecord> {

    private static final long serialVersionUID = 277832457;

    /**
     * The reference instance of <code>modeldb.FitEvent</code>
     */
    public static final Fitevent FITEVENT = new Fitevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FiteventRecord> getRecordType() {
        return FiteventRecord.class;
    }

    /**
     * The column <code>modeldb.FitEvent.id</code>.
     */
    public final TableField<FiteventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.transformerSpec</code>.
     */
    public final TableField<FiteventRecord, Integer> TRANSFORMERSPEC = createField("transformerSpec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.transformer</code>.
     */
    public final TableField<FiteventRecord, Integer> TRANSFORMER = createField("transformer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.df</code>.
     */
    public final TableField<FiteventRecord, Integer> DF = createField("df", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.predictionColumns</code>.
     */
    public final TableField<FiteventRecord, String> PREDICTIONCOLUMNS = createField("predictionColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.labelColumns</code>.
     */
    public final TableField<FiteventRecord, String> LABELCOLUMNS = createField("labelColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.experimentRun</code>.
     */
    public final TableField<FiteventRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.FitEvent.problemType</code>.
     */
    public final TableField<FiteventRecord, String> PROBLEMTYPE = createField("problemType", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>modeldb.FitEvent</code> table reference
     */
    public Fitevent() {
        this("FitEvent", null);
    }

    /**
     * Create an aliased <code>modeldb.FitEvent</code> table reference
     */
    public Fitevent(String alias) {
        this(alias, FITEVENT);
    }

    private Fitevent(String alias, Table<FiteventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fitevent(String alias, Table<FiteventRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FiteventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FITEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FiteventRecord> getPrimaryKey() {
        return Keys.KEY_FITEVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FiteventRecord>> getKeys() {
        return Arrays.<UniqueKey<FiteventRecord>>asList(Keys.KEY_FITEVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FiteventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FiteventRecord, ?>>asList(Keys.FITEVENT_IBFK_1, Keys.FITEVENT_IBFK_2, Keys.FITEVENT_IBFK_3, Keys.FITEVENT_IBFK_4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fitevent as(String alias) {
        return new Fitevent(alias, this);
    }

    /**
     * Rename this table
     */
    public Fitevent rename(String name) {
        return new Fitevent(name, null);
    }
}