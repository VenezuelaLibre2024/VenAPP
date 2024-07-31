package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0710o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p407w.InterfaceC12011h0;

/* renamed from: androidx.camera.core.e */
/* loaded from: classes.dex */
public abstract class AbstractC0592e implements InterfaceC0710o {

    /* renamed from: b */
    protected final InterfaceC0710o f2710b;

    /* renamed from: a */
    private final Object f2709a = new Object();

    /* renamed from: c */
    private final Set<a> f2711c = new HashSet();

    /* renamed from: androidx.camera.core.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo2902a(InterfaceC0710o interfaceC0710o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0592e(InterfaceC0710o interfaceC0710o) {
        this.f2710b = interfaceC0710o;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: Z */
    public void mo2882Z(Rect rect) {
        this.f2710b.mo2882Z(rect);
    }

    /* renamed from: a */
    public void m2900a(a aVar) {
        synchronized (this.f2709a) {
            this.f2711c.add(aVar);
        }
    }

    /* renamed from: b */
    protected void m2901b() {
        HashSet hashSet;
        synchronized (this.f2709a) {
            hashSet = new HashSet(this.f2711c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo2902a(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC0710o, java.lang.AutoCloseable
    public void close() {
        this.f2710b.close();
        m2901b();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: e1 */
    public InterfaceC12011h0 mo2883e1() {
        return this.f2710b.mo2883e1();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getFormat() {
        return this.f2710b.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getHeight() {
        return this.f2710b.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getWidth() {
        return this.f2710b.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: k1 */
    public Image mo2884k1() {
        return this.f2710b.mo2884k1();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: u0 */
    public InterfaceC0710o.a[] mo2885u0() {
        return this.f2710b.mo2885u0();
    }
}
