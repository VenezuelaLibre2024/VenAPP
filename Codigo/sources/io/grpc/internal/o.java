package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import vi.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    static final Logger f19017f = Logger.getLogger(vi.f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Object f19018a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final vi.i0 f19019b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<vi.d0> f19020c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19021d;

    /* renamed from: e, reason: collision with root package name */
    private int f19022e;

    /* loaded from: classes3.dex */
    class a extends ArrayDeque<vi.d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19023a;

        a(int i10) {
            this.f19023a = i10;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(vi.d0 d0Var) {
            if (size() == this.f19023a) {
                removeFirst();
            }
            o.a(o.this);
            return super.add(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19025a;

        static {
            int[] iArr = new int[d0.b.values().length];
            f19025a = iArr;
            try {
                iArr[d0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19025a[d0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(vi.i0 i0Var, int i10, long j10, String str) {
        eb.o.p(str, "description");
        this.f19019b = (vi.i0) eb.o.p(i0Var, "logId");
        this.f19020c = i10 > 0 ? new a(i10) : null;
        this.f19021d = j10;
        e(new d0.a().b(str + " created").c(d0.b.CT_INFO).e(j10).a());
    }

    static /* synthetic */ int a(o oVar) {
        int i10 = oVar.f19022e;
        oVar.f19022e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(vi.i0 i0Var, Level level, String str) {
        Logger logger = f19017f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + i0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vi.i0 b() {
        return this.f19019b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        boolean z10;
        synchronized (this.f19018a) {
            z10 = this.f19020c != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(vi.d0 d0Var) {
        int i10 = b.f19025a[d0Var.f29082b.ordinal()];
        Level level = i10 != 1 ? i10 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(d0Var);
        d(this.f19019b, level, d0Var.f29081a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(vi.d0 d0Var) {
        synchronized (this.f19018a) {
            Collection<vi.d0> collection = this.f19020c;
            if (collection != null) {
                collection.add(d0Var);
            }
        }
    }
}
