package io.grpc.internal;

import java.io.InputStream;
import p082eb.C7153i;
import vi.C11915g1;
import vi.C11946t;
import vi.C11950v;
import vi.InterfaceC11934n;

/* renamed from: io.grpc.internal.h0 */
/* loaded from: classes3.dex */
abstract class AbstractC8854h0 implements InterfaceC8889q {
    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: a */
    public void mo25282a(InterfaceC11934n interfaceC11934n) {
        mo25586p().mo25282a(interfaceC11934n);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: b */
    public void mo25283b(int i10) {
        mo25586p().mo25283b(i10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: c */
    public void mo25194c(C11915g1 c11915g1) {
        mo25586p().mo25194c(c11915g1);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: d */
    public boolean mo25195d() {
        return mo25586p().mo25195d();
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: e */
    public void mo25196e(int i10) {
        mo25586p().mo25196e(i10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: f */
    public void mo25197f(int i10) {
        mo25586p().mo25197f(i10);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    public void flush() {
        mo25586p().flush();
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: g */
    public void mo25198g(C11946t c11946t) {
        mo25586p().mo25198g(c11946t);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: h */
    public void mo25284h(InputStream inputStream) {
        mo25586p().mo25284h(inputStream);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: i */
    public void mo25285i() {
        mo25586p().mo25285i();
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: j */
    public void mo25199j(boolean z10) {
        mo25586p().mo25199j(z10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: k */
    public void mo25200k(C11950v c11950v) {
        mo25586p().mo25200k(c11950v);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: l */
    public void mo25286l(String str) {
        mo25586p().mo25286l(str);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: m */
    public void mo25201m(C8908w0 c8908w0) {
        mo25586p().mo25201m(c8908w0);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: n */
    public void mo25202n() {
        mo25586p().mo25202n();
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: o */
    public void mo25203o(InterfaceC8892r interfaceC8892r) {
        mo25586p().mo25203o(interfaceC8892r);
    }

    /* renamed from: p */
    protected abstract InterfaceC8889q mo25586p();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo25586p()).toString();
    }
}
