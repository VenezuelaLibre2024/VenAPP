package u8;

import android.view.Surface;

/* loaded from: classes.dex */
public class g extends k7.m {

    /* renamed from: c, reason: collision with root package name */
    public final int f27387c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27388d;

    public g(Throwable th2, k7.p pVar, Surface surface) {
        super(th2, pVar);
        this.f27387c = System.identityHashCode(surface);
        this.f27388d = surface == null || surface.isValid();
    }
}
