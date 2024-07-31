package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.C0712q;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p018b0.C1594b;
import p407w.C12029o0;
import p407w.InterfaceC12011h0;

/* renamed from: androidx.camera.core.q */
/* loaded from: classes.dex */
public class C0712q implements InterfaceC0623g1, AbstractC0592e.a {

    /* renamed from: a */
    private final Object f3068a;

    /* renamed from: b */
    private AbstractC0637k f3069b;

    /* renamed from: c */
    private int f3070c;

    /* renamed from: d */
    private InterfaceC0623g1.a f3071d;

    /* renamed from: e */
    private boolean f3072e;

    /* renamed from: f */
    private final InterfaceC0623g1 f3073f;

    /* renamed from: g */
    InterfaceC0623g1.a f3074g;

    /* renamed from: h */
    private Executor f3075h;

    /* renamed from: i */
    private final LongSparseArray<InterfaceC12011h0> f3076i;

    /* renamed from: j */
    private final LongSparseArray<InterfaceC0710o> f3077j;

    /* renamed from: k */
    private int f3078k;

    /* renamed from: l */
    private final List<InterfaceC0710o> f3079l;

    /* renamed from: m */
    private final List<InterfaceC0710o> f3080m;

    /* renamed from: androidx.camera.core.q$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0637k {
        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: b */
        public void mo2411b(InterfaceC0663s interfaceC0663s) {
            super.mo2411b(interfaceC0663s);
            C0712q.this.m3497s(interfaceC0663s);
        }
    }

    public C0712q(int i10, int i11, int i12, int i13) {
        this(m3488j(i10, i11, i12, i13));
    }

    C0712q(InterfaceC0623g1 interfaceC0623g1) {
        this.f3068a = new Object();
        this.f3069b = new a();
        this.f3070c = 0;
        this.f3071d = new InterfaceC0623g1.a() { // from class: w.p0
            @Override // androidx.camera.core.impl.InterfaceC0623g1.a
            /* renamed from: a */
            public final void mo2863a(InterfaceC0623g1 interfaceC0623g12) {
                C0712q.this.m3492p(interfaceC0623g12);
            }
        };
        this.f3072e = false;
        this.f3076i = new LongSparseArray<>();
        this.f3077j = new LongSparseArray<>();
        this.f3080m = new ArrayList();
        this.f3073f = interfaceC0623g1;
        this.f3078k = 0;
        this.f3079l = new ArrayList(mo2897e());
    }

    /* renamed from: j */
    private static InterfaceC0623g1 m3488j(int i10, int i11, int i12, int i13) {
        return new C0591d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    /* renamed from: k */
    private void m3489k(InterfaceC0710o interfaceC0710o) {
        synchronized (this.f3068a) {
            int indexOf = this.f3079l.indexOf(interfaceC0710o);
            if (indexOf >= 0) {
                this.f3079l.remove(indexOf);
                int i10 = this.f3078k;
                if (indexOf <= i10) {
                    this.f3078k = i10 - 1;
                }
            }
            this.f3080m.remove(interfaceC0710o);
            if (this.f3070c > 0) {
                m3496n(this.f3073f);
            }
        }
    }

    /* renamed from: l */
    private void m3490l(C0716u c0716u) {
        final InterfaceC0623g1.a aVar;
        Executor executor;
        synchronized (this.f3068a) {
            if (this.f3079l.size() < mo2897e()) {
                c0716u.m2900a(this);
                this.f3079l.add(c0716u);
                aVar = this.f3074g;
                executor = this.f3075h;
            } else {
                C12029o0.m38638a("TAG", "Maximum image number reached.");
                c0716u.close();
                aVar = null;
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: w.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0712q.this.m3491o(aVar);
                    }
                });
            } else {
                aVar.mo2863a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m3491o(InterfaceC0623g1.a aVar) {
        aVar.mo2863a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m3492p(InterfaceC0623g1 interfaceC0623g1) {
        synchronized (this.f3068a) {
            this.f3070c++;
        }
        m3496n(interfaceC0623g1);
    }

    /* renamed from: q */
    private void m3493q() {
        synchronized (this.f3068a) {
            for (int size = this.f3076i.size() - 1; size >= 0; size--) {
                InterfaceC12011h0 valueAt = this.f3076i.valueAt(size);
                long mo8853c = valueAt.mo8853c();
                InterfaceC0710o interfaceC0710o = this.f3077j.get(mo8853c);
                if (interfaceC0710o != null) {
                    this.f3077j.remove(mo8853c);
                    this.f3076i.removeAt(size);
                    m3490l(new C0716u(interfaceC0710o, valueAt));
                }
            }
            m3494r();
        }
    }

    /* renamed from: r */
    private void m3494r() {
        synchronized (this.f3068a) {
            if (this.f3077j.size() != 0 && this.f3076i.size() != 0) {
                Long valueOf = Long.valueOf(this.f3077j.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f3076i.keyAt(0));
                C0984h.m4823a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f3077j.size() - 1; size >= 0; size--) {
                        if (this.f3077j.keyAt(size) < valueOf2.longValue()) {
                            this.f3077j.valueAt(size).close();
                            this.f3077j.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f3076i.size() - 1; size2 >= 0; size2--) {
                        if (this.f3076i.keyAt(size2) < valueOf.longValue()) {
                            this.f3076i.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.AbstractC0592e.a
    /* renamed from: a */
    public void mo2902a(InterfaceC0710o interfaceC0710o) {
        synchronized (this.f3068a) {
            m3489k(interfaceC0710o);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: b */
    public InterfaceC0710o mo2894b() {
        synchronized (this.f3068a) {
            if (this.f3079l.isEmpty()) {
                return null;
            }
            if (this.f3078k >= this.f3079l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f3079l.size() - 1; i10++) {
                if (!this.f3080m.contains(this.f3079l.get(i10))) {
                    arrayList.add(this.f3079l.get(i10));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0710o) it.next()).close();
            }
            int size = this.f3079l.size() - 1;
            List<InterfaceC0710o> list = this.f3079l;
            this.f3078k = size + 1;
            InterfaceC0710o interfaceC0710o = list.get(size);
            this.f3080m.add(interfaceC0710o);
            return interfaceC0710o;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: c */
    public int mo2895c() {
        int mo2895c;
        synchronized (this.f3068a) {
            mo2895c = this.f3073f.mo2895c();
        }
        return mo2895c;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public void close() {
        synchronized (this.f3068a) {
            if (this.f3072e) {
                return;
            }
            Iterator it = new ArrayList(this.f3079l).iterator();
            while (it.hasNext()) {
                ((InterfaceC0710o) it.next()).close();
            }
            this.f3079l.clear();
            this.f3073f.close();
            this.f3072e = true;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: d */
    public void mo2896d() {
        synchronized (this.f3068a) {
            this.f3073f.mo2896d();
            this.f3074g = null;
            this.f3075h = null;
            this.f3070c = 0;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: e */
    public int mo2897e() {
        int mo2897e;
        synchronized (this.f3068a) {
            mo2897e = this.f3073f.mo2897e();
        }
        return mo2897e;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: f */
    public void mo2898f(InterfaceC0623g1.a aVar, Executor executor) {
        synchronized (this.f3068a) {
            this.f3074g = (InterfaceC0623g1.a) C0984h.m4833k(aVar);
            this.f3075h = (Executor) C0984h.m4833k(executor);
            this.f3073f.mo2898f(this.f3071d, executor);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: g */
    public InterfaceC0710o mo2899g() {
        synchronized (this.f3068a) {
            if (this.f3079l.isEmpty()) {
                return null;
            }
            if (this.f3078k >= this.f3079l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List<InterfaceC0710o> list = this.f3079l;
            int i10 = this.f3078k;
            this.f3078k = i10 + 1;
            InterfaceC0710o interfaceC0710o = list.get(i10);
            this.f3080m.add(interfaceC0710o);
            return interfaceC0710o;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getHeight() {
        int height;
        synchronized (this.f3068a) {
            height = this.f3073f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f3068a) {
            surface = this.f3073f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getWidth() {
        int width;
        synchronized (this.f3068a) {
            width = this.f3073f.getWidth();
        }
        return width;
    }

    /* renamed from: m */
    public AbstractC0637k m3495m() {
        return this.f3069b;
    }

    /* renamed from: n */
    void m3496n(InterfaceC0623g1 interfaceC0623g1) {
        InterfaceC0710o interfaceC0710o;
        synchronized (this.f3068a) {
            if (this.f3072e) {
                return;
            }
            int size = this.f3077j.size() + this.f3079l.size();
            if (size >= interfaceC0623g1.mo2897e()) {
                C12029o0.m38638a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    interfaceC0710o = interfaceC0623g1.mo2899g();
                    if (interfaceC0710o != null) {
                        this.f3070c--;
                        size++;
                        this.f3077j.put(interfaceC0710o.mo2883e1().mo8853c(), interfaceC0710o);
                        m3493q();
                    }
                } catch (IllegalStateException e10) {
                    C12029o0.m38639b("MetadataImageReader", "Failed to acquire next image.", e10);
                    interfaceC0710o = null;
                }
                if (interfaceC0710o == null || this.f3070c <= 0) {
                    break;
                }
            } while (size < interfaceC0623g1.mo2897e());
        }
    }

    /* renamed from: s */
    void m3497s(InterfaceC0663s interfaceC0663s) {
        synchronized (this.f3068a) {
            if (this.f3072e) {
                return;
            }
            this.f3076i.put(interfaceC0663s.mo2380c(), new C1594b(interfaceC0663s));
            m3493q();
        }
    }
}
