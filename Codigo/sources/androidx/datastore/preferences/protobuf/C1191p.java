package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1215y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p */
/* loaded from: classes.dex */
public class C1191p {

    /* renamed from: b */
    private static boolean f4947b = true;

    /* renamed from: d */
    private static volatile C1191p f4949d;

    /* renamed from: a */
    private final Map<a, AbstractC1215y.e<?, ?>> f4951a;

    /* renamed from: c */
    private static final Class<?> f4948c = m6273c();

    /* renamed from: e */
    static final C1191p f4950e = new C1191p(true);

    /* renamed from: androidx.datastore.preferences.protobuf.p$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final Object f4952a;

        /* renamed from: b */
        private final int f4953b;

        a(Object obj, int i10) {
            this.f4952a = obj;
            this.f4953b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4952a == aVar.f4952a && this.f4953b == aVar.f4953b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4952a) * 65535) + this.f4953b;
        }
    }

    C1191p() {
        this.f4951a = new HashMap();
    }

    C1191p(boolean z10) {
        this.f4951a = Collections.emptyMap();
    }

    /* renamed from: b */
    public static C1191p m6272b() {
        C1191p c1191p = f4949d;
        if (c1191p == null) {
            synchronized (C1191p.class) {
                c1191p = f4949d;
                if (c1191p == null) {
                    c1191p = f4947b ? C1188o.m6249a() : f4950e;
                    f4949d = c1191p;
                }
            }
        }
        return c1191p;
    }

    /* renamed from: c */
    static Class<?> m6273c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC1198r0> AbstractC1215y.e<ContainingType, ?> m6274a(ContainingType containingtype, int i10) {
        return (AbstractC1215y.e) this.f4951a.get(new a(containingtype, i10));
    }
}
