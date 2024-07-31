package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 == 2) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 4) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                zzdVar = (zzd) ea.b.p(parcel, E, zzd.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new l(j10, i10, z10, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
