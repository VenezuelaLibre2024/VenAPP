package p085eh;

import p066dg.C6958s;

/* renamed from: eh.d */
/* loaded from: classes2.dex */
public final class C7192d extends C6958s {

    /* renamed from: c */
    private final float f16096c;

    /* renamed from: d */
    private final int f16097d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7192d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private C7192d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f16096c = f12;
        this.f16097d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m21416f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m20120d()) > f10 || Math.abs(f12 - m20119c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f16096c);
        return abs <= 1.0f || abs <= this.f16096c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C7192d m21417g(float f10, float f11, float f12) {
        int i10 = this.f16097d;
        int i11 = i10 + 1;
        float m20119c = (i10 * m20119c()) + f11;
        float f13 = i11;
        return new C7192d(m20119c / f13, ((this.f16097d * m20120d()) + f10) / f13, ((this.f16097d * this.f16096c) + f12) / f13, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m21418h() {
        return this.f16097d;
    }

    /* renamed from: i */
    public float m21419i() {
        return this.f16096c;
    }
}
