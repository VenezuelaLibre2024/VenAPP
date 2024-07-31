package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                latLng = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
            } else if (w10 == 3) {
                latLng2 = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
            } else if (w10 == 4) {
                latLng3 = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
            } else if (w10 == 5) {
                latLng4 = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                latLngBounds = (LatLngBounds) ea.b.p(parcel, E, LatLngBounds.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new e0(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
