package ze;

import ze.i;

/* loaded from: classes2.dex */
public class l extends i {

    /* renamed from: b, reason: collision with root package name */
    private final int f32797b;

    public l(int i10, String str) {
        super(str);
        this.f32797b = i10;
    }

    public l(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f32797b = i10;
    }

    public l(int i10, String str, i.a aVar) {
        super(str, aVar);
        this.f32797b = i10;
    }

    public l(String str, i.a aVar) {
        super(str, aVar);
        this.f32797b = -1;
    }

    public int a() {
        return this.f32797b;
    }
}
