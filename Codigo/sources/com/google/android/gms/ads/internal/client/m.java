package com.google.android.gms.ads.internal.client;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z4 f8694c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8695d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f8696e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(v vVar, Context context, z4 z4Var, String str) {
        this.f8693b = context;
        this.f8694c = z4Var;
        this.f8695d = str;
        this.f8696e = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8693b, "search");
        return new z3();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.o1(com.google.android.gms.dynamic.d.h2(this.f8693b), this.f8694c, this.f8695d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        t4 t4Var;
        t4Var = this.f8696e.f8764a;
        return t4Var.a(this.f8693b, this.f8694c, this.f8695d, null, 3);
    }
}
