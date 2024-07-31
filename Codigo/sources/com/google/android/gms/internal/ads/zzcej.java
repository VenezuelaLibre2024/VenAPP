package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzcej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 4) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 5) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                z11 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new zzcei(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcei[i10];
    }
}
