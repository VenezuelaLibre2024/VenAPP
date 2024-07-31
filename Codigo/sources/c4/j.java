package c4;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f6852a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f6853b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f6854c;

    public j() {
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f6852a = cls;
        this.f6853b = cls2;
        this.f6854c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6852a.equals(jVar.f6852a) && this.f6853b.equals(jVar.f6853b) && l.d(this.f6854c, jVar.f6854c);
    }

    public int hashCode() {
        int hashCode = ((this.f6852a.hashCode() * 31) + this.f6853b.hashCode()) * 31;
        Class<?> cls = this.f6854c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f6852a + ", second=" + this.f6853b + '}';
    }
}
