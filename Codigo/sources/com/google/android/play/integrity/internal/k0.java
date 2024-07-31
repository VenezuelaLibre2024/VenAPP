package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class k0 extends d0 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ IBinder f11024r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ c f11025s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(c cVar, IBinder iBinder) {
        this.f11025s = cVar;
        this.f11024r = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.d0
    public final void b() {
        j0 j0Var;
        List list;
        List list2;
        d dVar = this.f11025s.f10993a;
        j0Var = dVar.f11004i;
        dVar.f11009n = (IInterface) j0Var.a(this.f11024r);
        d.r(this.f11025s.f10993a);
        this.f11025s.f10993a.f11002g = false;
        list = this.f11025s.f10993a.f10999d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f11025s.f10993a.f10999d;
        list2.clear();
    }
}
