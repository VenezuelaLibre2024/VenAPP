package p211l2;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1523c;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import p094f2.AbstractC7277j;
import p094f2.C7272e;
import p094f2.InterfaceC7273f;
import p192k2.C9132u;
import p230m2.InterfaceC9536b;

/* renamed from: l2.b0 */
/* loaded from: classes.dex */
public class RunnableC9347b0 implements Runnable {

    /* renamed from: r */
    static final String f22629r = AbstractC7277j.m21769i("WorkForegroundRunnable");

    /* renamed from: a */
    final C1583c<Void> f22630a = C1583c.m8801s();

    /* renamed from: b */
    final Context f22631b;

    /* renamed from: c */
    final C9132u f22632c;

    /* renamed from: d */
    final AbstractC1523c f22633d;

    /* renamed from: e */
    final InterfaceC7273f f22634e;

    /* renamed from: f */
    final InterfaceC9536b f22635f;

    /* renamed from: l2.b0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1583c f22636a;

        a(C1583c c1583c) {
            this.f22636a = c1583c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC9347b0.this.f22630a.isCancelled()) {
                return;
            }
            try {
                C7272e c7272e = (C7272e) this.f22636a.get();
                if (c7272e == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC9347b0.this.f22632c.f22007c + ") but did not provide ForegroundInfo");
                }
                AbstractC7277j.m21767e().mo21770a(RunnableC9347b0.f22629r, "Updating notification for " + RunnableC9347b0.this.f22632c.f22007c);
                RunnableC9347b0 runnableC9347b0 = RunnableC9347b0.this;
                runnableC9347b0.f22630a.mo8792q(runnableC9347b0.f22634e.mo21759a(runnableC9347b0.f22631b, runnableC9347b0.f22633d.getId(), c7272e));
            } catch (Throwable th2) {
                RunnableC9347b0.this.f22630a.mo8791p(th2);
            }
        }
    }

    public RunnableC9347b0(Context context, C9132u c9132u, AbstractC1523c abstractC1523c, InterfaceC7273f interfaceC7273f, InterfaceC9536b interfaceC9536b) {
        this.f22631b = context;
        this.f22632c = c9132u;
        this.f22633d = abstractC1523c;
        this.f22634e = interfaceC7273f;
        this.f22635f = interfaceC9536b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27838c(C1583c c1583c) {
        if (this.f22630a.isCancelled()) {
            c1583c.cancel(true);
        } else {
            c1583c.mo8792q(this.f22633d.getForegroundInfoAsync());
        }
    }

    /* renamed from: b */
    public InterfaceFutureC5920f<Void> m27839b() {
        return this.f22630a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f22632c.f22021q || Build.VERSION.SDK_INT >= 31) {
            this.f22630a.mo8790o(null);
            return;
        }
        final C1583c m8801s = C1583c.m8801s();
        this.f22635f.mo28363a().execute(new Runnable() { // from class: l2.a0
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC9347b0.this.m27838c(m8801s);
            }
        });
        m8801s.addListener(new a(m8801s), this.f22635f.mo28363a());
    }
}
