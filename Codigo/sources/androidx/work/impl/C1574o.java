package androidx.work.impl;

import androidx.lifecycle.C1320r;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import p094f2.InterfaceC7280m;

/* renamed from: androidx.work.impl.o */
/* loaded from: classes.dex */
public class C1574o implements InterfaceC7280m {

    /* renamed from: c */
    private final C1320r<InterfaceC7280m.b> f6739c = new C1320r<>();

    /* renamed from: d */
    private final C1583c<InterfaceC7280m.b.c> f6740d = C1583c.m8801s();

    public C1574o() {
        m8746a(InterfaceC7280m.f16315b);
    }

    /* renamed from: a */
    public void m8746a(InterfaceC7280m.b bVar) {
        this.f6739c.postValue(bVar);
        if (bVar instanceof InterfaceC7280m.b.c) {
            this.f6740d.mo8790o((InterfaceC7280m.b.c) bVar);
        } else if (bVar instanceof InterfaceC7280m.b.a) {
            this.f6740d.mo8791p(((InterfaceC7280m.b.a) bVar).m21786a());
        }
    }

    @Override // p094f2.InterfaceC7280m
    public InterfaceFutureC5920f<InterfaceC7280m.b.c> getResult() {
        return this.f6740d;
    }
}
