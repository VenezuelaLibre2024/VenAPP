package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.f;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final l f4924a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f4925b;

    /* renamed from: c, reason: collision with root package name */
    private a f4926c;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final l f4927a;

        /* renamed from: b, reason: collision with root package name */
        private final f.a f4928b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4929c;

        public a(l registry, f.a event) {
            kotlin.jvm.internal.n.e(registry, "registry");
            kotlin.jvm.internal.n.e(event, "event");
            this.f4927a = registry;
            this.f4928b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4929c) {
                return;
            }
            this.f4927a.h(this.f4928b);
            this.f4929c = true;
        }
    }

    public f0(k provider) {
        kotlin.jvm.internal.n.e(provider, "provider");
        this.f4924a = new l(provider);
        this.f4925b = new Handler();
    }

    private final void f(f.a aVar) {
        a aVar2 = this.f4926c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f4924a, aVar);
        this.f4926c = aVar3;
        Handler handler = this.f4925b;
        kotlin.jvm.internal.n.b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public f a() {
        return this.f4924a;
    }

    public void b() {
        f(f.a.ON_START);
    }

    public void c() {
        f(f.a.ON_CREATE);
    }

    public void d() {
        f(f.a.ON_STOP);
        f(f.a.ON_DESTROY);
    }

    public void e() {
        f(f.a.ON_START);
    }
}
