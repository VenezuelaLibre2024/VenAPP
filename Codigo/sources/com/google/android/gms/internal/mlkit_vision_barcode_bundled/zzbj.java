package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 1) {
                d10 = b.A(parcel, E);
            } else if (w10 != 2) {
                b.N(parcel, E);
            } else {
                d11 = b.A(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzau(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}