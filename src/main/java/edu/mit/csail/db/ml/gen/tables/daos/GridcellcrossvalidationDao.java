/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables.daos;


import edu.mit.csail.db.ml.gen.tables.pojos.Gridcellcrossvalidation;
import edu.mit.csail.db.ml.gen.tables.records.GridcellcrossvalidationRecord;
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
public class GridcellcrossvalidationDao extends DAOImpl<GridcellcrossvalidationRecord, Gridcellcrossvalidation, Integer> {

    /**
     * Create a new GridcellcrossvalidationDao without any configuration
     */
    public GridcellcrossvalidationDao() {
        super(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION, Gridcellcrossvalidation.class);
    }

    /**
     * Create a new GridcellcrossvalidationDao with an attached configuration
     */
    public GridcellcrossvalidationDao(Configuration configuration) {
        super(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION, Gridcellcrossvalidation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(Gridcellcrossvalidation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Gridcellcrossvalidation> fetchById(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Gridcellcrossvalidation fetchOneById(Integer value) {
        return fetchOne(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.ID, value);
    }

    /**
     * Fetch records that have <code>gridSearch IN (values)</code>
     */
    public List<Gridcellcrossvalidation> fetchByGridsearch(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.GRIDSEARCH, values);
    }

    /**
     * Fetch records that have <code>crossValidation IN (values)</code>
     */
    public List<Gridcellcrossvalidation> fetchByCrossvalidation(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.CROSSVALIDATION, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<Gridcellcrossvalidation> fetchByExperimentrun(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.EXPERIMENTRUN, values);
    }
}