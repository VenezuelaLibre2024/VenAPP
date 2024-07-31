package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.a;

/* loaded from: classes2.dex */
public final class zbt extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbsVar, zbp zbpVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbsVar);
        zbc.zbc(zba, zbpVar);
        zbb(3, zba);
    }

    public final void zbd(zbs zbsVar, a aVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbsVar);
        zbc.zbc(zba, aVar);
        zbb(1, zba);
    }

    public final void zbe(zbs zbsVar, zbu zbuVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbsVar);
        zbc.zbc(zba, zbuVar);
        zbb(2, zba);
    }

    public final void zbf(zbs zbsVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbsVar);
        zbb(4, zba);
    }
}
