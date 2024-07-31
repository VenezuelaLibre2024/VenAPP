package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import w.h0;
import w.o0;

/* loaded from: classes.dex */
public class q implements g1, e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2723a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.camera.core.impl.k f2724b;

    /* renamed from: c, reason: collision with root package name */
    private int f2725c;

    /* renamed from: d, reason: collision with root package name */
    private g1.a f2726d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2727e;

    /* renamed from: f, reason: collision with root package name */
    private final g1 f2728f;

    /* renamed from: g, reason: collision with root package name */
    g1.a f2729g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f2730h;

    /* renamed from: i, reason: collision with root package name */
    private final LongSparseArray<h0> f2731i;

    /* renamed from: j, reason: collision with root package name */
    private final LongSparseArray<o> f2732j;

    /* renamed from: k, reason: collision with root package name */
    private int f2733k;

    /* renamed from: l, reason: collision with root package name */
    private final List<o> f2734l;

    /* renamed from: m, reason: collision with root package name */
    private final List<o> f2735m;

    /* loaded from: classes.dex */
    class a extends androidx.camera.core.impl.k {
        a() {
        }

        @Override // androidx.camera.core.impl.k
        public void b(androidx.camera.core.impl.s sVar) {
            super.b(sVar);
            q.this.s(sVar);
        }
    }

    public q(int i10, int i11, int i12, int i13) {
        this(j(i10, i11, i12, i13));
    }

    q(g1 g1Var) {
        this.f2723a = new Object();
        this.f2724b = new a();
        this.f2725c = 0;
        this.f2726d = new g1.a() { // from class: w.p0
            @Override // androidx.camera.core.impl.g1.a
            public final void a(androidx.camera.core.impl.g1 g1Var2) {
                androidx.camera.core.q.this.p(g1Var2);
            }
        };
        this.f2727e = false;
        this.f2731i = new LongSparseArray<>();
        this.f2732j = new LongSparseArray<>();
        this.f2735m = new ArrayList();
        this.f2728f = g1Var;
        this.f2733k = 0;
        this.f2734l = new ArrayList(e());
    }

    private static g1 j(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void k(o oVar) {
        synchronized (this.f2723a) {
            int indexOf = this.f2734l.indexOf(oVar);
            if (indexOf >= 0) {
                this.f2734l.remove(indexOf);
                int i10 = this.f2733k;
                if (indexOf <= i10) {
                    this.f2733k = i10 - 1;
                }
            }
            this.f2735m.remove(oVar);
            if (this.f2725c > 0) {
                n(this.f2728f);
            }
        }
    }

    private void l(u uVar) {
        final g1.a aVar;
        Executor executor;
        synchronized (this.f2723a) {
            if (this.f2734l.size() < e()) {
                uVar.a(this);
                this.f2734l.add(uVar);
                aVar = this.f2729g;
                executor = this.f2730h;
            } else {
                o0.a("TAG", "Maximum image number reached.");
                uVar.close();
                aVar = null;
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: w.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.q.this.o(aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(g1.a aVar) {
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(g1 g1Var) {
        synchronized (this.f2723a) {
            this.f2725c++;
        }
        n(g1Var);
    }

    private void q() {
        synchronized (this.f2723a) {
            for (int size = this.f2731i.size() - 1; size >= 0; size--) {
                h0 valueAt = this.f2731i.valueAt(size);
                long c10 = valueAt.c();
                o oVar = this.f2732j.get(c10);
                if (oVar != null) {
                    this.f2732j.remove(c10);
                    this.f2731i.removeAt(size);
                    l(new u(oVar, valueAt));
                }
            }
            r();
        }
    }

    private void r() {
        synchronized (this.f2723a) {
            if (this.f2732j.size() != 0 && this.f2731i.size() != 0) {
                Long valueOf = Long.valueOf(this.f2732j.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f2731i.keyAt(0));
                androidx.core.util.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f2732j.size() - 1; size >= 0; size--) {
                        if (this.f2732j.keyAt(size) < valueOf2.longValue()) {
                            this.f2732j.valueAt(size).close();
                            this.f2732j.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f2731i.size() - 1; size2 >= 0; size2--) {
                        if (this.f2731i.keyAt(size2) < valueOf.longValue()) {
                            this.f2731i.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.e.a
    public void a(o oVar) {
        synchronized (this.f2723a) {
            k(oVar);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public o b() {
        synchronized (this.f2723a) {
            if (this.f2734l.isEmpty()) {
                return null;
            }
            if (this.f2733k >= this.f2734l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f2734l.size() - 1; i10++) {
                if (!this.f2735m.contains(this.f2734l.get(i10))) {
                    arrayList.add(this.f2734l.get(i10));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((o) it.next()).close();
            }
            int size = this.f2734l.size() - 1;
            List<o> list = this.f2734l;
            this.f2733k = size + 1;
            o oVar = list.get(size);
            this.f2735m.add(oVar);
            return oVar;
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int c() {
        int c10;
        synchronized (this.f2723a) {
            c10 = this.f2728f.c();
        }
        return c10;
    }

    @Override // androidx.camera.core.impl.g1
    public void close() {
        synchronized (this.f2723a) {
            if (this.f2727e) {
                return;
            }
            Iterator it = new ArrayList(this.f2734l).iterator();
            while (it.hasNext()) {
                ((o) it.next()).close();
            }
            this.f2734l.clear();
            this.f2728f.close();
            this.f2727e = true;
        }
    }

    @Override // androidx.camera.core.impl.g1
    public void d() {
        synchronized (this.f2723a) {
            this.f2728f.d();
            this.f2729g = null;
            this.f2730h = null;
            this.f2725c = 0;
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int e() {
        int e10;
        synchronized (this.f2723a) {
            e10 = this.f2728f.e();
        }
        return e10;
    }

    @Override // androidx.camera.core.impl.g1
    public void f(g1.a aVar, Executor executor) {
        synchronized (this.f2723a) {
            this.f2729g = (g1.a) androidx.core.util.h.k(aVar);
            this.f2730h = (Executor) androidx.core.util.h.k(executor);
            this.f2728f.f(this.f2726d, executor);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public o g() {
        synchronized (this.f2723a) {
            if (this.f2734l.isEmpty()) {
                return null;
            }
            if (this.f2733k >= this.f2734l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List<o> list = this.f2734l;
            int i10 = this.f2733k;
            this.f2733k = i10 + 1;
            o oVar = list.get(i10);
            this.f2735m.add(oVar);
            return oVar;
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int getHeight() {
        int height;
        synchronized (this.f2723a) {
            height = this.f2728f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2723a) {
            surface = this.f2728f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.g1
    public int getWidth() {
        int width;
        synchronized (this.f2723a) {
            width = this.f2728f.getWidth();
        }
        return width;
    }

    public androidx.camera.core.impl.k m() {
        return this.f2724b;
    }

    void n(g1 g1Var) {
        o oVar;
        synchronized (this.f2723a) {
            if (this.f2727e) {
                return;
            }
            int size = this.f2732j.size() + this.f2734l.size();
            if (size >= g1Var.e()) {
                o0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    oVar = g1Var.g();
                    if (oVar != null) {
                        this.f2725c--;
                        size++;
                        this.f2732j.put(oVar.e1().c(), oVar);
                        q();
                    }
                } catch (IllegalStateException e10) {
                    o0.b("MetadataImageReader", "Failed to acquire next image.", e10);
                    oVar = null;
                }
                if (oVar == null || this.f2725c <= 0) {
                    break;
                }
            } while (size < g1Var.e());
        }
    }

    void s(androidx.camera.core.impl.s sVar) {
        synchronized (this.f2723a) {
            if (this.f2727e) {
                return;
            }
            this.f2731i.put(sVar.c(), new b0.b(sVar));
            q();
        }
    }
}
