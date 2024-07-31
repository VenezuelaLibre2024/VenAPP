package k2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f20174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20175b;

    public a(String workSpecId, String prerequisiteId) {
        kotlin.jvm.internal.n.e(workSpecId, "workSpecId");
        kotlin.jvm.internal.n.e(prerequisiteId, "prerequisiteId");
        this.f20174a = workSpecId;
        this.f20175b = prerequisiteId;
    }

    public final String a() {
        return this.f20175b;
    }

    public final String b() {
        return this.f20174a;
    }
}
