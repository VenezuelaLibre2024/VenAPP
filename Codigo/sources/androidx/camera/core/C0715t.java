package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.C0715t;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.InterfaceC0623g1;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.t */
/* loaded from: classes.dex */
public class C0715t implements InterfaceC0623g1 {

    /* renamed from: d */
    private final InterfaceC0623g1 f3098d;

    /* renamed from: e */
    private final Surface f3099e;

    /* renamed from: f */
    private AbstractC0592e.a f3100f;

    /* renamed from: a */
    private final Object f3095a = new Object();

    /* renamed from: b */
    private int f3096b = 0;

    /* renamed from: c */
    private boolean f3097c = false;

    /* renamed from: g */
    private final AbstractC0592e.a f3101g = new AbstractC0592e.a() { // from class: w.v0
        @Override // androidx.camera.core.AbstractC0592e.a
        /* renamed from: a */
        public final void mo2902a(InterfaceC0710o interfaceC0710o) {
            C0715t.this.m3530j(interfaceC0710o);
        }
    };

    public C0715t(InterfaceC0623g1 interfaceC0623g1) {
        this.f3098d = interfaceC0623g1;
        this.f3099e = interfaceC0623g1.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m3530j(InterfaceC0710o interfaceC0710o) {
        AbstractC0592e.a aVar;
        synchronized (this.f3095a) {
            int i10 = this.f3096b - 1;
            this.f3096b = i10;
            if (this.f3097c && i10 == 0) {
                close();
            }
            aVar = this.f3100f;
        }
        if (aVar != null) {
            aVar.mo2902a(interfaceC0710o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m3531k(InterfaceC0623g1.a aVar, InterfaceC0623g1 interfaceC0623g1) {
        aVar.mo2863a(this);
    }

    /* renamed from: n */
    private InterfaceC0710o m3532n(InterfaceC0710o interfaceC0710o) {
        if (interfaceC0710o == null) {
            return null;
        }
        this.f3096b++;
        C0717v c0717v = new C0717v(interfaceC0710o);
        c0717v.m2900a(this.f3101g);
        return c0717v;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: b */
    public InterfaceC0710o mo2894b() {
        InterfaceC0710o m3532n;
        synchronized (this.f3095a) {
            m3532n = m3532n(this.f3098d.mo2894b());
        }
        return m3532n;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: c */
    public int mo2895c() {
        int mo2895c;
        synchronized (this.f3095a) {
            mo2895c = this.f3098d.mo2895c();
        }
        return mo2895c;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public void close() {
        synchronized (this.f3095a) {
            Surface surface = this.f3099e;
            if (surface != null) {
                surface.release();
            }
            this.f3098d.close();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: d */
    public void mo2896d() {
        synchronized (this.f3095a) {
            this.f3098d.mo2896d();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: e */
    public int mo2897e() {
        int mo2897e;
        synchronized (this.f3095a) {
            mo2897e = this.f3098d.mo2897e();
        }
        return mo2897e;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: f */
    public void mo2898f(final InterfaceC0623g1.a aVar, Executor executor) {
        synchronized (this.f3095a) {
            this.f3098d.mo2898f(new InterfaceC0623g1.a() { // from class: w.w0
                @Override // androidx.camera.core.impl.InterfaceC0623g1.a
                /* renamed from: a */
                public final void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
                    C0715t.this.m3531k(aVar, interfaceC0623g1);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: g */
    public InterfaceC0710o mo2899g() {
        InterfaceC0710o m3532n;
        synchronized (this.f3095a) {
            m3532n = m3532n(this.f3098d.mo2899g());
        }
        return m3532n;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getHeight() {
        int height;
        synchronized (this.f3095a) {
            height = this.f3098d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f3095a) {
            surface = this.f3098d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getWidth() {
        int width;
        synchronized (this.f3095a) {
            width = this.f3098d.getWidth();
        }
        return width;
    }

    /* renamed from: i */
    public int m3533i() {
        int mo2897e;
        synchronized (this.f3095a) {
            mo2897e = this.f3098d.mo2897e() - this.f3096b;
        }
        return mo2897e;
    }

    /* renamed from: l */
    public void m3534l() {
        synchronized (this.f3095a) {
            this.f3097c = true;
            this.f3098d.mo2896d();
            if (this.f3096b == 0) {
                close();
            }
        }
    }

    /* renamed from: m */
    public void m3535m(AbstractC0592e.a aVar) {
        synchronized (this.f3095a) {
            this.f3100f = aVar;
        }
    }
}
