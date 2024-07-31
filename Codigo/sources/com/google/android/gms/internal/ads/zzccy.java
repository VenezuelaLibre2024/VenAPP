package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzccy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        z4 z4Var = null;
        u4 u4Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                z4Var = (z4) ea.b.p(parcel, E, z4.CREATOR);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                u4Var = (u4) ea.b.p(parcel, E, u4.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new zzccx(str, str2, z4Var, u4Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzccx[i10];
    }
}
