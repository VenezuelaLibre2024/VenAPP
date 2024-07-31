package v7;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import t6.o;
import t6.u1;

/* loaded from: classes.dex */
public final class d1 implements t6.o {

    /* renamed from: f */
    private static final String f28285f = t8.r0.r0(0);

    /* renamed from: r */
    private static final String f28286r = t8.r0.r0(1);

    /* renamed from: s */
    public static final o.a<d1> f28287s = new o.a() { // from class: v7.c1
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            d1 f10;
            f10 = d1.f(bundle);
            return f10;
        }
    };

    /* renamed from: a */
    public final int f28288a;

    /* renamed from: b */
    public final String f28289b;

    /* renamed from: c */
    public final int f28290c;

    /* renamed from: d */
    private final u1[] f28291d;

    /* renamed from: e */
    private int f28292e;

    public d1(String str, u1... u1VarArr) {
        t8.a.a(u1VarArr.length > 0);
        this.f28289b = str;
        this.f28291d = u1VarArr;
        this.f28288a = u1VarArr.length;
        int k10 = t8.w.k(u1VarArr[0].f26517w);
        this.f28290c = k10 == -1 ? t8.w.k(u1VarArr[0].f26516v) : k10;
        j();
    }

    public d1(u1... u1VarArr) {
        this("", u1VarArr);
    }

    public static /* synthetic */ d1 f(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f28285f);
        return new d1(bundle.getString(f28286r, ""), (u1[]) (parcelableArrayList == null ? com.google.common.collect.w.v() : t8.c.b(u1.A0, parcelableArrayList)).toArray(new u1[0]));
    }

    private static void g(String str, String str2, String str3, int i10) {
        t8.s.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String h(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int i(int i10) {
        return i10 | 16384;
    }

    private void j() {
        String h10 = h(this.f28291d[0].f26508c);
        int i10 = i(this.f28291d[0].f26510e);
        int i11 = 1;
        while (true) {
            u1[] u1VarArr = this.f28291d;
            if (i11 >= u1VarArr.length) {
                return;
            }
            if (!h10.equals(h(u1VarArr[i11].f26508c))) {
                u1[] u1VarArr2 = this.f28291d;
                g("languages", u1VarArr2[0].f26508c, u1VarArr2[i11].f26508c, i11);
                return;
            } else {
                if (i10 != i(this.f28291d[i11].f26510e)) {
                    g("role flags", Integer.toBinaryString(this.f28291d[0].f26510e), Integer.toBinaryString(this.f28291d[i11].f26510e), i11);
                    return;
                }
                i11++;
            }
        }
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f28291d.length);
        for (u1 u1Var : this.f28291d) {
            arrayList.add(u1Var.j(true));
        }
        bundle.putParcelableArrayList(f28285f, arrayList);
        bundle.putString(f28286r, this.f28289b);
        return bundle;
    }

    public d1 c(String str) {
        return new d1(str, this.f28291d);
    }

    public u1 d(int i10) {
        return this.f28291d[i10];
    }

    public int e(u1 u1Var) {
        int i10 = 0;
        while (true) {
            u1[] u1VarArr = this.f28291d;
            if (i10 >= u1VarArr.length) {
                return -1;
            }
            if (u1Var == u1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f28289b.equals(d1Var.f28289b) && Arrays.equals(this.f28291d, d1Var.f28291d);
    }

    public int hashCode() {
        if (this.f28292e == 0) {
            this.f28292e = ((527 + this.f28289b.hashCode()) * 31) + Arrays.hashCode(this.f28291d);
        }
        return this.f28292e;
    }
}
