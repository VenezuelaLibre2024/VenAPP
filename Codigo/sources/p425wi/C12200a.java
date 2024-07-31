package p425wi;

import dm.C7056b;
import dm.C7081y;
import dm.InterfaceC7078v;
import io.grpc.internal.ExecutorC8836c2;
import java.io.IOException;
import java.net.Socket;
import p044cj.C2013b;
import p044cj.C2014c;
import p082eb.C7159o;
import p425wi.C12201b;
import p448xi.C12496i;
import p448xi.EnumC12488a;
import p448xi.InterfaceC12490c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.a */
/* loaded from: classes3.dex */
public final class C12200a implements InterfaceC7078v {

    /* renamed from: c */
    private final ExecutorC8836c2 f32481c;

    /* renamed from: d */
    private final C12201b.a f32482d;

    /* renamed from: e */
    private final int f32483e;

    /* renamed from: t */
    private InterfaceC7078v f32487t;

    /* renamed from: u */
    private Socket f32488u;

    /* renamed from: v */
    private boolean f32489v;

    /* renamed from: w */
    private int f32490w;

    /* renamed from: x */
    private int f32491x;

    /* renamed from: a */
    private final Object f32479a = new Object();

    /* renamed from: b */
    private final C7056b f32480b = new C7056b();

    /* renamed from: f */
    private boolean f32484f = false;

    /* renamed from: r */
    private boolean f32485r = false;

    /* renamed from: s */
    private boolean f32486s = false;

    /* renamed from: wi.a$a */
    /* loaded from: classes3.dex */
    class a extends e {

        /* renamed from: b */
        final C2013b f32492b;

        a() {
            super(C12200a.this, null);
            this.f32492b = C2014c.m10321e();
        }

        @Override // p425wi.C12200a.e
        /* renamed from: a */
        public void mo39165a() {
            int i10;
            C2014c.m10322f("WriteRunnable.runWrite");
            C2014c.m10320d(this.f32492b);
            C7056b c7056b = new C7056b();
            try {
                synchronized (C12200a.this.f32479a) {
                    c7056b.mo19710K0(C12200a.this.f32480b, C12200a.this.f32480b.m20721g());
                    C12200a.this.f32484f = false;
                    i10 = C12200a.this.f32491x;
                }
                C12200a.this.f32487t.mo19710K0(c7056b, c7056b.size());
                synchronized (C12200a.this.f32479a) {
                    C12200a.m39156g(C12200a.this, i10);
                }
            } finally {
                C2014c.m10324h("WriteRunnable.runWrite");
            }
        }
    }

    /* renamed from: wi.a$b */
    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: b */
        final C2013b f32494b;

        b() {
            super(C12200a.this, null);
            this.f32494b = C2014c.m10321e();
        }

        @Override // p425wi.C12200a.e
        /* renamed from: a */
        public void mo39165a() {
            C2014c.m10322f("WriteRunnable.runFlush");
            C2014c.m10320d(this.f32494b);
            C7056b c7056b = new C7056b();
            try {
                synchronized (C12200a.this.f32479a) {
                    c7056b.mo19710K0(C12200a.this.f32480b, C12200a.this.f32480b.size());
                    C12200a.this.f32485r = false;
                }
                C12200a.this.f32487t.mo19710K0(c7056b, c7056b.size());
                C12200a.this.f32487t.flush();
            } finally {
                C2014c.m10324h("WriteRunnable.runFlush");
            }
        }
    }

    /* renamed from: wi.a$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12200a.this.f32487t != null && C12200a.this.f32480b.size() > 0) {
                    C12200a.this.f32487t.mo19710K0(C12200a.this.f32480b, C12200a.this.f32480b.size());
                }
            } catch (IOException e10) {
                C12200a.this.f32482d.mo39177h(e10);
            }
            C12200a.this.f32480b.close();
            try {
                if (C12200a.this.f32487t != null) {
                    C12200a.this.f32487t.close();
                }
            } catch (IOException e11) {
                C12200a.this.f32482d.mo39177h(e11);
            }
            try {
                if (C12200a.this.f32488u != null) {
                    C12200a.this.f32488u.close();
                }
            } catch (IOException e12) {
                C12200a.this.f32482d.mo39177h(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wi.a$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC12202c {
        public d(InterfaceC12490c interfaceC12490c) {
            super(interfaceC12490c);
        }

        @Override // p425wi.AbstractC12202c, p448xi.InterfaceC12490c
        /* renamed from: h */
        public void mo39166h(boolean z10, int i10, int i11) {
            if (z10) {
                C12200a.m39161o(C12200a.this);
            }
            super.mo39166h(z10, i10, i11);
        }

        @Override // p425wi.AbstractC12202c, p448xi.InterfaceC12490c
        /* renamed from: o1 */
        public void mo39167o1(C12496i c12496i) {
            C12200a.m39161o(C12200a.this);
            super.mo39167o1(c12496i);
        }

        @Override // p425wi.AbstractC12202c, p448xi.InterfaceC12490c
        /* renamed from: s */
        public void mo39168s(int i10, EnumC12488a enumC12488a) {
            C12200a.m39161o(C12200a.this);
            super.mo39168s(i10, enumC12488a);
        }
    }

    /* renamed from: wi.a$e */
    /* loaded from: classes3.dex */
    private abstract class e implements Runnable {
        private e() {
        }

        /* synthetic */ e(C12200a c12200a, a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract void mo39165a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C12200a.this.f32487t == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                mo39165a();
            } catch (Exception e10) {
                C12200a.this.f32482d.mo39177h(e10);
            }
        }
    }

    private C12200a(ExecutorC8836c2 executorC8836c2, C12201b.a aVar, int i10) {
        this.f32481c = (ExecutorC8836c2) C7159o.m21313p(executorC8836c2, "executor");
        this.f32482d = (C12201b.a) C7159o.m21313p(aVar, "exceptionHandler");
        this.f32483e = i10;
    }

    /* renamed from: g */
    static /* synthetic */ int m39156g(C12200a c12200a, int i10) {
        int i11 = c12200a.f32491x - i10;
        c12200a.f32491x = i11;
        return i11;
    }

    /* renamed from: o */
    static /* synthetic */ int m39161o(C12200a c12200a) {
        int i10 = c12200a.f32490w;
        c12200a.f32490w = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static C12200a m39162y(ExecutorC8836c2 executorC8836c2, C12201b.a aVar, int i10) {
        return new C12200a(executorC8836c2, aVar, i10);
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: K0 */
    public void mo19710K0(C7056b c7056b, long j10) {
        C7159o.m21313p(c7056b, "source");
        if (this.f32486s) {
            throw new IOException("closed");
        }
        C2014c.m10322f("AsyncSink.write");
        try {
            synchronized (this.f32479a) {
                this.f32480b.mo19710K0(c7056b, j10);
                int i10 = this.f32491x + this.f32490w;
                this.f32491x = i10;
                boolean z10 = false;
                this.f32490w = 0;
                if (this.f32489v || i10 <= this.f32483e) {
                    if (!this.f32484f && !this.f32485r && this.f32480b.m20721g() > 0) {
                        this.f32484f = true;
                    }
                }
                this.f32489v = true;
                z10 = true;
                if (!z10) {
                    this.f32481c.execute(new a());
                    return;
                }
                try {
                    this.f32488u.close();
                } catch (IOException e10) {
                    this.f32482d.mo39177h(e10);
                }
            }
        } finally {
            C2014c.m10324h("AsyncSink.write");
        }
    }

    @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32486s) {
            return;
        }
        this.f32486s = true;
        this.f32481c.execute(new c());
    }

    @Override // dm.InterfaceC7078v, java.io.Flushable
    public void flush() {
        if (this.f32486s) {
            throw new IOException("closed");
        }
        C2014c.m10322f("AsyncSink.flush");
        try {
            synchronized (this.f32479a) {
                if (this.f32485r) {
                    return;
                }
                this.f32485r = true;
                this.f32481c.execute(new b());
            }
        } finally {
            C2014c.m10324h("AsyncSink.flush");
        }
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: m */
    public C7081y mo20683m() {
        return C7081y.f15697e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m39163q(InterfaceC7078v interfaceC7078v, Socket socket) {
        C7159o.m21319v(this.f32487t == null, "AsyncSink's becomeConnected should only be called once.");
        this.f32487t = (InterfaceC7078v) C7159o.m21313p(interfaceC7078v, "sink");
        this.f32488u = (Socket) C7159o.m21313p(socket, "socket");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public InterfaceC12490c m39164r(InterfaceC12490c interfaceC12490c) {
        return new d(interfaceC12490c);
    }
}
