package a8;

import android.net.Uri;
import android.text.TextUtils;
import i7.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t6.u1;
import t8.n0;
import t8.w;
import u6.m3;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f123d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    private final int f124b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f125c;

    public d() {
        this(0, true);
    }

    public d(int i10, boolean z10) {
        this.f124b = i10;
        this.f125c = z10;
    }

    private static void b(int i10, List<Integer> list) {
        if (hb.e.h(f123d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private y6.k d(int i10, u1 u1Var, List<u1> list, n0 n0Var) {
        if (i10 == 0) {
            return new i7.b();
        }
        if (i10 == 1) {
            return new i7.e();
        }
        if (i10 == 2) {
            return new i7.h();
        }
        if (i10 == 7) {
            return new f7.f(0, 0L);
        }
        if (i10 == 8) {
            return e(n0Var, u1Var, list);
        }
        if (i10 == 11) {
            return f(this.f124b, this.f125c, u1Var, list, n0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new t(u1Var.f26508c, n0Var);
    }

    private static g7.g e(n0 n0Var, u1 u1Var, List<u1> list) {
        int i10 = g(u1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new g7.g(i10, n0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, u1 u1Var, List<u1> list, n0 n0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new u1.b().g0("application/cea-608").G()) : Collections.emptyList();
        }
        String str = u1Var.f26514t;
        if (!TextUtils.isEmpty(str)) {
            if (!w.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!w.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, n0Var, new i7.j(i11, list));
    }

    private static boolean g(u1 u1Var) {
        l7.a aVar = u1Var.f26515u;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            if (aVar.d(i10) instanceof q) {
                return !((q) r2).f233c.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(y6.k kVar, y6.l lVar) {
        try {
            boolean e10 = kVar.e(lVar);
            lVar.f();
            return e10;
        } catch (EOFException unused) {
            lVar.f();
            return false;
        } catch (Throwable th2) {
            lVar.f();
            throw th2;
        }
    }

    @Override // a8.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b a(Uri uri, u1 u1Var, List<u1> list, n0 n0Var, Map<String, List<String>> map, y6.l lVar, m3 m3Var) {
        int a10 = t8.k.a(u1Var.f26517w);
        int b10 = t8.k.b(map);
        int c10 = t8.k.c(uri);
        int[] iArr = f123d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        lVar.f();
        y6.k kVar = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            y6.k kVar2 = (y6.k) t8.a.e(d(intValue, u1Var, list, n0Var));
            if (h(kVar2, lVar)) {
                return new b(kVar2, u1Var, n0Var);
            }
            if (kVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                kVar = kVar2;
            }
        }
        return new b((y6.k) t8.a.e(kVar), u1Var, n0Var);
    }
}
