package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbyn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    str = ea.b.q(parcel, E);
                    break;
                case 2:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 3:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 4:
                    bArr = ea.b.g(parcel, E);
                    break;
                case 5:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 6:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str3 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbym(str, i10, bundle, bArr, z10, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbym[i10];
    }
}
