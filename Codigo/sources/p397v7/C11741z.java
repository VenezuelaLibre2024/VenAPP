package p397v7;

/* renamed from: v7.z */
/* loaded from: classes.dex */
public class C11741z {

    /* renamed from: a */
    public final Object f30974a;

    /* renamed from: b */
    public final int f30975b;

    /* renamed from: c */
    public final int f30976c;

    /* renamed from: d */
    public final long f30977d;

    /* renamed from: e */
    public final int f30978e;

    public C11741z(Object obj) {
        this(obj, -1L);
    }

    public C11741z(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private C11741z(Object obj, int i10, int i11, long j10, int i12) {
        this.f30974a = obj;
        this.f30975b = i10;
        this.f30976c = i11;
        this.f30977d = j10;
        this.f30978e = i12;
    }

    public C11741z(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C11741z(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11741z(C11741z c11741z) {
        this.f30974a = c11741z.f30974a;
        this.f30975b = c11741z.f30975b;
        this.f30976c = c11741z.f30976c;
        this.f30977d = c11741z.f30977d;
        this.f30978e = c11741z.f30978e;
    }

    /* renamed from: a */
    public C11741z m37105a(Object obj) {
        return this.f30974a.equals(obj) ? this : new C11741z(obj, this.f30975b, this.f30976c, this.f30977d, this.f30978e);
    }

    /* renamed from: b */
    public boolean m37106b() {
        return this.f30975b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11741z)) {
            return false;
        }
        C11741z c11741z = (C11741z) obj;
        return this.f30974a.equals(c11741z.f30974a) && this.f30975b == c11741z.f30975b && this.f30976c == c11741z.f30976c && this.f30977d == c11741z.f30977d && this.f30978e == c11741z.f30978e;
    }

    public int hashCode() {
        return ((((((((527 + this.f30974a.hashCode()) * 31) + this.f30975b) * 31) + this.f30976c) * 31) + ((int) this.f30977d)) * 31) + this.f30978e;
    }
}
