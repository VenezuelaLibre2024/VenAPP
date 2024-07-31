package p354t;

import androidx.camera.core.impl.C0668t1;
import p342s.C10748k;
import p342s.C10750l;
import p342s.C10758t;

/* renamed from: t.b */
/* loaded from: classes.dex */
public class C10937b {

    /* renamed from: a */
    private final boolean f27834a;

    /* renamed from: b */
    private final boolean f27835b;

    public C10937b(C0668t1 c0668t1) {
        this.f27834a = c0668t1.m3237a(C10758t.class);
        this.f27835b = C10750l.m32699a(C10748k.class) != null;
    }

    /* renamed from: a */
    public int m33410a(int i10) {
        if ((this.f27834a || this.f27835b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
