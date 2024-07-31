package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.j2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import la.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdlx implements zzdni {
    private t1 zzB;
    private final Context zza;
    private final zzdnl zzb;
    private final JSONObject zzc;
    private final zzdrz zzd;
    private final zzdna zze;
    private final zzavi zzf;
    private final zzdbp zzg;
    private final zzdav zzh;
    private final zzdis zzi;
    private final zzfgm zzj;
    private final zzcei zzk;
    private final zzfhh zzl;
    private final zzctb zzm;
    private final zzdoe zzn;
    private final la.f zzo;
    private final zzdio zzp;
    private final zzfny zzq;
    private final zzfmz zzr;
    private final zzehs zzs;
    private boolean zzu;
    private boolean zzt = false;
    private boolean zzv = false;
    private boolean zzw = false;
    private Point zzx = new Point();
    private Point zzy = new Point();
    private long zzz = 0;
    private long zzA = 0;

    public zzdlx(Context context, zzdnl zzdnlVar, JSONObject jSONObject, zzdrz zzdrzVar, zzdna zzdnaVar, zzavi zzaviVar, zzdbp zzdbpVar, zzdav zzdavVar, zzdis zzdisVar, zzfgm zzfgmVar, zzcei zzceiVar, zzfhh zzfhhVar, zzctb zzctbVar, zzdoe zzdoeVar, la.f fVar, zzdio zzdioVar, zzfny zzfnyVar, zzfmz zzfmzVar, zzehs zzehsVar) {
        this.zza = context;
        this.zzb = zzdnlVar;
        this.zzc = jSONObject;
        this.zzd = zzdrzVar;
        this.zze = zzdnaVar;
        this.zzf = zzaviVar;
        this.zzg = zzdbpVar;
        this.zzh = zzdavVar;
        this.zzi = zzdisVar;
        this.zzj = zzfgmVar;
        this.zzk = zzceiVar;
        this.zzl = zzfhhVar;
        this.zzm = zzctbVar;
        this.zzn = zzdoeVar;
        this.zzo = fVar;
        this.zzp = zzdioVar;
        this.zzq = zzfnyVar;
        this.zzr = zzfmzVar;
        this.zzs = zzehsVar;
    }

    private final String zzD(View view) {
        if (!((Boolean) a0.c().zza(zzbgc.zzdp)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            zzcec.zzg("Exception getting data.");
            return null;
        }
    }

    private final String zzE(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc == 1) {
            return "1099";
        }
        if (zzc == 2) {
            return "2099";
        }
        if (zzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzF(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzH(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        zzdrz zzdrzVar;
        String str2;
        zzbng zzdlsVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) a0.c().zza(zzbgc.zzdp)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            t.r();
            DisplayMetrics U = j2.U((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", x.b().zzb(context, U.widthPixels));
                jSONObject7.put("height", x.b().zzb(context, U.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) a0.c().zza(zzbgc.zzit)).booleanValue()) {
                zzdrzVar = this.zzd;
                str2 = "/clickRecorded";
                zzdlsVar = new zzdlu(this, null);
            } else {
                zzdrzVar = this.zzd;
                str2 = "/logScionEvent";
                zzdlsVar = new zzdls(this, null);
            }
            zzdrzVar.zzi(str2, zzdlsVar);
            this.zzd.zzi("/nativeImpression", new zzdlw(this, null));
            zzces.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzt) {
                return true;
            }
            this.zzt = t.u().n(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e10) {
            zzcec.zzh("Unable to create impression JSON.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzB() {
        return zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzC(Bundle bundle) {
        if (zzF("impression_reporting")) {
            return zzH(null, null, null, null, ((Boolean) a0.c().zza(zzbgc.zzkP)).booleanValue() ? zzD(null) : null, x.b().zzj(bundle, null), false);
        }
        zzcec.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject d10 = b1.d(context, map, map2, view, scaleType);
        JSONObject g10 = b1.g(context, view);
        JSONObject f10 = b1.f(view);
        JSONObject e10 = b1.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d10);
            jSONObject.put("ad_view_signal", g10);
            jSONObject.put("scroll_view_signal", f10);
            jSONObject.put("lock_screen_signal", e10);
            return jSONObject;
        } catch (JSONException e11) {
            zzcec.zzh("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzw && zzG()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e10) {
            zzcec.zzh("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzg() {
        try {
            t1 t1Var = this.zzB;
            if (t1Var != null) {
                t1Var.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzj(x1 x1Var) {
        try {
            if (this.zzv) {
                return;
            }
            if (x1Var == null) {
                zzdna zzdnaVar = this.zze;
                if (zzdnaVar.zzk() != null) {
                    this.zzv = true;
                    this.zzq.zzc(zzdnaVar.zzk().zzf(), this.zzr);
                    zzg();
                    return;
                }
            }
            this.zzv = true;
            this.zzq.zzc(x1Var.zzf(), this.zzr);
            zzg();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject d10 = b1.d(context, map, map2, view2, scaleType);
        JSONObject g10 = b1.g(context, view2);
        JSONObject f10 = b1.f(view2);
        JSONObject e10 = b1.e(context, view2);
        String zzE = zzE(view, map);
        zzn(true == ((Boolean) a0.c().zza(zzbgc.zzdw)).booleanValue() ? view2 : view, g10, d10, f10, e10, zzE, b1.c(zzE, context, this.zzy, this.zzx), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            zzcec.zze("Click data is null. No click is reported.");
        } else if (!zzF("click_reporting")) {
            zzcec.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, x.b().zzj(bundle, null), false, false);
        }
    }

    protected final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbjb zzbjbVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbjbVar != null && zzbjbVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(Constants.TIMESTAMP, this.zzo.a());
            if (this.zzw && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                zzcec.zzh("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) a0.c().zza(zzbgc.zzez)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) a0.c().zza(zzbgc.zzix)).booleanValue() && p.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) a0.c().zza(zzbgc.zziy)).booleanValue() && p.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a10 = this.zzo.a();
            jSONObject9.put("time_from_last_touch_down", a10 - this.zzz);
            jSONObject9.put("time_from_last_touch", a10 - this.zzA);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzaj) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzs.zzp(string, this.zze);
                }
            }
            zzces.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            zzcec.zzh("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzw) {
                zzcec.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                zzcec.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject d10 = b1.d(this.zza, map, map2, view2, scaleType);
        JSONObject g10 = b1.g(this.zza, view2);
        JSONObject f10 = b1.f(view2);
        JSONObject e10 = b1.e(this.zza, view2);
        String zzE = zzE(view, map);
        JSONObject c10 = b1.c(zzE, this.zza, this.zzy, this.zzx);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzy;
                Point point2 = this.zzx;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e11) {
                        e = e11;
                        zzcec.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, g10, d10, f10, e10, zzE, c10, null, z10, true);
                    }
                } catch (Exception e12) {
                    e = e12;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e13) {
                zzcec.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e13);
                t.q().zzw(e13, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, g10, d10, f10, e10, zzE, c10, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzces.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzH(b1.g(context, view), b1.d(context, map, map2, view, scaleType), b1.f(view), b1.e(context, view), zzD(view), null, b1.h(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzr() {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzx = b1.a(motionEvent, view2);
        long a10 = this.zzo.a();
        this.zzA = a10;
        if (motionEvent.getAction() == 0) {
            this.zzz = a10;
            this.zzy = this.zzx;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzx;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzcec.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzF("touch_reporting")) {
            zzcec.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcec.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdoe zzdoeVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdoeVar);
        view.setClickable(true);
        zzdoeVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzv() {
        this.zzw = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzw(t1 t1Var) {
        this.zzB = t1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzx(zzblg zzblgVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzblgVar);
        } else {
            zzcec.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzx = new Point();
        this.zzy = new Point();
        if (!this.zzu) {
            this.zzp.zza(view);
            this.zzu = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean i10 = b1.i(this.zzk.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (i10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (i10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzz(View view, Map map) {
        this.zzx = new Point();
        this.zzy = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzu = false;
    }
}
