package p297pj;

import dj.AbstractC6981f;
import dj.AbstractC6985j;
import dj.InterfaceC6984i;
import dj.InterfaceC6987l;
import im.InterfaceC8016c;
import p123gj.InterfaceC7578b;
import p241mj.InterfaceC9592b;
import p426wj.EnumC12224g;
import p471yj.C12727a;

/* renamed from: pj.f */
/* loaded from: classes3.dex */
public final class C10180f<T> extends AbstractC6985j<T> implements InterfaceC9592b<T> {

    /* renamed from: a */
    final AbstractC6981f<T> f25049a;

    /* renamed from: b */
    final long f25050b;

    /* renamed from: pj.f$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6984i<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f25051a;

        /* renamed from: b */
        final long f25052b;

        /* renamed from: c */
        InterfaceC8016c f25053c;

        /* renamed from: d */
        long f25054d;

        /* renamed from: e */
        boolean f25055e;

        a(InterfaceC6987l<? super T> interfaceC6987l, long j10) {
            this.f25051a = interfaceC6987l;
            this.f25052b = j10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25053c = EnumC12224g.CANCELLED;
            if (this.f25055e) {
                return;
            }
            this.f25055e = true;
            this.f25051a.mo20278a();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25055e) {
                return;
            }
            long j10 = this.f25054d;
            if (j10 != this.f25052b) {
                this.f25054d = j10 + 1;
                return;
            }
            this.f25055e = true;
            this.f25053c.cancel();
            this.f25053c = EnumC12224g.CANCELLED;
            this.f25051a.onSuccess(t10);
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25053c, interfaceC8016c)) {
                this.f25053c = interfaceC8016c;
                this.f25051a.mo20279b(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f25053c.cancel();
            this.f25053c = EnumC12224g.CANCELLED;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f25053c == EnumC12224g.CANCELLED;
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25055e) {
                C12727a.m41995q(th2);
                return;
            }
            this.f25055e = true;
            this.f25053c = EnumC12224g.CANCELLED;
            this.f25051a.onError(th2);
        }
    }

    public C10180f(AbstractC6981f<T> abstractC6981f, long j10) {
        this.f25049a = abstractC6981f;
        this.f25050b = j10;
    }

    @Override // p241mj.InterfaceC9592b
    /* renamed from: d */
    public AbstractC6981f<T> mo28587d() {
        return C12727a.m41989k(new C10179e(this.f25049a, this.f25050b, null, false));
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f25049a.m20228H(new a(interfaceC6987l, this.f25050b));
    }
}
