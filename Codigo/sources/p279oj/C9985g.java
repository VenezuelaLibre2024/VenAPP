package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p205kj.EnumC9284b;
import p205kj.EnumC9285c;
import p471yj.C12727a;

/* renamed from: oj.g */
/* loaded from: classes3.dex */
public final class C9985g extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC6979d f24605a;

    /* renamed from: b */
    final InterfaceC9076d<? super InterfaceC7578b> f24606b;

    /* renamed from: c */
    final InterfaceC9076d<? super Throwable> f24607c;

    /* renamed from: d */
    final InterfaceC9073a f24608d;

    /* renamed from: e */
    final InterfaceC9073a f24609e;

    /* renamed from: f */
    final InterfaceC9073a f24610f;

    /* renamed from: r */
    final InterfaceC9073a f24611r;

    /* renamed from: oj.g$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC6978c, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6978c f24612a;

        /* renamed from: b */
        InterfaceC7578b f24613b;

        a(InterfaceC6978c interfaceC6978c) {
            this.f24612a = interfaceC6978c;
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: a */
        public void mo20210a() {
            if (this.f24613b == EnumC9284b.DISPOSED) {
                return;
            }
            try {
                C9985g.this.f24608d.run();
                C9985g.this.f24609e.run();
                this.f24612a.mo20210a();
                m29835c();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f24612a.onError(th2);
            }
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: b */
        public void mo20211b(InterfaceC7578b interfaceC7578b) {
            try {
                C9985g.this.f24606b.accept(interfaceC7578b);
                if (EnumC9284b.m27698p(this.f24613b, interfaceC7578b)) {
                    this.f24613b = interfaceC7578b;
                    this.f24612a.mo20211b(this);
                }
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                interfaceC7578b.dispose();
                this.f24613b = EnumC9284b.DISPOSED;
                EnumC9285c.m27702n(th2, this.f24612a);
            }
        }

        /* renamed from: c */
        void m29835c() {
            try {
                C9985g.this.f24610f.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                C12727a.m41995q(th2);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            try {
                C9985g.this.f24611r.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                C12727a.m41995q(th2);
            }
            this.f24613b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f24613b.mo616h();
        }

        @Override // dj.InterfaceC6978c
        public void onError(Throwable th2) {
            if (this.f24613b == EnumC9284b.DISPOSED) {
                C12727a.m41995q(th2);
                return;
            }
            try {
                C9985g.this.f24607c.accept(th2);
                C9985g.this.f24609e.run();
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                th2 = new C7743a(th2, th3);
            }
            this.f24612a.onError(th2);
            m29835c();
        }
    }

    public C9985g(InterfaceC6979d interfaceC6979d, InterfaceC9076d<? super InterfaceC7578b> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2, InterfaceC9073a interfaceC9073a3, InterfaceC9073a interfaceC9073a4) {
        this.f24605a = interfaceC6979d;
        this.f24606b = interfaceC9076d;
        this.f24607c = interfaceC9076d2;
        this.f24608d = interfaceC9073a;
        this.f24609e = interfaceC9073a2;
        this.f24610f = interfaceC9073a3;
        this.f24611r = interfaceC9073a4;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        this.f24605a.mo20199a(new a(interfaceC6978c));
    }
}
