package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8707b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z4 f8708c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8709d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzbsv f8710e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v f8711f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(v vVar, Context context, z4 z4Var, String str, zzbsv zzbsvVar) {
        this.f8707b = context;
        this.f8708c = z4Var;
        this.f8709d = str;
        this.f8710e = zzbsvVar;
        this.f8711f = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8707b, "interstitial");
        return new z3();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.x0(com.google.android.gms.dynamic.d.h2(this.f8707b), this.f8708c, this.f8709d, this.f8710e, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        t4 t4Var;
        t4Var = this.f8711f.f8764a;
        return t4Var.a(this.f8707b, this.f8708c, this.f8709d, this.f8710e, 2);
    }
}
