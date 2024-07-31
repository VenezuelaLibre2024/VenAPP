package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1300f;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes.dex */
public class C1301f0 {

    /* renamed from: a */
    private final C1312l f5678a;

    /* renamed from: b */
    private final Handler f5679b;

    /* renamed from: c */
    private a f5680c;

    /* renamed from: androidx.lifecycle.f0$a */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        private final C1312l f5681a;

        /* renamed from: b */
        private final AbstractC1300f.a f5682b;

        /* renamed from: c */
        private boolean f5683c;

        public a(C1312l registry, AbstractC1300f.a event) {
            C9322n.m27781e(registry, "registry");
            C9322n.m27781e(event, "event");
            this.f5681a = registry;
            this.f5682b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5683c) {
                return;
            }
            this.f5681a.m7360h(this.f5682b);
            this.f5683c = true;
        }
    }

    public C1301f0(InterfaceC1310k provider) {
        C9322n.m27781e(provider, "provider");
        this.f5678a = new C1312l(provider);
        this.f5679b = new Handler();
    }

    /* renamed from: f */
    private final void m7326f(AbstractC1300f.a aVar) {
        a aVar2 = this.f5680c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f5678a, aVar);
        this.f5680c = aVar3;
        Handler handler = this.f5679b;
        C9322n.m27778b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    /* renamed from: a */
    public AbstractC1300f m7327a() {
        return this.f5678a;
    }

    /* renamed from: b */
    public void m7328b() {
        m7326f(AbstractC1300f.a.ON_START);
    }

    /* renamed from: c */
    public void m7329c() {
        m7326f(AbstractC1300f.a.ON_CREATE);
    }

    /* renamed from: d */
    public void m7330d() {
        m7326f(AbstractC1300f.a.ON_STOP);
        m7326f(AbstractC1300f.a.ON_DESTROY);
    }

    /* renamed from: e */
    public void m7331e() {
        m7326f(AbstractC1300f.a.ON_START);
    }
}
