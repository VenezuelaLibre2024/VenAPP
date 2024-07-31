package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p082eb.C7159o;
import vi.AbstractC11910f;
import vi.C11905d0;
import vi.C11920i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.o */
/* loaded from: classes3.dex */
public final class C8881o {

    /* renamed from: f */
    static final Logger f20764f = Logger.getLogger(AbstractC11910f.class.getName());

    /* renamed from: a */
    private final Object f20765a = new Object();

    /* renamed from: b */
    private final C11920i0 f20766b;

    /* renamed from: c */
    private final Collection<C11905d0> f20767c;

    /* renamed from: d */
    private final long f20768d;

    /* renamed from: e */
    private int f20769e;

    /* renamed from: io.grpc.internal.o$a */
    /* loaded from: classes3.dex */
    class a extends ArrayDeque<C11905d0> {

        /* renamed from: a */
        final /* synthetic */ int f20770a;

        a(int i10) {
            this.f20770a = i10;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(C11905d0 c11905d0) {
            if (size() == this.f20770a) {
                removeFirst();
            }
            C8881o.m25697a(C8881o.this);
            return super.add(c11905d0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.o$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f20772a;

        static {
            int[] iArr = new int[C11905d0.b.values().length];
            f20772a = iArr;
            try {
                iArr[C11905d0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20772a[C11905d0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8881o(C11920i0 c11920i0, int i10, long j10, String str) {
        C7159o.m21313p(str, "description");
        this.f20766b = (C11920i0) C7159o.m21313p(c11920i0, "logId");
        this.f20767c = i10 > 0 ? new a(i10) : null;
        this.f20768d = j10;
        m25701e(new C11905d0.a().m38113b(str + " created").m38114c(C11905d0.b.CT_INFO).m38116e(j10).m38112a());
    }

    /* renamed from: a */
    static /* synthetic */ int m25697a(C8881o c8881o) {
        int i10 = c8881o.f20769e;
        c8881o.f20769e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m25698d(C11920i0 c11920i0, Level level, String str) {
        Logger logger = f20764f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c11920i0 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11920i0 m25699b() {
        return this.f20766b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m25700c() {
        boolean z10;
        synchronized (this.f20765a) {
            z10 = this.f20767c != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m25701e(C11905d0 c11905d0) {
        int i10 = b.f20772a[c11905d0.f31516b.ordinal()];
        Level level = i10 != 1 ? i10 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        m25702f(c11905d0);
        m25698d(this.f20766b, level, c11905d0.f31515a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m25702f(C11905d0 c11905d0) {
        synchronized (this.f20765a) {
            Collection<C11905d0> collection = this.f20767c;
            if (collection != null) {
                collection.add(c11905d0);
            }
        }
    }
}
