package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbpj;
import java.util.ArrayList;
import java.util.List;
import p080e9.InterfaceC7136b;
import p080e9.InterfaceC7137c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.l3 */
/* loaded from: classes.dex */
public final class BinderC4862l3 extends zzbpj {

    /* renamed from: a */
    final /* synthetic */ C4868m3 f9769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ BinderC4862l3(C4868m3 c4868m3, C4856k3 c4856k3) {
        this.f9769a = c4868m3;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzb(List list) {
        Object obj;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InterfaceC7136b m12417x;
        obj = this.f9769a.f9775a;
        synchronized (obj) {
            this.f9769a.f9777c = false;
            this.f9769a.f9778d = true;
            arrayList2 = this.f9769a.f9776b;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = this.f9769a.f9776b;
            arrayList3.clear();
        }
        m12417x = C4868m3.m12417x(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((InterfaceC7137c) arrayList.get(i10)).onInitializationComplete(m12417x);
        }
    }
}
