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
public class TransformerSpec implements org.apache.thrift.TBase<TransformerSpec, TransformerSpec._Fields>, java.io.Serializable, Cloneable, Comparable<TransformerSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransformerSpec");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TRANSFORMER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("transformerType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HYPERPARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("hyperparameters", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransformerSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransformerSpecTupleSchemeFactory());
  }

  public int id; // required
  public String transformerType; // required
  public List<HyperParameter> hyperparameters; // required
  public String tag; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TRANSFORMER_TYPE((short)2, "transformerType"),
    HYPERPARAMETERS((short)3, "hyperparameters"),
    TAG((short)4, "tag");

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
        case 1: // ID
          return ID;
        case 2: // TRANSFORMER_TYPE
          return TRANSFORMER_TYPE;
        case 3: // HYPERPARAMETERS
          return HYPERPARAMETERS;
        case 4: // TAG
          return TAG;
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
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TRANSFORMER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("transformerType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HYPERPARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("hyperparameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HyperParameter.class))));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransformerSpec.class, metaDataMap);
  }

  public TransformerSpec() {
    this.id = -1;

    this.tag = "";

  }

  public TransformerSpec(
    int id,
    String transformerType,
    List<HyperParameter> hyperparameters,
    String tag)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.transformerType = transformerType;
    this.hyperparameters = hyperparameters;
    this.tag = tag;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransformerSpec(TransformerSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTransformerType()) {
      this.transformerType = other.transformerType;
    }
    if (other.isSetHyperparameters()) {
      List<HyperParameter> __this__hyperparameters = new ArrayList<HyperParameter>(other.hyperparameters.size());
      for (HyperParameter other_element : other.hyperparameters) {
        __this__hyperparameters.add(new HyperParameter(other_element));
      }
      this.hyperparameters = __this__hyperparameters;
    }
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
  }

  public TransformerSpec deepCopy() {
    return new TransformerSpec(this);
  }

  @Override
  public void clear() {
    this.id = -1;

    this.transformerType = null;
    this.hyperparameters = null;
    this.tag = "";

  }

  public int getId() {
    return this.id;
  }

  public TransformerSpec setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getTransformerType() {
    return this.transformerType;
  }

  public TransformerSpec setTransformerType(String transformerType) {
    this.transformerType = transformerType;
    return this;
  }

  public void unsetTransformerType() {
    this.transformerType = null;
  }

  /** Returns true if field transformerType is set (has been assigned a value) and false otherwise */
  public boolean isSetTransformerType() {
    return this.transformerType != null;
  }

  public void setTransformerTypeIsSet(boolean value) {
    if (!value) {
      this.transformerType = null;
    }
  }

  public int getHyperparametersSize() {
    return (this.hyperparameters == null) ? 0 : this.hyperparameters.size();
  }

  public java.util.Iterator<HyperParameter> getHyperparametersIterator() {
    return (this.hyperparameters == null) ? null : this.hyperparameters.iterator();
  }

  public void addToHyperparameters(HyperParameter elem) {
    if (this.hyperparameters == null) {
      this.hyperparameters = new ArrayList<HyperParameter>();
    }
    this.hyperparameters.add(elem);
  }

  public List<HyperParameter> getHyperparameters() {
    return this.hyperparameters;
  }

  public TransformerSpec setHyperparameters(List<HyperParameter> hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  public void unsetHyperparameters() {
    this.hyperparameters = null;
  }

  /** Returns true if field hyperparameters is set (has been assigned a value) and false otherwise */
  public boolean isSetHyperparameters() {
    return this.hyperparameters != null;
  }

  public void setHyperparametersIsSet(boolean value) {
    if (!value) {
      this.hyperparameters = null;
    }
  }

  public String getTag() {
    return this.tag;
  }

  public TransformerSpec setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case TRANSFORMER_TYPE:
      if (value == null) {
        unsetTransformerType();
      } else {
        setTransformerType((String)value);
      }
      break;

    case HYPERPARAMETERS:
      if (value == null) {
        unsetHyperparameters();
      } else {
        setHyperparameters((List<HyperParameter>)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TRANSFORMER_TYPE:
      return getTransformerType();

    case HYPERPARAMETERS:
      return getHyperparameters();

    case TAG:
      return getTag();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TRANSFORMER_TYPE:
      return isSetTransformerType();
    case HYPERPARAMETERS:
      return isSetHyperparameters();
    case TAG:
      return isSetTag();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TransformerSpec)
      return this.equals((TransformerSpec)that);
    return false;
  }

  public boolean equals(TransformerSpec that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_transformerType = true && this.isSetTransformerType();
    boolean that_present_transformerType = true && that.isSetTransformerType();
    if (this_present_transformerType || that_present_transformerType) {
      if (!(this_present_transformerType && that_present_transformerType))
        return false;
      if (!this.transformerType.equals(that.transformerType))
        return false;
    }

    boolean this_present_hyperparameters = true && this.isSetHyperparameters();
    boolean that_present_hyperparameters = true && that.isSetHyperparameters();
    if (this_present_hyperparameters || that_present_hyperparameters) {
      if (!(this_present_hyperparameters && that_present_hyperparameters))
        return false;
      if (!this.hyperparameters.equals(that.hyperparameters))
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_transformerType = true && (isSetTransformerType());
    list.add(present_transformerType);
    if (present_transformerType)
      list.add(transformerType);

    boolean present_hyperparameters = true && (isSetHyperparameters());
    list.add(present_hyperparameters);
    if (present_hyperparameters)
      list.add(hyperparameters);

    boolean present_tag = true && (isSetTag());
    list.add(present_tag);
    if (present_tag)
      list.add(tag);

    return list.hashCode();
  }

  @Override
  public int compareTo(TransformerSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransformerType()).compareTo(other.isSetTransformerType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransformerType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transformerType, other.transformerType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHyperparameters()).compareTo(other.isSetHyperparameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHyperparameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hyperparameters, other.hyperparameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
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
    StringBuilder sb = new StringBuilder("TransformerSpec(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transformerType:");
    if (this.transformerType == null) {
      sb.append("null");
    } else {
      sb.append(this.transformerType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hyperparameters:");
    if (this.hyperparameters == null) {
      sb.append("null");
    } else {
      sb.append(this.hyperparameters);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tag:");
    if (this.tag == null) {
      sb.append("null");
    } else {
      sb.append(this.tag);
    }
    first = false;
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

  private static class TransformerSpecStandardSchemeFactory implements SchemeFactory {
    public TransformerSpecStandardScheme getScheme() {
      return new TransformerSpecStandardScheme();
    }
  }

  private static class TransformerSpecStandardScheme extends StandardScheme<TransformerSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransformerSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRANSFORMER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transformerType = iprot.readString();
              struct.setTransformerTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HYPERPARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.hyperparameters = new ArrayList<HyperParameter>(_list16.size);
                HyperParameter _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new HyperParameter();
                  _elem17.read(iprot);
                  struct.hyperparameters.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setHyperparametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransformerSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.transformerType != null) {
        oprot.writeFieldBegin(TRANSFORMER_TYPE_FIELD_DESC);
        oprot.writeString(struct.transformerType);
        oprot.writeFieldEnd();
      }
      if (struct.hyperparameters != null) {
        oprot.writeFieldBegin(HYPERPARAMETERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.hyperparameters.size()));
          for (HyperParameter _iter19 : struct.hyperparameters)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tag != null) {
        oprot.writeFieldBegin(TAG_FIELD_DESC);
        oprot.writeString(struct.tag);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransformerSpecTupleSchemeFactory implements SchemeFactory {
    public TransformerSpecTupleScheme getScheme() {
      return new TransformerSpecTupleScheme();
    }
  }

  private static class TransformerSpecTupleScheme extends TupleScheme<TransformerSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransformerSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTransformerType()) {
        optionals.set(1);
      }
      if (struct.isSetHyperparameters()) {
        optionals.set(2);
      }
      if (struct.isSetTag()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetTransformerType()) {
        oprot.writeString(struct.transformerType);
      }
      if (struct.isSetHyperparameters()) {
        {
          oprot.writeI32(struct.hyperparameters.size());
          for (HyperParameter _iter20 : struct.hyperparameters)
          {
            _iter20.write(oprot);
          }
        }
      }
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransformerSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.transformerType = iprot.readString();
        struct.setTransformerTypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.hyperparameters = new ArrayList<HyperParameter>(_list21.size);
          HyperParameter _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new HyperParameter();
            _elem22.read(iprot);
            struct.hyperparameters.add(_elem22);
          }
        }
        struct.setHyperparametersIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
    }
  }

}

