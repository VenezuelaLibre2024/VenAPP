package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w1;
import com.google.android.gms.common.api.a;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcse {
    zzbxy zza;
    zzbxy zzb;
    private final Context zzc;
    private final w1 zzd;
    private final zzeij zze;
    private final zzdtp zzf;
    private final zzgey zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcse(Context context, w1 w1Var, zzeij zzeijVar, zzdtp zzdtpVar, zzgey zzgeyVar, zzgey zzgeyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = w1Var;
        this.zze = zzeijVar;
        this.zzf = zzdtpVar;
        this.zzg = zzgeyVar;
        this.zzh = zzgeyVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzh(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) a0.c().zza(zzbgc.zzjM));
    }

    private final com.google.common.util.concurrent.f zzi(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) a0.c().zza(zzbgc.zzjM)) || this.zzd.zzQ()) {
            return zzgen.zzh(str);
        }
        buildUpon.appendQueryParameter((String) a0.c().zza(zzbgc.zzjN), String.valueOf(random.nextInt(a.e.API_PRIORITY_OTHER)));
        if (inputEvent != null) {
            return zzgen.zzf(zzgen.zzn(zzgee.zzu(this.zze.zza()), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcry
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzcse.this.zzc(buildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.zzh), Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcrz
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzcse.this.zzd(buildUpon, (Throwable) obj);
                }
            }, this.zzg);
        }
        buildUpon.appendQueryParameter((String) a0.c().zza(zzbgc.zzjO), "11");
        return zzgen.zzh(buildUpon.toString());
    }

    public final com.google.common.util.concurrent.f zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgen.zzh(str) : zzgen.zzf(zzi(str, this.zzf.zza(), random), Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcrx
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(str);
            }
        }, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) a0.c().zza(zzbgc.zzjO), "10");
            return zzgen.zzh(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) a0.c().zza(zzbgc.zzjP), "1");
        buildUpon.appendQueryParameter((String) a0.c().zza(zzbgc.zzjO), "12");
        if (str.contains((CharSequence) a0.c().zza(zzbgc.zzjQ))) {
            buildUpon.authority((String) a0.c().zza(zzbgc.zzjR));
        }
        return zzgen.zzn(zzgee.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcsa
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                String str2 = (String) a0.c().zza(zzbgc.zzjO);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgen.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzd(Uri.Builder builder, final Throwable th2) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // java.lang.Runnable
            public final void run() {
                zzcse.this.zzf(th2);
            }
        });
        builder.appendQueryParameter((String) a0.c().zza(zzbgc.zzjO), "9");
        return zzgen.zzh(builder.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Throwable th2) {
        zzbxy zza;
        if (((Boolean) a0.c().zza(zzbgc.zzjT)).booleanValue()) {
            zza = zzbxw.zzc(this.zzc);
            this.zzb = zza;
        } else {
            zza = zzbxw.zza(this.zzc);
            this.zza = zza;
        }
        zza.zzg(th2, "AttributionReporting");
    }

    public final void zzg(String str, zzfny zzfnyVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgen.zzr(zzgen.zzo(zzi(str, this.zzf.zza(), random), ((Integer) a0.c().zza(zzbgc.zzjS)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcsd(this, zzfnyVar, str), this.zzg);
    }
}
