package p423wg;

import p066dg.C6947h;

/* renamed from: wg.p */
/* loaded from: classes2.dex */
final class C12195p extends AbstractC12196q {

    /* renamed from: b */
    private final int f32466b;

    /* renamed from: c */
    private final int f32467c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12195p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw C6947h.m20094a();
        }
        this.f32466b = i11;
        this.f32467c = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m39124b() {
        return this.f32466b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m39125c() {
        return this.f32467c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m39126d() {
        return this.f32466b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m39127e() {
        return this.f32467c == 10;
    }
}
