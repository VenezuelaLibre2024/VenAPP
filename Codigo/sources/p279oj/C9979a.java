package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import java.util.concurrent.atomic.AtomicInteger;
import p123gj.InterfaceC7578b;
import p205kj.C9287e;

/* renamed from: oj.a */
/* loaded from: classes3.dex */
public final class C9979a extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC6979d[] f24592a;

    /* renamed from: oj.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements InterfaceC6978c {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: a */
        final InterfaceC6978c f24593a;

        /* renamed from: b */
        final InterfaceC6979d[] f24594b;

        /* renamed from: c */
        int f24595c;

        /* renamed from: d */
        final C9287e f24596d = new C9287e();

        a(InterfaceC6978c interfaceC6978c, InterfaceC6979d[] interfaceC6979dArr) {
            this.f24593a = interfaceC6978c;
            this.f24594b = interfaceC6979dArr;
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: a */
        public void mo20210a() {
            m29834c();
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: b */
        public void mo20211b(InterfaceC7578b interfaceC7578b) {
            this.f24596d.m27708a(interfaceC7578b);
        }

        /* renamed from: c */
        void m29834c() {
            if (!this.f24596d.mo616h() && getAndIncrement() == 0) {
                InterfaceC6979d[] interfaceC6979dArr = this.f24594b;
                while (!this.f24596d.mo616h()) {
                    int i10 = this.f24595c;
                    this.f24595c = i10 + 1;
                    if (i10 == interfaceC6979dArr.length) {
                        this.f24593a.mo20210a();
                        return;
                    } else {
                        interfaceC6979dArr[i10].mo20199a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // dj.InterfaceC6978c
        public void onError(Throwable th2) {
            this.f24593a.onError(th2);
        }
    }

    public C9979a(InterfaceC6979d[] interfaceC6979dArr) {
        this.f24592a = interfaceC6979dArr;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    public void mo20208p(InterfaceC6978c interfaceC6978c) {
        a aVar = new a(interfaceC6978c, this.f24592a);
        interfaceC6978c.mo20211b(aVar.f24596d);
        aVar.m29834c();
    }
}
