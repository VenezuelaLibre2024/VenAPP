package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 4:
                    bArr = ea.b.g(parcel, E);
                    break;
                case 5:
                    strArr = ea.b.r(parcel, E);
                    break;
                case 6:
                    strArr2 = ea.b.r(parcel, E);
                    break;
                case 7:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 8:
                    j10 = ea.b.J(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbos(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbos[i10];
    }
}
