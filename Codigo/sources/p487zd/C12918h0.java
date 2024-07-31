package p487zd;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import de.AbstractC6896i;
import de.AbstractC6900m;
import de.C6888a;
import dj.AbstractC6977b;
import dj.AbstractC6985j;
import dj.AbstractC6993r;
import dj.InterfaceC6989n;
import java.util.concurrent.Callable;
import p043ce.InterfaceC1956a;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p311qd.InterfaceC10460t;
import pf.C10163a;

/* renamed from: zd.h0 */
/* loaded from: classes.dex */
public class C12918h0 implements InterfaceC10460t {

    /* renamed from: a */
    private final C12989w0 f35150a;

    /* renamed from: b */
    private final InterfaceC1956a f35151b;

    /* renamed from: c */
    private final C12956o3 f35152c;

    /* renamed from: d */
    private final C12946m3 f35153d;

    /* renamed from: e */
    private final C12932k f35154e;

    /* renamed from: f */
    private final AbstractC6900m f35155f;

    /* renamed from: g */
    private final C12965q2 f35156g;

    /* renamed from: h */
    private final C12947n f35157h;

    /* renamed from: i */
    private final AbstractC6896i f35158i;

    /* renamed from: j */
    private final String f35159j;

    /* renamed from: k */
    private boolean f35160k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12918h0(C12989w0 c12989w0, InterfaceC1956a interfaceC1956a, C12956o3 c12956o3, C12946m3 c12946m3, C12932k c12932k, AbstractC6900m abstractC6900m, C12965q2 c12965q2, C12947n c12947n, AbstractC6896i abstractC6896i, String str) {
        this.f35150a = c12989w0;
        this.f35151b = interfaceC1956a;
        this.f35152c = c12956o3;
        this.f35153d = c12946m3;
        this.f35154e = c12932k;
        this.f35155f = abstractC6900m;
        this.f35156g = c12965q2;
        this.f35157h = c12947n;
        this.f35158i = abstractC6896i;
        this.f35159j = str;
    }

    /* renamed from: A */
    private void m42708A(String str) {
        m42709B(str, null);
    }

    /* renamed from: B */
    private void m42709B(String str, AbstractC6985j<String> abstractC6985j) {
        C12940l2.m42840a(abstractC6985j != null ? String.format("Not recording: %s. Reason: %s", str, abstractC6985j) : this.f35158i.m19929a().m19903c() ? String.format("Not recording: %s. Reason: Message is test message", str) : !this.f35157h.m42876b() ? String.format("Not recording: %s. Reason: Data collection is disabled", str) : String.format("Not recording: %s", str));
    }

    /* renamed from: C */
    private Task<Void> m42710C(AbstractC6977b abstractC6977b) {
        if (!this.f35160k) {
            mo31383d();
        }
        return m42713F(abstractC6977b.m20209q(), this.f35152c.m42881a());
    }

    /* renamed from: D */
    private Task<Void> m42711D(final C6888a c6888a) {
        C12940l2.m42840a("Attempting to record: message click to metrics logger");
        return m42710C(AbstractC6977b.m20195j(new InterfaceC9073a() { // from class: zd.y
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12918h0.this.m42729r(c6888a);
            }
        }));
    }

    /* renamed from: E */
    private AbstractC6977b m42712E() {
        String m19901a = this.f35158i.m19929a().m19901a();
        C12940l2.m42840a("Attempting to record message impression in impression store for id: " + m19901a);
        AbstractC6977b m20202g = this.f35150a.m42970r(C10163a.m30379f0().m30384J(this.f35151b.mo10198a()).m30383I(m19901a).build()).m20203h(new InterfaceC9076d() { // from class: zd.e0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12940l2.m42841b("Impression store write failure");
            }
        }).m20202g(new InterfaceC9073a() { // from class: zd.f0
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12940l2.m42840a("Impression store write success");
            }
        });
        return C12925i2.m42754Q(this.f35159j) ? this.f35153d.m42870l(this.f35155f).m20203h(new InterfaceC9076d() { // from class: zd.g0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12940l2.m42841b("Rate limiter client write failure");
            }
        }).m20202g(new InterfaceC9073a() { // from class: zd.w
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12940l2.m42840a("Rate limiter client write success");
            }
        }).m20204l().m20200c(m20202g) : m20202g;
    }

    /* renamed from: F */
    private static <T> Task<T> m42713F(AbstractC6985j<T> abstractC6985j, AbstractC6993r abstractC6993r) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC6985j.m20259f(new InterfaceC9076d() { // from class: zd.b0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                TaskCompletionSource.this.setResult(obj);
            }
        }).m20274x(AbstractC6985j.m20254l(new Callable() { // from class: zd.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m42735x;
                m42735x = C12918h0.m42735x(TaskCompletionSource.this);
                return m42735x;
            }
        })).m20268r(new InterfaceC9077e() { // from class: zd.d0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6989n m42734w;
                m42734w = C12918h0.m42734w(TaskCompletionSource.this, (Throwable) obj);
                return m42734w;
            }
        }).m20272v(abstractC6993r).m20269s();
        return taskCompletionSource.getTask();
    }

    /* renamed from: G */
    private boolean m42714G() {
        return this.f35157h.m42876b();
    }

    /* renamed from: H */
    private AbstractC6977b m42715H() {
        return AbstractC6977b.m20195j(new InterfaceC9073a() { // from class: zd.x
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12918h0.this.m42737z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m42727p(InterfaceC10460t.b bVar) {
        this.f35156g.m42906u(this.f35158i, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m42728q() {
        this.f35156g.m42904s(this.f35158i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m42729r(C6888a c6888a) {
        this.f35156g.m42905t(this.f35158i, c6888a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ InterfaceC6989n m42734w(TaskCompletionSource taskCompletionSource, Throwable th2) {
        if (th2 instanceof Exception) {
            taskCompletionSource.setException((Exception) th2);
        } else {
            taskCompletionSource.setException(new RuntimeException(th2));
        }
        return AbstractC6985j.m20253g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ Object m42735x(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m42736y(InterfaceC10460t.a aVar) {
        this.f35156g.m42903q(this.f35158i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m42737z() {
        this.f35160k = true;
    }

    @Override // p311qd.InterfaceC10460t
    /* renamed from: a */
    public Task<Void> mo31380a(C6888a c6888a) {
        if (m42714G()) {
            return c6888a.m19871b() == null ? mo31381b(InterfaceC10460t.a.CLICK) : m42711D(c6888a);
        }
        m42708A("message click to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    @Override // p311qd.InterfaceC10460t
    /* renamed from: b */
    public Task<Void> mo31381b(final InterfaceC10460t.a aVar) {
        if (!m42714G()) {
            m42708A("message dismissal to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        C12940l2.m42840a("Attempting to record: message dismissal to metrics logger");
        return m42710C(AbstractC6977b.m20195j(new InterfaceC9073a() { // from class: zd.v
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12918h0.this.m42736y(aVar);
            }
        }));
    }

    @Override // p311qd.InterfaceC10460t
    /* renamed from: c */
    public Task<Void> mo31382c(final InterfaceC10460t.b bVar) {
        if (!m42714G()) {
            m42708A("render error to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        C12940l2.m42840a("Attempting to record: render error to metrics logger");
        return m42713F(m42712E().m20200c(AbstractC6977b.m20195j(new InterfaceC9073a() { // from class: zd.z
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12918h0.this.m42727p(bVar);
            }
        })).m20200c(m42715H()).m20209q(), this.f35152c.m42881a());
    }

    @Override // p311qd.InterfaceC10460t
    /* renamed from: d */
    public Task<Void> mo31383d() {
        if (!m42714G() || this.f35160k) {
            m42708A("message impression to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        C12940l2.m42840a("Attempting to record: message impression to metrics logger");
        return m42713F(m42712E().m20200c(AbstractC6977b.m20195j(new InterfaceC9073a() { // from class: zd.a0
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12918h0.this.m42728q();
            }
        })).m20200c(m42715H()).m20209q(), this.f35152c.m42881a());
    }
}
