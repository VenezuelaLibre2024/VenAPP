package p451xl;

import dm.InterfaceC7060d;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10545t;

/* renamed from: xl.a */
/* loaded from: classes3.dex */
public final class C12528a {

    /* renamed from: c */
    public static final a f33943c = new a(null);

    /* renamed from: a */
    private final InterfaceC7060d f33944a;

    /* renamed from: b */
    private long f33945b;

    /* renamed from: xl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C12528a(InterfaceC7060d source) {
        C9322n.m27781e(source, "source");
        this.f33944a = source;
        this.f33945b = 262144L;
    }

    /* renamed from: a */
    public final C10545t m41110a() {
        C10545t.a aVar = new C10545t.a();
        while (true) {
            String m41111b = m41111b();
            if (m41111b.length() == 0) {
                return aVar.m31855e();
            }
            aVar.m31852b(m41111b);
        }
    }

    /* renamed from: b */
    public final String m41111b() {
        String mo20700L = this.f33944a.mo20700L(this.f33945b);
        this.f33945b -= mo20700L.length();
        return mo20700L;
    }
}
