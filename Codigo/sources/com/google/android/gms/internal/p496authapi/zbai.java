package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p399v9.C11763f;

/* loaded from: classes2.dex */
public abstract class zbai extends zbb implements zbaj {
    public zbai() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p496authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C11763f c11763f = (C11763f) zbc.zba(parcel, C11763f.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c11763f);
        return true;
    }
}
