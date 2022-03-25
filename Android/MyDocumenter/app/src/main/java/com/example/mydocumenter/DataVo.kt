package com.example.sample30

import android.os.Parcel
import android.os.Parcelable

class DataVo(val imgPath:String?, val address:String?, val title:String?, val content:String?, val regDate:String?, val photo:String?) : Parcelable {
    constructor(parcel:Parcel) :this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ){}

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(imgPath)
        parcel.writeString(address)
        parcel.writeString(title)
        parcel.writeString(content)
        parcel.writeString(regDate)
        parcel.writeString(photo)
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








