package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import w.h0;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: d, reason: collision with root package name */
    private final Object f2757d;

    /* renamed from: e, reason: collision with root package name */
    private final h0 f2758e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f2759f;

    /* renamed from: r, reason: collision with root package name */
    private final int f2760r;

    /* renamed from: s, reason: collision with root package name */
    private final int f2761s;

    public u(o oVar, Size size, h0 h0Var) {
        super(oVar);
        int height;
        this.f2757d = new Object();
        if (size == null) {
            this.f2760r = super.getWidth();
            height = super.getHeight();
        } else {
            this.f2760r = size.getWidth();
            height = size.getHeight();
        }
        this.f2761s = height;
        this.f2758e = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(o oVar, h0 h0Var) {
        this(oVar, null, h0Var);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public void Z(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f2757d) {
            this.f2759f = rect;
        }
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public h0 e1() {
        return this.f2758e;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int getHeight() {
        return this.f2761s;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int getWidth() {
        return this.f2760r;
    }
}
