package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<d2> f2448a = new ArrayList();

    private static void b(List<int[]> list, int i10, int[] iArr, int i11) {
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
                b(list, i10, iArr, i11 + 1);
            }
        }
    }

    private List<int[]> c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean a(d2 d2Var) {
        return this.f2448a.add(d2Var);
    }

    public List<d2> d(List<d2> list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f2448a.size()) {
            return null;
        }
        List<int[]> c10 = c(this.f2448a.size());
        d2[] d2VarArr = new d2[list.size()];
        Iterator<int[]> it = c10.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z10 = true;
            while (i10 < this.f2448a.size()) {
                if (next[i10] < list.size()) {
                    z10 &= this.f2448a.get(i10).g(list.get(next[i10]));
                    if (!z10) {
                        break;
                    }
                    d2VarArr[next[i10]] = this.f2448a.get(i10);
                }
                i10++;
            }
            if (z10) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(d2VarArr);
        }
        return null;
    }
}
