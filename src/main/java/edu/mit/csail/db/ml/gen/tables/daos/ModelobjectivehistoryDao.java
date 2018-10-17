/**
 * This class is generated by jOOQ
 */
package edu.mit.csail.db.ml.gen.tables.daos;


import edu.mit.csail.db.ml.gen.tables.pojos.Modelobjectivehistory;
import edu.mit.csail.db.ml.gen.tables.records.ModelobjectivehistoryRecord;
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
public class ModelobjectivehistoryDao extends DAOImpl<ModelobjectivehistoryRecord, Modelobjectivehistory, Integer> {

    /**
     * Create a new ModelobjectivehistoryDao without any configuration
     */
    public ModelobjectivehistoryDao() {
        super(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY, Modelobjectivehistory.class);
    }

    /**
     * Create a new ModelobjectivehistoryDao with an attached configuration
     */
    public ModelobjectivehistoryDao(Configuration configuration) {
        super(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY, Modelobjectivehistory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(Modelobjectivehistory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Modelobjectivehistory> fetchById(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Modelobjectivehistory fetchOneById(Integer value) {
        return fetchOne(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY.ID, value);
    }

    /**
     * Fetch records that have <code>model IN (values)</code>
     */
    public List<Modelobjectivehistory> fetchByModel(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY.MODEL, values);
    }

    /**
     * Fetch records that have <code>iteration IN (values)</code>
     */
    public List<Modelobjectivehistory> fetchByIteration(Integer... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY.ITERATION, values);
    }

    /**
     * Fetch records that have <code>objectiveValue IN (values)</code>
     */
    public List<Modelobjectivehistory> fetchByObjectivevalue(Double... values) {
        return fetch(edu.mit.csail.db.ml.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY.OBJECTIVEVALUE, values);
    }
}
