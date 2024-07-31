package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcec;
import p438x8.InterfaceC12380r;

/* renamed from: com.google.android.gms.ads.internal.client.y1 */
/* loaded from: classes.dex */
public final class C4938y1 implements InterfaceC12380r {

    /* renamed from: a */
    private final String f9884a;

    /* renamed from: b */
    private final InterfaceC4932x1 f9885b;

    public C4938y1(InterfaceC4932x1 interfaceC4932x1) {
        String str;
        this.f9885b = interfaceC4932x1;
        try {
            str = interfaceC4932x1.zze();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            str = null;
        }
        this.f9884a = str;
    }

    /* renamed from: a */
    public final InterfaceC4932x1 m12482a() {
        return this.f9885b;
    }

    public final String toString() {
        return this.f9884a;
    }
}
