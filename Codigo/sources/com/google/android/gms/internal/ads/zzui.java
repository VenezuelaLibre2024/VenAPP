package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzui {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzhb zza;
    public final Uri zzb;
    public final Map zzc;

    public zzui(long j10, zzhb zzhbVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.zza = zzhbVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
