package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import la.l;

/* loaded from: classes2.dex */
public final class zzchf implements zzgw {
    private final Context zza;
    private final zzgw zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbb zzi;
    private zzhb zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue();

    public zzchf(Context context, zzgw zzgwVar, String str, int i10, zzhy zzhyVar, zzche zzcheVar) {
        this.zza = context;
        this.zzb = zzgwVar;
        this.zzc = str;
        this.zzd = i10;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzem)).booleanValue() || this.zzj) {
            return ((Boolean) a0.c().zza(zzbgc.zzen)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhbVar.zza;
        this.zzh = uri;
        this.zzm = zzhbVar;
        this.zzi = zzbbb.zza(uri);
        zzbay zzbayVar = null;
        if (!((Boolean) a0.c().zza(zzbgc.zzej)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhbVar.zzf;
                this.zzi.zzi = zzfxt.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbayVar = t.e().zzb(this.zzi);
            }
            if (zzbayVar != null && zzbayVar.zze()) {
                this.zzj = zzbayVar.zzg();
                this.zzk = zzbayVar.zzf();
                if (!zzg()) {
                    this.zzf = zzbayVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhbVar.zzf;
            this.zzi.zzi = zzfxt.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long longValue = ((Long) a0.c().zza(this.zzi.zzg ? zzbgc.zzel : zzbgc.zzek)).longValue();
            t.b().b();
            t.f();
            Future zza = zzbbm.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbbn zzbbnVar = (zzbbn) zza.get(longValue, TimeUnit.MILLISECONDS);
                        zzbbnVar.zzd();
                        this.zzj = zzbbnVar.zzf();
                        this.zzk = zzbbnVar.zze();
                        zzbbnVar.zza();
                        if (!zzg()) {
                            this.zzf = zzbbnVar.zzc();
                        }
                    } catch (InterruptedException unused) {
                        zza.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            t.b().b();
            throw null;
        }
        if (this.zzi != null) {
            this.zzm = new zzhb(Uri.parse(this.zzi.zza), null, zzhbVar.zze, zzhbVar.zzf, zzhbVar.zzg, null, zzhbVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            l.a(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
    }
}
