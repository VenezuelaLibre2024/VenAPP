package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import ck.n;
import ck.o;
import ck.v;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zk.m;

/* loaded from: classes2.dex */
public final class zzcu {
    final /* synthetic */ zzda zza;
    private Long zzb;
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(String str) {
        Map map;
        Object a10;
        zzb();
        zzlz zzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        zzg.zzk();
        map = this.zza.zzk;
        m mVar = (m) map.remove(zzg.zzj());
        String zzk = zzg.zzk();
        if (zzk == null || zzk.length() == 0) {
            zzg.zzi().name();
            zzg zzgVar = zzh.zza;
            zzh zza = zzg.zza(zzg.zzi());
            zzg.zzj();
            if (mVar == null) {
                return;
            }
            n.a aVar = n.f7126b;
            a10 = o.a(zza);
        } else if (mVar == null) {
            return;
        } else {
            a10 = zzg.zzk();
        }
        mVar.resumeWith(n.b(a10));
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzmd zzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (this.zza.zzm().B(v.f7137a)) {
                return;
            }
            this.zza.zzm().hashCode();
            return;
        }
        zzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zza = zzg.zza(zzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().y(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
