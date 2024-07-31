package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        u uVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    uVar = (u) ea.b.p(parcel, E, u.CREATOR);
                    break;
                case 2:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 3:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 4:
                    iArr = ea.b.k(parcel, E);
                    break;
                case 5:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 6:
                    iArr2 = ea.b.k(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new f(uVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
