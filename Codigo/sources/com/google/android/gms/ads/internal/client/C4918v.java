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
import p027b9.InterfaceC1684b;

/* renamed from: com.google.android.gms.ads.internal.client.v */
/* loaded from: classes.dex */
public final class C4918v {

    /* renamed from: a */
    private final C4911t4 f9851a;

    /* renamed from: b */
    private final C4899r4 f9852b;

    /* renamed from: c */
    private final C4910t3 f9853c;

    /* renamed from: d */
    private final zzbll f9854d;

    /* renamed from: e */
    private final zzcaz f9855e;

    /* renamed from: f */
    private final zzbwq f9856f;

    /* renamed from: g */
    private final zzblm f9857g;

    /* renamed from: h */
    private zzbxy f9858h;

    public C4918v(C4911t4 c4911t4, C4899r4 c4899r4, C4910t3 c4910t3, zzbll zzbllVar, zzcaz zzcazVar, zzbwq zzbwqVar, zzblm zzblmVar) {
        this.f9851a = c4911t4;
        this.f9852b = c4899r4;
        this.f9853c = c4910t3;
        this.f9854d = zzbllVar;
        this.f9855e = zzcazVar;
        this.f9856f = zzbwqVar;
        this.f9857g = zzblmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m12449r(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C4930x.m12474b().zzn(context, C4930x.m12475c().zza, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final InterfaceC4889q0 m12450c(Context context, String str, zzbsv zzbsvVar) {
        return (InterfaceC4889q0) new C4882p(this, context, str, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: d */
    public final InterfaceC4913u0 m12451d(Context context, C4947z4 c4947z4, String str, zzbsv zzbsvVar) {
        return (InterfaceC4913u0) new C4858l(this, context, c4947z4, str, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: e */
    public final InterfaceC4913u0 m12452e(Context context, C4947z4 c4947z4, String str, zzbsv zzbsvVar) {
        return (InterfaceC4913u0) new C4870n(this, context, c4947z4, str, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: f */
    public final InterfaceC4861l2 m12453f(Context context, zzbsv zzbsvVar) {
        return (InterfaceC4861l2) new C4804d(this, context, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: h */
    public final zzbjq m12454h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbjq) new C4906t(this, frameLayout, frameLayout2, context).m12471d(context, false);
    }

    /* renamed from: j */
    public final zzboh m12455j(Context context, zzbsv zzbsvVar, InterfaceC1684b interfaceC1684b) {
        return (zzboh) new C4846j(this, context, zzbsvVar, interfaceC1684b).m12471d(context, false);
    }

    /* renamed from: k */
    public final zzbwm m12456k(Context context, zzbsv zzbsvVar) {
        return (zzbwm) new C4832h(this, context, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: m */
    public final zzbwt m12457m(Activity activity) {
        C4790b c4790b = new C4790b(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzcec.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbwt) c4790b.m12471d(activity, z10);
    }

    /* renamed from: o */
    public final zzcan m12458o(Context context, String str, zzbsv zzbsvVar) {
        return (zzcan) new C4912u(this, context, str, zzbsvVar).m12471d(context, false);
    }

    /* renamed from: p */
    public final zzcct m12459p(Context context, zzbsv zzbsvVar) {
        return (zzcct) new C4818f(this, context, zzbsvVar).m12471d(context, false);
    }
}
