package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzceu;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Map;
import la.C9460e;

/* renamed from: com.google.android.gms.ads.internal.util.s0 */
/* loaded from: classes.dex */
public final class C5039s0 {

    /* renamed from: a */
    private static zzaqd f10148a;

    /* renamed from: b */
    private static final Object f10149b = new Object();

    /* renamed from: c */
    @Deprecated
    public static final InterfaceC5019n0 f10150c = new C5007k0();

    public C5039s0(Context context) {
        zzaqd zza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f10149b) {
            if (f10148a == null) {
                zzbgc.zza(context);
                if (!C9460e.m28129a()) {
                    if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzer)).booleanValue()) {
                        zza = C4967a0.m12591a(context);
                        f10148a = zza;
                    }
                }
                zza = zzarg.zza(context, null);
                f10148a = zza;
            }
        }
    }

    /* renamed from: a */
    public final InterfaceFutureC5920f m12715a(String str) {
        zzceu zzceuVar = new zzceu();
        f10148a.zza(new C5035r0(str, null, zzceuVar));
        return zzceuVar;
    }

    /* renamed from: b */
    public final InterfaceFutureC5920f m12716b(int i10, String str, Map map, byte[] bArr) {
        C5027p0 c5027p0 = new C5027p0(null);
        C5011l0 c5011l0 = new C5011l0(this, str, c5027p0);
        zzceb zzcebVar = new zzceb(null);
        C5015m0 c5015m0 = new C5015m0(this, i10, str, c5027p0, c5011l0, bArr, map, zzcebVar);
        if (zzceb.zzk()) {
            try {
                zzcebVar.zzd(str, "GET", c5015m0.zzl(), c5015m0.zzx());
            } catch (zzapi e10) {
                zzcec.zzj(e10.getMessage());
            }
        }
        f10148a.zza(c5015m0);
        return c5027p0;
    }
}
