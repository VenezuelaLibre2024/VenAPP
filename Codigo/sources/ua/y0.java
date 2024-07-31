package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        e eVar = null;
        e eVar2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    arrayList = ea.b.u(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 4:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 5:
                    f11 = ea.b.C(parcel, E);
                    break;
                case 6:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 7:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 8:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 9:
                    eVar = (e) ea.b.p(parcel, E, e.CREATOR);
                    break;
                case 10:
                    eVar2 = (e) ea.b.p(parcel, E, e.CREATOR);
                    break;
                case 11:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 12:
                    arrayList2 = ea.b.u(parcel, E, o.CREATOR);
                    break;
                case 13:
                    arrayList3 = ea.b.u(parcel, E, z.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new t(arrayList, f10, i10, f11, z10, z11, z12, eVar, eVar2, i11, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
