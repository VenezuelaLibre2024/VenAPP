package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AbstractBinderC4786a2;
import com.google.android.gms.ads.internal.client.C4801c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.w */
/* loaded from: classes.dex */
public final class BinderC5051w extends AbstractBinderC4786a2 {

    /* renamed from: a */
    final /* synthetic */ Context f10171a;

    /* renamed from: b */
    final /* synthetic */ C5060z f10172b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5051w(C5060z c5060z, Context context) {
        this.f10171a = context;
        this.f10172b = c5060z;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4800c2
    public final void zze(C4801c3 c4801c3) {
        if (c4801c3 == null) {
            return;
        }
        this.f10172b.m12790i(this.f10171a, c4801c3.f9704b, true, true);
    }
}
