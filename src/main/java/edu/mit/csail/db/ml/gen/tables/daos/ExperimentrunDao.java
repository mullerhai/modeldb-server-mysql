/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables.daos;


import edu.mit.csail.db.ml.gen.tables.pojos.Experimentrun;
import edu.mit.csail.db.ml.gen.tables.records.ExperimentrunRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
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
public class ExperimentrunDao extends DAOImpl<ExperimentrunRecord, Experimentrun, Integer> {

    /**
     * Create a new ExperimentrunDao without any configuration
     */
    public ExperimentrunDao() {
        super(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN, Experimentrun.class);
    }

    /**
     * Create a new ExperimentrunDao with an attached configuration
     */
    public ExperimentrunDao(Configuration configuration) {
        super(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN, Experimentrun.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(Experimentrun object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Experimentrun> fetchById(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Experimentrun fetchOneById(Integer value) {
        return fetchOne(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.ID, value);
    }

    /**
     * Fetch records that have <code>experiment IN (values)</code>
     */
    public List<Experimentrun> fetchByExperiment(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.EXPERIMENT, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<Experimentrun> fetchByDescription(String... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>sha IN (values)</code>
     */
    public List<Experimentrun> fetchBySha(String... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.SHA, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<Experimentrun> fetchByCreated(Timestamp... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Experimentrun.EXPERIMENTRUN.CREATED, values);
    }
}