package w;

/* loaded from: classes.dex */
public abstract class q {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th2) {
            return new c(i10, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* loaded from: classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static q a(b bVar) {
        return b(bVar, null);
    }

    public static q b(b bVar, a aVar) {
        return new w.b(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
