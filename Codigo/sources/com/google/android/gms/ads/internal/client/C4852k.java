package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbsv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.k */
/* loaded from: classes.dex */
public final class C4852k extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9758b;

    /* renamed from: c */
    final /* synthetic */ C4947z4 f9759c;

    /* renamed from: d */
    final /* synthetic */ String f9760d;

    /* renamed from: e */
    final /* synthetic */ zzbsv f9761e;

    /* renamed from: f */
    final /* synthetic */ C4918v f9762f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4852k(C4918v c4918v, Context context, C4947z4 c4947z4, String str, zzbsv zzbsvVar) {
        this.f9758b = context;
        this.f9759c = c4947z4;
        this.f9760d = str;
        this.f9761e = zzbsvVar;
        this.f9762f = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9758b, "banner");
        return new BinderC4946z3();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12352j1(BinderC5314d.m13412h2(this.f9758b), this.f9759c, this.f9760d, this.f9761e, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        C4911t4 c4911t4;
        c4911t4 = this.f9762f.f9851a;
        return c4911t4.m12441a(this.f9758b, this.f9759c, this.f9760d, this.f9761e, 1);
    }
}
