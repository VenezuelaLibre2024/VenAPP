package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    i10 = b.G(parcel, E);
                    break;
                case 3:
                    i11 = b.G(parcel, E);
                    break;
                case 4:
                    i12 = b.G(parcel, E);
                    break;
                case 5:
                    i13 = b.G(parcel, E);
                    break;
                case 6:
                    i14 = b.G(parcel, E);
                    break;
                case 7:
                    i15 = b.G(parcel, E);
                    break;
                case 8:
                    z10 = b.x(parcel, E);
                    break;
                case 9:
                    str = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzj(i10, i11, i12, i13, i14, i15, z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
