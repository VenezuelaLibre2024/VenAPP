package p218l9;

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
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
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
import p237m9.AbstractC9555b;
import p237m9.C9554a;
import p438x8.C12365h;
import p438x8.EnumC12355c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.a */
/* loaded from: classes.dex */
public final class C9411a {

    /* renamed from: a */
    private final Context f22858a;

    /* renamed from: b */
    private final WebView f22859b;

    /* renamed from: c */
    private final zzavi f22860c;

    /* renamed from: d */
    private final zzfhl f22861d;

    /* renamed from: e */
    private final int f22862e;

    /* renamed from: f */
    private final zzdwk f22863f;

    /* renamed from: g */
    private final boolean f22864g;

    /* renamed from: h */
    private final zzgey f22865h = zzcep.zze;

    /* renamed from: i */
    private final zzfny f22866i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9411a(WebView webView, zzavi zzaviVar, zzdwk zzdwkVar, zzfny zzfnyVar, zzfhl zzfhlVar) {
        this.f22859b = webView;
        Context context = webView.getContext();
        this.f22858a = context;
        this.f22860c = zzaviVar;
        this.f22863f = zzdwkVar;
        zzbgc.zza(context);
        this.f22862e = ((Integer) C4784a0.m12365c().zza(zzbgc.zzjq)).intValue();
        this.f22864g = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzjr)).booleanValue();
        this.f22866i = zzfnyVar;
        this.f22861d = zzfhlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m28044b(Bundle bundle, AbstractC9555b abstractC9555b) {
        CookieManager mo12605a = C4965t.m12582s().mo12605a(this.f22858a);
        bundle.putBoolean("accept_3p_cookie", mo12605a != null ? mo12605a.acceptThirdPartyCookies(this.f22859b) : false);
        C9554a.m28444a(this.f22858a, EnumC12355c.BANNER, new C12365h.a().m39941b(AdMobAdapter.class, bundle).m39991k(), abstractC9555b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m28045c(String str) {
        zzfhl zzfhlVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzlr)).booleanValue() || (zzfhlVar = this.f22861d) == null) ? this.f22860c.zza(parse, this.f22858a, this.f22859b, null) : zzfhlVar.zza(parse, this.f22858a, this.f22859b, null);
        } catch (zzavj e10) {
            zzcec.zzf("Failed to append the click signal to URL: ", e10);
            C4965t.m12580q().zzw(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.f22866i.zzc(parse.toString(), null);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long mo28130a = C4965t.m12565b().mo28130a();
            String zze = this.f22860c.zzc().zze(this.f22858a, str, this.f22859b);
            if (this.f22864g) {
                C9454y.m28109c(this.f22863f, null, "csg", new Pair("clat", String.valueOf(C4965t.m12565b().mo28130a() - mo28130a)));
            }
            return zze;
        } catch (RuntimeException e10) {
            zzcec.zzh("Exception getting click signals. ", e10);
            C4965t.m12580q().zzw(e10, "TaggingLibraryJsInterface.getClickSignals");
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
                    return C9411a.this.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f22862e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzh("Exception getting click signals with timeout. ", e10);
            C4965t.m12580q().zzw(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        C4965t.m12581r();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final C9449t c9449t = new C9449t(this, uuid);
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjt)).booleanValue()) {
            this.f22865h.execute(new Runnable() { // from class: l9.s
                @Override // java.lang.Runnable
                public final void run() {
                    C9411a.this.m28044b(bundle, c9449t);
                }
            });
        } else {
            C9554a.m28444a(this.f22858a, EnumC12355c.BANNER, new C12365h.a().m39941b(AdMobAdapter.class, bundle).m39991k(), c9449t);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long mo28130a = C4965t.m12565b().mo28130a();
            String zzh = this.f22860c.zzc().zzh(this.f22858a, this.f22859b, null);
            if (this.f22864g) {
                C9454y.m28109c(this.f22863f, null, "vsg", new Pair("vlat", String.valueOf(C4965t.m12565b().mo28130a() - mo28130a)));
            }
            return zzh;
        } catch (RuntimeException e10) {
            zzcec.zzh("Exception getting view signals. ", e10);
            C4965t.m12580q().zzw(e10, "TaggingLibraryJsInterface.getViewSignals");
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
                    return C9411a.this.getViewSignals();
                }
            }).get(Math.min(i10, this.f22862e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzh("Exception getting view signals with timeout. ", e10);
            C4965t.m12580q().zzw(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzjv)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcep.zza.execute(new Runnable() { // from class: l9.q
            @Override // java.lang.Runnable
            public final void run() {
                C9411a.this.m28045c(str);
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
                this.f22860c.zzd(MotionEvent.obtain(0L, i12, i14, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.f22860c.zzd(MotionEvent.obtain(0L, i12, i14, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e11) {
            e = e11;
            zzcec.zzh("Failed to parse the touch string. ", e);
            C4965t.m12580q().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e12) {
            e = e12;
            zzcec.zzh("Failed to parse the touch string. ", e);
            C4965t.m12580q().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i14 = i15;
    }
}
