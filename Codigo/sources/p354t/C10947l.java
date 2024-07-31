package p354t;

import android.util.Size;
import androidx.camera.core.impl.AbstractC0612d2;
import p342s.C10750l;
import p342s.C10753o;

/* renamed from: t.l */
/* loaded from: classes.dex */
public class C10947l {

    /* renamed from: a */
    private final C10753o f27843a;

    public C10947l() {
        this((C10753o) C10750l.m32699a(C10753o.class));
    }

    C10947l(C10753o c10753o) {
        this.f27843a = c10753o;
    }

    /* renamed from: a */
    public Size m33424a(Size size) {
        Size m32716a;
        C10753o c10753o = this.f27843a;
        if (c10753o == null || (m32716a = c10753o.m32716a(AbstractC0612d2.b.PRIV)) == null) {
            return size;
        }
        return m32716a.getWidth() * m32716a.getHeight() > size.getWidth() * size.getHeight() ? m32716a : size;
    }
}
