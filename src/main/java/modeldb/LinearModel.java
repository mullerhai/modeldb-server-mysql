/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package modeldb;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-08-01")
public class LinearModel implements org.apache.thrift.TBase<LinearModel, LinearModel._Fields>, java.io.Serializable, Cloneable, Comparable<LinearModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LinearModel");

  private static final org.apache.thrift.protocol.TField INTERCEPT_TERM_FIELD_DESC = new org.apache.thrift.protocol.TField("interceptTerm", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FEATURE_TERMS_FIELD_DESC = new org.apache.thrift.protocol.TField("featureTerms", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OBJECTIVE_HISTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("objectiveHistory", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField RMSE_FIELD_DESC = new org.apache.thrift.protocol.TField("rmse", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField EXPLAINED_VARIANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("explainedVariance", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField R2_FIELD_DESC = new org.apache.thrift.protocol.TField("r2", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LinearModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LinearModelTupleSchemeFactory());
  }

  public LinearModelTerm interceptTerm; // optional
  public List<LinearModelTerm> featureTerms; // required
  public List<Double> objectiveHistory; // optional
  public double rmse; // optional
  public double explainedVariance; // optional
  public double r2; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTERCEPT_TERM((short)1, "interceptTerm"),
    FEATURE_TERMS((short)2, "featureTerms"),
    OBJECTIVE_HISTORY((short)3, "objectiveHistory"),
    RMSE((short)4, "rmse"),
    EXPLAINED_VARIANCE((short)5, "explainedVariance"),
    R2((short)6, "r2");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INTERCEPT_TERM
          return INTERCEPT_TERM;
        case 2: // FEATURE_TERMS
          return FEATURE_TERMS;
        case 3: // OBJECTIVE_HISTORY
          return OBJECTIVE_HISTORY;
        case 4: // RMSE
          return RMSE;
        case 5: // EXPLAINED_VARIANCE
          return EXPLAINED_VARIANCE;
        case 6: // R2
          return R2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RMSE_ISSET_ID = 0;
  private static final int __EXPLAINEDVARIANCE_ISSET_ID = 1;
  private static final int __R2_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INTERCEPT_TERM,_Fields.OBJECTIVE_HISTORY,_Fields.RMSE,_Fields.EXPLAINED_VARIANCE,_Fields.R2};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTERCEPT_TERM, new org.apache.thrift.meta_data.FieldMetaData("interceptTerm", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LinearModelTerm.class)));
    tmpMap.put(_Fields.FEATURE_TERMS, new org.apache.thrift.meta_data.FieldMetaData("featureTerms", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LinearModelTerm.class))));
    tmpMap.put(_Fields.OBJECTIVE_HISTORY, new org.apache.thrift.meta_data.FieldMetaData("objectiveHistory", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.RMSE, new org.apache.thrift.meta_data.FieldMetaData("rmse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.EXPLAINED_VARIANCE, new org.apache.thrift.meta_data.FieldMetaData("explainedVariance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.R2, new org.apache.thrift.meta_data.FieldMetaData("r2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LinearModel.class, metaDataMap);
  }

  public LinearModel() {
  }

  public LinearModel(
    List<LinearModelTerm> featureTerms)
  {
    this();
    this.featureTerms = featureTerms;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LinearModel(LinearModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetInterceptTerm()) {
      this.interceptTerm = new LinearModelTerm(other.interceptTerm);
    }
    if (other.isSetFeatureTerms()) {
      List<LinearModelTerm> __this__featureTerms = new ArrayList<LinearModelTerm>(other.featureTerms.size());
      for (LinearModelTerm other_element : other.featureTerms) {
        __this__featureTerms.add(new LinearModelTerm(other_element));
      }
      this.featureTerms = __this__featureTerms;
    }
    if (other.isSetObjectiveHistory()) {
      List<Double> __this__objectiveHistory = new ArrayList<Double>(other.objectiveHistory);
      this.objectiveHistory = __this__objectiveHistory;
    }
    this.rmse = other.rmse;
    this.explainedVariance = other.explainedVariance;
    this.r2 = other.r2;
  }

  public LinearModel deepCopy() {
    return new LinearModel(this);
  }

  @Override
  public void clear() {
    this.interceptTerm = null;
    this.featureTerms = null;
    this.objectiveHistory = null;
    setRmseIsSet(false);
    this.rmse = 0.0;
    setExplainedVarianceIsSet(false);
    this.explainedVariance = 0.0;
    setR2IsSet(false);
    this.r2 = 0.0;
  }

  public LinearModelTerm getInterceptTerm() {
    return this.interceptTerm;
  }

  public LinearModel setInterceptTerm(LinearModelTerm interceptTerm) {
    this.interceptTerm = interceptTerm;
    return this;
  }

  public void unsetInterceptTerm() {
    this.interceptTerm = null;
  }

  /** Returns true if field interceptTerm is set (has been assigned a value) and false otherwise */
  public boolean isSetInterceptTerm() {
    return this.interceptTerm != null;
  }

  public void setInterceptTermIsSet(boolean value) {
    if (!value) {
      this.interceptTerm = null;
    }
  }

  public int getFeatureTermsSize() {
    return (this.featureTerms == null) ? 0 : this.featureTerms.size();
  }

  public java.util.Iterator<LinearModelTerm> getFeatureTermsIterator() {
    return (this.featureTerms == null) ? null : this.featureTerms.iterator();
  }

  public void addToFeatureTerms(LinearModelTerm elem) {
    if (this.featureTerms == null) {
      this.featureTerms = new ArrayList<LinearModelTerm>();
    }
    this.featureTerms.add(elem);
  }

  public List<LinearModelTerm> getFeatureTerms() {
    return this.featureTerms;
  }

  public LinearModel setFeatureTerms(List<LinearModelTerm> featureTerms) {
    this.featureTerms = featureTerms;
    return this;
  }

  public void unsetFeatureTerms() {
    this.featureTerms = null;
  }

  /** Returns true if field featureTerms is set (has been assigned a value) and false otherwise */
  public boolean isSetFeatureTerms() {
    return this.featureTerms != null;
  }

  public void setFeatureTermsIsSet(boolean value) {
    if (!value) {
      this.featureTerms = null;
    }
  }

  public int getObjectiveHistorySize() {
    return (this.objectiveHistory == null) ? 0 : this.objectiveHistory.size();
  }

  public java.util.Iterator<Double> getObjectiveHistoryIterator() {
    return (this.objectiveHistory == null) ? null : this.objectiveHistory.iterator();
  }

  public void addToObjectiveHistory(double elem) {
    if (this.objectiveHistory == null) {
      this.objectiveHistory = new ArrayList<Double>();
    }
    this.objectiveHistory.add(elem);
  }

  public List<Double> getObjectiveHistory() {
    return this.objectiveHistory;
  }

  public LinearModel setObjectiveHistory(List<Double> objectiveHistory) {
    this.objectiveHistory = objectiveHistory;
    return this;
  }

  public void unsetObjectiveHistory() {
    this.objectiveHistory = null;
  }

  /** Returns true if field objectiveHistory is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectiveHistory() {
    return this.objectiveHistory != null;
  }

  public void setObjectiveHistoryIsSet(boolean value) {
    if (!value) {
      this.objectiveHistory = null;
    }
  }

  public double getRmse() {
    return this.rmse;
  }

  public LinearModel setRmse(double rmse) {
    this.rmse = rmse;
    setRmseIsSet(true);
    return this;
  }

  public void unsetRmse() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RMSE_ISSET_ID);
  }

  /** Returns true if field rmse is set (has been assigned a value) and false otherwise */
  public boolean isSetRmse() {
    return EncodingUtils.testBit(__isset_bitfield, __RMSE_ISSET_ID);
  }

  public void setRmseIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RMSE_ISSET_ID, value);
  }

  public double getExplainedVariance() {
    return this.explainedVariance;
  }

  public LinearModel setExplainedVariance(double explainedVariance) {
    this.explainedVariance = explainedVariance;
    setExplainedVarianceIsSet(true);
    return this;
  }

  public void unsetExplainedVariance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPLAINEDVARIANCE_ISSET_ID);
  }

  /** Returns true if field explainedVariance is set (has been assigned a value) and false otherwise */
  public boolean isSetExplainedVariance() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPLAINEDVARIANCE_ISSET_ID);
  }

  public void setExplainedVarianceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPLAINEDVARIANCE_ISSET_ID, value);
  }

  public double getR2() {
    return this.r2;
  }

  public LinearModel setR2(double r2) {
    this.r2 = r2;
    setR2IsSet(true);
    return this;
  }

  public void unsetR2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __R2_ISSET_ID);
  }

  /** Returns true if field r2 is set (has been assigned a value) and false otherwise */
  public boolean isSetR2() {
    return EncodingUtils.testBit(__isset_bitfield, __R2_ISSET_ID);
  }

  public void setR2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __R2_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INTERCEPT_TERM:
      if (value == null) {
        unsetInterceptTerm();
      } else {
        setInterceptTerm((LinearModelTerm)value);
      }
      break;

    case FEATURE_TERMS:
      if (value == null) {
        unsetFeatureTerms();
      } else {
        setFeatureTerms((List<LinearModelTerm>)value);
      }
      break;

    case OBJECTIVE_HISTORY:
      if (value == null) {
        unsetObjectiveHistory();
      } else {
        setObjectiveHistory((List<Double>)value);
      }
      break;

    case RMSE:
      if (value == null) {
        unsetRmse();
      } else {
        setRmse((Double)value);
      }
      break;

    case EXPLAINED_VARIANCE:
      if (value == null) {
        unsetExplainedVariance();
      } else {
        setExplainedVariance((Double)value);
      }
      break;

    case R2:
      if (value == null) {
        unsetR2();
      } else {
        setR2((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INTERCEPT_TERM:
      return getInterceptTerm();

    case FEATURE_TERMS:
      return getFeatureTerms();

    case OBJECTIVE_HISTORY:
      return getObjectiveHistory();

    case RMSE:
      return getRmse();

    case EXPLAINED_VARIANCE:
      return getExplainedVariance();

    case R2:
      return getR2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INTERCEPT_TERM:
      return isSetInterceptTerm();
    case FEATURE_TERMS:
      return isSetFeatureTerms();
    case OBJECTIVE_HISTORY:
      return isSetObjectiveHistory();
    case RMSE:
      return isSetRmse();
    case EXPLAINED_VARIANCE:
      return isSetExplainedVariance();
    case R2:
      return isSetR2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LinearModel)
      return this.equals((LinearModel)that);
    return false;
  }

  public boolean equals(LinearModel that) {
    if (that == null)
      return false;

    boolean this_present_interceptTerm = true && this.isSetInterceptTerm();
    boolean that_present_interceptTerm = true && that.isSetInterceptTerm();
    if (this_present_interceptTerm || that_present_interceptTerm) {
      if (!(this_present_interceptTerm && that_present_interceptTerm))
        return false;
      if (!this.interceptTerm.equals(that.interceptTerm))
        return false;
    }

    boolean this_present_featureTerms = true && this.isSetFeatureTerms();
    boolean that_present_featureTerms = true && that.isSetFeatureTerms();
    if (this_present_featureTerms || that_present_featureTerms) {
      if (!(this_present_featureTerms && that_present_featureTerms))
        return false;
      if (!this.featureTerms.equals(that.featureTerms))
        return false;
    }

    boolean this_present_objectiveHistory = true && this.isSetObjectiveHistory();
    boolean that_present_objectiveHistory = true && that.isSetObjectiveHistory();
    if (this_present_objectiveHistory || that_present_objectiveHistory) {
      if (!(this_present_objectiveHistory && that_present_objectiveHistory))
        return false;
      if (!this.objectiveHistory.equals(that.objectiveHistory))
        return false;
    }

    boolean this_present_rmse = true && this.isSetRmse();
    boolean that_present_rmse = true && that.isSetRmse();
    if (this_present_rmse || that_present_rmse) {
      if (!(this_present_rmse && that_present_rmse))
        return false;
      if (this.rmse != that.rmse)
        return false;
    }

    boolean this_present_explainedVariance = true && this.isSetExplainedVariance();
    boolean that_present_explainedVariance = true && that.isSetExplainedVariance();
    if (this_present_explainedVariance || that_present_explainedVariance) {
      if (!(this_present_explainedVariance && that_present_explainedVariance))
        return false;
      if (this.explainedVariance != that.explainedVariance)
        return false;
    }

    boolean this_present_r2 = true && this.isSetR2();
    boolean that_present_r2 = true && that.isSetR2();
    if (this_present_r2 || that_present_r2) {
      if (!(this_present_r2 && that_present_r2))
        return false;
      if (this.r2 != that.r2)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_interceptTerm = true && (isSetInterceptTerm());
    list.add(present_interceptTerm);
    if (present_interceptTerm)
      list.add(interceptTerm);

    boolean present_featureTerms = true && (isSetFeatureTerms());
    list.add(present_featureTerms);
    if (present_featureTerms)
      list.add(featureTerms);

    boolean present_objectiveHistory = true && (isSetObjectiveHistory());
    list.add(present_objectiveHistory);
    if (present_objectiveHistory)
      list.add(objectiveHistory);

    boolean present_rmse = true && (isSetRmse());
    list.add(present_rmse);
    if (present_rmse)
      list.add(rmse);

    boolean present_explainedVariance = true && (isSetExplainedVariance());
    list.add(present_explainedVariance);
    if (present_explainedVariance)
      list.add(explainedVariance);

    boolean present_r2 = true && (isSetR2());
    list.add(present_r2);
    if (present_r2)
      list.add(r2);

    return list.hashCode();
  }

  @Override
  public int compareTo(LinearModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInterceptTerm()).compareTo(other.isSetInterceptTerm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterceptTerm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interceptTerm, other.interceptTerm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFeatureTerms()).compareTo(other.isSetFeatureTerms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeatureTerms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.featureTerms, other.featureTerms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObjectiveHistory()).compareTo(other.isSetObjectiveHistory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectiveHistory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectiveHistory, other.objectiveHistory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRmse()).compareTo(other.isSetRmse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRmse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rmse, other.rmse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExplainedVariance()).compareTo(other.isSetExplainedVariance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExplainedVariance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.explainedVariance, other.explainedVariance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetR2()).compareTo(other.isSetR2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetR2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.r2, other.r2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LinearModel(");
    boolean first = true;

    if (isSetInterceptTerm()) {
      sb.append("interceptTerm:");
      if (this.interceptTerm == null) {
        sb.append("null");
      } else {
        sb.append(this.interceptTerm);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("featureTerms:");
    if (this.featureTerms == null) {
      sb.append("null");
    } else {
      sb.append(this.featureTerms);
    }
    first = false;
    if (isSetObjectiveHistory()) {
      if (!first) sb.append(", ");
      sb.append("objectiveHistory:");
      if (this.objectiveHistory == null) {
        sb.append("null");
      } else {
        sb.append(this.objectiveHistory);
      }
      first = false;
    }
    if (isSetRmse()) {
      if (!first) sb.append(", ");
      sb.append("rmse:");
      sb.append(this.rmse);
      first = false;
    }
    if (isSetExplainedVariance()) {
      if (!first) sb.append(", ");
      sb.append("explainedVariance:");
      sb.append(this.explainedVariance);
      first = false;
    }
    if (isSetR2()) {
      if (!first) sb.append(", ");
      sb.append("r2:");
      sb.append(this.r2);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (interceptTerm != null) {
      interceptTerm.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LinearModelStandardSchemeFactory implements SchemeFactory {
    public LinearModelStandardScheme getScheme() {
      return new LinearModelStandardScheme();
    }
  }

  private static class LinearModelStandardScheme extends StandardScheme<LinearModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LinearModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTERCEPT_TERM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.interceptTerm = new LinearModelTerm();
              struct.interceptTerm.read(iprot);
              struct.setInterceptTermIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FEATURE_TERMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.featureTerms = new ArrayList<LinearModelTerm>(_list24.size);
                LinearModelTerm _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new LinearModelTerm();
                  _elem25.read(iprot);
                  struct.featureTerms.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setFeatureTermsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBJECTIVE_HISTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.objectiveHistory = new ArrayList<Double>(_list27.size);
                double _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = iprot.readDouble();
                  struct.objectiveHistory.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setObjectiveHistoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RMSE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rmse = iprot.readDouble();
              struct.setRmseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EXPLAINED_VARIANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.explainedVariance = iprot.readDouble();
              struct.setExplainedVarianceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // R2
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.r2 = iprot.readDouble();
              struct.setR2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LinearModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.interceptTerm != null) {
        if (struct.isSetInterceptTerm()) {
          oprot.writeFieldBegin(INTERCEPT_TERM_FIELD_DESC);
          struct.interceptTerm.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.featureTerms != null) {
        oprot.writeFieldBegin(FEATURE_TERMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.featureTerms.size()));
          for (LinearModelTerm _iter30 : struct.featureTerms)
          {
            _iter30.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.objectiveHistory != null) {
        if (struct.isSetObjectiveHistory()) {
          oprot.writeFieldBegin(OBJECTIVE_HISTORY_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.objectiveHistory.size()));
            for (double _iter31 : struct.objectiveHistory)
            {
              oprot.writeDouble(_iter31);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRmse()) {
        oprot.writeFieldBegin(RMSE_FIELD_DESC);
        oprot.writeDouble(struct.rmse);
        oprot.writeFieldEnd();
      }
      if (struct.isSetExplainedVariance()) {
        oprot.writeFieldBegin(EXPLAINED_VARIANCE_FIELD_DESC);
        oprot.writeDouble(struct.explainedVariance);
        oprot.writeFieldEnd();
      }
      if (struct.isSetR2()) {
        oprot.writeFieldBegin(R2_FIELD_DESC);
        oprot.writeDouble(struct.r2);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LinearModelTupleSchemeFactory implements SchemeFactory {
    public LinearModelTupleScheme getScheme() {
      return new LinearModelTupleScheme();
    }
  }

  private static class LinearModelTupleScheme extends TupleScheme<LinearModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LinearModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInterceptTerm()) {
        optionals.set(0);
      }
      if (struct.isSetFeatureTerms()) {
        optionals.set(1);
      }
      if (struct.isSetObjectiveHistory()) {
        optionals.set(2);
      }
      if (struct.isSetRmse()) {
        optionals.set(3);
      }
      if (struct.isSetExplainedVariance()) {
        optionals.set(4);
      }
      if (struct.isSetR2()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetInterceptTerm()) {
        struct.interceptTerm.write(oprot);
      }
      if (struct.isSetFeatureTerms()) {
        {
          oprot.writeI32(struct.featureTerms.size());
          for (LinearModelTerm _iter32 : struct.featureTerms)
          {
            _iter32.write(oprot);
          }
        }
      }
      if (struct.isSetObjectiveHistory()) {
        {
          oprot.writeI32(struct.objectiveHistory.size());
          for (double _iter33 : struct.objectiveHistory)
          {
            oprot.writeDouble(_iter33);
          }
        }
      }
      if (struct.isSetRmse()) {
        oprot.writeDouble(struct.rmse);
      }
      if (struct.isSetExplainedVariance()) {
        oprot.writeDouble(struct.explainedVariance);
      }
      if (struct.isSetR2()) {
        oprot.writeDouble(struct.r2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LinearModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.interceptTerm = new LinearModelTerm();
        struct.interceptTerm.read(iprot);
        struct.setInterceptTermIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list34 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.featureTerms = new ArrayList<LinearModelTerm>(_list34.size);
          LinearModelTerm _elem35;
          for (int _i36 = 0; _i36 < _list34.size; ++_i36)
          {
            _elem35 = new LinearModelTerm();
            _elem35.read(iprot);
            struct.featureTerms.add(_elem35);
          }
        }
        struct.setFeatureTermsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.objectiveHistory = new ArrayList<Double>(_list37.size);
          double _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = iprot.readDouble();
            struct.objectiveHistory.add(_elem38);
          }
        }
        struct.setObjectiveHistoryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rmse = iprot.readDouble();
        struct.setRmseIsSet(true);
      }
      if (incoming.get(4)) {
        struct.explainedVariance = iprot.readDouble();
        struct.setExplainedVarianceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.r2 = iprot.readDouble();
        struct.setR2IsSet(true);
      }
    }
  }

}
