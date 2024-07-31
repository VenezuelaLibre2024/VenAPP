package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbpj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class l3 extends zzbpj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m3 f8692a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l3(m3 m3Var, k3 k3Var) {
        this.f8692a = m3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzb(List list) {
        int i10;
        ArrayList arrayList;
        synchronized (m3.i(this.f8692a)) {
            m3.l(this.f8692a, false);
            m3.k(this.f8692a, true);
            arrayList = new ArrayList(m3.j(this.f8692a));
            m3.j(this.f8692a).clear();
        }
        e9.b f10 = m3.f(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e9.c) arrayList.get(i10)).onInitializationComplete(f10);
        }
    }
}
