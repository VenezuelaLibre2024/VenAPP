package z3;

import android.graphics.drawable.Drawable;
import c4.l;
import y3.e;

/* loaded from: classes.dex */
public abstract class a<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f32314a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32315b;

    /* renamed from: c, reason: collision with root package name */
    private e f32316c;

    public a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public a(int i10, int i11) {
        if (l.t(i10, i11)) {
            this.f32314a = i10;
            this.f32315b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // z3.d
    public final void a(c cVar) {
    }

    @Override // z3.d
    public void e(Drawable drawable) {
    }

    @Override // z3.d
    public final e f() {
        return this.f32316c;
    }

    @Override // z3.d
    public final void h(e eVar) {
        this.f32316c = eVar;
    }

    @Override // z3.d
    public final void i(c cVar) {
        cVar.d(this.f32314a, this.f32315b);
    }

    @Override // z3.d
    public void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
    }
}
