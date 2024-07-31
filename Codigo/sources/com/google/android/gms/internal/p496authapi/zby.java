package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p399v9.C11756a;

/* loaded from: classes2.dex */
public abstract class zby extends zbb implements zbz {
    public zby() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p496authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C11756a c11756a = (C11756a) zbc.zba(parcel, C11756a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c11756a);
        return true;
    }
}
