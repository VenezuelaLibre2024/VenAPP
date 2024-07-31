package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
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
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    latLng = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    str = ea.b.q(parcel, E);
                    break;
                case 4:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 5:
                    iBinder = ea.b.F(parcel, E);
                    break;
                case 6:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 7:
                    f11 = ea.b.C(parcel, E);
                    break;
                case 8:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 9:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 10:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 11:
                    f12 = ea.b.C(parcel, E);
                    break;
                case 12:
                    f17 = ea.b.C(parcel, E);
                    break;
                case 13:
                    f13 = ea.b.C(parcel, E);
                    break;
                case 14:
                    f16 = ea.b.C(parcel, E);
                    break;
                case 15:
                    f14 = ea.b.C(parcel, E);
                    break;
                case 16:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 17:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 18:
                    iBinder2 = ea.b.F(parcel, E);
                    break;
                case 19:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 20:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 21:
                    f15 = ea.b.C(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new n(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f17, f13, f16, f14, i10, iBinder2, i11, str3, f15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
