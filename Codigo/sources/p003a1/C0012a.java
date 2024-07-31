package p003a1;

import dk.C7042z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p003a1.AbstractC0015d;
import p280ok.InterfaceC9998l;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0012a extends AbstractC0015d {

    /* renamed from: a */
    private final Map<AbstractC0015d.a<?>, Object> f36a;

    /* renamed from: b */
    private final AtomicBoolean f37b;

    /* renamed from: a1.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Map.Entry<AbstractC0015d.a<?>, Object>, CharSequence> {

        /* renamed from: a */
        public static final a f38a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<AbstractC0015d.a<?>, Object> entry) {
            C9322n.m27781e(entry, "entry");
            return "  " + entry.getKey().m53a() + " = " + entry.getValue();
        }
    }

    public C0012a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public C0012a(Map<AbstractC0015d.a<?>, Object> preferencesMap, boolean z10) {
        C9322n.m27781e(preferencesMap, "preferencesMap");
        this.f36a = preferencesMap;
        this.f37b = new AtomicBoolean(z10);
    }

    public /* synthetic */ C0012a(Map map, boolean z10, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // p003a1.AbstractC0015d
    /* renamed from: a */
    public Map<AbstractC0015d.a<?>, Object> mo38a() {
        Map<AbstractC0015d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f36a);
        C9322n.m27780d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // p003a1.AbstractC0015d
    /* renamed from: b */
    public <T> T mo39b(AbstractC0015d.a<T> key) {
        C9322n.m27781e(key, "key");
        return (T) this.f36a.get(key);
    }

    /* renamed from: e */
    public final void m40e() {
        if (!(!this.f37b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0012a) {
            return C9322n.m27777a(this.f36a, ((C0012a) obj).f36a);
        }
        return false;
    }

    /* renamed from: f */
    public final void m41f() {
        this.f37b.set(true);
    }

    /* renamed from: g */
    public final void m42g(AbstractC0015d.b<?>... pairs) {
        C9322n.m27781e(pairs, "pairs");
        m40e();
        for (AbstractC0015d.b<?> bVar : pairs) {
            m45j(bVar.m54a(), bVar.m55b());
        }
    }

    /* renamed from: h */
    public final <T> T m43h(AbstractC0015d.a<T> key) {
        C9322n.m27781e(key, "key");
        m40e();
        return (T) this.f36a.remove(key);
    }

    public int hashCode() {
        return this.f36a.hashCode();
    }

    /* renamed from: i */
    public final <T> void m44i(AbstractC0015d.a<T> key, T t10) {
        C9322n.m27781e(key, "key");
        m45j(key, t10);
    }

    /* renamed from: j */
    public final void m45j(AbstractC0015d.a<?> key, Object obj) {
        Map<AbstractC0015d.a<?>, Object> map;
        Set m20634j0;
        C9322n.m27781e(key, "key");
        m40e();
        if (obj == null) {
            m43h(key);
            return;
        }
        if (obj instanceof Set) {
            map = this.f36a;
            m20634j0 = C7042z.m20634j0((Iterable) obj);
            obj = Collections.unmodifiableSet(m20634j0);
            C9322n.m27780d(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f36a;
        }
        map.put(key, obj);
    }

    public String toString() {
        String m20611M;
        m20611M = C7042z.m20611M(this.f36a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f38a, 24, null);
        return m20611M;
    }
}
