package p378u8;

import android.view.Surface;
import p197k7.C9192m;
import p197k7.C9195p;

/* renamed from: u8.g */
/* loaded from: classes.dex */
public class C11454g extends C9192m {

    /* renamed from: c */
    public final int f29690c;

    /* renamed from: d */
    public final boolean f29691d;

    public C11454g(Throwable th2, C9195p c9195p, Surface surface) {
        super(th2, c9195p);
        this.f29690c = System.identityHashCode(surface);
        this.f29691d = surface == null || surface.isValid();
    }
}
