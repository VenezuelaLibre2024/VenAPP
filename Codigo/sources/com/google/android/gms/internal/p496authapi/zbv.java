package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p081ea.C7139b;

/* loaded from: classes2.dex */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                credential = (Credential) C7139b.m21183p(parcel, m21155E, Credential.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbu[i10];
    }
}
