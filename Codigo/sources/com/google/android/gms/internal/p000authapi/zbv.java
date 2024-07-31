package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import ea.b;

/* loaded from: classes2.dex */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            if (b.w(E) != 1) {
                b.N(parcel, E);
            } else {
                credential = (Credential) b.p(parcel, E, Credential.CREATOR);
            }
        }
        b.v(parcel, O);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbu[i10];
    }
}
