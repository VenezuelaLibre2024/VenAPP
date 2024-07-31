package tf;

import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: tf.c */
/* loaded from: classes2.dex */
public class C11254c {

    /* renamed from: a */
    private final Map f29186a = new HashMap();

    /* renamed from: tf.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final Class f29187a;

        /* renamed from: b */
        private final InterfaceC7183b f29188b;

        public <RemoteT extends AbstractC11253b> a(Class<RemoteT> cls, InterfaceC7183b<Object> interfaceC7183b) {
            this.f29187a = cls;
            this.f29188b = interfaceC7183b;
        }

        /* renamed from: a */
        final InterfaceC7183b m35167a() {
            return this.f29188b;
        }

        /* renamed from: b */
        final Class m35168b() {
            return this.f29187a;
        }
    }

    public C11254c(Set<a> set) {
        for (a aVar : set) {
            this.f29186a.put(aVar.m35168b(), aVar.m35167a());
        }
    }
}
