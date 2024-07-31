package p407w;

/* renamed from: w.q */
/* loaded from: classes.dex */
public abstract class AbstractC12032q {

    /* renamed from: w.q$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public static a m38661a(int i10) {
            return m38662b(i10, null);
        }

        /* renamed from: b */
        public static a m38662b(int i10, Throwable th2) {
            return new C11995c(i10, th2);
        }

        /* renamed from: c */
        public abstract Throwable mo38572c();

        /* renamed from: d */
        public abstract int mo38573d();
    }

    /* renamed from: w.q$b */
    /* loaded from: classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static AbstractC12032q m38659a(b bVar) {
        return m38660b(bVar, null);
    }

    /* renamed from: b */
    public static AbstractC12032q m38660b(b bVar, a aVar) {
        return new C11992b(bVar, aVar);
    }

    /* renamed from: c */
    public abstract a mo38570c();

    /* renamed from: d */
    public abstract b mo38571d();
}
