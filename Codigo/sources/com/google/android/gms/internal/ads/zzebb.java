package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzebb {
    private final ScheduledExecutorService zza;
    private final zzgey zzb;
    private final zzgey zzc;
    private final zzebs zzd;
    private final zzhgx zze;

    public zzebb(ScheduledExecutorService scheduledExecutorService, zzgey zzgeyVar, zzgey zzgeyVar2, zzebs zzebsVar, zzhgx zzhgxVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgeyVar;
        this.zzc = zzgeyVar2;
        this.zzd = zzebsVar;
        this.zze = zzhgxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzbze zzbzeVar, int i10, Throwable th2) {
        return ((zzeem) this.zze.zzb()).zzd(zzbzeVar, i10);
    }

    public final com.google.common.util.concurrent.f zzb(final zzbze zzbzeVar) {
        com.google.common.util.concurrent.f zzb;
        String str = zzbzeVar.zzd;
        t.r();
        if (j2.b(str)) {
            zzb = zzgen.zzg(new zzecf(1));
        } else {
            zzb = ((Boolean) a0.c().zza(zzbgc.zzhA)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzebb.this.zzc(zzbzeVar);
                }
            }) : this.zzd.zzb(zzbzeVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgen.zzf((zzgee) zzgen.zzo(zzgee.zzu(zzb), ((Integer) a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzebb.this.zza(zzbzeVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzc(zzbze zzbzeVar) {
        return (InputStream) this.zzd.zzb(zzbzeVar).get(((Integer) a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS);
    }
}
