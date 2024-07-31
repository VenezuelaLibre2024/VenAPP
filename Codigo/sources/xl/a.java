package xl;

import dm.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ql.t;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0527a f31423c = new C0527a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f31424a;

    /* renamed from: b, reason: collision with root package name */
    private long f31425b;

    /* renamed from: xl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0527a {
        private C0527a() {
        }

        public /* synthetic */ C0527a(g gVar) {
            this();
        }
    }

    public a(d source) {
        n.e(source, "source");
        this.f31424a = source;
        this.f31425b = 262144L;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.e();
            }
            aVar.b(b10);
        }
    }

    public final String b() {
        String L = this.f31424a.L(this.f31425b);
        this.f31425b -= L.length();
        return L;
    }
}
