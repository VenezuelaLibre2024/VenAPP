package p371u1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1300f;
import androidx.savedstate.C1418a;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public final class C11299c {

    /* renamed from: d */
    public static final a f29317d = new a(null);

    /* renamed from: a */
    private final InterfaceC11300d f29318a;

    /* renamed from: b */
    private final C1418a f29319b;

    /* renamed from: c */
    private boolean f29320c;

    /* renamed from: u1.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C11299c m35302a(InterfaceC11300d owner) {
            C9322n.m27781e(owner, "owner");
            return new C11299c(owner, null);
        }
    }

    private C11299c(InterfaceC11300d interfaceC11300d) {
        this.f29318a = interfaceC11300d;
        this.f29319b = new C1418a();
    }

    public /* synthetic */ C11299c(InterfaceC11300d interfaceC11300d, C9315g c9315g) {
        this(interfaceC11300d);
    }

    /* renamed from: a */
    public static final C11299c m35297a(InterfaceC11300d interfaceC11300d) {
        return f29317d.m35302a(interfaceC11300d);
    }

    /* renamed from: b */
    public final C1418a m35298b() {
        return this.f29319b;
    }

    /* renamed from: c */
    public final void m35299c() {
        AbstractC1300f lifecycle = this.f29318a.getLifecycle();
        if (!(lifecycle.mo7315b() == AbstractC1300f.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo7314a(new Recreator(this.f29318a));
        this.f29319b.m8118e(lifecycle);
        this.f29320c = true;
    }

    /* renamed from: d */
    public final void m35300d(Bundle bundle) {
        if (!this.f29320c) {
            m35299c();
        }
        AbstractC1300f lifecycle = this.f29318a.getLifecycle();
        if (!lifecycle.mo7315b().m7325h(AbstractC1300f.b.STARTED)) {
            this.f29319b.m8119f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo7315b()).toString());
    }

    /* renamed from: e */
    public final void m35301e(Bundle outBundle) {
        C9322n.m27781e(outBundle, "outBundle");
        this.f29319b.m8120g(outBundle);
    }
}
