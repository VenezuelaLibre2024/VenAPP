package jh;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private ih.p f19963a;

    /* renamed from: b, reason: collision with root package name */
    private int f19964b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19965c = false;

    /* renamed from: d, reason: collision with root package name */
    private q f19966d = new n();

    public m(int i10, ih.p pVar) {
        this.f19964b = i10;
        this.f19963a = pVar;
    }

    public ih.p a(List<ih.p> list, boolean z10) {
        return this.f19966d.b(list, b(z10));
    }

    public ih.p b(boolean z10) {
        ih.p pVar = this.f19963a;
        if (pVar == null) {
            return null;
        }
        return z10 ? pVar.h() : pVar;
    }

    public int c() {
        return this.f19964b;
    }

    public Rect d(ih.p pVar) {
        return this.f19966d.d(pVar, this.f19963a);
    }

    public void e(q qVar) {
        this.f19966d = qVar;
    }
}
