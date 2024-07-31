package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzdg implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    j10 = b.J(parcel, E);
                    break;
                case 2:
                    j11 = b.J(parcel, E);
                    break;
                case 3:
                    z10 = b.x(parcel, E);
                    break;
                case 4:
                    str = b.q(parcel, E);
                    break;
                case 5:
                    str2 = b.q(parcel, E);
                    break;
                case 6:
                    str3 = b.q(parcel, E);
                    break;
                case 7:
                    bundle = b.f(parcel, E);
                    break;
                case 8:
                    str4 = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzdd(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i10) {
        return new zzdd[i10];
    }
}
