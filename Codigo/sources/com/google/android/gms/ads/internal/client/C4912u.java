package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.u */
/* loaded from: classes.dex */
public final class C4912u extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9821b;

    /* renamed from: c */
    final /* synthetic */ String f9822c;

    /* renamed from: d */
    final /* synthetic */ zzbsv f9823d;

    /* renamed from: e */
    final /* synthetic */ C4918v f9824e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4912u(C4918v c4918v, Context context, String str, zzbsv zzbsvVar) {
        this.f9821b = context;
        this.f9822c = str;
        this.f9823d = zzbsvVar;
        this.f9824e = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9821b, "rewarded");
        return new BinderC4823f4();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12351g(BinderC5314d.m13412h2(this.f9821b), this.f9822c, this.f9823d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        return zzcaz.zza(this.f9821b, this.f9822c, this.f9823d);
    }
}
