package z8;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import x8.f;
import x8.h;
import x8.n;
import x8.t;
import x8.z;
import z8.a;

/* loaded from: classes.dex */
public abstract class a {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* renamed from: z8.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0543a extends f<a> {
    }

    @Deprecated
    public static void load(Context context, String str, h hVar, int i10, AbstractC0543a abstractC0543a) {
        s.k(context, "Context cannot be null.");
        s.k(str, "adUnitId cannot be null.");
        s.k(hVar, "AdRequest cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.c

                    /* renamed from: a */
                    public final /* synthetic */ Context f32455a;

                    /* renamed from: b */
                    public final /* synthetic */ String f32456b;

                    /* renamed from: c */
                    public final /* synthetic */ h f32457c;

                    /* renamed from: d */
                    public final /* synthetic */ int f32458d;

                    /* renamed from: e */
                    public final /* synthetic */ a.AbstractC0543a f32459e;

                    public /* synthetic */ c(Context context2, String str2, h hVar2, int i102, a.AbstractC0543a abstractC0543a2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = hVar2;
                        r4 = i102;
                        r5 = abstractC0543a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        int i11 = r4;
                        String str2 = r2;
                        h hVar2 = r3;
                        try {
                            new zzbar(context2, str2, hVar2.a(), i11, r5).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context2, str2, hVar2.a(), i102, abstractC0543a2).zza();
    }

    public static void load(Context context, String str, h hVar, AbstractC0543a abstractC0543a) {
        s.k(context, "Context cannot be null.");
        s.k(str, "adUnitId cannot be null.");
        s.k(hVar, "AdRequest cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.b

                    /* renamed from: a */
                    public final /* synthetic */ Context f32451a;

                    /* renamed from: b */
                    public final /* synthetic */ String f32452b;

                    /* renamed from: c */
                    public final /* synthetic */ h f32453c;

                    /* renamed from: d */
                    public final /* synthetic */ a.AbstractC0543a f32454d;

                    public /* synthetic */ b(Context context2, String str2, h hVar2, a.AbstractC0543a abstractC0543a2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = hVar2;
                        r4 = abstractC0543a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        String str2 = r2;
                        h hVar2 = r3;
                        try {
                            new zzbar(context2, str2, hVar2.a(), 3, r4).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context2, str2, hVar2.a(), 3, abstractC0543a2).zza();
    }

    @Deprecated
    public static void load(Context context, String str, y8.a aVar, int i10, AbstractC0543a abstractC0543a) {
        s.k(context, "Context cannot be null.");
        s.k(str, "adUnitId cannot be null.");
        s.k(aVar, "AdManagerAdRequest cannot be null.");
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: z8.d

                    /* renamed from: a */
                    public final /* synthetic */ Context f32460a;

                    /* renamed from: b */
                    public final /* synthetic */ String f32461b;

                    /* renamed from: c */
                    public final /* synthetic */ y8.a f32462c;

                    /* renamed from: d */
                    public final /* synthetic */ int f32463d;

                    /* renamed from: e */
                    public final /* synthetic */ a.AbstractC0543a f32464e;

                    public /* synthetic */ d(Context context2, String str2, y8.a aVar2, int i102, a.AbstractC0543a abstractC0543a2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = aVar2;
                        r4 = i102;
                        r5 = abstractC0543a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        int i11 = r4;
                        String str2 = r2;
                        y8.a aVar2 = r3;
                        try {
                            new zzbar(context2, str2, aVar2.a(), i11, r5).zza();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(context2).zzg(e10, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbar(context2, str2, aVar2.a(), i102, abstractC0543a2).zza();
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
