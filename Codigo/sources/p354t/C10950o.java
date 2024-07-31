package p354t;

import androidx.camera.core.impl.C0668t1;
import p342s.C10734d;

/* renamed from: t.o */
/* loaded from: classes.dex */
public class C10950o {

    /* renamed from: a */
    private final boolean f27848a;

    /* renamed from: b */
    private boolean f27849b = false;

    public C10950o(C0668t1 c0668t1) {
        this.f27848a = c0668t1.m3238b(C10734d.class) != null;
    }

    /* renamed from: a */
    public void m33428a() {
        this.f27849b = false;
    }

    /* renamed from: b */
    public void m33429b() {
        this.f27849b = true;
    }

    /* renamed from: c */
    public boolean m33430c(int i10) {
        return this.f27849b && i10 == 0 && this.f27848a;
    }
}
