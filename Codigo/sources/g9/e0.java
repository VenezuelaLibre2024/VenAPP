package g9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzfvb;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfvp;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfvs;
import com.google.android.gms.internal.ads.zzfwh;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    private zzfvq f16116f;

    /* renamed from: c, reason: collision with root package name */
    private zzcjk f16113c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16115e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f16111a = null;

    /* renamed from: d, reason: collision with root package name */
    private zzfvd f16114d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f16112b = null;

    private final zzfvs l() {
        zzfvr zzc = zzfvs.zzc();
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkR)).booleanValue() || TextUtils.isEmpty(this.f16112b)) {
            String str = this.f16111a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f16112b);
        }
        return zzc.zzc();
    }

    private final void m() {
        if (this.f16116f == null) {
            this.f16116f = new d0(this);
        }
    }

    public final synchronized void a(zzcjk zzcjkVar, Context context) {
        this.f16113c = zzcjkVar;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        e("on_play_store_bind", hashMap);
    }

    public final void b() {
        zzfvd zzfvdVar;
        if (!this.f16115e || (zzfvdVar = this.f16114d) == null) {
            u1.a("LastMileDelivery not connected");
        } else {
            zzfvdVar.zza(l(), this.f16116f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        zzfvd zzfvdVar;
        if (!this.f16115e || (zzfvdVar = this.f16114d) == null) {
            u1.a("LastMileDelivery not connected");
            return;
        }
        zzfvb zzc = zzfvc.zzc();
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkR)).booleanValue() || TextUtils.isEmpty(this.f16112b)) {
            String str = this.f16111a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f16112b);
        }
        zzfvdVar.zzb(zzc.zzc(), this.f16116f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        zzcep.zze.execute(new Runnable() { // from class: g9.c0
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.h(str, map);
            }
        });
    }

    final void f(String str, String str2) {
        u1.a(str);
        if (this.f16113c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.MESSAGE, str);
            hashMap.put("action", str2);
            e("onError", hashMap);
        }
    }

    public final void g() {
        zzfvd zzfvdVar;
        if (!this.f16115e || (zzfvdVar = this.f16114d) == null) {
            u1.a("LastMileDelivery not connected");
        } else {
            zzfvdVar.zzc(l(), this.f16116f);
            d("onLMDOverlayExpand");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, Map map) {
        zzcjk zzcjkVar = this.f16113c;
        if (zzcjkVar != null) {
            zzcjkVar.zzd(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(zzfvp zzfvpVar) {
        if (!TextUtils.isEmpty(zzfvpVar.zzb())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkR)).booleanValue()) {
                this.f16111a = zzfvpVar.zzb();
            }
        }
        switch (zzfvpVar.zza()) {
            case 8152:
                d("onLMDOverlayOpened");
                return;
            case 8153:
                d("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                d("onLMDOverlayClose");
                return;
            case 8157:
                this.f16111a = null;
                this.f16112b = null;
                this.f16115e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfvpVar.zza()));
                e("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void j(zzcjk zzcjkVar, zzfvn zzfvnVar) {
        if (zzcjkVar == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f16113c = zzcjkVar;
        if (!this.f16115e && !k(zzcjkVar.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkR)).booleanValue()) {
            this.f16112b = zzfvnVar.zzg();
        }
        m();
        zzfvd zzfvdVar = this.f16114d;
        if (zzfvdVar != null) {
            zzfvdVar.zzd(zzfvnVar, this.f16116f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!zzfwh.zza(context)) {
            return false;
        }
        try {
            this.f16114d = zzfve.zza(context);
        } catch (NullPointerException e10) {
            u1.a("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.t.q().zzw(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f16114d == null) {
            this.f16115e = false;
            return false;
        }
        m();
        this.f16115e = true;
        return true;
    }
}
