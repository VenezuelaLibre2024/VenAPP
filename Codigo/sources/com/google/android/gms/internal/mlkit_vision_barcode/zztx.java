package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.d;
import androidx.core.os.h;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zztx {
    private static zzcv zza;
    private static final zzcx zzb = zzcx.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zztn zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zztx(Context context, n nVar, zztn zztnVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zztnVar;
        zzuj.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztr
            public /* synthetic */ zztr() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zztx.this.zzb();
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.zzh = a10.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzts
            public /* synthetic */ zzts() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.this.a();
            }
        });
        zzcx zzcxVar = zzb;
        this.zzj = zzcxVar.containsKey(str) ? DynamiteModule.c(context, (String) zzcxVar.get(str)) : -1;
    }

    static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzcv zzi() {
        synchronized (zztx.class) {
            zzcv zzcvVar = zza;
            if (zzcvVar != null) {
                return zzcvVar;
            }
            h a10 = d.a(Resources.getSystem().getConfiguration());
            zzcs zzcsVar = new zzcs();
            for (int i10 = 0; i10 < a10.g(); i10++) {
                zzcsVar.zzd(c.b(a10.c(i10)));
            }
            zzcv zzf = zzcsVar.zzf();
            zza = zzf;
            return zzf;
        }
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : o.a().b(this.zzi);
    }

    private final boolean zzk(zzpk zzpkVar, long j10, long j11) {
        return this.zzk.get(zzpkVar) == null || j10 - ((Long) this.zzk.get(zzpkVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() {
        return o.a().b(this.zzi);
    }

    public final /* synthetic */ void zzc(zztm zztmVar, zzpk zzpkVar, String str) {
        zztmVar.zzb(zzpkVar);
        String zzd = zztmVar.zzd();
        zzsj zzsjVar = new zzsj();
        zzsjVar.zzb(this.zzc);
        zzsjVar.zzc(this.zzd);
        zzsjVar.zzh(zzi());
        zzsjVar.zzg(Boolean.TRUE);
        zzsjVar.zzl(zzd);
        zzsjVar.zzj(str);
        zzsjVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzsjVar.zzd(10);
        zzsjVar.zzk(Integer.valueOf(this.zzj));
        zztmVar.zzc(zzsjVar);
        this.zze.zza(zztmVar);
    }

    public final void zzd(zztm zztmVar, zzpk zzpkVar) {
        zze(zztmVar, zzpkVar, zzj());
    }

    public final void zze(zztm zztmVar, zzpk zzpkVar, String str) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztt
            public final /* synthetic */ zztm zzb;
            public final /* synthetic */ zzpk zzc;
            public final /* synthetic */ String zzd;

            public /* synthetic */ zztt(zztm zztmVar2, zzpk zzpkVar2, String str2) {
                r2 = zztmVar2;
                r3 = zzpkVar2;
                r4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.zzc(r2, r3, r4);
            }
        });
    }

    public final void zzf(zztw zztwVar, zzpk zzpkVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpkVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzpkVar, Long.valueOf(elapsedRealtime));
            zze(zztwVar.zza(), zzpkVar, zzj());
        }
    }

    public final /* synthetic */ void zzg(zzpk zzpkVar, com.google.mlkit.vision.barcode.internal.h hVar) {
        zzdb zzdbVar = (zzdb) this.zzl.get(zzpkVar);
        if (zzdbVar != null) {
            for (Object obj : zzdbVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzdbVar.zze(obj));
                Collections.sort(arrayList);
                zzoj zzojVar = new zzoj();
                Iterator it = arrayList.iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((Long) it.next()).longValue();
                }
                zzojVar.zza(Long.valueOf(j10 / arrayList.size()));
                zzojVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzojVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzojVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzojVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzojVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(hVar.a(obj, arrayList.size(), zzojVar.zzg()), zzpkVar, zzj());
            }
            this.zzl.remove(zzpkVar);
        }
    }

    public final /* synthetic */ void zzh(zzpk zzpkVar, Object obj, long j10, com.google.mlkit.vision.barcode.internal.h hVar) {
        if (!this.zzl.containsKey(zzpkVar)) {
            this.zzl.put(zzpkVar, zzbz.zzz());
        }
        ((zzdb) this.zzl.get(zzpkVar)).zzt(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpkVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzpkVar, Long.valueOf(elapsedRealtime));
            g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztv
                public final /* synthetic */ zzpk zzb;
                public final /* synthetic */ com.google.mlkit.vision.barcode.internal.h zzc;

                public /* synthetic */ zztv(zzpk zzpkVar2, com.google.mlkit.vision.barcode.internal.h hVar2) {
                    r2 = zzpkVar2;
                    r3 = hVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zztx.this.zzg(r2, r3);
                }
            });
        }
    }
}
