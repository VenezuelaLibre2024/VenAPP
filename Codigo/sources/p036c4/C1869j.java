package p036c4;

/* renamed from: c4.j */
/* loaded from: classes.dex */
public class C1869j {

    /* renamed from: a */
    private Class<?> f7801a;

    /* renamed from: b */
    private Class<?> f7802b;

    /* renamed from: c */
    private Class<?> f7803c;

    public C1869j() {
    }

    public C1869j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m9946a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void m9946a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7801a = cls;
        this.f7802b = cls2;
        this.f7803c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1869j c1869j = (C1869j) obj;
        return this.f7801a.equals(c1869j.f7801a) && this.f7802b.equals(c1869j.f7802b) && C1871l.m9955d(this.f7803c, c1869j.f7803c);
    }

    public int hashCode() {
        int hashCode = ((this.f7801a.hashCode() * 31) + this.f7802b.hashCode()) * 31;
        Class<?> cls = this.f7803c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7801a + ", second=" + this.f7802b + '}';
    }
}
