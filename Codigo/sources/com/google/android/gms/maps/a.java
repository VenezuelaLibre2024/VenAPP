package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import ea.b;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    b10 = b.z(parcel, E);
                    break;
                case 3:
                    b11 = b.z(parcel, E);
                    break;
                case 4:
                    i10 = b.G(parcel, E);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) b.p(parcel, E, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = b.z(parcel, E);
                    break;
                case 7:
                    b13 = b.z(parcel, E);
                    break;
                case 8:
                    b14 = b.z(parcel, E);
                    break;
                case 9:
                    b15 = b.z(parcel, E);
                    break;
                case 10:
                    b16 = b.z(parcel, E);
                    break;
                case 11:
                    b17 = b.z(parcel, E);
                    break;
                case 12:
                    b18 = b.z(parcel, E);
                    break;
                case 13:
                default:
                    b.N(parcel, E);
                    break;
                case 14:
                    b19 = b.z(parcel, E);
                    break;
                case 15:
                    b20 = b.z(parcel, E);
                    break;
                case 16:
                    f10 = b.D(parcel, E);
                    break;
                case 17:
                    f11 = b.D(parcel, E);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) b.p(parcel, E, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = b.z(parcel, E);
                    break;
                case 20:
                    num = b.H(parcel, E);
                    break;
                case 21:
                    str = b.q(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
