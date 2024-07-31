package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzceu;
import java.util.Map;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static zzaqd f9049a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9050b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final n0 f9051c = new k0();

    public s0(Context context) {
        zzaqd zza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f9050b) {
            if (f9049a == null) {
                zzbgc.zza(context);
                if (!la.e.a()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzer)).booleanValue()) {
                        zza = a0.a(context);
                        f9049a = zza;
                    }
                }
                zza = zzarg.zza(context, null);
                f9049a = zza;
            }
        }
    }

    public final com.google.common.util.concurrent.f a(String str) {
        zzceu zzceuVar = new zzceu();
        f9049a.zza(new r0(str, null, zzceuVar));
        return zzceuVar;
    }

    public final com.google.common.util.concurrent.f b(int i10, String str, Map map, byte[] bArr) {
        p0 p0Var = new p0(null);
        l0 l0Var = new l0(this, str, p0Var);
        zzceb zzcebVar = new zzceb(null);
        m0 m0Var = new m0(this, i10, str, p0Var, l0Var, bArr, map, zzcebVar);
        if (zzceb.zzk()) {
            try {
                zzcebVar.zzd(str, "GET", m0Var.zzl(), m0Var.zzx());
            } catch (zzapi e10) {
                zzcec.zzj(e10.getMessage());
            }
        }
        f9049a.zza(m0Var);
        return p0Var;
    }
}
