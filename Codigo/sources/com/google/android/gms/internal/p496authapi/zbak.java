package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p399v9.C11765h;

/* loaded from: classes2.dex */
public abstract class zbak extends zbb implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p496authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C11765h c11765h = (C11765h) zbc.zba(parcel, C11765h.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c11765h);
        return true;
    }
}
