package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzcif extends zzchw implements zzcgb {
    public static final /* synthetic */ int zzd = 0;
    private zzcgc zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcho zzi;
    private long zzj;
    private long zzk;

    public zzcif(zzcgl zzcglVar, zzcgk zzcgkVar) {
        super(zzcglVar);
        zzcix zzcixVar = new zzcix(zzcglVar.getContext(), zzcgkVar, (zzcgl) this.zzc.get(), null);
        zzcec.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcixVar;
        zzcixVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzcdv.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j10) {
        j2.f8993l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final void run() {
                zzcif.this.zzb();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzchw, com.google.android.gms.common.api.k
    public final void release() {
        zzcgc zzcgcVar = this.zze;
        if (zzcgcVar != null) {
            zzcgcVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzD(int i10, int i11) {
    }

    public final zzcgc zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcgc zzcgcVar = this.zze;
        this.zze = null;
        return zzcgcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcif] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzcif] */
    /* JADX WARN: Type inference failed for: r2v30 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcif zzcifVar;
        zzcif zzcifVar2;
        zzbga c10;
        long longValue;
        long intValue;
        zzcif zzcifVar3;
        long j10;
        long j11;
        String str2;
        long j12;
        String zzc = zzc(this.zzf);
        String str3 = "error";
        try {
            zzbfu zzbfuVar = zzbgc.zzx;
            c10 = a0.c();
            longValue = ((Long) c10.zza(zzbfuVar)).longValue() * 1000;
            intValue = ((Integer) a0.c().zza(zzbgc.zzw)).intValue();
            zzcifVar = ((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue();
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
            str = zzc;
            zzcifVar = this;
        }
        synchronized (this) {
            try {
                long a10 = t.b().a();
                long j13 = this.zzj;
                if (a10 - j13 <= longValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzz = this.zze.zzz();
                            if (zzz > 0) {
                                long zzv = this.zze.zzv();
                                if (zzv != this.zzk) {
                                    try {
                                        j11 = intValue;
                                        str2 = zzc;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        zzcifVar = this;
                                        str = zzc;
                                    }
                                    try {
                                        zzo(this.zzf, zzc, zzv, zzz, zzv > 0, zzcifVar != 0 ? this.zze.zzA() : -1L, zzcifVar != 0 ? this.zze.zzx() : -1L, zzcifVar != 0 ? this.zze.zzB() : -1L, zzcgc.zzs(), zzcgc.zzu());
                                        zzcifVar = this;
                                        j10 = zzv;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzcifVar = this;
                                        str = str2;
                                        throw th;
                                    }
                                    try {
                                        zzcifVar.zzk = j10;
                                        j12 = zzz;
                                        zzcifVar = zzcifVar;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str = str2;
                                        throw th;
                                    }
                                } else {
                                    j10 = zzv;
                                    j11 = intValue;
                                    str2 = zzc;
                                    zzcifVar = this;
                                    j12 = zzz;
                                }
                                if (j10 >= j12) {
                                    zzcifVar.zzj(zzcifVar.zzf, str2, j12);
                                } else {
                                    long zzw = zzcifVar.zze.zzw();
                                    zzcifVar3 = zzcifVar;
                                    if (zzw >= j11) {
                                        zzcifVar3 = zzcifVar;
                                        if (j10 > 0) {
                                        }
                                    }
                                }
                                zzcifVar2 = zzcifVar;
                            } else {
                                zzcifVar3 = this;
                            }
                            zzcifVar3.zzx(((Long) a0.c().zza(zzbgc.zzy)).longValue());
                            return;
                        }
                        zzcifVar2 = this;
                        t.A().zzc(zzcifVar2.zzi);
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = c10;
                        str = j13;
                    }
                } else {
                    str = zzc;
                    zzcifVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th7) {
                        th = th7;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                str = zzc;
                zzcifVar = this;
            }
            try {
                throw th;
            } catch (Exception e11) {
                e = e11;
                String str4 = str3;
                zzcec.zzj("Failed to preload url " + zzcifVar.zzf + " Exception: " + e.getMessage());
                t.q().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcifVar.zzg(zzcifVar.zzf, str, str4, zzd(str4, e));
                zzcifVar2 = zzcifVar;
                t.A().zzc(zzcifVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzi(final boolean z10, final long j10) {
        final zzcgl zzcglVar = (zzcgl) this.zzc.get();
        if (zzcglVar != null) {
            zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgl.this.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzk(String str, Exception exc) {
        zzcec.zzk("Precache error", exc);
        t.q().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzl(String str, Exception exc) {
        zzcec.zzk("Precache exception", exc);
        t.q().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzchw] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzchw
    public final boolean zzu(String str, String[] strArr) {
        ?? r62;
        String str2;
        ?? r52;
        long j10;
        long j11;
        long j12;
        ?? r12;
        long j13;
        String str3;
        long j14;
        long j15;
        zzcif zzcifVar = this;
        String str4 = str;
        zzcifVar.zzf = str4;
        String str5 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            zzcifVar.zze.zzF(uriArr, zzcifVar.zzb);
            zzcgl zzcglVar = (zzcgl) zzcifVar.zzc.get();
            if (zzcglVar != null) {
                zzcglVar.zzt(zzc, zzcifVar);
            }
            la.f b10 = t.b();
            long a10 = b10.a();
            long longValue = ((Long) a0.c().zza(zzbgc.zzy)).longValue();
            long longValue2 = ((Long) a0.c().zza(zzbgc.zzx)).longValue() * 1000;
            long intValue = ((Integer) a0.c().zza(zzbgc.zzw)).intValue();
            boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue();
            long j16 = -1;
            long j17 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (b10.a() - a10 > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (zzcifVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcifVar.zzh) {
                            break;
                        }
                        if (!zzcifVar.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = zzcifVar.zze.zzz();
                        if (zzz > 0) {
                            long zzv = zzcifVar.zze.zzv();
                            if (zzv != j16) {
                                try {
                                    j10 = j17;
                                    long j18 = zzz;
                                    j11 = longValue2;
                                    j13 = longValue;
                                    str3 = zzc;
                                    try {
                                        zzo(str, zzc, zzv, j18, zzv > 0, booleanValue ? zzcifVar.zze.zzA() : -1L, booleanValue ? zzcifVar.zze.zzx() : -1L, booleanValue ? zzcifVar.zze.zzB() : -1L, zzcgc.zzs(), zzcgc.zzu());
                                        j15 = zzv;
                                        j14 = zzz;
                                        r62 = j18;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r52 = this;
                                        r62 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e10) {
                                            e = e10;
                                            String str6 = str5;
                                            zzcec.zzj("Failed to preload url " + r62 + " Exception: " + e.getMessage());
                                            t.q().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r52.zzg(r62, str2, str6, zzd(str6, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r52 = this;
                                    r62 = str;
                                    str2 = zzc;
                                }
                            } else {
                                j10 = j17;
                                j11 = longValue2;
                                j13 = longValue;
                                str3 = zzc;
                                j14 = zzz;
                                j15 = j16;
                                r62 = j17;
                            }
                            r52 = (zzv > j14 ? 1 : (zzv == j14 ? 0 : -1));
                            if (r52 >= 0) {
                                zzj(str, str3, j14);
                                break;
                            }
                            try {
                                zzcif zzcifVar2 = this;
                                r62 = str;
                                str2 = str3;
                                if (zzcifVar2.zze.zzw() >= j10 && zzv > 0) {
                                    break;
                                }
                                j12 = j13;
                                r12 = j15;
                                r52 = zzcifVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        } else {
                            j10 = j17;
                            j11 = longValue2;
                            r62 = str4;
                            str2 = zzc;
                            r52 = zzcifVar;
                            j12 = longValue;
                            r12 = j16;
                        }
                        try {
                            try {
                                r52.wait(j12);
                            } catch (Throwable th5) {
                                th = th5;
                                str5 = r12;
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r62 = str4;
                        str2 = zzc;
                        r52 = zzcifVar;
                    }
                }
                longValue = j12;
                zzcifVar = r52;
                str4 = r62;
                zzc = str2;
                j17 = j10;
                longValue2 = j11;
                j16 = r12;
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            r62 = str4;
            str2 = zzc;
            r52 = zzcifVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzv() {
        zzcec.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final boolean zzw(String str, String[] strArr, zzcho zzchoVar) {
        this.zzf = str;
        this.zzi = zzchoVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcgl zzcglVar = (zzcgl) this.zzc.get();
            if (zzcglVar != null) {
                zzcglVar.zzt(zzc, this);
            }
            this.zzj = t.b().a();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e10) {
            zzcec.zzj("Failed to preload url " + str + " Exception: " + e10.getMessage());
            t.q().zzv(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e10));
            return false;
        }
    }
}
