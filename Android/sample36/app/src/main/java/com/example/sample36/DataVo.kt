package com.example.sample36

import android.os.Parcel
import android.os.Parcelable

class DataVo(val text1:String?) : Parcelable {
    constructor(parcel:Parcel) :this(
        parcel.readString()
    ){}

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(text1)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataVo>{
        override fun createFromParcel(parcel: Parcel): DataVo {
            return DataVo(parcel)
        }

        override fun newArray(size: Int): Array<DataVo?> {
            return  arrayOfNulls(size)
        }
    }
}








