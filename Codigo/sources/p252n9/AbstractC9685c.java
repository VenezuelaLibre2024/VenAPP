package p252n9;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import p438x8.AbstractC12376n;
import p438x8.C12365h;
import p438x8.C12388z;
import p438x8.InterfaceC12382t;
import p438x8.InterfaceC12383u;
import p461y8.C12645a;

/* renamed from: n9.c */
/* loaded from: classes.dex */
public abstract class AbstractC9685c {
    public static void load(final Context context, final String str, final C12365h c12365h, final AbstractC9686d abstractC9686d) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "AdUnitId cannot be null.");
        C5276s.m13325k(c12365h, "AdRequest cannot be null.");
        C5276s.m13325k(abstractC9686d, "LoadCallback cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: n9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C12365h c12365h2 = c12365h;
                        try {
                            new zzcaw(context2, str2).zza(c12365h2.m39990a(), abstractC9686d);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzcec.zze("Loading on UI thread");
        new zzcaw(context, str).zza(c12365h.m39990a(), abstractC9686d);
    }

    public static void load(final Context context, final String str, final C12645a c12645a, final AbstractC9686d abstractC9686d) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "AdUnitId cannot be null.");
        C5276s.m13325k(c12645a, "AdManagerAdRequest cannot be null.");
        C5276s.m13325k(abstractC9686d, "LoadCallback cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcec.zze("Loading on background thread");
                zzcdr.zzb.execute(new Runnable() { // from class: n9.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C12645a c12645a2 = c12645a;
                        try {
                            new zzcaw(context2, str2).zza(c12645a2.m39990a(), abstractC9686d);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzcec.zze("Loading on UI thread");
        new zzcaw(context, str).zza(c12645a.m39990a(), abstractC9686d);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract AbstractC12376n getFullScreenContentCallback();

    public abstract InterfaceC9683a getOnAdMetadataChangedListener();

    public abstract InterfaceC12382t getOnPaidEventListener();

    public abstract C12388z getResponseInfo();

    public abstract InterfaceC9684b getRewardItem();

    public abstract void setFullScreenContentCallback(AbstractC12376n abstractC12376n);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(InterfaceC9683a interfaceC9683a);

    public abstract void setOnPaidEventListener(InterfaceC12382t interfaceC12382t);

    public abstract void setServerSideVerificationOptions(C9687e c9687e);

    public abstract void show(Activity activity, InterfaceC12383u interfaceC12383u);
}
