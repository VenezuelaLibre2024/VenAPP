package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 4:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 5:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 6:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 7:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 8:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 9:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 10:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 11:
                    i10 = ea.b.G(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbbb(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbbb[i10];
    }
}
