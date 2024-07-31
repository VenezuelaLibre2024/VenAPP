package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzeah {
    private final zzgey zza;
    private final zzgey zzb;
    private final zzebo zzc;
    private final zzhgx zzd;

    public zzeah(zzgey zzgeyVar, zzgey zzgeyVar2, zzebo zzeboVar, zzhgx zzhgxVar) {
        this.zza = zzgeyVar;
        this.zzb = zzgeyVar2;
        this.zzc = zzeboVar;
        this.zzd = zzhgxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzbze zzbzeVar, int i10, zzecf zzecfVar) {
        return ((zzeem) this.zzd.zzb()).zzc(zzbzeVar, i10);
    }

    public final com.google.common.util.concurrent.f zzb(final zzbze zzbzeVar) {
        com.google.common.util.concurrent.f zzf;
        String str = zzbzeVar.zzd;
        t.r();
        if (j2.b(str)) {
            zzf = zzgen.zzg(new zzecf(1));
        } else {
            zzf = zzgen.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeae
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeah.this.zzc(zzbzeVar);
                }
            }), ExecutionException.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeaf
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzgen.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgen.zzf(zzf, zzecf.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeag
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzeah.this.zza(zzbzeVar, callingUid, (zzecf) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzc(zzbze zzbzeVar) {
        zzceu zzceuVar;
        final zzebo zzeboVar = this.zzc;
        synchronized (zzeboVar.zzb) {
            if (zzeboVar.zzc) {
                zzceuVar = zzeboVar.zza;
            } else {
                zzeboVar.zzc = true;
                zzeboVar.zze = zzbzeVar;
                zzeboVar.zzf.checkAvailabilityAndConnect();
                zzeboVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzebo.this.zza();
                    }
                }, zzcep.zzf);
                zzceuVar = zzeboVar.zza;
            }
        }
        return (InputStream) zzceuVar.get(((Integer) a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS);
    }
}
