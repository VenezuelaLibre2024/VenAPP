package je;

/* renamed from: je.b */
/* loaded from: classes.dex */
public class C9045b implements InterfaceC9044a {

    /* renamed from: a */
    private static C9045b f21666a;

    private C9045b() {
    }

    /* renamed from: b */
    public static C9045b m26554b() {
        if (f21666a == null) {
            f21666a = new C9045b();
        }
        return f21666a;
    }

    @Override // je.InterfaceC9044a
    /* renamed from: a */
    public long mo26553a() {
        return System.currentTimeMillis();
    }
}
