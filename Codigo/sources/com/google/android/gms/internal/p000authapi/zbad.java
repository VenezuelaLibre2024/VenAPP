package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import v9.g;

/* loaded from: classes2.dex */
public final class zbad extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbajVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbajVar);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbal zbalVar, g gVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbalVar);
        zbc.zbc(zba, gVar);
        zbb(2, zba);
    }
}
