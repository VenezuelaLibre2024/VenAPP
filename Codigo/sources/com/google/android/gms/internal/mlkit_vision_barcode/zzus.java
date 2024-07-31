package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import com.google.android.gms.common.internal.j;
import com.google.mlkit.common.sdkinternal.n;
import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import zf.b;

/* loaded from: classes2.dex */
public final class zzus {
    private static final j zzf = new j("AutoZoom");
    final zzuu zza;
    final zzbz zzb;
    ScheduledFuture zzc;
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbf zzj;
    private final zztx zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private b zzs;

    private zzus(Context context, zzuu zzuuVar, String str) {
        zzg.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbf zza = zzar.zza();
        zztx zztxVar = new zztx(context, new n(context), new zztq(context, zztp.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzuuVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbz.zzz();
        this.zzi = unconfigurableScheduledExecutorService;
        this.zzj = zza;
        this.zzk = zztxVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zza.zza();
    }

    public static zzus zzd(Context context, String str) {
        return new zzus(context, zzuu.zzb, str);
    }

    public static /* synthetic */ void zzf(zzus zzusVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzusVar.zzh) {
            if (zzusVar.zze == 2 && !zzusVar.zzg.get() && (scheduledFuture = zzusVar.zzc) != null && !scheduledFuture.isCancelled()) {
                if (zzusVar.zzn > 1.0f && zzusVar.zza() >= zzusVar.zza.zzi()) {
                    zzf.e("AutoZoom", "Reset zoom = 1");
                    zzusVar.zzl(1.0f, zzpk.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzus zzusVar, float f10) {
        synchronized (zzusVar.zzh) {
            zzusVar.zzn = f10;
            zzusVar.zzr(false);
        }
    }

    private final float zzp(float f10) {
        float f11 = this.zzo;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        return (f11 <= 0.0f || f10 <= f11) ? f10 : f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzpk zzpkVar, float f10, float f11, zzuv zzuvVar) {
        long convert;
        if (this.zzd != null) {
            zzsb zzsbVar = new zzsb();
            zzsbVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzsbVar.zze(str);
            zzsbVar.zzf(Float.valueOf(f10));
            zzsbVar.zzc(Float.valueOf(f11));
            synchronized (this.zzh) {
                convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzsbVar.zzb(Long.valueOf(convert));
            if (zzuvVar != null) {
                zzsc zzscVar = new zzsc();
                zzscVar.zzc(Float.valueOf(zzuvVar.zzc()));
                zzscVar.zze(Float.valueOf(zzuvVar.zze()));
                zzscVar.zzb(Float.valueOf(zzuvVar.zzb()));
                zzscVar.zzd(Float.valueOf(zzuvVar.zzd()));
                zzscVar.zza(Float.valueOf(0.0f));
                zzsbVar.zzd(zzscVar.zzf());
            }
            zztx zztxVar = this.zzk;
            zzpl zzplVar = new zzpl();
            zzplVar.zzi(zzsbVar.zzh());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpkVar);
        }
    }

    private final void zzr(boolean z10) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            this.zzb.zzs();
            this.zzp = this.zzj.zza();
            if (z10 && (scheduledFuture = this.zzc) != null) {
                scheduledFuture.cancel(false);
                this.zzc = null;
            }
        }
    }

    public final long zza() {
        long convert;
        synchronized (this.zzh) {
            convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzev zzc(float f10) {
        b bVar = this.zzs;
        zzp(f10);
        bVar.getClass();
        int i10 = BarcodeScannerImpl.f13092y;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r13, com.google.android.gms.internal.mlkit_vision_barcode.zzuv r14) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzus.zzi(int, com.google.android.gms.internal.mlkit_vision_barcode.zzuv):void");
    }

    public final void zzj() {
        synchronized (this.zzh) {
            if (this.zze == 4) {
                return;
            }
            zzn(false);
            this.zzi.shutdown();
            this.zze = 4;
        }
    }

    public final void zzk(float f10) {
        synchronized (this.zzh) {
            zzbc.zzc(f10 >= 1.0f);
            this.zzo = f10;
        }
    }

    final void zzl(float f10, zzpk zzpkVar, zzuv zzuvVar) {
        synchronized (this.zzh) {
            if (this.zzm != null && this.zzs != null && this.zze == 2) {
                if (this.zzg.compareAndSet(false, true)) {
                    zzem.zzb(zzem.zzc(new zzup(this, f10), this.zzm), new zzur(this, zzpkVar, this.zzn, zzuvVar, f10), zzew.zza());
                }
            }
        }
    }

    public final void zzm() {
        zzpk zzpkVar;
        float f10;
        synchronized (this.zzh) {
            int i10 = this.zze;
            if (i10 != 2 && i10 != 4) {
                zzr(true);
                this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzus.zzf(zzus.this);
                    }
                }, 500L, 500L, TimeUnit.MILLISECONDS);
                if (this.zze == 1) {
                    this.zzd = UUID.randomUUID().toString();
                    this.zzq = this.zzj.zza();
                    this.zzr = false;
                    zzpkVar = zzpk.SCANNER_AUTO_ZOOM_START;
                    f10 = this.zzn;
                } else {
                    zzpkVar = zzpk.SCANNER_AUTO_ZOOM_RESUME;
                    f10 = this.zzn;
                }
                zzq(zzpkVar, f10, f10, null);
                this.zze = 2;
            }
        }
    }

    public final void zzn(boolean z10) {
        zzpk zzpkVar;
        float f10;
        synchronized (this.zzh) {
            int i10 = this.zze;
            if (i10 != 1 && i10 != 4) {
                zzr(true);
                if (z10) {
                    if (!this.zzr) {
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f11 = this.zzn;
                        zzq(zzpkVar2, f11, f11, null);
                    }
                    zzpkVar = zzpk.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                    f10 = this.zzn;
                } else {
                    zzpkVar = zzpk.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                    f10 = this.zzn;
                }
                zzq(zzpkVar, f10, f10, null);
                this.zzr = false;
                this.zze = 1;
                this.zzd = null;
            }
        }
    }

    public final void zzo(b bVar, Executor executor) {
        this.zzs = bVar;
        this.zzm = executor;
    }
}
