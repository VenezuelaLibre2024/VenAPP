package m2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import l2.u;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final u f21335a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f21336b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f21337c = new a();

    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f21336b.post(runnable);
        }
    }

    public c(Executor executor) {
        this.f21335a = new u(executor);
    }

    @Override // m2.b
    public Executor a() {
        return this.f21337c;
    }

    @Override // m2.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public u b() {
        return this.f21335a;
    }
}
