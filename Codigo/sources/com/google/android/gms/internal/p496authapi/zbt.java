package com.google.android.gms.internal.p496authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.C5083a;

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

    public final void zbd(zbs zbsVar, C5083a c5083a) {
        Parcel zba = zba();
        zbc.zbd(zba, zbsVar);
        zbc.zbc(zba, c5083a);
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
