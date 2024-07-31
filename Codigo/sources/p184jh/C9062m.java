package p184jh;

import android.graphics.Rect;
import java.util.List;
import p163ih.C7999p;

/* renamed from: jh.m */
/* loaded from: classes3.dex */
public class C9062m {

    /* renamed from: a */
    private C7999p f21742a;

    /* renamed from: b */
    private int f21743b;

    /* renamed from: c */
    private boolean f21744c = false;

    /* renamed from: d */
    private AbstractC9066q f21745d = new C9063n();

    public C9062m(int i10, C7999p c7999p) {
        this.f21743b = i10;
        this.f21742a = c7999p;
    }

    /* renamed from: a */
    public C7999p m26661a(List<C7999p> list, boolean z10) {
        return this.f21745d.m26668b(list, m26662b(z10));
    }

    /* renamed from: b */
    public C7999p m26662b(boolean z10) {
        C7999p c7999p = this.f21742a;
        if (c7999p == null) {
            return null;
        }
        return z10 ? c7999p.m24569h() : c7999p;
    }

    /* renamed from: c */
    public int m26663c() {
        return this.f21743b;
    }

    /* renamed from: d */
    public Rect m26664d(C7999p c7999p) {
        return this.f21745d.mo26660d(c7999p, this.f21742a);
    }

    /* renamed from: e */
    public void m26665e(AbstractC9066q abstractC9066q) {
        this.f21745d = abstractC9066q;
    }
}
