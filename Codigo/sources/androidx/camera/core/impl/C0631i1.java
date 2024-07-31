package androidx.camera.core.impl;

import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.List;
import p407w.InterfaceC12026n;
import p407w.InterfaceC12028o;

/* renamed from: androidx.camera.core.impl.i1 */
/* loaded from: classes.dex */
public class C0631i1 implements InterfaceC12026n {

    /* renamed from: b */
    private final int f2845b;

    public C0631i1(int i10) {
        this.f2845b = i10;
    }

    @Override // p407w.InterfaceC12026n
    /* renamed from: b */
    public List<InterfaceC12028o> mo3101b(List<InterfaceC12028o> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12028o interfaceC12028o : list) {
            C0984h.m4824b(interfaceC12028o instanceof InterfaceC0602b0, "The camera info doesn't contain internal implementation.");
            if (interfaceC12028o.getLensFacing() == this.f2845b) {
                arrayList.add(interfaceC12028o);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int m3102c() {
        return this.f2845b;
    }
}
