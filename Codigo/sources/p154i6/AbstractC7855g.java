package p154i6;

/* renamed from: i6.g */
/* loaded from: classes.dex */
public abstract class AbstractC7855g {

    /* renamed from: i6.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC7855g m24156a() {
        return new C7850b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC7855g m24157d() {
        return new C7850b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC7855g m24158e(long j10) {
        return new C7850b(a.OK, j10);
    }

    /* renamed from: f */
    public static AbstractC7855g m24159f() {
        return new C7850b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo24149b();

    /* renamed from: c */
    public abstract a mo24150c();
}
