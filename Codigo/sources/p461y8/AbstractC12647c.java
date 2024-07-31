package p461y8;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import p135h9.AbstractC7670a;

/* renamed from: y8.c */
/* loaded from: classes.dex */
public abstract class AbstractC12647c extends AbstractC7670a {
    public static void load(final Context context, final String str, final C12645a c12645a, final AbstractC12648d abstractC12648d) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "AdUnitId cannot be null.");
        C5276s.m13325k(c12645a, "AdManagerAdRequest cannot be null.");
        C5276s.m13325k(abstractC12648d, "LoadCallback cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: y8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C12645a c12645a2 = c12645a;
                        try {
                            new zzbpz(context2, str2).zza(c12645a2.m39990a(), abstractC12648d);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(c12645a.m39990a(), abstractC12648d);
    }

    public abstract InterfaceC12649e getAppEventListener();

    public abstract void setAppEventListener(InterfaceC12649e interfaceC12649e);
}
