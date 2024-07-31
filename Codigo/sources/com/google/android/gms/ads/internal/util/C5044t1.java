package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzces;
import com.google.common.util.concurrent.InterfaceFutureC5920f;

/* renamed from: com.google.android.gms.ads.internal.util.t1 */
/* loaded from: classes.dex */
public final class C5044t1 {
    /* renamed from: a */
    public static void m12725a(Context context) {
        int i10 = zzceb.zza;
        if (((Boolean) zzbhw.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || zzceb.zzl()) {
                    return;
                }
                InterfaceFutureC5920f zzb = new C4976c1(context).zzb();
                zzcec.zzi("Updating ad debug logging enablement.");
                zzces.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                zzcec.zzk("Fail to determine debug setting.", e10);
            }
        }
    }
}
