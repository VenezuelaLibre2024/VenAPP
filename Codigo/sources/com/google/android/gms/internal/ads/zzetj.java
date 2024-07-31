package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzetj implements zzexq {
    private final zzgey zza;
    private final Context zzb;

    public zzetj(zzgey zzgeyVar, Context context) {
        this.zza = zzgeyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeti
            public /* synthetic */ zzeti() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetj.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetk zzc() {
        double d10;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) a0.c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            r1 = intExtra == 2 || intExtra == 5;
            d10 = intExtra2 / intExtra3;
        } else {
            d10 = -1.0d;
        }
        return new zzetk(d10, r1);
    }
}
