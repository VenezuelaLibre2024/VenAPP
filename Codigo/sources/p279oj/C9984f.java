package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9079g;

/* renamed from: oj.f */
/* loaded from: classes3.dex */
public final class C9984f extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC6979d f24601a;

    /* renamed from: b */
    final InterfaceC9079g<? super Throwable> f24602b;

    /* renamed from: oj.f$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC6978c {

        /* renamed from: a */
        private final InterfaceC6978c f24603a;

        a(InterfaceC6978c interfaceC6978c) {
            this.f24603a = interfaceC6978c;
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: a */
        public void mo20210a() {
            this.f24603a.mo20210a();
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: b */
        public void mo20211b(InterfaceC7578b interfaceC7578b) {
            this.f24603a.mo20211b(interfaceC7578b);
        }

        @Override // dj.InterfaceC6978c
        public void onError(Throwable th2) {
            try {
                if (C9984f.this.f24602b.test(th2)) {
                    this.f24603a.mo20210a();
                } else {
                    this.f24603a.onError(th2);
                }
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f24603a.onError(new C7743a(th2, th3));
            }
        }
    }

    public C9984f(InterfaceC6979d interfaceC6979d, InterfaceC9079g<? super Throwable> interfaceC9079g) {
        this.f24601a = interfaceC6979d;
        this.f24602b = interfaceC9079g;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        this.f24601a.mo20199a(new a(interfaceC6978c));
    }
}
