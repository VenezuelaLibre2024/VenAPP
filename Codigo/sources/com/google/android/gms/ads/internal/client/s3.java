package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class s3 implements x8.p {

    /* renamed from: a, reason: collision with root package name */
    private final zzbjj f8735a;

    /* renamed from: b, reason: collision with root package name */
    private final x8.b0 f8736b = new x8.b0();

    /* renamed from: c, reason: collision with root package name */
    private final zzbkg f8737c;

    public s3(zzbjj zzbjjVar, zzbkg zzbkgVar) {
        this.f8735a = zzbjjVar;
        this.f8737c = zzbkgVar;
    }

    @Override // x8.p
    public final boolean a() {
        try {
            return this.f8735a.zzl();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }

    public final zzbjj b() {
        return this.f8735a;
    }

    @Override // x8.p
    public final zzbkg zza() {
        return this.f8737c;
    }

    @Override // x8.p
    public final boolean zzb() {
        try {
            return this.f8735a.zzk();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }
}
