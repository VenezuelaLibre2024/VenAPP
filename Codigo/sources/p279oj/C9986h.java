package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.C9287e;

/* renamed from: oj.h */
/* loaded from: classes3.dex */
public final class C9986h extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC6979d f24615a;

    /* renamed from: b */
    final InterfaceC9077e<? super Throwable, ? extends InterfaceC6979d> f24616b;

    /* renamed from: oj.h$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC6978c {

        /* renamed from: a */
        final InterfaceC6978c f24617a;

        /* renamed from: b */
        final C9287e f24618b;

        /* renamed from: oj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13229a implements InterfaceC6978c {
            C13229a() {
            }

            @Override // dj.InterfaceC6978c
            /* renamed from: a */
            public void mo20210a() {
                a.this.f24617a.mo20210a();
            }

            @Override // dj.InterfaceC6978c
            /* renamed from: b */
            public void mo20211b(InterfaceC7578b interfaceC7578b) {
                a.this.f24618b.m27709b(interfaceC7578b);
            }

            @Override // dj.InterfaceC6978c
            public void onError(Throwable th2) {
                a.this.f24617a.onError(th2);
            }
        }

        a(InterfaceC6978c interfaceC6978c, C9287e c9287e) {
            this.f24617a = interfaceC6978c;
            this.f24618b = c9287e;
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: a */
        public void mo20210a() {
            this.f24617a.mo20210a();
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: b */
        public void mo20211b(InterfaceC7578b interfaceC7578b) {
            this.f24618b.m27709b(interfaceC7578b);
        }

        @Override // dj.InterfaceC6978c
        public void onError(Throwable th2) {
            try {
                InterfaceC6979d apply = C9986h.this.f24616b.apply(th2);
                if (apply != null) {
                    apply.mo20199a(new C13229a());
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                nullPointerException.initCause(th2);
                this.f24617a.onError(nullPointerException);
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f24617a.onError(new C7743a(th3, th2));
            }
        }
    }

    public C9986h(InterfaceC6979d interfaceC6979d, InterfaceC9077e<? super Throwable, ? extends InterfaceC6979d> interfaceC9077e) {
        this.f24615a = interfaceC6979d;
        this.f24616b = interfaceC9077e;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        C9287e c9287e = new C9287e();
        interfaceC6978c.mo20211b(c9287e);
        this.f24615a.mo20199a(new a(interfaceC6978c, c9287e));
    }
}
