package z7;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f32355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32357c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32358d;

    public b(String str, String str2, int i10, int i11) {
        this.f32355a = str;
        this.f32356b = str2;
        this.f32357c = i10;
        this.f32358d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32357c == bVar.f32357c && this.f32358d == bVar.f32358d && eb.k.a(this.f32355a, bVar.f32355a) && eb.k.a(this.f32356b, bVar.f32356b);
    }

    public int hashCode() {
        return eb.k.b(this.f32355a, this.f32356b, Integer.valueOf(this.f32357c), Integer.valueOf(this.f32358d));
    }
}
