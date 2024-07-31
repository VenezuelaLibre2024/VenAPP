package p478z3;

import android.graphics.drawable.Drawable;
import p036c4.C1871l;
import p456y3.InterfaceC12590e;

/* renamed from: z3.a */
/* loaded from: classes.dex */
public abstract class AbstractC12795a<T> implements InterfaceC12798d<T> {

    /* renamed from: a */
    private final int f34865a;

    /* renamed from: b */
    private final int f34866b;

    /* renamed from: c */
    private InterfaceC12590e f34867c;

    public AbstractC12795a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC12795a(int i10, int i11) {
        if (C1871l.m9971t(i10, i11)) {
            this.f34865a = i10;
            this.f34866b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: a */
    public final void mo41395a(InterfaceC12797c interfaceC12797c) {
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: e */
    public void mo41396e(Drawable drawable) {
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: f */
    public final InterfaceC12590e mo41397f() {
        return this.f34867c;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: h */
    public final void mo41398h(InterfaceC12590e interfaceC12590e) {
        this.f34867c = interfaceC12590e;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: i */
    public final void mo41399i(InterfaceC12797c interfaceC12797c) {
        interfaceC12797c.mo41427d(this.f34865a, this.f34866b);
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: j */
    public void mo36109j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStop() {
    }
}
