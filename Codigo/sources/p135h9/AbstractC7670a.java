package p135h9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import p438x8.AbstractC12376n;
import p438x8.C12365h;
import p438x8.C12388z;
import p438x8.InterfaceC12382t;

/* renamed from: h9.a */
/* loaded from: classes.dex */
public abstract class AbstractC7670a {
    public static void load(final Context context, final String str, final C12365h c12365h, final AbstractC7671b abstractC7671b) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "AdUnitId cannot be null.");
        C5276s.m13325k(c12365h, "AdRequest cannot be null.");
        C5276s.m13325k(abstractC7671b, "LoadCallback cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: h9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C12365h c12365h2 = c12365h;
                        try {
                            new zzbpz(context2, str2).zza(c12365h2.m39990a(), abstractC7671b);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(c12365h.m39990a(), abstractC7671b);
    }

    public abstract String getAdUnitId();

    public abstract AbstractC12376n getFullScreenContentCallback();

    public abstract InterfaceC12382t getOnPaidEventListener();

    public abstract C12388z getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC12376n abstractC12376n);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(InterfaceC12382t interfaceC12382t);

    public abstract void show(Activity activity);
}
