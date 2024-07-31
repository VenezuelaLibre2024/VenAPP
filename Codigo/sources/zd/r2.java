package zd;

/* loaded from: classes.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    private a f32727a;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public void a(a aVar) {
        this.f32727a = aVar;
    }

    public void b(String str) {
        l2.a("Programmatically trigger: " + str);
        this.f32727a.a(str);
    }
}
