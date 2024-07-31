package p294pc;

import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p254nd.C9705a;
import p254nd.InterfaceC9707c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.f0 */
/* loaded from: classes.dex */
public final class C10139f0 implements InterfaceC10134d {

    /* renamed from: a */
    private final Set<C10137e0<?>> f24917a;

    /* renamed from: b */
    private final Set<C10137e0<?>> f24918b;

    /* renamed from: c */
    private final Set<C10137e0<?>> f24919c;

    /* renamed from: d */
    private final Set<C10137e0<?>> f24920d;

    /* renamed from: e */
    private final Set<C10137e0<?>> f24921e;

    /* renamed from: f */
    private final Set<Class<?>> f24922f;

    /* renamed from: g */
    private final InterfaceC10134d f24923g;

    /* renamed from: pc.f0$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC9707c {

        /* renamed from: a */
        private final Set<Class<?>> f24924a;

        /* renamed from: b */
        private final InterfaceC9707c f24925b;

        public a(Set<Class<?>> set, InterfaceC9707c interfaceC9707c) {
            this.f24924a = set;
            this.f24925b = interfaceC9707c;
        }

        @Override // p254nd.InterfaceC9707c
        /* renamed from: a */
        public void mo29097a(C9705a<?> c9705a) {
            if (!this.f24924a.contains(c9705a.m29096b())) {
                throw new C10152s(String.format("Attempting to publish an undeclared event %s.", c9705a));
            }
            this.f24925b.mo29097a(c9705a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10139f0(C10132c<?> c10132c, InterfaceC10134d interfaceC10134d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C10150q c10150q : c10132c.m30266g()) {
            if (c10150q.m30360e()) {
                boolean m30362g = c10150q.m30362g();
                C10137e0<?> m30358c = c10150q.m30358c();
                if (m30362g) {
                    hashSet4.add(m30358c);
                } else {
                    hashSet.add(m30358c);
                }
            } else if (c10150q.m30359d()) {
                hashSet3.add(c10150q.m30358c());
            } else {
                boolean m30362g2 = c10150q.m30362g();
                C10137e0<?> m30358c2 = c10150q.m30358c();
                if (m30362g2) {
                    hashSet5.add(m30358c2);
                } else {
                    hashSet2.add(m30358c2);
                }
            }
        }
        if (!c10132c.m30270k().isEmpty()) {
            hashSet.add(C10137e0.m30307b(InterfaceC9707c.class));
        }
        this.f24917a = Collections.unmodifiableSet(hashSet);
        this.f24918b = Collections.unmodifiableSet(hashSet2);
        this.f24919c = Collections.unmodifiableSet(hashSet3);
        this.f24920d = Collections.unmodifiableSet(hashSet4);
        this.f24921e = Collections.unmodifiableSet(hashSet5);
        this.f24922f = c10132c.m30270k();
        this.f24923g = interfaceC10134d;
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: a */
    public <T> InterfaceC7182a<T> mo30294a(C10137e0<T> c10137e0) {
        if (this.f24919c.contains(c10137e0)) {
            return this.f24923g.mo30294a(c10137e0);
        }
        throw new C10152s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c10137e0));
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: b */
    public <T> InterfaceC7183b<T> mo30295b(C10137e0<T> c10137e0) {
        if (this.f24918b.contains(c10137e0)) {
            return this.f24923g.mo30295b(c10137e0);
        }
        throw new C10152s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c10137e0));
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: d */
    public <T> InterfaceC7183b<Set<T>> mo30297d(C10137e0<T> c10137e0) {
        if (this.f24921e.contains(c10137e0)) {
            return this.f24923g.mo30297d(c10137e0);
        }
        throw new C10152s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c10137e0));
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: e */
    public <T> T mo30298e(C10137e0<T> c10137e0) {
        if (this.f24917a.contains(c10137e0)) {
            return (T) this.f24923g.mo30298e(c10137e0);
        }
        throw new C10152s(String.format("Attempting to request an undeclared dependency %s.", c10137e0));
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: f */
    public <T> InterfaceC7183b<T> mo30299f(Class<T> cls) {
        return mo30295b(C10137e0.m30307b(cls));
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: g */
    public <T> Set<T> mo30300g(C10137e0<T> c10137e0) {
        if (this.f24920d.contains(c10137e0)) {
            return this.f24923g.mo30300g(c10137e0);
        }
        throw new C10152s(String.format("Attempting to request an undeclared dependency Set<%s>.", c10137e0));
    }

    @Override // p294pc.InterfaceC10134d
    public <T> T get(Class<T> cls) {
        if (!this.f24917a.contains(C10137e0.m30307b(cls))) {
            throw new C10152s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f24923g.get(cls);
        return !cls.equals(InterfaceC9707c.class) ? t10 : (T) new a(this.f24922f, (InterfaceC9707c) t10);
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: h */
    public <T> InterfaceC7182a<T> mo30301h(Class<T> cls) {
        return mo30294a(C10137e0.m30307b(cls));
    }
}
