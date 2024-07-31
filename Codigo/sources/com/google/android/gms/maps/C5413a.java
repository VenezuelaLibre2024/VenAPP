package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.maps.a */
/* loaded from: classes2.dex */
public final class C5413a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
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
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    b10 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 3:
                    b11 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 4:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C7139b.m21183p(parcel, m21155E, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 7:
                    b13 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 8:
                    b14 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 9:
                    b15 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 10:
                    b16 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 11:
                    b17 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 12:
                    b18 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 13:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 14:
                    b19 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 15:
                    b20 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 16:
                    f10 = C7139b.m21154D(parcel, m21155E);
                    break;
                case 17:
                    f11 = C7139b.m21154D(parcel, m21155E);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C7139b.m21183p(parcel, m21155E, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = C7139b.m21193z(parcel, m21155E);
                    break;
                case 20:
                    num = C7139b.m21158H(parcel, m21155E);
                    break;
                case 21:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
