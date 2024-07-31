package vi;

import java.util.IdentityHashMap;
import java.util.Map;
import p082eb.C7155k;

/* renamed from: vi.a */
/* loaded from: classes3.dex */
public final class C11895a {

    /* renamed from: b */
    private static final IdentityHashMap<c<?>, Object> f31457b;

    /* renamed from: c */
    public static final C11895a f31458c;

    /* renamed from: a */
    private final IdentityHashMap<c<?>, Object> f31459a;

    /* renamed from: vi.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private C11895a f31460a;

        /* renamed from: b */
        private IdentityHashMap<c<?>, Object> f31461b;

        private b(C11895a c11895a) {
            this.f31460a = c11895a;
        }

        /* renamed from: b */
        private IdentityHashMap<c<?>, Object> m38050b(int i10) {
            if (this.f31461b == null) {
                this.f31461b = new IdentityHashMap<>(i10);
            }
            return this.f31461b;
        }

        /* renamed from: a */
        public C11895a m38051a() {
            if (this.f31461b != null) {
                for (Map.Entry entry : this.f31460a.f31459a.entrySet()) {
                    if (!this.f31461b.containsKey(entry.getKey())) {
                        this.f31461b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f31460a = new C11895a(this.f31461b);
                this.f31461b = null;
            }
            return this.f31460a;
        }

        /* renamed from: c */
        public <T> b m38052c(c<T> cVar) {
            if (this.f31460a.f31459a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f31460a.f31459a);
                identityHashMap.remove(cVar);
                this.f31460a = new C11895a(identityHashMap);
            }
            IdentityHashMap<c<?>, Object> identityHashMap2 = this.f31461b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public <T> b m38053d(c<T> cVar, T t10) {
            m38050b(1).put(cVar, t10);
            return this;
        }
    }

    /* renamed from: vi.a$c */
    /* loaded from: classes3.dex */
    public static final class c<T> {

        /* renamed from: a */
        private final String f31462a;

        private c(String str) {
            this.f31462a = str;
        }

        /* renamed from: a */
        public static <T> c<T> m38054a(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f31462a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f31457b = identityHashMap;
        f31458c = new C11895a(identityHashMap);
    }

    private C11895a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.f31459a = identityHashMap;
    }

    /* renamed from: c */
    public static b m38047c() {
        return new b();
    }

    /* renamed from: b */
    public <T> T m38048b(c<T> cVar) {
        return (T) this.f31459a.get(cVar);
    }

    /* renamed from: d */
    public b m38049d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11895a.class != obj.getClass()) {
            return false;
        }
        C11895a c11895a = (C11895a) obj;
        if (this.f31459a.size() != c11895a.f31459a.size()) {
            return false;
        }
        for (Map.Entry<c<?>, Object> entry : this.f31459a.entrySet()) {
            if (!c11895a.f31459a.containsKey(entry.getKey()) || !C7155k.m21289a(entry.getValue(), c11895a.f31459a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry<c<?>, Object> entry : this.f31459a.entrySet()) {
            i10 += C7155k.m21290b(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public String toString() {
        return this.f31459a.toString();
    }
}
