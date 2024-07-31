package p230m2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p211l2.C9369u;

/* renamed from: m2.c */
/* loaded from: classes.dex */
public class C9537c implements InterfaceC9536b {

    /* renamed from: a */
    private final C9369u f23188a;

    /* renamed from: b */
    final Handler f23189b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f23190c = new a();

    /* renamed from: m2.c$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C9537c.this.f23189b.post(runnable);
        }
    }

    public C9537c(Executor executor) {
        this.f23188a = new C9369u(executor);
    }

    @Override // p230m2.InterfaceC9536b
    /* renamed from: a */
    public Executor mo28363a() {
        return this.f23190c;
    }

    @Override // p230m2.InterfaceC9536b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9369u mo28364b() {
        return this.f23188a;
    }
}
