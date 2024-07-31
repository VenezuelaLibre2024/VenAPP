package com.google.android.gms.internal.p496authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* loaded from: classes2.dex */
public final class zbaa extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbz zbzVar, AuthorizationRequest authorizationRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbzVar);
        zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}
