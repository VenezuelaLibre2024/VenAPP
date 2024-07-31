package p085eh;

import p066dg.C6958s;

/* renamed from: eh.a */
/* loaded from: classes2.dex */
public final class C7189a extends C6958s {

    /* renamed from: c */
    private final float f16084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7189a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f16084c = f12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m21399f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m20120d()) > f10 || Math.abs(f12 - m20119c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f16084c);
        return abs <= 1.0f || abs <= this.f16084c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C7189a m21400g(float f10, float f11, float f12) {
        return new C7189a((m20119c() + f11) / 2.0f, (m20120d() + f10) / 2.0f, (this.f16084c + f12) / 2.0f);
    }
}
