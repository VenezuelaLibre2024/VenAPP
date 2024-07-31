package fj;

import android.os.Handler;
import android.os.Message;
import dj.AbstractC6993r;
import java.util.concurrent.TimeUnit;
import p123gj.C7579c;
import p123gj.InterfaceC7578b;
import p471yj.C12727a;

/* renamed from: fj.b */
/* loaded from: classes3.dex */
final class C7366b extends AbstractC6993r {

    /* renamed from: b */
    private final Handler f16671b;

    /* renamed from: fj.b$a */
    /* loaded from: classes3.dex */
    private static final class a extends AbstractC6993r.b {

        /* renamed from: a */
        private final Handler f16672a;

        /* renamed from: b */
        private volatile boolean f16673b;

        a(Handler handler) {
            this.f16672a = handler;
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: c */
        public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f16673b) {
                return C7579c.m23024a();
            }
            b bVar = new b(this.f16672a, C12727a.m41997s(runnable));
            Message obtain = Message.obtain(this.f16672a, bVar);
            obtain.obj = this;
            this.f16672a.sendMessageDelayed(obtain, timeUnit.toMillis(j10));
            if (!this.f16673b) {
                return bVar;
            }
            this.f16672a.removeCallbacks(bVar);
            return C7579c.m23024a();
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f16673b = true;
            this.f16672a.removeCallbacksAndMessages(this);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f16673b;
        }
    }

    /* renamed from: fj.b$b */
    /* loaded from: classes3.dex */
    private static final class b implements Runnable, InterfaceC7578b {

        /* renamed from: a */
        private final Handler f16674a;

        /* renamed from: b */
        private final Runnable f16675b;

        /* renamed from: c */
        private volatile boolean f16676c;

        b(Handler handler, Runnable runnable) {
            this.f16674a = handler;
            this.f16675b = runnable;
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f16676c = true;
            this.f16674a.removeCallbacks(this);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f16676c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16675b.run();
            } catch (Throwable th2) {
                C12727a.m41995q(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7366b(Handler handler) {
        this.f16671b = handler;
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new a(this.f16671b);
    }

    @Override // dj.AbstractC6993r
    /* renamed from: c */
    public InterfaceC7578b mo20300c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.f16671b, C12727a.m41997s(runnable));
        this.f16671b.postDelayed(bVar, timeUnit.toMillis(j10));
        return bVar;
    }
}
