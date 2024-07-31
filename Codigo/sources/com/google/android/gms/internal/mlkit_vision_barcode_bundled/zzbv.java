package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 1) {
                i10 = b.G(parcel, E);
            } else if (w10 == 2) {
                i11 = b.G(parcel, E);
            } else if (w10 == 3) {
                i12 = b.G(parcel, E);
            } else if (w10 == 4) {
                i13 = b.G(parcel, E);
            } else if (w10 != 5) {
                b.N(parcel, E);
            } else {
                j10 = b.J(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzbu(i10, i11, i12, i13, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbu[i10];
    }
}
