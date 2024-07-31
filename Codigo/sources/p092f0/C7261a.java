package p092f0;

import java.util.ArrayDeque;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public class C7261a<T> {

    /* renamed from: a */
    private final int f16266a;

    /* renamed from: b */
    private final ArrayDeque<T> f16267b;

    /* renamed from: c */
    private final Object f16268c = new Object();

    /* renamed from: d */
    final InterfaceC7263c<T> f16269d;

    public C7261a(int i10, InterfaceC7263c<T> interfaceC7263c) {
        this.f16266a = i10;
        this.f16267b = new ArrayDeque<>(i10);
        this.f16269d = interfaceC7263c;
    }

    /* renamed from: a */
    public T m21727a() {
        T removeLast;
        synchronized (this.f16268c) {
            removeLast = this.f16267b.removeLast();
        }
        return removeLast;
    }

    /* renamed from: b */
    public void m21728b(T t10) {
        T m21727a;
        synchronized (this.f16268c) {
            m21727a = this.f16267b.size() >= this.f16266a ? m21727a() : null;
            this.f16267b.addFirst(t10);
        }
        InterfaceC7263c<T> interfaceC7263c = this.f16269d;
        if (interfaceC7263c == null || m21727a == null) {
            return;
        }
        interfaceC7263c.mo2864a(m21727a);
    }

    /* renamed from: c */
    public boolean m21729c() {
        boolean isEmpty;
        synchronized (this.f16268c) {
            isEmpty = this.f16267b.isEmpty();
        }
        return isEmpty;
    }
}
