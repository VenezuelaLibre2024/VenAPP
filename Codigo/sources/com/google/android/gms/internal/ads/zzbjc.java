package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.n4;

/* loaded from: classes2.dex */
public final class zzbjc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        n4 n4Var = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 3:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 4:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 5:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 6:
                    n4Var = (n4) ea.b.p(parcel, E, n4.CREATOR);
                    break;
                case 7:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 8:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 9:
                    i14 = ea.b.G(parcel, E);
                    break;
                case 10:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 11:
                    i15 = ea.b.G(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbjb(i10, z10, i11, z11, i12, n4Var, z12, i13, i14, z13, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbjb[i10];
    }
}
