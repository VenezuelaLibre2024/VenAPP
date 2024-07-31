package zk;

/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private static final el.h0 f32873a = new el.h0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final el.h0 f32874b = new el.h0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final el.h0 f32875c = new el.h0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final el.h0 f32876d = new el.h0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final el.h0 f32877e = new el.h0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final f1 f32878f = new f1(false);

    /* renamed from: g, reason: collision with root package name */
    private static final f1 f32879g = new f1(true);

    public static final Object g(Object obj) {
        return obj instanceof r1 ? new s1((r1) obj) : obj;
    }

    public static final Object h(Object obj) {
        r1 r1Var;
        s1 s1Var = obj instanceof s1 ? (s1) obj : null;
        return (s1Var == null || (r1Var = s1Var.f32927a) == null) ? obj : r1Var;
    }
}
