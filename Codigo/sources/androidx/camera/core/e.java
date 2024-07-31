package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import w.h0;

/* loaded from: classes.dex */
public abstract class e implements o {

    /* renamed from: b, reason: collision with root package name */
    protected final o f2389b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2388a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Set<a> f2390c = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void a(o oVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(o oVar) {
        this.f2389b = oVar;
    }

    @Override // androidx.camera.core.o
    public void Z(Rect rect) {
        this.f2389b.Z(rect);
    }

    public void a(a aVar) {
        synchronized (this.f2388a) {
            this.f2390c.add(aVar);
        }
    }

    protected void b() {
        HashSet hashSet;
        synchronized (this.f2388a) {
            hashSet = new HashSet(this.f2390c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f2389b.close();
        b();
    }

    @Override // androidx.camera.core.o
    public h0 e1() {
        return this.f2389b.e1();
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f2389b.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f2389b.getHeight();
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        return this.f2389b.getWidth();
    }

    @Override // androidx.camera.core.o
    public Image k1() {
        return this.f2389b.k1();
    }

    @Override // androidx.camera.core.o
    public o.a[] u0() {
        return this.f2389b.u0();
    }
}
