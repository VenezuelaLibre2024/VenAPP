package p423wg;

/* renamed from: wg.m */
/* loaded from: classes2.dex */
final class C12192m {

    /* renamed from: a */
    private int f32460a = 0;

    /* renamed from: b */
    private a f32461b = a.NUMERIC;

    /* renamed from: wg.m$a */
    /* loaded from: classes2.dex */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m39111a() {
        return this.f32460a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m39112b(int i10) {
        this.f32460a += i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m39113c() {
        return this.f32461b == a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m39114d() {
        return this.f32461b == a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39115e() {
        this.f32461b = a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39116f() {
        this.f32461b = a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39117g() {
        this.f32461b = a.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m39118h(int i10) {
        this.f32460a = i10;
    }
}
