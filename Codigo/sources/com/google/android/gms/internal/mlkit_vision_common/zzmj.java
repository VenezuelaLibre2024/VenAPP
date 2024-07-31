package com.google.android.gms.internal.mlkit_vision_common;

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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, n nVar, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            public /* synthetic */ zzmg() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzmj.this.zza();
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.zzh = a10.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            public /* synthetic */ zzmh() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.this.a();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.c(context, (String) zzrVar.get(str)) : -1;
    }

    private static synchronized zzp zzd() {
        synchronized (zzmj.class) {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            h a10 = d.a(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i10 = 0; i10 < a10.g(); i10++) {
                zzmVar.zzb(c.b(a10.c(i10)));
            }
            zzp zzc = zzmVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    public final /* synthetic */ String zza() {
        return o.a().b(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String zzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(zzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, zziv zzivVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && elapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(elapsedRealtime));
        int i10 = zzmtVar.zza;
        int i11 = zzmtVar.zzb;
        int i12 = zzmtVar.zzc;
        int i13 = zzmtVar.zzd;
        int i14 = zzmtVar.zze;
        long j10 = zzmtVar.zzf;
        int i15 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        zzinVar.zzd(i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP);
        zzinVar.zzf(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP);
        zzinVar.zzc(Integer.valueOf(i12));
        zzinVar.zze(Integer.valueOf(i13));
        zzinVar.zzg(Integer.valueOf(i14));
        zzinVar.zzb(Long.valueOf(j10));
        zzinVar.zzh(Integer.valueOf(i15));
        zziq zzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zzj);
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            public final /* synthetic */ zzmb zzb;
            public final /* synthetic */ zziv zzc;
            public final /* synthetic */ String zzd;

            public /* synthetic */ zzmi(zzmb zzmbVar, zziv zzivVar2, String str) {
                r2 = zzmbVar;
                r3 = zzivVar2;
                r4 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzmj.this.zzb(r2, r3, r4);
            }
        });
    }
}
