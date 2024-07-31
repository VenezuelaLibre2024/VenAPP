package p484z9;

/* renamed from: z9.b */
/* loaded from: classes.dex */
public class C12829b {

    /* renamed from: b */
    static int f35019b = 31;

    /* renamed from: a */
    private int f35020a = 1;

    /* renamed from: a */
    public C12829b m42564a(Object obj) {
        this.f35020a = (f35019b * this.f35020a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m42565b() {
        return this.f35020a;
    }

    /* renamed from: c */
    public final C12829b m42566c(boolean z10) {
        this.f35020a = (f35019b * this.f35020a) + (z10 ? 1 : 0);
        return this;
    }
}
