package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        c3 c3Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    str = ea.b.q(parcel, E);
                    break;
                case 2:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 3:
                    c3Var = (c3) ea.b.p(parcel, E, c3.CREATOR);
                    break;
                case 4:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 5:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 6:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 8:
                    str5 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d5(str, j10, c3Var, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d5[i10];
    }
}
