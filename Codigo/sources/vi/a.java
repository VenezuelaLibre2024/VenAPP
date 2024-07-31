package vi;

import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap<c<?>, Object> f29023b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f29024c;

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<c<?>, Object> f29025a;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private a f29026a;

        /* renamed from: b, reason: collision with root package name */
        private IdentityHashMap<c<?>, Object> f29027b;

        private b(a aVar) {
            this.f29026a = aVar;
        }

        private IdentityHashMap<c<?>, Object> b(int i10) {
            if (this.f29027b == null) {
                this.f29027b = new IdentityHashMap<>(i10);
            }
            return this.f29027b;
        }

        public a a() {
            if (this.f29027b != null) {
                for (Map.Entry entry : this.f29026a.f29025a.entrySet()) {
                    if (!this.f29027b.containsKey(entry.getKey())) {
                        this.f29027b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f29026a = new a(this.f29027b);
                this.f29027b = null;
            }
            return this.f29026a;
        }

        public <T> b c(c<T> cVar) {
            if (this.f29026a.f29025a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f29026a.f29025a);
                identityHashMap.remove(cVar);
                this.f29026a = new a(identityHashMap);
            }
            IdentityHashMap<c<?>, Object> identityHashMap2 = this.f29027b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> b d(c<T> cVar, T t10) {
            b(1).put(cVar, t10);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f29028a;

        private c(String str) {
            this.f29028a = str;
        }

        public static <T> c<T> a(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f29028a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f29023b = identityHashMap;
        f29024c = new a(identityHashMap);
    }

    private a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.f29025a = identityHashMap;
    }

    public static b c() {
        return new b();
    }

    public <T> T b(c<T> cVar) {
        return (T) this.f29025a.get(cVar);
    }

    public b d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f29025a.size() != aVar.f29025a.size()) {
            return false;
        }
        for (Map.Entry<c<?>, Object> entry : this.f29025a.entrySet()) {
            if (!aVar.f29025a.containsKey(entry.getKey()) || !eb.k.a(entry.getValue(), aVar.f29025a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry<c<?>, Object> entry : this.f29025a.entrySet()) {
            i10 += eb.k.b(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public String toString() {
        return this.f29025a.toString();
    }
}
