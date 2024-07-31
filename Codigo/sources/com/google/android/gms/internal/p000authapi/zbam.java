package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.h;
import v9.b;
import v9.d;
import v9.e;

/* loaded from: classes2.dex */
public final class zbam extends zba {
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbacVar, b bVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbacVar);
        zbc.zbc(zba, bVar);
        zbb(1, zba);
    }

    public final void zbd(zbaf zbafVar, d dVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbafVar);
        zbc.zbc(zba, dVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbah zbahVar, e eVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbahVar);
        zbc.zbc(zba, eVar);
        zbb(3, zba);
    }

    public final void zbf(h hVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, hVar);
        zba.writeString(str);
        zbb(2, zba);
    }
}
