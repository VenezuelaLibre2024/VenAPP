package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicLong;
import p145hj.C7745c;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p471yj.C12727a;

/* renamed from: pj.u */
/* loaded from: classes3.dex */
public final class C10195u<T> extends AbstractC10175a<T, T> {

    /* renamed from: pj.u$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements InterfaceC6984i<T>, InterfaceC8016c {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25178a;

        /* renamed from: b */
        InterfaceC8016c f25179b;

        /* renamed from: c */
        boolean f25180c;

        a(InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25178a = interfaceC8015b;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25180c) {
                return;
            }
            this.f25180c = true;
            this.f25178a.mo24632a();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25180c) {
                return;
            }
            if (get() == 0) {
                onError(new C7745c("could not emit value due to lack of requests"));
            } else {
                this.f25178a.mo24633c(t10);
                C12501d.m40931d(this, 1L);
            }
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            this.f25179b.cancel();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25179b, interfaceC8016c)) {
                this.f25179b = interfaceC8016c;
                this.f25178a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this, j10);
            }
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25180c) {
                C12727a.m41995q(th2);
            } else {
                this.f25180c = true;
                this.f25178a.onError(th2);
            }
        }
    }

    public C10195u(AbstractC6981f<T> abstractC6981f) {
        super(abstractC6981f);
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b));
    }
}
