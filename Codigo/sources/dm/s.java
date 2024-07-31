package dm;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f14322h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14323a;

    /* renamed from: b, reason: collision with root package name */
    public int f14324b;

    /* renamed from: c, reason: collision with root package name */
    public int f14325c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14326d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14327e;

    /* renamed from: f, reason: collision with root package name */
    public s f14328f;

    /* renamed from: g, reason: collision with root package name */
    public s f14329g;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public s() {
        this.f14323a = new byte[8192];
        this.f14327e = true;
        this.f14326d = false;
    }

    public s(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.e(data, "data");
        this.f14323a = data;
        this.f14324b = i10;
        this.f14325c = i11;
        this.f14326d = z10;
        this.f14327e = z11;
    }

    public final void a() {
        s sVar = this.f14329g;
        int i10 = 0;
        if (!(sVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.n.b(sVar);
        if (sVar.f14327e) {
            int i11 = this.f14325c - this.f14324b;
            s sVar2 = this.f14329g;
            kotlin.jvm.internal.n.b(sVar2);
            int i12 = 8192 - sVar2.f14325c;
            s sVar3 = this.f14329g;
            kotlin.jvm.internal.n.b(sVar3);
            if (!sVar3.f14326d) {
                s sVar4 = this.f14329g;
                kotlin.jvm.internal.n.b(sVar4);
                i10 = sVar4.f14324b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            s sVar5 = this.f14329g;
            kotlin.jvm.internal.n.b(sVar5);
            f(sVar5, i11);
            b();
            t.b(this);
        }
    }

    public final s b() {
        s sVar = this.f14328f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f14329g;
        kotlin.jvm.internal.n.b(sVar2);
        sVar2.f14328f = this.f14328f;
        s sVar3 = this.f14328f;
        kotlin.jvm.internal.n.b(sVar3);
        sVar3.f14329g = this.f14329g;
        this.f14328f = null;
        this.f14329g = null;
        return sVar;
    }

    public final s c(s segment) {
        kotlin.jvm.internal.n.e(segment, "segment");
        segment.f14329g = this;
        segment.f14328f = this.f14328f;
        s sVar = this.f14328f;
        kotlin.jvm.internal.n.b(sVar);
        sVar.f14329g = segment;
        this.f14328f = segment;
        return segment;
    }

    public final s d() {
        this.f14326d = true;
        return new s(this.f14323a, this.f14324b, this.f14325c, true, false);
    }

    public final s e(int i10) {
        s c10;
        if (!(i10 > 0 && i10 <= this.f14325c - this.f14324b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            c10 = d();
        } else {
            c10 = t.c();
            byte[] bArr = this.f14323a;
            byte[] bArr2 = c10.f14323a;
            int i11 = this.f14324b;
            dk.l.f(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        c10.f14325c = c10.f14324b + i10;
        this.f14324b += i10;
        s sVar = this.f14329g;
        kotlin.jvm.internal.n.b(sVar);
        sVar.c(c10);
        return c10;
    }

    public final void f(s sink, int i10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (!sink.f14327e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.f14325c;
        if (i11 + i10 > 8192) {
            if (sink.f14326d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f14324b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f14323a;
            dk.l.f(bArr, bArr, 0, i12, i11, 2, null);
            sink.f14325c -= sink.f14324b;
            sink.f14324b = 0;
        }
        byte[] bArr2 = this.f14323a;
        byte[] bArr3 = sink.f14323a;
        int i13 = sink.f14325c;
        int i14 = this.f14324b;
        dk.l.d(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f14325c += i10;
        this.f14324b += i10;
    }
}
