package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    str = b.q(parcel, E);
                    break;
                case 2:
                    j10 = b.J(parcel, E);
                    break;
                case 3:
                    s10 = b.L(parcel, E);
                    break;
                case 4:
                    d10 = b.A(parcel, E);
                    break;
                case 5:
                    d11 = b.A(parcel, E);
                    break;
                case 6:
                    f10 = b.C(parcel, E);
                    break;
                case 7:
                    i10 = b.G(parcel, E);
                    break;
                case 8:
                    i11 = b.G(parcel, E);
                    break;
                case 9:
                    i12 = b.G(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzdh(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdh[i10];
    }
}
