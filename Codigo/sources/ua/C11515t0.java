package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p081ea.C7139b;

/* renamed from: ua.t0 */
/* loaded from: classes2.dex */
public final class C11515t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        int i11 = 0;
        float f16 = 1.0f;
        float f17 = 0.5f;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    latLng = (LatLng) C7139b.m21183p(parcel, m21155E, LatLng.CREATOR);
                    break;
                case 3:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    iBinder = C7139b.m21156F(parcel, m21155E);
                    break;
                case 6:
                    f10 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 7:
                    f11 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 8:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    f12 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 12:
                    f17 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 13:
                    f13 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 14:
                    f16 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 15:
                    f14 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 16:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 17:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 18:
                    iBinder2 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 19:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 20:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 21:
                    f15 = C7139b.m21153C(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11502n(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f17, f13, f16, f14, i10, iBinder2, i11, str3, f15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11502n[i10];
    }
}
