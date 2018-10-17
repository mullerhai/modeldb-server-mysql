/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables;


import edu.mit.csail.db.ml.gen.Modeldb;
import edu.mit.csail.db.ml.gen.tables.records.ModelViewRecord;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelView extends TableImpl<ModelViewRecord> {

    private static final long serialVersionUID = -1485373860;

    /**
     * The reference instance of <code>modeldb.model_view</code>
     */
    public static final ModelView MODEL_VIEW = new ModelView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModelViewRecord> getRecordType() {
        return ModelViewRecord.class;
    }

    /**
     * The column <code>modeldb.model_view.fe_id</code>.
     */
    public final TableField<ModelViewRecord, Integer> FE_ID = createField("fe_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>modeldb.model_view.model_type</code>.
     */
    public final TableField<ModelViewRecord, String> MODEL_TYPE = createField("model_type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb.model_view.model</code>.
     */
    public final TableField<ModelViewRecord, Integer> MODEL = createField("model", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.model_view.spec_id</code>.
     */
    public final TableField<ModelViewRecord, Integer> SPEC_ID = createField("spec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb.model_view.train_df</code>.
     */
    public final TableField<ModelViewRecord, Integer> TRAIN_DF = createField("train_df", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb.model_view</code> table reference
     */
    public ModelView() {
        this("model_view", null);
    }

    /**
     * Create an aliased <code>modeldb.model_view</code> table reference
     */
    public ModelView(String alias) {
        this(alias, MODEL_VIEW);
    }

    private ModelView(String alias, Table<ModelViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ModelView(String alias, Table<ModelViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
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
    public ModelView as(String alias) {
        return new ModelView(alias, this);
    }

    /**
     * Rename this table
     */
    public ModelView rename(String name) {
        return new ModelView(name, null);
    }
}