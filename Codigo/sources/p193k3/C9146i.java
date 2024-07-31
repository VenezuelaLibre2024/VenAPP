package p193k3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p036c4.C1870k;

/* renamed from: k3.i */
/* loaded from: classes.dex */
public final class C9146i implements InterfaceC9139b {

    /* renamed from: a */
    private final C9144g<a, Object> f22072a = new C9144g<>();

    /* renamed from: b */
    private final b f22073b = new b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f22074c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC9138a<?>> f22075d = new HashMap();

    /* renamed from: e */
    private final int f22076e;

    /* renamed from: f */
    private int f22077f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3.i$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9150m {

        /* renamed from: a */
        private final b f22078a;

        /* renamed from: b */
        int f22079b;

        /* renamed from: c */
        private Class<?> f22080c;

        a(b bVar) {
            this.f22078a = bVar;
        }

        @Override // p193k3.InterfaceC9150m
        /* renamed from: a */
        public void mo26978a() {
            this.f22078a.m26947c(this);
        }

        /* renamed from: b */
        void m26979b(int i10, Class<?> cls) {
            this.f22079b = i10;
            this.f22080c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22079b == aVar.f22079b && this.f22080c == aVar.f22080c;
        }

        public int hashCode() {
            int i10 = this.f22079b * 31;
            Class<?> cls = this.f22080c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f22079b + "array=" + this.f22080c + '}';
        }
    }

    /* renamed from: k3.i$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC9140c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p193k3.AbstractC9140c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo26945a() {
            return new a(this);
        }

        /* renamed from: e */
        a m26981e(int i10, Class<?> cls) {
            a m26946b = m26946b();
            m26946b.m26979b(i10, cls);
            return m26946b;
        }
    }

    public C9146i(int i10) {
        this.f22076e = i10;
    }

    /* renamed from: e */
    private void m26967e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> m26974l = m26974l(cls);
        Integer num = m26974l.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i10);
        if (intValue == 1) {
            m26974l.remove(valueOf);
        } else {
            m26974l.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    private void m26968f() {
        m26969g(this.f22076e);
    }

    /* renamed from: g */
    private void m26969g(int i10) {
        while (this.f22077f > i10) {
            Object m26961f = this.f22072a.m26961f();
            C1870k.m9950d(m26961f);
            InterfaceC9138a m26970h = m26970h(m26961f);
            this.f22077f -= m26970h.mo26940c(m26961f) * m26970h.mo26939b();
            m26967e(m26970h.mo26940c(m26961f), m26961f.getClass());
            if (Log.isLoggable(m26970h.mo26938a(), 2)) {
                Log.v(m26970h.mo26938a(), "evicted: " + m26970h.mo26940c(m26961f));
            }
        }
    }

    /* renamed from: h */
    private <T> InterfaceC9138a<T> m26970h(T t10) {
        return m26971i(t10.getClass());
    }

    /* renamed from: i */
    private <T> InterfaceC9138a<T> m26971i(Class<T> cls) {
        InterfaceC9138a<T> interfaceC9138a = (InterfaceC9138a) this.f22075d.get(cls);
        if (interfaceC9138a == null) {
            if (cls.equals(int[].class)) {
                interfaceC9138a = new C9145h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                interfaceC9138a = new C9143f();
            }
            this.f22075d.put(cls, interfaceC9138a);
        }
        return interfaceC9138a;
    }

    /* renamed from: j */
    private <T> T m26972j(a aVar) {
        return (T) this.f22072a.m26959a(aVar);
    }

    /* renamed from: k */
    private <T> T m26973k(a aVar, Class<T> cls) {
        InterfaceC9138a<T> m26971i = m26971i(cls);
        T t10 = (T) m26972j(aVar);
        if (t10 != null) {
            this.f22077f -= m26971i.mo26940c(t10) * m26971i.mo26939b();
            m26967e(m26971i.mo26940c(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(m26971i.mo26938a(), 2)) {
            Log.v(m26971i.mo26938a(), "Allocated " + aVar.f22079b + " bytes");
        }
        return m26971i.newArray(aVar.f22079b);
    }

    /* renamed from: l */
    private NavigableMap<Integer, Integer> m26974l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f22074c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22074c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    private boolean m26975m() {
        int i10 = this.f22077f;
        return i10 == 0 || this.f22076e / i10 >= 2;
    }

    /* renamed from: n */
    private boolean m26976n(int i10) {
        return i10 <= this.f22076e / 2;
    }

    /* renamed from: o */
    private boolean m26977o(int i10, Integer num) {
        return num != null && (m26975m() || num.intValue() <= i10 * 8);
    }

    @Override // p193k3.InterfaceC9139b
    /* renamed from: a */
    public synchronized void mo26941a(int i10) {
        try {
            if (i10 >= 40) {
                mo26942b();
            } else if (i10 >= 20 || i10 == 15) {
                m26969g(this.f22076e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p193k3.InterfaceC9139b
    /* renamed from: b */
    public synchronized void mo26942b() {
        m26969g(0);
    }

    @Override // p193k3.InterfaceC9139b
    /* renamed from: c */
    public synchronized <T> T mo26943c(int i10, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m26974l(cls).ceilingKey(Integer.valueOf(i10));
        return (T) m26973k(m26977o(i10, ceilingKey) ? this.f22073b.m26981e(ceilingKey.intValue(), cls) : this.f22073b.m26981e(i10, cls), cls);
    }

    @Override // p193k3.InterfaceC9139b
    /* renamed from: d */
    public synchronized <T> T mo26944d(int i10, Class<T> cls) {
        return (T) m26973k(this.f22073b.m26981e(i10, cls), cls);
    }

    @Override // p193k3.InterfaceC9139b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        InterfaceC9138a<T> m26971i = m26971i(cls);
        int mo26940c = m26971i.mo26940c(t10);
        int mo26939b = m26971i.mo26939b() * mo26940c;
        if (m26976n(mo26939b)) {
            a m26981e = this.f22073b.m26981e(mo26940c, cls);
            this.f22072a.m26960d(m26981e, t10);
            NavigableMap<Integer, Integer> m26974l = m26974l(cls);
            Integer num = m26974l.get(Integer.valueOf(m26981e.f22079b));
            Integer valueOf = Integer.valueOf(m26981e.f22079b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            m26974l.put(valueOf, Integer.valueOf(i10));
            this.f22077f += mo26939b;
            m26968f();
        }
    }
}
