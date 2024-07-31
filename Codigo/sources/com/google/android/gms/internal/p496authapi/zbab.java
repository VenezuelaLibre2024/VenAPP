package com.google.android.gms.internal.p496authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p399v9.C11760c;

/* loaded from: classes2.dex */
public abstract class zbab extends zbb implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p496authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C11760c c11760c = (C11760c) zbc.zba(parcel, C11760c.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c11760c);
        return true;
    }
}
