package a1;

import a1.d;
import dk.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a */
    private final Map<d.a<?>, Object> f36a;

    /* renamed from: b */
    private final AtomicBoolean f37b;

    /* renamed from: a1.a$a */
    /* loaded from: classes.dex */
    static final class C0000a extends o implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: a */
        public static final C0000a f38a = new C0000a();

        C0000a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            n.e(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public a() {
        this(null, false, 3, null);
    }

    public a(Map<d.a<?>, Object> preferencesMap, boolean z10) {
        n.e(preferencesMap, "preferencesMap");
        this.f36a = preferencesMap;
        this.f37b = new AtomicBoolean(z10);
    }

    public /* synthetic */ a(Map map, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // a1.d
    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f36a);
        n.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // a1.d
    public <T> T b(d.a<T> key) {
        n.e(key, "key");
        return (T) this.f36a.get(key);
    }

    public final void e() {
        if (!(!this.f37b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return n.a(this.f36a, ((a) obj).f36a);
        }
        return false;
    }

    public final void f() {
        this.f37b.set(true);
    }

    public final void g(d.b<?>... pairs) {
        n.e(pairs, "pairs");
        e();
        for (d.b<?> bVar : pairs) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(d.a<T> key) {
        n.e(key, "key");
        e();
        return (T) this.f36a.remove(key);
    }

    public int hashCode() {
        return this.f36a.hashCode();
    }

    public final <T> void i(d.a<T> key, T t10) {
        n.e(key, "key");
        j(key, t10);
    }

    public final void j(d.a<?> key, Object obj) {
        Map<d.a<?>, Object> map;
        Set j02;
        n.e(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            map = this.f36a;
            j02 = z.j0((Iterable) obj);
            obj = Collections.unmodifiableSet(j02);
            n.d(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f36a;
        }
        map.put(key, obj);
    }

    public String toString() {
        String M;
        M = z.M(this.f36a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0000a.f38a, 24, null);
        return M;
    }
}
