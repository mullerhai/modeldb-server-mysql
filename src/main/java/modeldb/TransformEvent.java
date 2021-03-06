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
public class TransformEvent implements org.apache.thrift.TBase<TransformEvent, TransformEvent._Fields>, java.io.Serializable, Cloneable, Comparable<TransformEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransformEvent");

  private static final org.apache.thrift.protocol.TField OLD_DATA_FRAME_FIELD_DESC = new org.apache.thrift.protocol.TField("oldDataFrame", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_DATA_FRAME_FIELD_DESC = new org.apache.thrift.protocol.TField("newDataFrame", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSFORMER_FIELD_DESC = new org.apache.thrift.protocol.TField("transformer", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField INPUT_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("inputColumns", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField OUTPUT_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("outputColumns", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentRunId", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransformEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransformEventTupleSchemeFactory());
  }

  public DataFrame oldDataFrame; // required
  public DataFrame newDataFrame; // required
  public Transformer transformer; // required
  public List<String> inputColumns; // required
  public List<String> outputColumns; // required
  public int experimentRunId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OLD_DATA_FRAME((short)1, "oldDataFrame"),
    NEW_DATA_FRAME((short)2, "newDataFrame"),
    TRANSFORMER((short)3, "transformer"),
    INPUT_COLUMNS((short)4, "inputColumns"),
    OUTPUT_COLUMNS((short)5, "outputColumns"),
    EXPERIMENT_RUN_ID((short)6, "experimentRunId");

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
        case 1: // OLD_DATA_FRAME
          return OLD_DATA_FRAME;
        case 2: // NEW_DATA_FRAME
          return NEW_DATA_FRAME;
        case 3: // TRANSFORMER
          return TRANSFORMER;
        case 4: // INPUT_COLUMNS
          return INPUT_COLUMNS;
        case 5: // OUTPUT_COLUMNS
          return OUTPUT_COLUMNS;
        case 6: // EXPERIMENT_RUN_ID
          return EXPERIMENT_RUN_ID;
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
  private static final int __EXPERIMENTRUNID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OLD_DATA_FRAME, new org.apache.thrift.meta_data.FieldMetaData("oldDataFrame", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataFrame.class)));
    tmpMap.put(_Fields.NEW_DATA_FRAME, new org.apache.thrift.meta_data.FieldMetaData("newDataFrame", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataFrame.class)));
    tmpMap.put(_Fields.TRANSFORMER, new org.apache.thrift.meta_data.FieldMetaData("transformer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Transformer.class)));
    tmpMap.put(_Fields.INPUT_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("inputColumns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OUTPUT_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("outputColumns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EXPERIMENT_RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("experimentRunId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransformEvent.class, metaDataMap);
  }

  public TransformEvent() {
  }

  public TransformEvent(
    DataFrame oldDataFrame,
    DataFrame newDataFrame,
    Transformer transformer,
    List<String> inputColumns,
    List<String> outputColumns,
    int experimentRunId)
  {
    this();
    this.oldDataFrame = oldDataFrame;
    this.newDataFrame = newDataFrame;
    this.transformer = transformer;
    this.inputColumns = inputColumns;
    this.outputColumns = outputColumns;
    this.experimentRunId = experimentRunId;
    setExperimentRunIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransformEvent(TransformEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOldDataFrame()) {
      this.oldDataFrame = new DataFrame(other.oldDataFrame);
    }
    if (other.isSetNewDataFrame()) {
      this.newDataFrame = new DataFrame(other.newDataFrame);
    }
    if (other.isSetTransformer()) {
      this.transformer = new Transformer(other.transformer);
    }
    if (other.isSetInputColumns()) {
      List<String> __this__inputColumns = new ArrayList<String>(other.inputColumns);
      this.inputColumns = __this__inputColumns;
    }
    if (other.isSetOutputColumns()) {
      List<String> __this__outputColumns = new ArrayList<String>(other.outputColumns);
      this.outputColumns = __this__outputColumns;
    }
    this.experimentRunId = other.experimentRunId;
  }

  public TransformEvent deepCopy() {
    return new TransformEvent(this);
  }

  @Override
  public void clear() {
    this.oldDataFrame = null;
    this.newDataFrame = null;
    this.transformer = null;
    this.inputColumns = null;
    this.outputColumns = null;
    setExperimentRunIdIsSet(false);
    this.experimentRunId = 0;
  }

  public DataFrame getOldDataFrame() {
    return this.oldDataFrame;
  }

  public TransformEvent setOldDataFrame(DataFrame oldDataFrame) {
    this.oldDataFrame = oldDataFrame;
    return this;
  }

  public void unsetOldDataFrame() {
    this.oldDataFrame = null;
  }

  /** Returns true if field oldDataFrame is set (has been assigned a value) and false otherwise */
  public boolean isSetOldDataFrame() {
    return this.oldDataFrame != null;
  }

  public void setOldDataFrameIsSet(boolean value) {
    if (!value) {
      this.oldDataFrame = null;
    }
  }

  public DataFrame getNewDataFrame() {
    return this.newDataFrame;
  }

  public TransformEvent setNewDataFrame(DataFrame newDataFrame) {
    this.newDataFrame = newDataFrame;
    return this;
  }

  public void unsetNewDataFrame() {
    this.newDataFrame = null;
  }

  /** Returns true if field newDataFrame is set (has been assigned a value) and false otherwise */
  public boolean isSetNewDataFrame() {
    return this.newDataFrame != null;
  }

  public void setNewDataFrameIsSet(boolean value) {
    if (!value) {
      this.newDataFrame = null;
    }
  }

  public Transformer getTransformer() {
    return this.transformer;
  }

  public TransformEvent setTransformer(Transformer transformer) {
    this.transformer = transformer;
    return this;
  }

  public void unsetTransformer() {
    this.transformer = null;
  }

  /** Returns true if field transformer is set (has been assigned a value) and false otherwise */
  public boolean isSetTransformer() {
    return this.transformer != null;
  }

  public void setTransformerIsSet(boolean value) {
    if (!value) {
      this.transformer = null;
    }
  }

  public int getInputColumnsSize() {
    return (this.inputColumns == null) ? 0 : this.inputColumns.size();
  }

  public java.util.Iterator<String> getInputColumnsIterator() {
    return (this.inputColumns == null) ? null : this.inputColumns.iterator();
  }

  public void addToInputColumns(String elem) {
    if (this.inputColumns == null) {
      this.inputColumns = new ArrayList<String>();
    }
    this.inputColumns.add(elem);
  }

  public List<String> getInputColumns() {
    return this.inputColumns;
  }

  public TransformEvent setInputColumns(List<String> inputColumns) {
    this.inputColumns = inputColumns;
    return this;
  }

  public void unsetInputColumns() {
    this.inputColumns = null;
  }

  /** Returns true if field inputColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetInputColumns() {
    return this.inputColumns != null;
  }

  public void setInputColumnsIsSet(boolean value) {
    if (!value) {
      this.inputColumns = null;
    }
  }

  public int getOutputColumnsSize() {
    return (this.outputColumns == null) ? 0 : this.outputColumns.size();
  }

  public java.util.Iterator<String> getOutputColumnsIterator() {
    return (this.outputColumns == null) ? null : this.outputColumns.iterator();
  }

  public void addToOutputColumns(String elem) {
    if (this.outputColumns == null) {
      this.outputColumns = new ArrayList<String>();
    }
    this.outputColumns.add(elem);
  }

  public List<String> getOutputColumns() {
    return this.outputColumns;
  }

  public TransformEvent setOutputColumns(List<String> outputColumns) {
    this.outputColumns = outputColumns;
    return this;
  }

  public void unsetOutputColumns() {
    this.outputColumns = null;
  }

  /** Returns true if field outputColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputColumns() {
    return this.outputColumns != null;
  }

  public void setOutputColumnsIsSet(boolean value) {
    if (!value) {
      this.outputColumns = null;
    }
  }

  public int getExperimentRunId() {
    return this.experimentRunId;
  }

  public TransformEvent setExperimentRunId(int experimentRunId) {
    this.experimentRunId = experimentRunId;
    setExperimentRunIdIsSet(true);
    return this;
  }

  public void unsetExperimentRunId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPERIMENTRUNID_ISSET_ID);
  }

  /** Returns true if field experimentRunId is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentRunId() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPERIMENTRUNID_ISSET_ID);
  }

  public void setExperimentRunIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPERIMENTRUNID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OLD_DATA_FRAME:
      if (value == null) {
        unsetOldDataFrame();
      } else {
        setOldDataFrame((DataFrame)value);
      }
      break;

    case NEW_DATA_FRAME:
      if (value == null) {
        unsetNewDataFrame();
      } else {
        setNewDataFrame((DataFrame)value);
      }
      break;

    case TRANSFORMER:
      if (value == null) {
        unsetTransformer();
      } else {
        setTransformer((Transformer)value);
      }
      break;

    case INPUT_COLUMNS:
      if (value == null) {
        unsetInputColumns();
      } else {
        setInputColumns((List<String>)value);
      }
      break;

    case OUTPUT_COLUMNS:
      if (value == null) {
        unsetOutputColumns();
      } else {
        setOutputColumns((List<String>)value);
      }
      break;

    case EXPERIMENT_RUN_ID:
      if (value == null) {
        unsetExperimentRunId();
      } else {
        setExperimentRunId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OLD_DATA_FRAME:
      return getOldDataFrame();

    case NEW_DATA_FRAME:
      return getNewDataFrame();

    case TRANSFORMER:
      return getTransformer();

    case INPUT_COLUMNS:
      return getInputColumns();

    case OUTPUT_COLUMNS:
      return getOutputColumns();

    case EXPERIMENT_RUN_ID:
      return getExperimentRunId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OLD_DATA_FRAME:
      return isSetOldDataFrame();
    case NEW_DATA_FRAME:
      return isSetNewDataFrame();
    case TRANSFORMER:
      return isSetTransformer();
    case INPUT_COLUMNS:
      return isSetInputColumns();
    case OUTPUT_COLUMNS:
      return isSetOutputColumns();
    case EXPERIMENT_RUN_ID:
      return isSetExperimentRunId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TransformEvent)
      return this.equals((TransformEvent)that);
    return false;
  }

  public boolean equals(TransformEvent that) {
    if (that == null)
      return false;

    boolean this_present_oldDataFrame = true && this.isSetOldDataFrame();
    boolean that_present_oldDataFrame = true && that.isSetOldDataFrame();
    if (this_present_oldDataFrame || that_present_oldDataFrame) {
      if (!(this_present_oldDataFrame && that_present_oldDataFrame))
        return false;
      if (!this.oldDataFrame.equals(that.oldDataFrame))
        return false;
    }

    boolean this_present_newDataFrame = true && this.isSetNewDataFrame();
    boolean that_present_newDataFrame = true && that.isSetNewDataFrame();
    if (this_present_newDataFrame || that_present_newDataFrame) {
      if (!(this_present_newDataFrame && that_present_newDataFrame))
        return false;
      if (!this.newDataFrame.equals(that.newDataFrame))
        return false;
    }

    boolean this_present_transformer = true && this.isSetTransformer();
    boolean that_present_transformer = true && that.isSetTransformer();
    if (this_present_transformer || that_present_transformer) {
      if (!(this_present_transformer && that_present_transformer))
        return false;
      if (!this.transformer.equals(that.transformer))
        return false;
    }

    boolean this_present_inputColumns = true && this.isSetInputColumns();
    boolean that_present_inputColumns = true && that.isSetInputColumns();
    if (this_present_inputColumns || that_present_inputColumns) {
      if (!(this_present_inputColumns && that_present_inputColumns))
        return false;
      if (!this.inputColumns.equals(that.inputColumns))
        return false;
    }

    boolean this_present_outputColumns = true && this.isSetOutputColumns();
    boolean that_present_outputColumns = true && that.isSetOutputColumns();
    if (this_present_outputColumns || that_present_outputColumns) {
      if (!(this_present_outputColumns && that_present_outputColumns))
        return false;
      if (!this.outputColumns.equals(that.outputColumns))
        return false;
    }

    boolean this_present_experimentRunId = true;
    boolean that_present_experimentRunId = true;
    if (this_present_experimentRunId || that_present_experimentRunId) {
      if (!(this_present_experimentRunId && that_present_experimentRunId))
        return false;
      if (this.experimentRunId != that.experimentRunId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_oldDataFrame = true && (isSetOldDataFrame());
    list.add(present_oldDataFrame);
    if (present_oldDataFrame)
      list.add(oldDataFrame);

    boolean present_newDataFrame = true && (isSetNewDataFrame());
    list.add(present_newDataFrame);
    if (present_newDataFrame)
      list.add(newDataFrame);

    boolean present_transformer = true && (isSetTransformer());
    list.add(present_transformer);
    if (present_transformer)
      list.add(transformer);

    boolean present_inputColumns = true && (isSetInputColumns());
    list.add(present_inputColumns);
    if (present_inputColumns)
      list.add(inputColumns);

    boolean present_outputColumns = true && (isSetOutputColumns());
    list.add(present_outputColumns);
    if (present_outputColumns)
      list.add(outputColumns);

    boolean present_experimentRunId = true;
    list.add(present_experimentRunId);
    if (present_experimentRunId)
      list.add(experimentRunId);

    return list.hashCode();
  }

  @Override
  public int compareTo(TransformEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOldDataFrame()).compareTo(other.isSetOldDataFrame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldDataFrame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldDataFrame, other.oldDataFrame);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewDataFrame()).compareTo(other.isSetNewDataFrame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewDataFrame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newDataFrame, other.newDataFrame);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransformer()).compareTo(other.isSetTransformer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransformer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transformer, other.transformer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputColumns()).compareTo(other.isSetInputColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputColumns, other.inputColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutputColumns()).compareTo(other.isSetOutputColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputColumns, other.outputColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentRunId()).compareTo(other.isSetExperimentRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentRunId, other.experimentRunId);
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
    StringBuilder sb = new StringBuilder("TransformEvent(");
    boolean first = true;

    sb.append("oldDataFrame:");
    if (this.oldDataFrame == null) {
      sb.append("null");
    } else {
      sb.append(this.oldDataFrame);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newDataFrame:");
    if (this.newDataFrame == null) {
      sb.append("null");
    } else {
      sb.append(this.newDataFrame);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transformer:");
    if (this.transformer == null) {
      sb.append("null");
    } else {
      sb.append(this.transformer);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputColumns:");
    if (this.inputColumns == null) {
      sb.append("null");
    } else {
      sb.append(this.inputColumns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("outputColumns:");
    if (this.outputColumns == null) {
      sb.append("null");
    } else {
      sb.append(this.outputColumns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("experimentRunId:");
    sb.append(this.experimentRunId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (oldDataFrame != null) {
      oldDataFrame.validate();
    }
    if (newDataFrame != null) {
      newDataFrame.validate();
    }
    if (transformer != null) {
      transformer.validate();
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

  private static class TransformEventStandardSchemeFactory implements SchemeFactory {
    public TransformEventStandardScheme getScheme() {
      return new TransformEventStandardScheme();
    }
  }

  private static class TransformEventStandardScheme extends StandardScheme<TransformEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransformEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OLD_DATA_FRAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.oldDataFrame = new DataFrame();
              struct.oldDataFrame.read(iprot);
              struct.setOldDataFrameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_DATA_FRAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.newDataFrame = new DataFrame();
              struct.newDataFrame.read(iprot);
              struct.setNewDataFrameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSFORMER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transformer = new Transformer();
              struct.transformer.read(iprot);
              struct.setTransformerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INPUT_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.inputColumns = new ArrayList<String>(_list64.size);
                String _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = iprot.readString();
                  struct.inputColumns.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setInputColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OUTPUT_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list67 = iprot.readListBegin();
                struct.outputColumns = new ArrayList<String>(_list67.size);
                String _elem68;
                for (int _i69 = 0; _i69 < _list67.size; ++_i69)
                {
                  _elem68 = iprot.readString();
                  struct.outputColumns.add(_elem68);
                }
                iprot.readListEnd();
              }
              struct.setOutputColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXPERIMENT_RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.experimentRunId = iprot.readI32();
              struct.setExperimentRunIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransformEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.oldDataFrame != null) {
        oprot.writeFieldBegin(OLD_DATA_FRAME_FIELD_DESC);
        struct.oldDataFrame.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.newDataFrame != null) {
        oprot.writeFieldBegin(NEW_DATA_FRAME_FIELD_DESC);
        struct.newDataFrame.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.transformer != null) {
        oprot.writeFieldBegin(TRANSFORMER_FIELD_DESC);
        struct.transformer.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.inputColumns != null) {
        oprot.writeFieldBegin(INPUT_COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.inputColumns.size()));
          for (String _iter70 : struct.inputColumns)
          {
            oprot.writeString(_iter70);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.outputColumns != null) {
        oprot.writeFieldBegin(OUTPUT_COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.outputColumns.size()));
          for (String _iter71 : struct.outputColumns)
          {
            oprot.writeString(_iter71);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPERIMENT_RUN_ID_FIELD_DESC);
      oprot.writeI32(struct.experimentRunId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransformEventTupleSchemeFactory implements SchemeFactory {
    public TransformEventTupleScheme getScheme() {
      return new TransformEventTupleScheme();
    }
  }

  private static class TransformEventTupleScheme extends TupleScheme<TransformEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransformEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOldDataFrame()) {
        optionals.set(0);
      }
      if (struct.isSetNewDataFrame()) {
        optionals.set(1);
      }
      if (struct.isSetTransformer()) {
        optionals.set(2);
      }
      if (struct.isSetInputColumns()) {
        optionals.set(3);
      }
      if (struct.isSetOutputColumns()) {
        optionals.set(4);
      }
      if (struct.isSetExperimentRunId()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetOldDataFrame()) {
        struct.oldDataFrame.write(oprot);
      }
      if (struct.isSetNewDataFrame()) {
        struct.newDataFrame.write(oprot);
      }
      if (struct.isSetTransformer()) {
        struct.transformer.write(oprot);
      }
      if (struct.isSetInputColumns()) {
        {
          oprot.writeI32(struct.inputColumns.size());
          for (String _iter72 : struct.inputColumns)
          {
            oprot.writeString(_iter72);
          }
        }
      }
      if (struct.isSetOutputColumns()) {
        {
          oprot.writeI32(struct.outputColumns.size());
          for (String _iter73 : struct.outputColumns)
          {
            oprot.writeString(_iter73);
          }
        }
      }
      if (struct.isSetExperimentRunId()) {
        oprot.writeI32(struct.experimentRunId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransformEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.oldDataFrame = new DataFrame();
        struct.oldDataFrame.read(iprot);
        struct.setOldDataFrameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newDataFrame = new DataFrame();
        struct.newDataFrame.read(iprot);
        struct.setNewDataFrameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transformer = new Transformer();
        struct.transformer.read(iprot);
        struct.setTransformerIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list74 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.inputColumns = new ArrayList<String>(_list74.size);
          String _elem75;
          for (int _i76 = 0; _i76 < _list74.size; ++_i76)
          {
            _elem75 = iprot.readString();
            struct.inputColumns.add(_elem75);
          }
        }
        struct.setInputColumnsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list77 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.outputColumns = new ArrayList<String>(_list77.size);
          String _elem78;
          for (int _i79 = 0; _i79 < _list77.size; ++_i79)
          {
            _elem78 = iprot.readString();
            struct.outputColumns.add(_elem78);
          }
        }
        struct.setOutputColumnsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.experimentRunId = iprot.readI32();
        struct.setExperimentRunIdIsSet(true);
      }
    }
  }

}

