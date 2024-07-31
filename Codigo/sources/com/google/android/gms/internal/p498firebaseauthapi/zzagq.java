package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* loaded from: classes2.dex */
public final class zzagq implements Parcelable.Creator<zzagr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            C7139b.m21190w(m21155E);
            C7139b.m21164N(parcel, m21155E);
        }
        C7139b.m21189v(parcel, m21165O);
        return new zzagr();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr[] newArray(int i10) {
        return new zzagr[i10];
    }
}
