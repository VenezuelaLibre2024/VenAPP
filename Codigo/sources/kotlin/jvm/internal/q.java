package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class q extends u implements vk.f {
    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.c
    protected vk.b computeReflected() {
        return y.d(this);
    }

    @Override // ok.a
    public Object invoke() {
        return get();
    }
}
