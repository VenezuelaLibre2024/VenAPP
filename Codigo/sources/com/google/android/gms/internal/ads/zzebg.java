package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzebg implements zzece {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzeah zzb;
    private final zzgey zzc;
    private final zzfhh zzd;
    private final ScheduledExecutorService zze;
    private final zzegc zzf;
    private final zzfmz zzg;
    private final Context zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebg(Context context, zzfhh zzfhhVar, zzeah zzeahVar, zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, zzegc zzegcVar, zzfmz zzfmzVar) {
        this.zzh = context;
        this.zzd = zzfhhVar;
        this.zzb = zzeahVar;
        this.zzc = zzgeyVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzegcVar;
        this.zzg = zzfmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final com.google.common.util.concurrent.f zzb(zzbze zzbzeVar) {
        Context context = this.zzh;
        com.google.common.util.concurrent.f zzb = this.zzb.zzb(zzbzeVar);
        zzfmo zza2 = zzfmn.zza(context, 11);
        zzfmy.zzd(zzb, zza2);
        com.google.common.util.concurrent.f zzn = zzgen.zzn(zzb, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzebg.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) a0.c().zza(zzbgc.zzfv)).booleanValue()) {
            zzn = zzgen.zzf(zzgen.zzo(zzn, ((Integer) a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzebe
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzgen.zzg(new zzead(5));
                }
            }, zzcep.zzf);
        }
        zzfmy.zza(zzn, this.zzg, zza2);
        zzgen.zzr(zzn, new zzebf(this), zzcep.zzf);
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(InputStream inputStream) {
        return zzgen.zzh(new zzfgy(new zzfgv(this.zzd), zzfgx.zza(new InputStreamReader(inputStream))));
    }
}
