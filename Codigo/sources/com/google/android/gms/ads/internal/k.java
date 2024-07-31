package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 3:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 4:
                    str = ea.b.q(parcel, E);
                    break;
                case 5:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 6:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 7:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 8:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 9:
                    z14 = ea.b.x(parcel, E);
                    break;
                case 10:
                    z15 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new j(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
