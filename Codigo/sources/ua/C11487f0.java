package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p081ea.C7139b;

/* renamed from: ua.f0 */
/* loaded from: classes2.dex */
public final class C11487f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                latLng = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
            } else if (m21190w == 3) {
                f10 = C7139b.m21153C(parcel, m21155E);
            } else if (m21190w == 4) {
                f12 = C7139b.m21153C(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                f11 = C7139b.m21153C(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
