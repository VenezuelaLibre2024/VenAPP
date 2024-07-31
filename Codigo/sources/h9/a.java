package h9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import x8.h;
import x8.n;
import x8.t;
import x8.z;

/* loaded from: classes.dex */
public abstract class a {
    public static void load(final Context context, final String str, final h hVar, final b bVar) {
        s.k(context, "Context cannot be null.");
        s.k(str, "AdUnitId cannot be null.");
        s.k(hVar, "AdRequest cannot be null.");
        s.k(bVar, "LoadCallback cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: h9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        h hVar2 = hVar;
                        try {
                            new zzbpz(context2, str2).zza(hVar2.a(), bVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(hVar.a(), bVar);
    }

    public abstract String getAdUnitId();

    public abstract n getFullScreenContentCallback();

    public abstract t getOnPaidEventListener();

    public abstract z getResponseInfo();

    public abstract void setFullScreenContentCallback(n nVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(t tVar);

    public abstract void show(Activity activity);
}
