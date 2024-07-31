package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        z[] zVarArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 2:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 3:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 4:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 5:
                    zVarArr = (z[]) ea.b.t(parcel, E, z.CREATOR);
                    break;
                case 6:
                    z10 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new LocationAvailability(i10, i11, i12, j10, zVarArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
