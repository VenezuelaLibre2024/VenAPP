package com.google.android.gms.internal.p496authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import p399v9.C11764g;

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

    public final void zbd(zbal zbalVar, C11764g c11764g) {
        Parcel zba = zba();
        zbc.zbd(zba, zbalVar);
        zbc.zbc(zba, c11764g);
        zbb(2, zba);
    }
}
