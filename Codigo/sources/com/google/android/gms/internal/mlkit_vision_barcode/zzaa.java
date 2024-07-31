package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 2) {
                i10 = b.G(parcel, E);
            } else if (w10 == 3) {
                str = b.q(parcel, E);
            } else if (w10 == 4) {
                str3 = b.q(parcel, E);
            } else if (w10 != 5) {
                b.N(parcel, E);
            } else {
                str2 = b.q(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzn(i10, str, str3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzn[i10];
    }
}
