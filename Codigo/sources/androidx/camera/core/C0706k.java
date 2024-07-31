package androidx.camera.core;

import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.C0706k;
import androidx.camera.core.impl.InterfaceC0623g1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.k */
/* loaded from: classes.dex */
public final class C0706k extends AbstractC0596i {

    /* renamed from: t */
    final Executor f3041t;

    /* renamed from: u */
    private final Object f3042u = new Object();

    /* renamed from: v */
    InterfaceC0710o f3043v;

    /* renamed from: w */
    private b f3044w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.k$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ b f3045a;

        a(b bVar) {
            this.f3045a = bVar;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            this.f3045a.close();
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.k$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC0592e {

        /* renamed from: d */
        final WeakReference<C0706k> f3047d;

        b(InterfaceC0710o interfaceC0710o, C0706k c0706k) {
            super(interfaceC0710o);
            this.f3047d = new WeakReference<>(c0706k);
            m2900a(new AbstractC0592e.a() { // from class: androidx.camera.core.l
                @Override // androidx.camera.core.AbstractC0592e.a
                /* renamed from: a */
                public final void mo2902a(InterfaceC0710o interfaceC0710o2) {
                    C0706k.b.this.m3437i(interfaceC0710o2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m3437i(InterfaceC0710o interfaceC0710o) {
            final C0706k c0706k = this.f3047d.get();
            if (c0706k != null) {
                c0706k.f3041t.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0706k.this.m3432z();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0706k(Executor executor) {
        this.f3041t = executor;
    }

    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: d */
    InterfaceC0710o mo2957d(InterfaceC0623g1 interfaceC0623g1) {
        return interfaceC0623g1.mo2894b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: g */
    public void mo2960g() {
        synchronized (this.f3042u) {
            InterfaceC0710o interfaceC0710o = this.f3043v;
            if (interfaceC0710o != null) {
                interfaceC0710o.close();
                this.f3043v = null;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: o */
    void mo2962o(InterfaceC0710o interfaceC0710o) {
        synchronized (this.f3042u) {
            if (!this.f2756s) {
                interfaceC0710o.close();
                return;
            }
            if (this.f3044w == null) {
                b bVar = new b(interfaceC0710o, this);
                this.f3044w = bVar;
                C0009f.m16b(m2958e(bVar), new a(bVar), C12747a.m42280a());
            } else {
                if (interfaceC0710o.mo2883e1().mo8853c() <= this.f3044w.mo2883e1().mo8853c()) {
                    interfaceC0710o.close();
                } else {
                    InterfaceC0710o interfaceC0710o2 = this.f3043v;
                    if (interfaceC0710o2 != null) {
                        interfaceC0710o2.close();
                    }
                    this.f3043v = interfaceC0710o;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m3432z() {
        synchronized (this.f3042u) {
            this.f3044w = null;
            InterfaceC0710o interfaceC0710o = this.f3043v;
            if (interfaceC0710o != null) {
                this.f3043v = null;
                mo2962o(interfaceC0710o);
            }
        }
    }
}
