package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b */
    private static boolean f4236b = true;

    /* renamed from: d */
    private static volatile p f4238d;

    /* renamed from: a */
    private final Map<a, y.e<?, ?>> f4240a;

    /* renamed from: c */
    private static final Class<?> f4237c = c();

    /* renamed from: e */
    static final p f4239e = new p(true);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f4241a;

        /* renamed from: b */
        private final int f4242b;

        a(Object obj, int i10) {
            this.f4241a = obj;
            this.f4242b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4241a == aVar.f4241a && this.f4242b == aVar.f4242b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4241a) * 65535) + this.f4242b;
        }
    }

    p() {
        this.f4240a = new HashMap();
    }

    p(boolean z10) {
        this.f4240a = Collections.emptyMap();
    }

    public static p b() {
        p pVar = f4238d;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f4238d;
                if (pVar == null) {
                    pVar = f4236b ? o.a() : f4239e;
                    f4238d = pVar;
                }
            }
        }
        return pVar;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends r0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (y.e) this.f4240a.get(new a(containingtype, i10));
    }
}
