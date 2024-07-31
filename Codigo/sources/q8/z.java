package q8;

import android.os.SystemClock;
import com.google.common.collect.w;
import java.util.Arrays;
import java.util.List;
import q8.t;
import s8.d0;
import t6.i4;
import v7.d1;
import v7.f1;

/* loaded from: classes.dex */
public final class z {
    public static i4 a(t.a aVar, List<? extends u>[] listArr) {
        boolean z10;
        w.a aVar2 = new w.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            f1 f10 = aVar.f(i10);
            List<? extends u> list = listArr[i10];
            for (int i11 = 0; i11 < f10.f28314a; i11++) {
                d1 c10 = f10.c(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = c10.f28288a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < c10.f28288a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        u uVar = list.get(i14);
                        if (uVar.d().equals(c10) && uVar.c(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new i4.a(c10, z11, iArr, zArr));
            }
        }
        f1 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f28314a; i15++) {
            d1 c11 = h10.c(i15);
            int[] iArr2 = new int[c11.f28288a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new i4.a(c11, false, iArr2, new boolean[c11.f28288a]));
        }
        return new i4(aVar2.k());
    }

    public static i4 b(t.a aVar, u[] uVarArr) {
        List[] listArr = new List[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            u uVar = uVarArr[i10];
            listArr[i10] = uVar != null ? com.google.common.collect.w.w(uVar) : com.google.common.collect.w.v();
        }
        return a(aVar, listArr);
    }

    public static d0.a c(r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.j(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new d0.a(1, 0, length, i10);
    }
}
