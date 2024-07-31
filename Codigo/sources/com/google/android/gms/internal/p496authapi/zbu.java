package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* loaded from: classes2.dex */
public final class zbu extends AbstractC7138a {
    public static final Parcelable.Creator<zbu> CREATOR = new zbv();
    private final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, this.zba, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
