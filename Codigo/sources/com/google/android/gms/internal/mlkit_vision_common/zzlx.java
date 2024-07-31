package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzlx implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* JADX INFO: Access modifiers changed from: private */
    public zzlx(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    public /* synthetic */ zzlx(String str, zzlw zzlwVar) {
        this("unusedTag");
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzlx zze(String str) {
        zzlv zzlvVar;
        zzmw.zza();
        if (!zzmw.zzb()) {
            zzlvVar = zzlv.zza;
            return zzlvVar;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.zze;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j10);
    }

    public zzlx zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.zzf;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            zza();
        }
        this.zzf = elapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j10;
        this.zzg = Math.min(this.zzg, j10);
        this.zzh = Math.max(this.zzh, j10);
        if (this.zzc % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.zzb, Long.valueOf(j10), Integer.valueOf(this.zzc), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf((int) (this.zzd / this.zzc)));
            zzmw.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j10) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
