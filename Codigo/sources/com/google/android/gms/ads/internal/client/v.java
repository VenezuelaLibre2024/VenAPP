package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final t4 f8764a;

    /* renamed from: b, reason: collision with root package name */
    private final r4 f8765b;

    /* renamed from: c, reason: collision with root package name */
    private final t3 f8766c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbll f8767d;

    /* renamed from: e, reason: collision with root package name */
    private final zzcaz f8768e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbwq f8769f;

    /* renamed from: g, reason: collision with root package name */
    private final zzblm f8770g;

    /* renamed from: h, reason: collision with root package name */
    private zzbxy f8771h;

    public v(t4 t4Var, r4 r4Var, t3 t3Var, zzbll zzbllVar, zzcaz zzcazVar, zzbwq zzbwqVar, zzblm zzblmVar) {
        this.f8764a = t4Var;
        this.f8765b = r4Var;
        this.f8766c = t3Var;
        this.f8767d = zzbllVar;
        this.f8768e = zzcazVar;
        this.f8769f = zzbwqVar;
        this.f8770g = zzblmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void r(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        x.b().zzn(context, x.c().zza, "gmob-apps", bundle, true);
    }

    public final q0 c(Context context, String str, zzbsv zzbsvVar) {
        return (q0) new p(this, context, str, zzbsvVar).d(context, false);
    }

    public final u0 d(Context context, z4 z4Var, String str, zzbsv zzbsvVar) {
        return (u0) new l(this, context, z4Var, str, zzbsvVar).d(context, false);
    }

    public final u0 e(Context context, z4 z4Var, String str, zzbsv zzbsvVar) {
        return (u0) new n(this, context, z4Var, str, zzbsvVar).d(context, false);
    }

    public final l2 f(Context context, zzbsv zzbsvVar) {
        return (l2) new d(this, context, zzbsvVar).d(context, false);
    }

    public final zzbjq h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbjq) new t(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zzboh j(Context context, zzbsv zzbsvVar, b9.b bVar) {
        return (zzboh) new j(this, context, zzbsvVar, bVar).d(context, false);
    }

    public final zzbwm k(Context context, zzbsv zzbsvVar) {
        return (zzbwm) new h(this, context, zzbsvVar).d(context, false);
    }

    public final zzbwt m(Activity activity) {
        b bVar = new b(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzcec.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbwt) bVar.d(activity, z10);
    }

    public final zzcan o(Context context, String str, zzbsv zzbsvVar) {
        return (zzcan) new u(this, context, str, zzbsvVar).d(context, false);
    }

    public final zzcct p(Context context, zzbsv zzbsvVar) {
        return (zzcct) new f(this, context, zzbsvVar).d(context, false);
    }
}
