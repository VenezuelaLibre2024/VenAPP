package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p081ea.C7139b;

/* renamed from: ua.m0 */
/* loaded from: classes2.dex */
public final class C11501m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                latLng = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
            } else if (m21190w == 3) {
                latLng2 = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
            } else if (m21190w == 4) {
                latLng3 = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
            } else if (m21190w == 5) {
                latLng4 = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
            } else if (m21190w != 6) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                latLngBounds = (LatLngBounds) C7139b.m21183p(parcel, m21155E, LatLngBounds.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11485e0(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11485e0[i10];
    }
}
