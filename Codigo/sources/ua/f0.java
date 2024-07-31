package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                latLng = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
            } else if (w10 == 3) {
                f10 = ea.b.C(parcel, E);
            } else if (w10 == 4) {
                f12 = ea.b.C(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                f11 = ea.b.C(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
