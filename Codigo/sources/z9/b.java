package z9;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    static int f32468b = 31;

    /* renamed from: a, reason: collision with root package name */
    private int f32469a = 1;

    public b a(Object obj) {
        this.f32469a = (f32468b * this.f32469a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f32469a;
    }

    public final b c(boolean z10) {
        this.f32469a = (f32468b * this.f32469a) + (z10 ? 1 : 0);
        return this;
    }
}
