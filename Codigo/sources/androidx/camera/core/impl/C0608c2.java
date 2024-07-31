package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.c2 */
/* loaded from: classes.dex */
public final class C0608c2 {

    /* renamed from: a */
    private final List<AbstractC0612d2> f2776a = new ArrayList();

    /* renamed from: b */
    private static void m3011b(List<int[]> list, int i10, int[] iArr, int i11) {
        boolean z10;
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    z10 = false;
                    break;
                } else {
                    if (i12 == iArr[i13]) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (!z10) {
                iArr[i11] = i12;
                m3011b(list, i10, iArr, i11 + 1);
            }
        }
    }

    /* renamed from: c */
    private List<int[]> m3012c(int i10) {
        ArrayList arrayList = new ArrayList();
        m3011b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    /* renamed from: a */
    public boolean m3013a(AbstractC0612d2 abstractC0612d2) {
        return this.f2776a.add(abstractC0612d2);
    }

    /* renamed from: d */
    public List<AbstractC0612d2> m3014d(List<AbstractC0612d2> list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f2776a.size()) {
            return null;
        }
        List<int[]> m3012c = m3012c(this.f2776a.size());
        AbstractC0612d2[] abstractC0612d2Arr = new AbstractC0612d2[list.size()];
        Iterator<int[]> it = m3012c.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z10 = true;
            while (i10 < this.f2776a.size()) {
                if (next[i10] < list.size()) {
                    z10 &= this.f2776a.get(i10).m3033g(list.get(next[i10]));
                    if (!z10) {
                        break;
                    }
                    abstractC0612d2Arr[next[i10]] = this.f2776a.get(i10);
                }
                i10++;
            }
            if (z10) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(abstractC0612d2Arr);
        }
        return null;
    }
}
