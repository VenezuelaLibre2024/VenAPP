package p319ql;

import dm.C7056b;
import dm.InterfaceC7060d;
import java.io.Closeable;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p341rl.C10727d;
import p450xk.C12512d;

/* renamed from: ql.d0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10527d0 implements Closeable {

    /* renamed from: a */
    public static final a f26256a = new a(null);

    /* renamed from: ql.d0$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ql.d0$a$a */
        /* loaded from: classes3.dex */
        public static final class C13236a extends AbstractC10527d0 {

            /* renamed from: b */
            final /* synthetic */ C10548w f26257b;

            /* renamed from: c */
            final /* synthetic */ long f26258c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC7060d f26259d;

            C13236a(C10548w c10548w, long j10, InterfaceC7060d interfaceC7060d) {
                this.f26257b = c10548w;
                this.f26258c = j10;
                this.f26259d = interfaceC7060d;
            }

            @Override // p319ql.AbstractC10527d0
            /* renamed from: b */
            public long mo31705b() {
                return this.f26258c;
            }

            @Override // p319ql.AbstractC10527d0
            /* renamed from: e */
            public C10548w mo31706e() {
                return this.f26257b;
            }

            @Override // p319ql.AbstractC10527d0
            /* renamed from: f */
            public InterfaceC7060d mo31707f() {
                return this.f26259d;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ AbstractC10527d0 m31709c(a aVar, byte[] bArr, C10548w c10548w, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c10548w = null;
            }
            return aVar.m31711b(bArr, c10548w);
        }

        /* renamed from: a */
        public final AbstractC10527d0 m31710a(InterfaceC7060d interfaceC7060d, C10548w c10548w, long j10) {
            C9322n.m27781e(interfaceC7060d, "<this>");
            return new C13236a(c10548w, j10, interfaceC7060d);
        }

        /* renamed from: b */
        public final AbstractC10527d0 m31711b(byte[] bArr, C10548w c10548w) {
            C9322n.m27781e(bArr, "<this>");
            return m31710a(new C7056b().write(bArr), c10548w, bArr.length);
        }
    }

    /* renamed from: a */
    private final Charset m31704a() {
        C10548w mo31706e = mo31706e();
        Charset m31945c = mo31706e == null ? null : mo31706e.m31945c(C12512d.f33913b);
        return m31945c == null ? C12512d.f33913b : m31945c;
    }

    /* renamed from: b */
    public abstract long mo31705b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C10727d.m32653m(mo31707f());
    }

    /* renamed from: e */
    public abstract C10548w mo31706e();

    /* renamed from: f */
    public abstract InterfaceC7060d mo31707f();

    /* renamed from: g */
    public final String m31708g() {
        InterfaceC7060d mo31707f = mo31707f();
        try {
            String mo20708U0 = mo31707f.mo20708U0(C10727d.m32623I(mo31707f, m31704a()));
            C9602b.m28593a(mo31707f, null);
            return mo20708U0;
        } finally {
        }
    }
}
