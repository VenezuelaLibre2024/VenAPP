package o9;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcdr;
import n9.e;
import x8.h;
import x8.n;
import x8.t;
import x8.u;
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
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: o9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        h hVar2 = hVar;
                        try {
                            new zzcbh(context2, str2).zza(hVar2.a(), bVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbh(context, str).zza(hVar.a(), bVar);
    }

    public static void load(final Context context, final String str, final y8.a aVar, final b bVar) {
        s.k(context, "Context cannot be null.");
        s.k(str, "AdUnitId cannot be null.");
        s.k(aVar, "AdManagerAdRequest cannot be null.");
        s.k(bVar, "LoadCallback cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: o9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        y8.a aVar2 = aVar;
                        try {
                            new zzcbh(context2, str2).zza(aVar2.a(), bVar);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbh(context, str).zza(aVar.a(), bVar);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract n getFullScreenContentCallback();

    public abstract n9.a getOnAdMetadataChangedListener();

    public abstract t getOnPaidEventListener();

    public abstract z getResponseInfo();

    public abstract n9.b getRewardItem();

    public abstract void setFullScreenContentCallback(n nVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(n9.a aVar);

    public abstract void setOnPaidEventListener(t tVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, u uVar);
}
