package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzfjd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String str = null;
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
                    i13 = ea.b.G(parcel, E);
                    break;
                case 5:
                    str = ea.b.q(parcel, E);
                    break;
                case 6:
                    i14 = ea.b.G(parcel, E);
                    break;
                case 7:
                    i15 = ea.b.G(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzfjc(i10, i11, i12, i13, str, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfjc[i10];
    }
}
