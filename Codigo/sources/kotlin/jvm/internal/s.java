package kotlin.jvm.internal;

import vk.g;

/* loaded from: classes3.dex */
public abstract class s extends u implements vk.g {
    public s(Class cls, String str, String str2, int i10) {
        super(c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // vk.g
    public g.a b() {
        ((vk.g) getReflected()).b();
        return null;
    }

    @Override // kotlin.jvm.internal.c
    protected vk.b computeReflected() {
        return y.e(this);
    }

    @Override // ok.p
    public Object invoke(Object obj, Object obj2) {
        return n(obj, obj2);
    }
}
