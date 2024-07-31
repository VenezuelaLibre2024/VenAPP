package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamic.h */
/* loaded from: classes.dex */
public final class C5318h implements InterfaceC5322l {

    /* renamed from: a */
    final /* synthetic */ Bundle f10827a;

    /* renamed from: b */
    final /* synthetic */ AbstractC5311a f10828b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5318h(AbstractC5311a abstractC5311a, Bundle bundle) {
        this.f10828b = abstractC5311a;
        this.f10827a = bundle;
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5322l
    /* renamed from: a */
    public final int mo13414a() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5322l
    /* renamed from: b */
    public final void mo13415b(InterfaceC5313c interfaceC5313c) {
        InterfaceC5313c interfaceC5313c2;
        interfaceC5313c2 = this.f10828b.f10821a;
        interfaceC5313c2.onCreate(this.f10827a);
    }
}
