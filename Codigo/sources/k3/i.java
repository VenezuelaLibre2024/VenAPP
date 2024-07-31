package k3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements k3.b {

    /* renamed from: a, reason: collision with root package name */
    private final g<a, Object> f20290a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f20291b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f20292c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, k3.a<?>> f20293d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f20294e;

    /* renamed from: f, reason: collision with root package name */
    private int f20295f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f20296a;

        /* renamed from: b, reason: collision with root package name */
        int f20297b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f20298c;

        a(b bVar) {
            this.f20296a = bVar;
        }

        @Override // k3.m
        public void a() {
            this.f20296a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f20297b = i10;
            this.f20298c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20297b == aVar.f20297b && this.f20298c == aVar.f20298c;
        }

        public int hashCode() {
            int i10 = this.f20297b * 31;
            Class<?> cls = this.f20298c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f20297b + "array=" + this.f20298c + '}';
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // k3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class<?> cls) {
            a b10 = b();
            b10.b(i10, cls);
            return b10;
        }
    }

    public i(int i10) {
        this.f20294e = i10;
    }

    private void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> l10 = l(cls);
        Integer num = l10.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i10);
        if (intValue == 1) {
            l10.remove(valueOf);
        } else {
            l10.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private void f() {
        g(this.f20294e);
    }

    private void g(int i10) {
        while (this.f20295f > i10) {
            Object f10 = this.f20290a.f();
            c4.k.d(f10);
            k3.a h10 = h(f10);
            this.f20295f -= h10.c(f10) * h10.b();
            e(h10.c(f10), f10.getClass());
            if (Log.isLoggable(h10.a(), 2)) {
                Log.v(h10.a(), "evicted: " + h10.c(f10));
            }
        }
    }

    private <T> k3.a<T> h(T t10) {
        return i(t10.getClass());
    }

    private <T> k3.a<T> i(Class<T> cls) {
        k3.a<T> aVar = (k3.a) this.f20293d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                aVar = new f();
            }
            this.f20293d.put(cls, aVar);
        }
        return aVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f20290a.a(aVar);
    }

    private <T> T k(a aVar, Class<T> cls) {
        k3.a<T> i10 = i(cls);
        T t10 = (T) j(aVar);
        if (t10 != null) {
            this.f20295f -= i10.c(t10) * i10.b();
            e(i10.c(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(i10.a(), 2)) {
            Log.v(i10.a(), "Allocated " + aVar.f20297b + " bytes");
        }
        return i10.newArray(aVar.f20297b);
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f20292c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20292c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f20295f;
        return i10 == 0 || this.f20294e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f20294e / 2;
    }

    private boolean o(int i10, Integer num) {
        return num != null && (m() || num.intValue() <= i10 * 8);
    }

    @Override // k3.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f20294e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k3.b
    public synchronized void b() {
        g(0);
    }

    @Override // k3.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = l(cls).ceilingKey(Integer.valueOf(i10));
        return (T) k(o(i10, ceilingKey) ? this.f20291b.e(ceilingKey.intValue(), cls) : this.f20291b.e(i10, cls), cls);
    }

    @Override // k3.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) k(this.f20291b.e(i10, cls), cls);
    }

    @Override // k3.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        k3.a<T> i10 = i(cls);
        int c10 = i10.c(t10);
        int b10 = i10.b() * c10;
        if (n(b10)) {
            a e10 = this.f20291b.e(c10, cls);
            this.f20290a.d(e10, t10);
            NavigableMap<Integer, Integer> l10 = l(cls);
            Integer num = l10.get(Integer.valueOf(e10.f20297b));
            Integer valueOf = Integer.valueOf(e10.f20297b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            l10.put(valueOf, Integer.valueOf(i11));
            this.f20295f += b10;
            f();
        }
    }
}
