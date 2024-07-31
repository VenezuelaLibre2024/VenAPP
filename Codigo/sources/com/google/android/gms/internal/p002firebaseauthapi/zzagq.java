package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzagq implements Parcelable.Creator<zzagr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            b.w(E);
            b.N(parcel, E);
        }
        b.v(parcel, O);
        return new zzagr();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr[] newArray(int i10) {
        return new zzagr[i10];
    }
}
