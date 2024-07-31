package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzcec;
import p438x8.C12354b0;
import p438x8.InterfaceC12378p;

/* renamed from: com.google.android.gms.ads.internal.client.s3 */
/* loaded from: classes.dex */
public final class C4904s3 implements InterfaceC12378p {

    /* renamed from: a */
    private final zzbjj f9812a;

    /* renamed from: b */
    private final C12354b0 f9813b = new C12354b0();

    /* renamed from: c */
    private final zzbkg f9814c;

    public C4904s3(zzbjj zzbjjVar, zzbkg zzbkgVar) {
        this.f9812a = zzbjjVar;
        this.f9814c = zzbkgVar;
    }

    @Override // p438x8.InterfaceC12378p
    /* renamed from: a */
    public final boolean mo12438a() {
        try {
            return this.f9812a.zzl();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }

    /* renamed from: b */
    public final zzbjj m12439b() {
        return this.f9812a;
    }

    @Override // p438x8.InterfaceC12378p
    public final zzbkg zza() {
        return this.f9814c;
    }

    @Override // p438x8.InterfaceC12378p
    public final boolean zzb() {
        try {
            return this.f9812a.zzk();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }
}
