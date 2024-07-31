package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        hb hbVar = null;
        String str3 = null;
        d0 d0Var = null;
        d0 d0Var2 = null;
        d0 d0Var3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 4:
                    hbVar = (hb) ea.b.p(parcel, E, hb.CREATOR);
                    break;
                case 5:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 6:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 7:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 8:
                    d0Var = (d0) ea.b.p(parcel, E, d0.CREATOR);
                    break;
                case 9:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 10:
                    d0Var2 = (d0) ea.b.p(parcel, E, d0.CREATOR);
                    break;
                case 11:
                    j12 = ea.b.J(parcel, E);
                    break;
                case 12:
                    d0Var3 = (d0) ea.b.p(parcel, E, d0.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d(str, str2, hbVar, j10, z10, str3, d0Var, j11, d0Var2, j12, d0Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
