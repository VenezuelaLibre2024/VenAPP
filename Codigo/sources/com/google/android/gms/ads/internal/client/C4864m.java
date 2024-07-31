package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC5314d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.m */
/* loaded from: classes.dex */
public final class C4864m extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9770b;

    /* renamed from: c */
    final /* synthetic */ C4947z4 f9771c;

    /* renamed from: d */
    final /* synthetic */ String f9772d;

    /* renamed from: e */
    final /* synthetic */ C4918v f9773e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4864m(C4918v c4918v, Context context, C4947z4 c4947z4, String str) {
        this.f9770b = context;
        this.f9771c = c4947z4;
        this.f9772d = str;
        this.f9773e = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9770b, "search");
        return new BinderC4946z3();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12353o1(BinderC5314d.m13412h2(this.f9770b), this.f9771c, this.f9772d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        C4911t4 c4911t4;
        c4911t4 = this.f9773e.f9851a;
        return c4911t4.m12441a(this.f9770b, this.f9771c, this.f9772d, null, 3);
    }
}
