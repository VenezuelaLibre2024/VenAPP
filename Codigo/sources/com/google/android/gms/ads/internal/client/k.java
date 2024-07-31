package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z4 f8682c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8683d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzbsv f8684e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v f8685f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(v vVar, Context context, z4 z4Var, String str, zzbsv zzbsvVar) {
        this.f8681b = context;
        this.f8682c = z4Var;
        this.f8683d = str;
        this.f8684e = zzbsvVar;
        this.f8685f = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8681b, "banner");
        return new z3();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.j1(com.google.android.gms.dynamic.d.h2(this.f8681b), this.f8682c, this.f8683d, this.f8684e, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        t4 t4Var;
        t4Var = this.f8685f.f8764a;
        return t4Var.a(this.f8681b, this.f8682c, this.f8683d, this.f8684e, 1);
    }
}
