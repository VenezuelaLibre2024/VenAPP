package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.d;
import androidx.core.os.h;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import tf.b;

/* loaded from: classes2.dex */
public final class zzpz {
    private static zzar zza;
    private static final zzau zzb = zzau.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzpr zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzpz(Context context, n nVar, zzpr zzprVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzprVar;
        zzqn.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpv
            public /* synthetic */ zzpv() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzpz.this.zza();
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.zzh = a10.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpw
            public /* synthetic */ zzpw() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.this.a();
            }
        });
        zzau zzauVar = zzb;
        this.zzj = zzauVar.containsKey(str) ? DynamiteModule.c(context, (String) zzauVar.get(str)) : -1;
    }

    private static synchronized zzar zzh() {
        synchronized (zzpz.class) {
            zzar zzarVar = zza;
            if (zzarVar != null) {
                return zzarVar;
            }
            h a10 = d.a(Resources.getSystem().getConfiguration());
            zzao zzaoVar = new zzao();
            for (int i10 = 0; i10 < a10.g(); i10++) {
                zzaoVar.zzb(c.b(a10.c(i10)));
            }
            zzar zzc = zzaoVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    private final zzol zzi(String str, String str2) {
        zzol zzolVar = new zzol();
        zzolVar.zzb(this.zzc);
        zzolVar.zzc(this.zzd);
        zzolVar.zzh(zzh());
        zzolVar.zzg(Boolean.TRUE);
        zzolVar.zzl(str);
        zzolVar.zzj(str2);
        zzolVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzolVar.zzd(10);
        zzolVar.zzk(Integer.valueOf(this.zzj));
        return zzolVar;
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : o.a().b(this.zzi);
    }

    public final /* synthetic */ String zza() {
        return o.a().b(this.zzi);
    }

    public final /* synthetic */ void zzb(zzpq zzpqVar, zzln zzlnVar, String str) {
        zzpqVar.zza(zzlnVar);
        zzpqVar.zzc(zzi(zzpqVar.zzd(), str));
        this.zze.zza(zzpqVar);
    }

    public final /* synthetic */ void zzc(zzpq zzpqVar, zzqb zzqbVar, b bVar) {
        zzpqVar.zza(zzln.MODEL_DOWNLOAD);
        zzpqVar.zzc(zzi(zzqbVar.zze(), zzj()));
        zzpqVar.zzb(zzql.zza(bVar, this.zzf, zzqbVar));
        this.zze.zza(zzpqVar);
    }

    public final void zzd(zzpq zzpqVar, zzln zzlnVar) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpx
            public final /* synthetic */ zzpq zzb;
            public final /* synthetic */ zzln zzc;
            public final /* synthetic */ String zzd;

            public /* synthetic */ zzpx(zzpq zzpqVar2, zzln zzlnVar2, String str) {
                r2 = zzpqVar2;
                r3 = zzlnVar2;
                r4 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzpz.this.zzb(r2, r3, r4);
            }
        });
    }

    public final void zze(zzpq zzpqVar, b bVar, boolean z10, int i10) {
        zzqa zzh = zzqb.zzh();
        zzh.zzf(false);
        zzh.zzd(bVar.c());
        zzh.zza(zzls.FAILED);
        zzh.zzb(zzlm.DOWNLOAD_FAILED);
        zzh.zzc(i10);
        zzg(zzpqVar, bVar, zzh.zzh());
    }

    public final void zzf(zzpq zzpqVar, b bVar, zzlm zzlmVar, boolean z10, l lVar, zzls zzlsVar) {
        zzqa zzh = zzqb.zzh();
        zzh.zzf(z10);
        zzh.zzd(lVar);
        zzh.zzb(zzlmVar);
        zzh.zza(zzlsVar);
        zzg(zzpqVar, bVar, zzh.zzh());
    }

    public final void zzg(zzpq zzpqVar, b bVar, zzqb zzqbVar) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpy
            public final /* synthetic */ zzpq zzb;
            public final /* synthetic */ zzqb zzc;
            public final /* synthetic */ b zzd;

            public /* synthetic */ zzpy(zzpq zzpqVar2, zzqb zzqbVar2, b bVar2) {
                r2 = zzpqVar2;
                r3 = zzqbVar2;
                r4 = bVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzpz.this.zzc(r2, r3, r4);
            }
        });
    }
}
