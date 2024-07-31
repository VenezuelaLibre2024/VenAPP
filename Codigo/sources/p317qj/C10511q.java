package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p205kj.EnumC9284b;
import p205kj.EnumC9285c;
import p471yj.C12727a;

/* renamed from: qj.q */
/* loaded from: classes3.dex */
public final class C10511q<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final InterfaceC9076d<? super InterfaceC7578b> f26140b;

    /* renamed from: c */
    final InterfaceC9076d<? super T> f26141c;

    /* renamed from: d */
    final InterfaceC9076d<? super Throwable> f26142d;

    /* renamed from: e */
    final InterfaceC9073a f26143e;

    /* renamed from: f */
    final InterfaceC9073a f26144f;

    /* renamed from: r */
    final InterfaceC9073a f26145r;

    /* renamed from: qj.q$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6987l<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26146a;

        /* renamed from: b */
        final C10511q<T> f26147b;

        /* renamed from: c */
        InterfaceC7578b f26148c;

        a(InterfaceC6987l<? super T> interfaceC6987l, C10511q<T> c10511q) {
            this.f26146a = interfaceC6987l;
            this.f26147b = c10511q;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            InterfaceC7578b interfaceC7578b = this.f26148c;
            EnumC9284b enumC9284b = EnumC9284b.DISPOSED;
            if (interfaceC7578b == enumC9284b) {
                return;
            }
            try {
                this.f26147b.f26143e.run();
                this.f26148c = enumC9284b;
                this.f26146a.mo20278a();
                m31578c();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                m31579d(th2);
            }
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26148c, interfaceC7578b)) {
                try {
                    this.f26147b.f26140b.accept(interfaceC7578b);
                    this.f26148c = interfaceC7578b;
                    this.f26146a.mo20279b(this);
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    interfaceC7578b.dispose();
                    this.f26148c = EnumC9284b.DISPOSED;
                    EnumC9285c.m27703o(th2, this.f26146a);
                }
            }
        }

        /* renamed from: c */
        void m31578c() {
            try {
                this.f26147b.f26144f.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                C12727a.m41995q(th2);
            }
        }

        /* renamed from: d */
        void m31579d(Throwable th2) {
            try {
                this.f26147b.f26142d.accept(th2);
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                th2 = new C7743a(th2, th3);
            }
            this.f26148c = EnumC9284b.DISPOSED;
            this.f26146a.onError(th2);
            m31578c();
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            try {
                this.f26147b.f26145r.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                C12727a.m41995q(th2);
            }
            this.f26148c.dispose();
            this.f26148c = EnumC9284b.DISPOSED;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26148c.mo616h();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            if (this.f26148c == EnumC9284b.DISPOSED) {
                C12727a.m41995q(th2);
            } else {
                m31579d(th2);
            }
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            InterfaceC7578b interfaceC7578b = this.f26148c;
            EnumC9284b enumC9284b = EnumC9284b.DISPOSED;
            if (interfaceC7578b == enumC9284b) {
                return;
            }
            try {
                this.f26147b.f26141c.accept(t10);
                this.f26148c = enumC9284b;
                this.f26146a.onSuccess(t10);
                m31578c();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                m31579d(th2);
            }
        }
    }

    public C10511q(InterfaceC6989n<T> interfaceC6989n, InterfaceC9076d<? super InterfaceC7578b> interfaceC9076d, InterfaceC9076d<? super T> interfaceC9076d2, InterfaceC9076d<? super Throwable> interfaceC9076d3, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2, InterfaceC9073a interfaceC9073a3) {
        super(interfaceC6989n);
        this.f26140b = interfaceC9076d;
        this.f26141c = interfaceC9076d2;
        this.f26142d = interfaceC9076d3;
        this.f26143e = interfaceC9073a;
        this.f26144f = interfaceC9073a2;
        this.f26145r = interfaceC9073a3;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this));
    }
}
