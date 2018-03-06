package org.opendatakit.sync.service.entity;

import org.opendatakit.aggregate.odktables.rest.entity.DataKeyValue;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableDataKeyValue extends DataKeyValue implements Parcelable {
  protected ParcelableDataKeyValue(Parcel in) {
    super(in.readString(), in.readString());
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(column);
    dest.writeString(value);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Creator<ParcelableDataKeyValue> CREATOR = new Creator<ParcelableDataKeyValue>() {
    @Override
    public ParcelableDataKeyValue createFromParcel(Parcel in) {
      return new ParcelableDataKeyValue(in);
    }

    @Override
    public ParcelableDataKeyValue[] newArray(int size) {
      return new ParcelableDataKeyValue[size];
    }
  };
}
