package tf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26890a = new HashMap();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f26891a;

        /* renamed from: b, reason: collision with root package name */
        private final ee.b f26892b;

        public <RemoteT extends b> a(Class<RemoteT> cls, ee.b<Object> bVar) {
            this.f26891a = cls;
            this.f26892b = bVar;
        }

        final ee.b a() {
            return this.f26892b;
        }

        final Class b() {
            return this.f26891a;
        }
    }

    public c(Set<a> set) {
        for (a aVar : set) {
            this.f26890a.put(aVar.b(), aVar.a());
        }
    }
}
