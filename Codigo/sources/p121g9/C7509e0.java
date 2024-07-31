package p121g9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.util.C5047u1;
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

/* renamed from: g9.e0 */
/* loaded from: classes.dex */
public final class C7509e0 {

    /* renamed from: f */
    private zzfvq f17745f;

    /* renamed from: c */
    private zzcjk f17742c = null;

    /* renamed from: e */
    private boolean f17744e = false;

    /* renamed from: a */
    private String f17740a = null;

    /* renamed from: d */
    private zzfvd f17743d = null;

    /* renamed from: b */
    private String f17741b = null;

    /* renamed from: l */
    private final zzfvs m22842l() {
        zzfvr zzc = zzfvs.zzc();
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkR)).booleanValue() || TextUtils.isEmpty(this.f17741b)) {
            String str = this.f17740a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                m22849f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f17741b);
        }
        return zzc.zzc();
    }

    /* renamed from: m */
    private final void m22843m() {
        if (this.f17745f == null) {
            this.f17745f = new C7507d0(this);
        }
    }

    /* renamed from: a */
    public final synchronized void m22844a(zzcjk zzcjkVar, Context context) {
        this.f17742c = zzcjkVar;
        if (!m22854k(context)) {
            m22849f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        m22848e("on_play_store_bind", hashMap);
    }

    /* renamed from: b */
    public final void m22845b() {
        zzfvd zzfvdVar;
        if (!this.f17744e || (zzfvdVar = this.f17743d) == null) {
            C5047u1.m12726a("LastMileDelivery not connected");
        } else {
            zzfvdVar.zza(m22842l(), this.f17745f);
            m22847d("onLMDOverlayCollapse");
        }
    }

    /* renamed from: c */
    public final void m22846c() {
        zzfvd zzfvdVar;
        if (!this.f17744e || (zzfvdVar = this.f17743d) == null) {
            C5047u1.m12726a("LastMileDelivery not connected");
            return;
        }
        zzfvb zzc = zzfvc.zzc();
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkR)).booleanValue() || TextUtils.isEmpty(this.f17741b)) {
            String str = this.f17740a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                m22849f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f17741b);
        }
        zzfvdVar.zzb(zzc.zzc(), this.f17745f);
    }

    /* renamed from: d */
    final void m22847d(String str) {
        m22848e(str, new HashMap());
    }

    /* renamed from: e */
    final void m22848e(final String str, final Map map) {
        zzcep.zze.execute(new Runnable() { // from class: g9.c0
            @Override // java.lang.Runnable
            public final void run() {
                C7509e0.this.m22851h(str, map);
            }
        });
    }

    /* renamed from: f */
    final void m22849f(String str, String str2) {
        C5047u1.m12726a(str);
        if (this.f17742c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.MESSAGE, str);
            hashMap.put("action", str2);
            m22848e("onError", hashMap);
        }
    }

    /* renamed from: g */
    public final void m22850g() {
        zzfvd zzfvdVar;
        if (!this.f17744e || (zzfvdVar = this.f17743d) == null) {
            C5047u1.m12726a("LastMileDelivery not connected");
        } else {
            zzfvdVar.zzc(m22842l(), this.f17745f);
            m22847d("onLMDOverlayExpand");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m22851h(String str, Map map) {
        zzcjk zzcjkVar = this.f17742c;
        if (zzcjkVar != null) {
            zzcjkVar.zzd(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m22852i(zzfvp zzfvpVar) {
        if (!TextUtils.isEmpty(zzfvpVar.zzb())) {
            if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkR)).booleanValue()) {
                this.f17740a = zzfvpVar.zzb();
            }
        }
        switch (zzfvpVar.zza()) {
            case 8152:
                m22847d("onLMDOverlayOpened");
                return;
            case 8153:
                m22847d("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                m22847d("onLMDOverlayClose");
                return;
            case 8157:
                this.f17740a = null;
                this.f17741b = null;
                this.f17744e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfvpVar.zza()));
                m22848e("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    /* renamed from: j */
    public final void m22853j(zzcjk zzcjkVar, zzfvn zzfvnVar) {
        if (zzcjkVar == null) {
            m22849f("adWebview missing", "onLMDShow");
            return;
        }
        this.f17742c = zzcjkVar;
        if (!this.f17744e && !m22854k(zzcjkVar.getContext())) {
            m22849f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkR)).booleanValue()) {
            this.f17741b = zzfvnVar.zzg();
        }
        m22843m();
        zzfvd zzfvdVar = this.f17743d;
        if (zzfvdVar != null) {
            zzfvdVar.zzd(zzfvnVar, this.f17745f);
        }
    }

    /* renamed from: k */
    public final synchronized boolean m22854k(Context context) {
        if (!zzfwh.zza(context)) {
            return false;
        }
        try {
            this.f17743d = zzfve.zza(context);
        } catch (NullPointerException e10) {
            C5047u1.m12726a("Error connecting LMD Overlay service");
            C4965t.m12580q().zzw(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f17743d == null) {
            this.f17744e = false;
            return false;
        }
        m22843m();
        this.f17744e = true;
        return true;
    }
}
