/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables.daos;


import edu.mit.csail.db.ml.gen.tables.pojos.Fitevent;
import edu.mit.csail.db.ml.gen.tables.records.FiteventRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
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
public class FiteventDao extends DAOImpl<FiteventRecord, Fitevent, Integer> {

    /**
     * Create a new FiteventDao without any configuration
     */
    public FiteventDao() {
        super(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT, Fitevent.class);
    }

    /**
     * Create a new FiteventDao with an attached configuration
     */
    public FiteventDao(Configuration configuration) {
        super(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT, Fitevent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(Fitevent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Fitevent> fetchById(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Fitevent fetchOneById(Integer value) {
        return fetchOne(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.ID, value);
    }

    /**
     * Fetch records that have <code>transformerSpec IN (values)</code>
     */
    public List<Fitevent> fetchByTransformerspec(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.TRANSFORMERSPEC, values);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<Fitevent> fetchByTransformer(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.TRANSFORMER, values);
    }

    /**
     * Fetch records that have <code>df IN (values)</code>
     */
    public List<Fitevent> fetchByDf(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.DF, values);
    }

    /**
     * Fetch records that have <code>predictionColumns IN (values)</code>
     */
    public List<Fitevent> fetchByPredictioncolumns(String... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.PREDICTIONCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>labelColumns IN (values)</code>
     */
    public List<Fitevent> fetchByLabelcolumns(String... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.LABELCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<Fitevent> fetchByExperimentrun(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.EXPERIMENTRUN, values);
    }

    /**
     * Fetch records that have <code>problemType IN (values)</code>
     */
    public List<Fitevent> fetchByProblemtype(String... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Fitevent.FITEVENT.PROBLEMTYPE, values);
    }
}