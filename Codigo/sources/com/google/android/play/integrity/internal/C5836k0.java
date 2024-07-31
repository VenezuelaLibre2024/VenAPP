package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.integrity.internal.k0 */
/* loaded from: classes2.dex */
final class C5836k0 extends AbstractRunnableC5822d0 {

    /* renamed from: r */
    final /* synthetic */ IBinder f12239r;

    /* renamed from: s */
    final /* synthetic */ ServiceConnectionC5819c f12240s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5836k0(ServiceConnectionC5819c serviceConnectionC5819c, IBinder iBinder) {
        this.f12240s = serviceConnectionC5819c;
        this.f12239r = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    public final void mo14617b() {
        InterfaceC5834j0 interfaceC5834j0;
        List list;
        List list2;
        C5821d c5821d = this.f12240s.f12208a;
        interfaceC5834j0 = c5821d.f12219i;
        c5821d.f12224n = (IInterface) interfaceC5834j0.mo14615a(this.f12239r);
        C5821d.m14675r(this.f12240s.f12208a);
        this.f12240s.f12208a.f12217g = false;
        list = this.f12240s.f12208a.f12214d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f12240s.f12208a.f12214d;
        list2.clear();
    }
}
