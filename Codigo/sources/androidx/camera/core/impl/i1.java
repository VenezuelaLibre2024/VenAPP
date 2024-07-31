package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i1 implements w.n {

    /* renamed from: b, reason: collision with root package name */
    private final int f2507b;

    public i1(int i10) {
        this.f2507b = i10;
    }

    @Override // w.n
    public List<w.o> b(List<w.o> list) {
        ArrayList arrayList = new ArrayList();
        for (w.o oVar : list) {
            androidx.core.util.h.b(oVar instanceof b0, "The camera info doesn't contain internal implementation.");
            if (oVar.getLensFacing() == this.f2507b) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f2507b;
    }
}
