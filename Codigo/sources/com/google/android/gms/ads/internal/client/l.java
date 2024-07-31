package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8687b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z4 f8688c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8689d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzbsv f8690e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v f8691f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(v vVar, Context context, z4 z4Var, String str, zzbsv zzbsvVar) {
        this.f8687b = context;
        this.f8688c = z4Var;
        this.f8689d = str;
        this.f8690e = zzbsvVar;
        this.f8691f = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8687b, "app_open");
        return new z3();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.W0(com.google.android.gms.dynamic.d.h2(this.f8687b), this.f8688c, this.f8689d, this.f8690e, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        t4 t4Var;
        t4Var = this.f8691f.f8764a;
        return t4Var.a(this.f8687b, this.f8688c, this.f8689d, this.f8690e, 4);
    }
}
