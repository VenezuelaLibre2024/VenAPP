package zk;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final el.h0 f32905a = new el.h0("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final el.h0 f32906b = new el.h0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
