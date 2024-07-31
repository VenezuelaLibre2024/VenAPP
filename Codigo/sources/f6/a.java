package f6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a */
    private final Integer f14954a;

    /* renamed from: b */
    private final T f14955b;

    /* renamed from: c */
    private final d f14956c;

    public a(Integer num, T t10, d dVar) {
        this.f14954a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f14955b = t10;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f14956c = dVar;
    }

    @Override // f6.c
    public Integer a() {
        return this.f14954a;
    }

    @Override // f6.c
    public T b() {
        return this.f14955b;
    }

    @Override // f6.c
    public d c() {
        return this.f14956c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f14954a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f14955b.equals(cVar.b()) && this.f14956c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f14954a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f14955b.hashCode()) * 1000003) ^ this.f14956c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f14954a + ", payload=" + this.f14955b + ", priority=" + this.f14956c + "}";
    }
}
