package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str = null;
        z4[] z4VarArr = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 4:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 5:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 6:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 7:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 8:
                    z4VarArr = (z4[]) ea.b.t(parcel, E, z4.CREATOR);
                    break;
                case 9:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 10:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 11:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 12:
                    z14 = ea.b.x(parcel, E);
                    break;
                case 13:
                    z15 = ea.b.x(parcel, E);
                    break;
                case 14:
                    z16 = ea.b.x(parcel, E);
                    break;
                case 15:
                    z17 = ea.b.x(parcel, E);
                    break;
                case 16:
                    z18 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new z4(str, i10, i11, z10, i12, i13, z4VarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z4[i10];
    }
}
