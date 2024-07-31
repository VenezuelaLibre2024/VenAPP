package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i14 = -1;
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
                    i12 = ea.b.G(parcel, E);
                    break;
                case 4:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 5:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 6:
                    str = ea.b.q(parcel, E);
                    break;
                case 7:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 8:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 9:
                    i14 = ea.b.G(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new p(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
