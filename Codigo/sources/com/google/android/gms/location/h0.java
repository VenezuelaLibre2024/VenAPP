package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;

/* loaded from: classes2.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 2:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 3:
                    workSource = (WorkSource) ea.b.p(parcel, E, WorkSource.CREATOR);
                    break;
                case 4:
                    str = ea.b.q(parcel, E);
                    break;
                case 5:
                    iArr = ea.b.k(parcel, E);
                    break;
                case 6:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 7:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 8:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 9:
                    str3 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new g0(j10, z10, workSource, str, iArr, z11, str2, j11, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g0[i10];
    }
}
