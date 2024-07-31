package p483z8;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import p438x8.AbstractC12361f;
import p438x8.AbstractC12376n;
import p438x8.C12365h;
import p438x8.C12388z;
import p438x8.InterfaceC12382t;
import p461y8.C12645a;

/* renamed from: z8.a */
/* loaded from: classes.dex */
public abstract class AbstractC12824a {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* renamed from: z8.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC12361f<AbstractC12824a> {
    }

    @Deprecated
    public static void load(final Context context, final String str, final C12365h c12365h, final int i10, final a aVar) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "adUnitId cannot be null.");
        C5276s.m13325k(c12365h, "AdRequest cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i11 = i10;
                        String str2 = str;
                        C12365h c12365h2 = c12365h;
                        try {
                            new zzbar(context2, str2, c12365h2.m39990a(), i11, aVar).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context, str, c12365h.m39990a(), i10, aVar).zza();
    }

    public static void load(final Context context, final String str, final C12365h c12365h, final a aVar) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "adUnitId cannot be null.");
        C5276s.m13325k(c12365h, "AdRequest cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C12365h c12365h2 = c12365h;
                        try {
                            new zzbar(context2, str2, c12365h2.m39990a(), 3, aVar).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context, str, c12365h.m39990a(), 3, aVar).zza();
    }

    @Deprecated
    public static void load(final Context context, final String str, final C12645a c12645a, final int i10, final a aVar) {
        C5276s.m13325k(context, "Context cannot be null.");
        C5276s.m13325k(str, "adUnitId cannot be null.");
        C5276s.m13325k(c12645a, "AdManagerAdRequest cannot be null.");
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i11 = i10;
                        String str2 = str;
                        C12645a c12645a2 = c12645a;
                        try {
                            new zzbar(context2, str2, c12645a2.m39990a(), i11, aVar).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context, str, c12645a.m39990a(), i10, aVar).zza();
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
