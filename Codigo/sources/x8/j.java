package x8;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f30699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30700b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30701c;

    private j(int i10, String str, long j10) {
        this.f30699a = i10;
        this.f30700b = str;
        this.f30701c = j10;
    }

    public static j d(int i10, String str, long j10) {
        return new j(i10, str, j10);
    }

    public String a() {
        return this.f30700b;
    }

    public int b() {
        return this.f30699a;
    }

    public long c() {
        return this.f30701c;
    }
}
