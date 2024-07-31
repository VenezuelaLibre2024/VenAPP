package n9;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import x8.n;
import x8.t;
import x8.u;
import x8.z;

/* loaded from: classes.dex */
public abstract class c {
    public static void load(final Context context, final String str, final x8.h hVar, final d dVar) {
        s.k(context, "Context cannot be null.");
        s.k(str, "AdUnitId cannot be null.");
        s.k(hVar, "AdRequest cannot be null.");
        s.k(dVar, "LoadCallback cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: n9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        x8.h hVar2 = hVar;
                        try {
                            new zzcaw(context2, str2).zza(hVar2.a(), dVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzcec.zze("Loading on UI thread");
        new zzcaw(context, str).zza(hVar.a(), dVar);
    }

    public static void load(final Context context, final String str, final y8.a aVar, final d dVar) {
        s.k(context, "Context cannot be null.");
        s.k(str, "AdUnitId cannot be null.");
        s.k(aVar, "AdManagerAdRequest cannot be null.");
        s.k(dVar, "LoadCallback cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcec.zze("Loading on background thread");
                zzcdr.zzb.execute(new Runnable() { // from class: n9.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        y8.a aVar2 = aVar;
                        try {
                            new zzcaw(context2, str2).zza(aVar2.a(), dVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzcec.zze("Loading on UI thread");
        new zzcaw(context, str).zza(aVar.a(), dVar);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract n getFullScreenContentCallback();

    public abstract a getOnAdMetadataChangedListener();

    public abstract t getOnPaidEventListener();

    public abstract z getResponseInfo();

    public abstract b getRewardItem();

    public abstract void setFullScreenContentCallback(n nVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(t tVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, u uVar);
}
