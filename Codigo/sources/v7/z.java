package v7;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28545c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28546d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28547e;

    public z(Object obj) {
        this(obj, -1L);
    }

    public z(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private z(Object obj, int i10, int i11, long j10, int i12) {
        this.f28543a = obj;
        this.f28544b = i10;
        this.f28545c = i11;
        this.f28546d = j10;
        this.f28547e = i12;
    }

    public z(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public z(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(z zVar) {
        this.f28543a = zVar.f28543a;
        this.f28544b = zVar.f28544b;
        this.f28545c = zVar.f28545c;
        this.f28546d = zVar.f28546d;
        this.f28547e = zVar.f28547e;
    }

    public z a(Object obj) {
        return this.f28543a.equals(obj) ? this : new z(obj, this.f28544b, this.f28545c, this.f28546d, this.f28547e);
    }

    public boolean b() {
        return this.f28544b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f28543a.equals(zVar.f28543a) && this.f28544b == zVar.f28544b && this.f28545c == zVar.f28545c && this.f28546d == zVar.f28546d && this.f28547e == zVar.f28547e;
    }

    public int hashCode() {
        return ((((((((527 + this.f28543a.hashCode()) * 31) + this.f28544b) * 31) + this.f28545c) * 31) + ((int) this.f28546d)) * 31) + this.f28547e;
    }
}
