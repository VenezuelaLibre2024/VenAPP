package y8;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;

/* loaded from: classes.dex */
public abstract class c extends h9.a {
    public static void load(final Context context, final String str, final a aVar, final d dVar) {
        s.k(context, "Context cannot be null.");
        s.k(str, "AdUnitId cannot be null.");
        s.k(aVar, "AdManagerAdRequest cannot be null.");
        s.k(dVar, "LoadCallback cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: y8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        a aVar2 = aVar;
                        try {
                            new zzbpz(context2, str2).zza(aVar2.a(), dVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(aVar.a(), dVar);
    }

    public abstract e getAppEventListener();

    public abstract void setAppEventListener(e eVar);
}
