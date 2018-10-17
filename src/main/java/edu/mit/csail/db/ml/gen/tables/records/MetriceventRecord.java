/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables.records;


import edu.mit.csail.db.ml.gen.tables.Metricevent;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class MetriceventRecord extends UpdatableRecordImpl<MetriceventRecord> implements Record6<Integer, Integer, Integer, String, Double, Integer> {

    private static final long serialVersionUID = 685975866;

    /**
     * Setter for <code>modeldb.MetricEvent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb.MetricEvent.transformer</code>.
     */
    public void setTransformer(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.transformer</code>.
     */
    public Integer getTransformer() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb.MetricEvent.df</code>.
     */
    public void setDf(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.df</code>.
     */
    public Integer getDf() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>modeldb.MetricEvent.metricType</code>.
     */
    public void setMetrictype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.metricType</code>.
     */
    public String getMetrictype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>modeldb.MetricEvent.metricValue</code>.
     */
    public void setMetricvalue(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.metricValue</code>.
     */
    public Double getMetricvalue() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>modeldb.MetricEvent.experimentRun</code>.
     */
    public void setExperimentrun(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>modeldb.MetricEvent.experimentRun</code>.
     */
    public Integer getExperimentrun() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Double, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Double, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Metricevent.METRICEVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Metricevent.METRICEVENT.TRANSFORMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Metricevent.METRICEVENT.DF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Metricevent.METRICEVENT.METRICTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Metricevent.METRICEVENT.METRICVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Metricevent.METRICEVENT.EXPERIMENTRUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTransformer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMetrictype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getMetricvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getExperimentrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value2(Integer value) {
        setTransformer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value3(Integer value) {
        setDf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value4(String value) {
        setMetrictype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value5(Double value) {
        setMetricvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord value6(Integer value) {
        setExperimentrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetriceventRecord values(Integer value1, Integer value2, Integer value3, String value4, Double value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetriceventRecord
     */
    public MetriceventRecord() {
        super(Metricevent.METRICEVENT);
    }

    /**
     * Create a detached, initialised MetriceventRecord
     */
    public MetriceventRecord(Integer id, Integer transformer, Integer df, String metrictype, Double metricvalue, Integer experimentrun) {
        super(Metricevent.METRICEVENT);

        set(0, id);
        set(1, transformer);
        set(2, df);
        set(3, metrictype);
        set(4, metricvalue);
        set(5, experimentrun);
    }
}