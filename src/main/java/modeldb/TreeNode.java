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
public class TreeNode implements org.apache.thrift.TBase<TreeNode, TreeNode._Fields>, java.io.Serializable, Cloneable, Comparable<TreeNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TreeNode");

  private static final org.apache.thrift.protocol.TField PREDICTION_FIELD_DESC = new org.apache.thrift.protocol.TField("prediction", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField IMPURITY_FIELD_DESC = new org.apache.thrift.protocol.TField("impurity", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField GAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("gain", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField SPLIT_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("splitIndex", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TreeNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TreeNodeTupleSchemeFactory());
  }

  public double prediction; // required
  public double impurity; // required
  public double gain; // optional
  public int splitIndex; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PREDICTION((short)1, "prediction"),
    IMPURITY((short)2, "impurity"),
    GAIN((short)3, "gain"),
    SPLIT_INDEX((short)4, "splitIndex");

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
        case 1: // PREDICTION
          return PREDICTION;
        case 2: // IMPURITY
          return IMPURITY;
        case 3: // GAIN
          return GAIN;
        case 4: // SPLIT_INDEX
          return SPLIT_INDEX;
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
  private static final int __PREDICTION_ISSET_ID = 0;
  private static final int __IMPURITY_ISSET_ID = 1;
  private static final int __GAIN_ISSET_ID = 2;
  private static final int __SPLITINDEX_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GAIN,_Fields.SPLIT_INDEX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PREDICTION, new org.apache.thrift.meta_data.FieldMetaData("prediction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.IMPURITY, new org.apache.thrift.meta_data.FieldMetaData("impurity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.GAIN, new org.apache.thrift.meta_data.FieldMetaData("gain", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SPLIT_INDEX, new org.apache.thrift.meta_data.FieldMetaData("splitIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TreeNode.class, metaDataMap);
  }

  public TreeNode() {
  }

  public TreeNode(
    double prediction,
    double impurity)
  {
    this();
    this.prediction = prediction;
    setPredictionIsSet(true);
    this.impurity = impurity;
    setImpurityIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TreeNode(TreeNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.prediction = other.prediction;
    this.impurity = other.impurity;
    this.gain = other.gain;
    this.splitIndex = other.splitIndex;
  }

  public TreeNode deepCopy() {
    return new TreeNode(this);
  }

  @Override
  public void clear() {
    setPredictionIsSet(false);
    this.prediction = 0.0;
    setImpurityIsSet(false);
    this.impurity = 0.0;
    setGainIsSet(false);
    this.gain = 0.0;
    setSplitIndexIsSet(false);
    this.splitIndex = 0;
  }

  public double getPrediction() {
    return this.prediction;
  }

  public TreeNode setPrediction(double prediction) {
    this.prediction = prediction;
    setPredictionIsSet(true);
    return this;
  }

  public void unsetPrediction() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PREDICTION_ISSET_ID);
  }

  /** Returns true if field prediction is set (has been assigned a value) and false otherwise */
  public boolean isSetPrediction() {
    return EncodingUtils.testBit(__isset_bitfield, __PREDICTION_ISSET_ID);
  }

  public void setPredictionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PREDICTION_ISSET_ID, value);
  }

  public double getImpurity() {
    return this.impurity;
  }

  public TreeNode setImpurity(double impurity) {
    this.impurity = impurity;
    setImpurityIsSet(true);
    return this;
  }

  public void unsetImpurity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IMPURITY_ISSET_ID);
  }

  /** Returns true if field impurity is set (has been assigned a value) and false otherwise */
  public boolean isSetImpurity() {
    return EncodingUtils.testBit(__isset_bitfield, __IMPURITY_ISSET_ID);
  }

  public void setImpurityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IMPURITY_ISSET_ID, value);
  }

  public double getGain() {
    return this.gain;
  }

  public TreeNode setGain(double gain) {
    this.gain = gain;
    setGainIsSet(true);
    return this;
  }

  public void unsetGain() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GAIN_ISSET_ID);
  }

  /** Returns true if field gain is set (has been assigned a value) and false otherwise */
  public boolean isSetGain() {
    return EncodingUtils.testBit(__isset_bitfield, __GAIN_ISSET_ID);
  }

  public void setGainIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GAIN_ISSET_ID, value);
  }

  public int getSplitIndex() {
    return this.splitIndex;
  }

  public TreeNode setSplitIndex(int splitIndex) {
    this.splitIndex = splitIndex;
    setSplitIndexIsSet(true);
    return this;
  }

  public void unsetSplitIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPLITINDEX_ISSET_ID);
  }

  /** Returns true if field splitIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetSplitIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __SPLITINDEX_ISSET_ID);
  }

  public void setSplitIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPLITINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PREDICTION:
      if (value == null) {
        unsetPrediction();
      } else {
        setPrediction((Double)value);
      }
      break;

    case IMPURITY:
      if (value == null) {
        unsetImpurity();
      } else {
        setImpurity((Double)value);
      }
      break;

    case GAIN:
      if (value == null) {
        unsetGain();
      } else {
        setGain((Double)value);
      }
      break;

    case SPLIT_INDEX:
      if (value == null) {
        unsetSplitIndex();
      } else {
        setSplitIndex((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PREDICTION:
      return getPrediction();

    case IMPURITY:
      return getImpurity();

    case GAIN:
      return getGain();

    case SPLIT_INDEX:
      return getSplitIndex();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PREDICTION:
      return isSetPrediction();
    case IMPURITY:
      return isSetImpurity();
    case GAIN:
      return isSetGain();
    case SPLIT_INDEX:
      return isSetSplitIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TreeNode)
      return this.equals((TreeNode)that);
    return false;
  }

  public boolean equals(TreeNode that) {
    if (that == null)
      return false;

    boolean this_present_prediction = true;
    boolean that_present_prediction = true;
    if (this_present_prediction || that_present_prediction) {
      if (!(this_present_prediction && that_present_prediction))
        return false;
      if (this.prediction != that.prediction)
        return false;
    }

    boolean this_present_impurity = true;
    boolean that_present_impurity = true;
    if (this_present_impurity || that_present_impurity) {
      if (!(this_present_impurity && that_present_impurity))
        return false;
      if (this.impurity != that.impurity)
        return false;
    }

    boolean this_present_gain = true && this.isSetGain();
    boolean that_present_gain = true && that.isSetGain();
    if (this_present_gain || that_present_gain) {
      if (!(this_present_gain && that_present_gain))
        return false;
      if (this.gain != that.gain)
        return false;
    }

    boolean this_present_splitIndex = true && this.isSetSplitIndex();
    boolean that_present_splitIndex = true && that.isSetSplitIndex();
    if (this_present_splitIndex || that_present_splitIndex) {
      if (!(this_present_splitIndex && that_present_splitIndex))
        return false;
      if (this.splitIndex != that.splitIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_prediction = true;
    list.add(present_prediction);
    if (present_prediction)
      list.add(prediction);

    boolean present_impurity = true;
    list.add(present_impurity);
    if (present_impurity)
      list.add(impurity);

    boolean present_gain = true && (isSetGain());
    list.add(present_gain);
    if (present_gain)
      list.add(gain);

    boolean present_splitIndex = true && (isSetSplitIndex());
    list.add(present_splitIndex);
    if (present_splitIndex)
      list.add(splitIndex);

    return list.hashCode();
  }

  @Override
  public int compareTo(TreeNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPrediction()).compareTo(other.isSetPrediction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrediction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prediction, other.prediction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImpurity()).compareTo(other.isSetImpurity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImpurity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.impurity, other.impurity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGain()).compareTo(other.isSetGain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gain, other.gain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSplitIndex()).compareTo(other.isSetSplitIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplitIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.splitIndex, other.splitIndex);
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
    StringBuilder sb = new StringBuilder("TreeNode(");
    boolean first = true;

    sb.append("prediction:");
    sb.append(this.prediction);
    first = false;
    if (!first) sb.append(", ");
    sb.append("impurity:");
    sb.append(this.impurity);
    first = false;
    if (isSetGain()) {
      if (!first) sb.append(", ");
      sb.append("gain:");
      sb.append(this.gain);
      first = false;
    }
    if (isSetSplitIndex()) {
      if (!first) sb.append(", ");
      sb.append("splitIndex:");
      sb.append(this.splitIndex);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TreeNodeStandardSchemeFactory implements SchemeFactory {
    public TreeNodeStandardScheme getScheme() {
      return new TreeNodeStandardScheme();
    }
  }

  private static class TreeNodeStandardScheme extends StandardScheme<TreeNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TreeNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PREDICTION
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.prediction = iprot.readDouble();
              struct.setPredictionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IMPURITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.impurity = iprot.readDouble();
              struct.setImpurityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.gain = iprot.readDouble();
              struct.setGainIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SPLIT_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.splitIndex = iprot.readI32();
              struct.setSplitIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TreeNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PREDICTION_FIELD_DESC);
      oprot.writeDouble(struct.prediction);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IMPURITY_FIELD_DESC);
      oprot.writeDouble(struct.impurity);
      oprot.writeFieldEnd();
      if (struct.isSetGain()) {
        oprot.writeFieldBegin(GAIN_FIELD_DESC);
        oprot.writeDouble(struct.gain);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSplitIndex()) {
        oprot.writeFieldBegin(SPLIT_INDEX_FIELD_DESC);
        oprot.writeI32(struct.splitIndex);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TreeNodeTupleSchemeFactory implements SchemeFactory {
    public TreeNodeTupleScheme getScheme() {
      return new TreeNodeTupleScheme();
    }
  }

  private static class TreeNodeTupleScheme extends TupleScheme<TreeNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TreeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrediction()) {
        optionals.set(0);
      }
      if (struct.isSetImpurity()) {
        optionals.set(1);
      }
      if (struct.isSetGain()) {
        optionals.set(2);
      }
      if (struct.isSetSplitIndex()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPrediction()) {
        oprot.writeDouble(struct.prediction);
      }
      if (struct.isSetImpurity()) {
        oprot.writeDouble(struct.impurity);
      }
      if (struct.isSetGain()) {
        oprot.writeDouble(struct.gain);
      }
      if (struct.isSetSplitIndex()) {
        oprot.writeI32(struct.splitIndex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TreeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.prediction = iprot.readDouble();
        struct.setPredictionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.impurity = iprot.readDouble();
        struct.setImpurityIsSet(true);
      }
      if (incoming.get(2)) {
        struct.gain = iprot.readDouble();
        struct.setGainIsSet(true);
      }
      if (incoming.get(3)) {
        struct.splitIndex = iprot.readI32();
        struct.setSplitIndexIsSet(true);
      }
    }
  }

}

