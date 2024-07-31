package wg;

/* loaded from: classes2.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f29994b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29995c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29996d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(int i10, String str) {
        super(i10);
        this.f29994b = str;
        this.f29996d = false;
        this.f29995c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(int i10, String str, int i11) {
        super(i10);
        this.f29996d = true;
        this.f29995c = i11;
        this.f29994b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f29994b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f29995c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f29996d;
    }
}
