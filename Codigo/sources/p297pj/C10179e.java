package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.NoSuchElementException;
import p426wj.C12220c;
import p426wj.EnumC12224g;
import p471yj.C12727a;

/* renamed from: pj.e */
/* loaded from: classes3.dex */
public final class C10179e<T> extends AbstractC10175a<T, T> {

    /* renamed from: c */
    final long f25040c;

    /* renamed from: d */
    final T f25041d;

    /* renamed from: e */
    final boolean f25042e;

    /* renamed from: pj.e$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends C12220c<T> implements InterfaceC6984i<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: c */
        final long f25043c;

        /* renamed from: d */
        final T f25044d;

        /* renamed from: e */
        final boolean f25045e;

        /* renamed from: f */
        InterfaceC8016c f25046f;

        /* renamed from: r */
        long f25047r;

        /* renamed from: s */
        boolean f25048s;

        a(InterfaceC8015b<? super T> interfaceC8015b, long j10, T t10, boolean z10) {
            super(interfaceC8015b);
            this.f25043c = j10;
            this.f25044d = t10;
            this.f25045e = z10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25048s) {
                return;
            }
            this.f25048s = true;
            T t10 = this.f25044d;
            if (t10 != null) {
                m39345e(t10);
            } else if (this.f25045e) {
                this.f32683a.onError(new NoSuchElementException());
            } else {
                this.f32683a.mo24632a();
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25048s) {
                return;
            }
            long j10 = this.f25047r;
            if (j10 != this.f25043c) {
                this.f25047r = j10 + 1;
                return;
            }
            this.f25048s = true;
            this.f25046f.cancel();
            m39345e(t10);
        }

        @Override // p426wj.C12220c, im.InterfaceC8016c
        public void cancel() {
            super.cancel();
            this.f25046f.cancel();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25046f, interfaceC8016c)) {
                this.f25046f = interfaceC8016c;
                this.f32683a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25048s) {
                C12727a.m41995q(th2);
            } else {
                this.f25048s = true;
                this.f32683a.onError(th2);
            }
        }
    }

    public C10179e(AbstractC6981f<T> abstractC6981f, long j10, T t10, boolean z10) {
        super(abstractC6981f);
        this.f25040c = j10;
        this.f25041d = t10;
        this.f25042e = z10;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b, this.f25040c, this.f25041d, this.f25042e));
    }
}
