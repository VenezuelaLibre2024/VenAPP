package md;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements jd.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f21442a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21443b = false;

    /* renamed from: c, reason: collision with root package name */
    private jd.c f21444c;

    /* renamed from: d, reason: collision with root package name */
    private final f f21445d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f21445d = fVar;
    }

    private void a() {
        if (this.f21442a) {
            throw new jd.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f21442a = true;
    }

    @Override // jd.g
    public jd.g add(String str) {
        a();
        this.f21445d.d(this.f21444c, str, this.f21443b);
        return this;
    }

    @Override // jd.g
    public jd.g add(boolean z10) {
        a();
        this.f21445d.j(this.f21444c, z10, this.f21443b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(jd.c cVar, boolean z10) {
        this.f21442a = false;
        this.f21444c = cVar;
        this.f21443b = z10;
    }
}
