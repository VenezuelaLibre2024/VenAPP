package we;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final re.a f29933d = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final String f29934a;

    /* renamed from: b, reason: collision with root package name */
    private final ee.b<f6.g> f29935b;

    /* renamed from: c, reason: collision with root package name */
    private f6.f<xe.i> f29936c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ee.b<f6.g> bVar, String str) {
        this.f29934a = str;
        this.f29935b = bVar;
    }

    private boolean a() {
        if (this.f29936c == null) {
            f6.g gVar = this.f29935b.get();
            if (gVar != null) {
                this.f29936c = gVar.b(this.f29934a, xe.i.class, f6.b.b("proto"), new f6.e() { // from class: we.a
                    @Override // f6.e
                    public final Object apply(Object obj) {
                        return ((xe.i) obj).h();
                    }
                });
            } else {
                f29933d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f29936c != null;
    }

    public void b(xe.i iVar) {
        if (a()) {
            this.f29936c.b(f6.c.d(iVar));
        } else {
            f29933d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
