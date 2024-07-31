package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbpq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        int i12 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i12 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 != 1000) {
                ea.b.N(parcel, E);
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new zzbpp(i10, i12, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbpp[i10];
    }
}
