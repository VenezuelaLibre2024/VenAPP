package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8744b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f8745c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzbsv f8746d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f8747e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar, Context context, String str, zzbsv zzbsvVar) {
        this.f8744b = context;
        this.f8745c = str;
        this.f8746d = zzbsvVar;
        this.f8747e = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8744b, "rewarded");
        return new f4();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.g(com.google.android.gms.dynamic.d.h2(this.f8744b), this.f8745c, this.f8746d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        return zzcaz.zza(this.f8744b, this.f8745c, this.f8746d);
    }
}
