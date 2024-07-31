package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.C2162s;
import com.bumptech.glide.manager.C2165v;
import com.bumptech.glide.manager.InterfaceC2146c;
import com.bumptech.glide.manager.InterfaceC2147d;
import com.bumptech.glide.manager.InterfaceC2155l;
import com.bumptech.glide.manager.InterfaceC2156m;
import com.bumptech.glide.manager.InterfaceC2161r;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p036c4.C1871l;
import p171j3.AbstractC8963j;
import p373u3.C11308c;
import p456y3.C12594i;
import p456y3.InterfaceC12590e;
import p456y3.InterfaceC12593h;
import p478z3.InterfaceC12798d;

/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public class ComponentCallbacks2C2125k implements ComponentCallbacks2, InterfaceC2156m {

    /* renamed from: w */
    private static final C12594i f8383w = C12594i.m41402f0(Bitmap.class).m41342M();

    /* renamed from: x */
    private static final C12594i f8384x = C12594i.m41402f0(C11308c.class).m41342M();

    /* renamed from: y */
    private static final C12594i f8385y = C12594i.m41403g0(AbstractC8963j.f21390c).m41345P(EnumC2121g.LOW).m41351X(true);

    /* renamed from: a */
    protected final ComponentCallbacks2C2116b f8386a;

    /* renamed from: b */
    protected final Context f8387b;

    /* renamed from: c */
    final InterfaceC2155l f8388c;

    /* renamed from: d */
    private final C2162s f8389d;

    /* renamed from: e */
    private final InterfaceC2161r f8390e;

    /* renamed from: f */
    private final C2165v f8391f;

    /* renamed from: r */
    private final Runnable f8392r;

    /* renamed from: s */
    private final InterfaceC2146c f8393s;

    /* renamed from: t */
    private final CopyOnWriteArrayList<InterfaceC12593h<Object>> f8394t;

    /* renamed from: u */
    private C12594i f8395u;

    /* renamed from: v */
    private boolean f8396v;

    /* renamed from: com.bumptech.glide.k$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C2125k componentCallbacks2C2125k = ComponentCallbacks2C2125k.this;
            componentCallbacks2C2125k.f8388c.mo10798b(componentCallbacks2C2125k);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    /* loaded from: classes.dex */
    private class b implements InterfaceC2146c.a {

        /* renamed from: a */
        private final C2162s f8398a;

        b(C2162s c2162s) {
            this.f8398a = c2162s;
        }

        @Override // com.bumptech.glide.manager.InterfaceC2146c.a
        /* renamed from: a */
        public void mo10736a(boolean z10) {
            if (z10) {
                synchronized (ComponentCallbacks2C2125k.this) {
                    this.f8398a.m10842e();
                }
            }
        }
    }

    public ComponentCallbacks2C2125k(ComponentCallbacks2C2116b componentCallbacks2C2116b, InterfaceC2155l interfaceC2155l, InterfaceC2161r interfaceC2161r, Context context) {
        this(componentCallbacks2C2116b, interfaceC2155l, interfaceC2161r, new C2162s(), componentCallbacks2C2116b.m10652h(), context);
    }

    ComponentCallbacks2C2125k(ComponentCallbacks2C2116b componentCallbacks2C2116b, InterfaceC2155l interfaceC2155l, InterfaceC2161r interfaceC2161r, C2162s c2162s, InterfaceC2147d interfaceC2147d, Context context) {
        this.f8391f = new C2165v();
        a aVar = new a();
        this.f8392r = aVar;
        this.f8386a = componentCallbacks2C2116b;
        this.f8388c = interfaceC2155l;
        this.f8390e = interfaceC2161r;
        this.f8389d = c2162s;
        this.f8387b = context;
        InterfaceC2146c mo10802a = interfaceC2147d.mo10802a(context.getApplicationContext(), new b(c2162s));
        this.f8393s = mo10802a;
        componentCallbacks2C2116b.m10657p(this);
        if (C1871l.m9968q()) {
            C1871l.m9972u(aVar);
        } else {
            interfaceC2155l.mo10798b(this);
        }
        interfaceC2155l.mo10798b(mo10802a);
        this.f8394t = new CopyOnWriteArrayList<>(componentCallbacks2C2116b.m10654j().m10664b());
        m10733v(componentCallbacks2C2116b.m10654j().m10665c());
    }

    /* renamed from: y */
    private void m10719y(InterfaceC12798d<?> interfaceC12798d) {
        boolean m10735x = m10735x(interfaceC12798d);
        InterfaceC12590e mo41397f = interfaceC12798d.mo41397f();
        if (m10735x || this.f8386a.m10658q(interfaceC12798d) || mo41397f == null) {
            return;
        }
        interfaceC12798d.mo41398h(null);
        mo41397f.clear();
    }

    /* renamed from: c */
    public ComponentCallbacks2C2125k m10720c(InterfaceC12593h<Object> interfaceC12593h) {
        this.f8394t.add(interfaceC12593h);
        return this;
    }

    /* renamed from: d */
    public <ResourceType> C2124j<ResourceType> m10721d(Class<ResourceType> cls) {
        return new C2124j<>(this.f8386a, this, cls, this.f8387b);
    }

    /* renamed from: k */
    public C2124j<Bitmap> m10722k() {
        return m10721d(Bitmap.class).mo10708a(f8383w);
    }

    /* renamed from: l */
    public C2124j<Drawable> m10723l() {
        return m10721d(Drawable.class);
    }

    /* renamed from: m */
    public void m10724m(InterfaceC12798d<?> interfaceC12798d) {
        if (interfaceC12798d == null) {
            return;
        }
        m10719y(interfaceC12798d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<InterfaceC12593h<Object>> m10725n() {
        return this.f8394t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized C12594i m10726o() {
        return this.f8395u;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public synchronized void onDestroy() {
        this.f8391f.onDestroy();
        Iterator<InterfaceC12798d<?>> it = this.f8391f.m10867d().iterator();
        while (it.hasNext()) {
            m10724m(it.next());
        }
        this.f8391f.m10866c();
        this.f8389d.m10839b();
        this.f8388c.mo10797a(this);
        this.f8388c.mo10797a(this.f8393s);
        C1871l.m9973v(this.f8392r);
        this.f8386a.m10660t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public synchronized void onStart() {
        m10732u();
        this.f8391f.onStart();
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public synchronized void onStop() {
        m10731t();
        this.f8391f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f8396v) {
            m10730s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public <T> AbstractC2126l<?, T> m10727p(Class<T> cls) {
        return this.f8386a.m10654j().m10666d(cls);
    }

    /* renamed from: q */
    public C2124j<Drawable> m10728q(Object obj) {
        return m10723l().m10716t0(obj);
    }

    /* renamed from: r */
    public synchronized void m10729r() {
        this.f8389d.m10840c();
    }

    /* renamed from: s */
    public synchronized void m10730s() {
        m10729r();
        Iterator<ComponentCallbacks2C2125k> it = this.f8390e.mo10806a().iterator();
        while (it.hasNext()) {
            it.next().m10729r();
        }
    }

    /* renamed from: t */
    public synchronized void m10731t() {
        this.f8389d.m10841d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f8389d + ", treeNode=" + this.f8390e + "}";
    }

    /* renamed from: u */
    public synchronized void m10732u() {
        this.f8389d.m10843f();
    }

    /* renamed from: v */
    protected synchronized void m10733v(C12594i c12594i) {
        this.f8395u = c12594i.clone().m41354b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public synchronized void m10734w(InterfaceC12798d<?> interfaceC12798d, InterfaceC12590e interfaceC12590e) {
        this.f8391f.m10868k(interfaceC12798d);
        this.f8389d.m10844g(interfaceC12590e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized boolean m10735x(InterfaceC12798d<?> interfaceC12798d) {
        InterfaceC12590e mo41397f = interfaceC12798d.mo41397f();
        if (mo41397f == null) {
            return true;
        }
        if (!this.f8389d.m10838a(mo41397f)) {
            return false;
        }
        this.f8391f.m10869l(interfaceC12798d);
        interfaceC12798d.mo41398h(null);
        return true;
    }
}
