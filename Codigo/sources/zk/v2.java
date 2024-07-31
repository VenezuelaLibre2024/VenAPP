package zk;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class v2 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient w1 f32938a;

    public v2(String str) {
        this(str, null);
    }

    public v2(String str, w1 w1Var) {
        super(str);
        this.f32938a = w1Var;
    }
}
