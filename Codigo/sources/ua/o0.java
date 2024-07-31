package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        double d10 = 0.0d;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    latLng = (LatLng) ea.b.p(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    d10 = ea.b.A(parcel, E);
                    break;
                case 4:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 5:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 6:
                    i11 = ea.b.G(parcel, E);
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
                    arrayList = ea.b.u(parcel, E, o.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new g(latLng, d10, f10, i10, i11, f11, z10, z11, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
