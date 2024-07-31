package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        String str = null;
        String str2 = null;
        ja.b bVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 3:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 4:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 5:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 6:
                    str = ea.b.q(parcel, E);
                    break;
                case 7:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 8:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 9:
                    bVar = (ja.b) ea.b.p(parcel, E, ja.b.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new a.C0150a(i10, i11, z10, i12, z11, str, i13, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.C0150a[i10];
    }
}
