package l9;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzfhl;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzgey;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import x8.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21027a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f21028b;

    /* renamed from: c, reason: collision with root package name */
    private final zzavi f21029c;

    /* renamed from: d, reason: collision with root package name */
    private final zzfhl f21030d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21031e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdwk f21032f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21033g;

    /* renamed from: h, reason: collision with root package name */
    private final zzgey f21034h = zzcep.zze;

    /* renamed from: i, reason: collision with root package name */
    private final zzfny f21035i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(WebView webView, zzavi zzaviVar, zzdwk zzdwkVar, zzfny zzfnyVar, zzfhl zzfhlVar) {
        this.f21028b = webView;
        Context context = webView.getContext();
        this.f21027a = context;
        this.f21029c = zzaviVar;
        this.f21032f = zzdwkVar;
        zzbgc.zza(context);
        this.f21031e = ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjq)).intValue();
        this.f21033g = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjr)).booleanValue();
        this.f21035i = zzfnyVar;
        this.f21030d = zzfhlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(Bundle bundle, m9.b bVar) {
        CookieManager a10 = com.google.android.gms.ads.internal.t.s().a(this.f21027a);
        bundle.putBoolean("accept_3p_cookie", a10 != null ? a10.acceptThirdPartyCookies(this.f21028b) : false);
        m9.a.a(this.f21027a, x8.c.BANNER, new h.a().b(AdMobAdapter.class, bundle).k(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str) {
        zzfhl zzfhlVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzlr)).booleanValue() || (zzfhlVar = this.f21030d) == null) ? this.f21029c.zza(parse, this.f21027a, this.f21028b, null) : zzfhlVar.zza(parse, this.f21027a, this.f21028b, null);
        } catch (zzavj e10) {
            zzcec.zzf("Failed to append the click signal to URL: ", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.f21035i.zzc(parse.toString(), null);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long a10 = com.google.android.gms.ads.internal.t.b().a();
            String zze = this.f21029c.zzc().zze(this.f21027a, str, this.f21028b);
            if (this.f21033g) {
                y.c(this.f21032f, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.t.b().a() - a10)));
            }
            return zze;
        } catch (RuntimeException e10) {
            zzcec.zzh("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            zzcec.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcep.zza.zzb(new Callable() { // from class: l9.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return a.this.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f21031e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzh("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.t.r();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final t tVar = new t(this, uuid);
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjt)).booleanValue()) {
            this.f21034h.execute(new Runnable() { // from class: l9.s
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(bundle, tVar);
                }
            });
        } else {
            m9.a.a(this.f21027a, x8.c.BANNER, new h.a().b(AdMobAdapter.class, bundle).k(), tVar);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long a10 = com.google.android.gms.ads.internal.t.b().a();
            String zzh = this.f21029c.zzc().zzh(this.f21027a, this.f21028b, null);
            if (this.f21033g) {
                y.c(this.f21032f, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.t.b().a() - a10)));
            }
            return zzh;
        } catch (RuntimeException e10) {
            zzcec.zzh("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzcec.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcep.zza.zzb(new Callable() { // from class: l9.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return a.this.getViewSignals();
                }
            }).get(Math.min(i10, this.f21031e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzh("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjv)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcep.zza.execute(new Runnable() { // from class: l9.q
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            if (i13 != 0) {
                int i16 = 1;
                if (i13 != 1) {
                    i16 = 2;
                    if (i13 != 2) {
                        i16 = 3;
                        i15 = i13 != 3 ? -1 : 0;
                    }
                }
                i14 = i16;
                this.f21029c.zzd(MotionEvent.obtain(0L, i12, i14, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.f21029c.zzd(MotionEvent.obtain(0L, i12, i14, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e11) {
            e = e11;
            zzcec.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.t.q().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e12) {
            e = e12;
            zzcec.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.t.q().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i14 = i15;
    }
}
