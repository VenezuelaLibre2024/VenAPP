package com.google.android.gms.internal.p496authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC5139h;
import p399v9.C11758b;
import p399v9.C11761d;
import p399v9.C11762e;

/* loaded from: classes2.dex */
public final class zbam extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbacVar, C11758b c11758b) {
        Parcel zba = zba();
        zbc.zbd(zba, zbacVar);
        zbc.zbc(zba, c11758b);
        zbb(1, zba);
    }

    public final void zbd(zbaf zbafVar, C11761d c11761d, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbafVar);
        zbc.zbc(zba, c11761d);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbah zbahVar, C11762e c11762e) {
        Parcel zba = zba();
        zbc.zbd(zba, zbahVar);
        zbc.zbc(zba, c11762e);
        zbb(3, zba);
    }

    public final void zbf(InterfaceC5139h interfaceC5139h, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC5139h);
        zba.writeString(str);
        zbb(2, zba);
    }
}
