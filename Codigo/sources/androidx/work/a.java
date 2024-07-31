package androidx.work;

import androidx.work.impl.d;
import com.google.android.gms.common.api.a;
import f2.h;
import f2.q;
import f2.v;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f5682a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f5683b;

    /* renamed from: c, reason: collision with root package name */
    final v f5684c;

    /* renamed from: d, reason: collision with root package name */
    final h f5685d;

    /* renamed from: e, reason: collision with root package name */
    final q f5686e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.core.util.a<Throwable> f5687f;

    /* renamed from: g, reason: collision with root package name */
    final androidx.core.util.a<Throwable> f5688g;

    /* renamed from: h, reason: collision with root package name */
    final String f5689h;

    /* renamed from: i, reason: collision with root package name */
    final int f5690i;

    /* renamed from: j, reason: collision with root package name */
    final int f5691j;

    /* renamed from: k, reason: collision with root package name */
    final int f5692k;

    /* renamed from: l, reason: collision with root package name */
    final int f5693l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5694m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0092a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f5695a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5696b;

        ThreadFactoryC0092a(boolean z10) {
            this.f5696b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f5696b ? "WM.task-" : "androidx.work-") + this.f5695a.incrementAndGet());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f5698a;

        /* renamed from: b, reason: collision with root package name */
        v f5699b;

        /* renamed from: c, reason: collision with root package name */
        h f5700c;

        /* renamed from: d, reason: collision with root package name */
        Executor f5701d;

        /* renamed from: e, reason: collision with root package name */
        q f5702e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.util.a<Throwable> f5703f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.util.a<Throwable> f5704g;

        /* renamed from: h, reason: collision with root package name */
        String f5705h;

        /* renamed from: i, reason: collision with root package name */
        int f5706i = 4;

        /* renamed from: j, reason: collision with root package name */
        int f5707j = 0;

        /* renamed from: k, reason: collision with root package name */
        int f5708k = a.e.API_PRIORITY_OTHER;

        /* renamed from: l, reason: collision with root package name */
        int f5709l = 20;

        public a a() {
            return new a(this);
        }

        public b b(Executor executor) {
            this.f5698a = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.f5698a;
        this.f5682a = executor == null ? a(false) : executor;
        Executor executor2 = bVar.f5701d;
        if (executor2 == null) {
            this.f5694m = true;
            executor2 = a(true);
        } else {
            this.f5694m = false;
        }
        this.f5683b = executor2;
        v vVar = bVar.f5699b;
        this.f5684c = vVar == null ? v.c() : vVar;
        h hVar = bVar.f5700c;
        this.f5685d = hVar == null ? h.c() : hVar;
        q qVar = bVar.f5702e;
        this.f5686e = qVar == null ? new d() : qVar;
        this.f5690i = bVar.f5706i;
        this.f5691j = bVar.f5707j;
        this.f5692k = bVar.f5708k;
        this.f5693l = bVar.f5709l;
        this.f5687f = bVar.f5703f;
        this.f5688g = bVar.f5704g;
        this.f5689h = bVar.f5705h;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0092a(z10);
    }

    public String c() {
        return this.f5689h;
    }

    public Executor d() {
        return this.f5682a;
    }

    public androidx.core.util.a<Throwable> e() {
        return this.f5687f;
    }

    public h f() {
        return this.f5685d;
    }

    public int g() {
        return this.f5692k;
    }

    public int h() {
        return this.f5693l;
    }

    public int i() {
        return this.f5691j;
    }

    public int j() {
        return this.f5690i;
    }

    public q k() {
        return this.f5686e;
    }

    public androidx.core.util.a<Throwable> l() {
        return this.f5688g;
    }

    public Executor m() {
        return this.f5683b;
    }

    public v n() {
        return this.f5684c;
    }
}
