package ql;

import java.io.Closeable;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class d0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24214a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ql.d0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0401a extends d0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f24215b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f24216c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ dm.d f24217d;

            C0401a(w wVar, long j10, dm.d dVar) {
                this.f24215b = wVar;
                this.f24216c = j10;
                this.f24217d = dVar;
            }

            @Override // ql.d0
            public long b() {
                return this.f24216c;
            }

            @Override // ql.d0
            public w e() {
                return this.f24215b;
            }

            @Override // ql.d0
            public dm.d f() {
                return this.f24217d;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ d0 c(a aVar, byte[] bArr, w wVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            return aVar.b(bArr, wVar);
        }

        public final d0 a(dm.d dVar, w wVar, long j10) {
            kotlin.jvm.internal.n.e(dVar, "<this>");
            return new C0401a(wVar, j10, dVar);
        }

        public final d0 b(byte[] bArr, w wVar) {
            kotlin.jvm.internal.n.e(bArr, "<this>");
            return a(new dm.b().write(bArr), wVar, bArr.length);
        }
    }

    private final Charset a() {
        w e10 = e();
        Charset c10 = e10 == null ? null : e10.c(xk.d.f31393b);
        return c10 == null ? xk.d.f31393b : c10;
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        rl.d.m(f());
    }

    public abstract w e();

    public abstract dm.d f();

    public final String g() {
        dm.d f10 = f();
        try {
            String U0 = f10.U0(rl.d.I(f10, a()));
            mk.b.a(f10, null);
            return U0;
        } finally {
        }
    }
}
