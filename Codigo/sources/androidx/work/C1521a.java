package androidx.work;

import androidx.core.util.InterfaceC0977a;
import androidx.work.impl.C1550d;
import com.google.android.gms.common.api.C5101a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p094f2.AbstractC7275h;
import p094f2.AbstractC7289v;
import p094f2.InterfaceC7284q;

/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class C1521a {

    /* renamed from: a */
    final Executor f6533a;

    /* renamed from: b */
    final Executor f6534b;

    /* renamed from: c */
    final AbstractC7289v f6535c;

    /* renamed from: d */
    final AbstractC7275h f6536d;

    /* renamed from: e */
    final InterfaceC7284q f6537e;

    /* renamed from: f */
    final InterfaceC0977a<Throwable> f6538f;

    /* renamed from: g */
    final InterfaceC0977a<Throwable> f6539g;

    /* renamed from: h */
    final String f6540h;

    /* renamed from: i */
    final int f6541i;

    /* renamed from: j */
    final int f6542j;

    /* renamed from: k */
    final int f6543k;

    /* renamed from: l */
    final int f6544l;

    /* renamed from: m */
    private final boolean f6545m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6546a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f6547b;

        a(boolean z10) {
            this.f6547b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f6547b ? "WM.task-" : "androidx.work-") + this.f6546a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        Executor f6549a;

        /* renamed from: b */
        AbstractC7289v f6550b;

        /* renamed from: c */
        AbstractC7275h f6551c;

        /* renamed from: d */
        Executor f6552d;

        /* renamed from: e */
        InterfaceC7284q f6553e;

        /* renamed from: f */
        InterfaceC0977a<Throwable> f6554f;

        /* renamed from: g */
        InterfaceC0977a<Throwable> f6555g;

        /* renamed from: h */
        String f6556h;

        /* renamed from: i */
        int f6557i = 4;

        /* renamed from: j */
        int f6558j = 0;

        /* renamed from: k */
        int f6559k = C5101a.e.API_PRIORITY_OTHER;

        /* renamed from: l */
        int f6560l = 20;

        /* renamed from: a */
        public C1521a m8520a() {
            return new C1521a(this);
        }

        /* renamed from: b */
        public b m8521b(Executor executor) {
            this.f6549a = executor;
            return this;
        }
    }

    /* renamed from: androidx.work.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C1521a m8522a();
    }

    C1521a(b bVar) {
        Executor executor = bVar.f6549a;
        this.f6533a = executor == null ? m8506a(false) : executor;
        Executor executor2 = bVar.f6552d;
        if (executor2 == null) {
            this.f6545m = true;
            executor2 = m8506a(true);
        } else {
            this.f6545m = false;
        }
        this.f6534b = executor2;
        AbstractC7289v abstractC7289v = bVar.f6550b;
        this.f6535c = abstractC7289v == null ? AbstractC7289v.m21812c() : abstractC7289v;
        AbstractC7275h abstractC7275h = bVar.f6551c;
        this.f6536d = abstractC7275h == null ? AbstractC7275h.m21761c() : abstractC7275h;
        InterfaceC7284q interfaceC7284q = bVar.f6553e;
        this.f6537e = interfaceC7284q == null ? new C1550d() : interfaceC7284q;
        this.f6541i = bVar.f6557i;
        this.f6542j = bVar.f6558j;
        this.f6543k = bVar.f6559k;
        this.f6544l = bVar.f6560l;
        this.f6538f = bVar.f6554f;
        this.f6539g = bVar.f6555g;
        this.f6540h = bVar.f6556h;
    }

    /* renamed from: a */
    private Executor m8506a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m8507b(z10));
    }

    /* renamed from: b */
    private ThreadFactory m8507b(boolean z10) {
        return new a(z10);
    }

    /* renamed from: c */
    public String m8508c() {
        return this.f6540h;
    }

    /* renamed from: d */
    public Executor m8509d() {
        return this.f6533a;
    }

    /* renamed from: e */
    public InterfaceC0977a<Throwable> m8510e() {
        return this.f6538f;
    }

    /* renamed from: f */
    public AbstractC7275h m8511f() {
        return this.f6536d;
    }

    /* renamed from: g */
    public int m8512g() {
        return this.f6543k;
    }

    /* renamed from: h */
    public int m8513h() {
        return this.f6544l;
    }

    /* renamed from: i */
    public int m8514i() {
        return this.f6542j;
    }

    /* renamed from: j */
    public int m8515j() {
        return this.f6541i;
    }

    /* renamed from: k */
    public InterfaceC7284q m8516k() {
        return this.f6537e;
    }

    /* renamed from: l */
    public InterfaceC0977a<Throwable> m8517l() {
        return this.f6539g;
    }

    /* renamed from: m */
    public Executor m8518m() {
        return this.f6534b;
    }

    /* renamed from: n */
    public AbstractC7289v m8519n() {
        return this.f6535c;
    }
}
