package p397v7;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Arrays;
import p361t6.C11108u1;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11141c;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;

/* renamed from: v7.d1 */
/* loaded from: classes.dex */
public final class C11694d1 implements InterfaceC11076o {

    /* renamed from: f */
    private static final String f30655f = C11172r0.m34945r0(0);

    /* renamed from: r */
    private static final String f30656r = C11172r0.m34945r0(1);

    /* renamed from: s */
    public static final InterfaceC11076o.a<C11694d1> f30657s = new InterfaceC11076o.a() { // from class: v7.c1
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11694d1 m36843f;
            m36843f = C11694d1.m36843f(bundle);
            return m36843f;
        }
    };

    /* renamed from: a */
    public final int f30658a;

    /* renamed from: b */
    public final String f30659b;

    /* renamed from: c */
    public final int f30660c;

    /* renamed from: d */
    private final C11108u1[] f30661d;

    /* renamed from: e */
    private int f30662e;

    public C11694d1(String str, C11108u1... c11108u1Arr) {
        C11137a.m34599a(c11108u1Arr.length > 0);
        this.f30659b = str;
        this.f30661d = c11108u1Arr;
        this.f30658a = c11108u1Arr.length;
        int m35003k = C11178w.m35003k(c11108u1Arr[0].f28797w);
        this.f30660c = m35003k == -1 ? C11178w.m35003k(c11108u1Arr[0].f28796v) : m35003k;
        m36847j();
    }

    public C11694d1(C11108u1... c11108u1Arr) {
        this("", c11108u1Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C11694d1 m36843f(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f30655f);
        return new C11694d1(bundle.getString(f30656r, ""), (C11108u1[]) (parcelableArrayList == null ? AbstractC5907w.m15081v() : C11141c.m34616b(C11108u1.f28733A0, parcelableArrayList)).toArray(new C11108u1[0]));
    }

    /* renamed from: g */
    private static void m36844g(String str, String str2, String str3, int i10) {
        C11173s.m34965d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    /* renamed from: h */
    private static String m36845h(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: i */
    private static int m36846i(int i10) {
        return i10 | 16384;
    }

    /* renamed from: j */
    private void m36847j() {
        String m36845h = m36845h(this.f30661d[0].f28788c);
        int m36846i = m36846i(this.f30661d[0].f28790e);
        int i10 = 1;
        while (true) {
            C11108u1[] c11108u1Arr = this.f30661d;
            if (i10 >= c11108u1Arr.length) {
                return;
            }
            if (!m36845h.equals(m36845h(c11108u1Arr[i10].f28788c))) {
                C11108u1[] c11108u1Arr2 = this.f30661d;
                m36844g("languages", c11108u1Arr2[0].f28788c, c11108u1Arr2[i10].f28788c, i10);
                return;
            } else {
                if (m36846i != m36846i(this.f30661d[i10].f28790e)) {
                    m36844g("role flags", Integer.toBinaryString(this.f30661d[0].f28790e), Integer.toBinaryString(this.f30661d[i10].f28790e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f30661d.length);
        for (C11108u1 c11108u1 : this.f30661d) {
            arrayList.add(c11108u1.m34492j(true));
        }
        bundle.putParcelableArrayList(f30655f, arrayList);
        bundle.putString(f30656r, this.f30659b);
        return bundle;
    }

    /* renamed from: c */
    public C11694d1 m36848c(String str) {
        return new C11694d1(str, this.f30661d);
    }

    /* renamed from: d */
    public C11108u1 m36849d(int i10) {
        return this.f30661d[i10];
    }

    /* renamed from: e */
    public int m36850e(C11108u1 c11108u1) {
        int i10 = 0;
        while (true) {
            C11108u1[] c11108u1Arr = this.f30661d;
            if (i10 >= c11108u1Arr.length) {
                return -1;
            }
            if (c11108u1 == c11108u1Arr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11694d1.class != obj.getClass()) {
            return false;
        }
        C11694d1 c11694d1 = (C11694d1) obj;
        return this.f30659b.equals(c11694d1.f30659b) && Arrays.equals(this.f30661d, c11694d1.f30661d);
    }

    public int hashCode() {
        if (this.f30662e == 0) {
            this.f30662e = ((527 + this.f30659b.hashCode()) * 31) + Arrays.hashCode(this.f30661d);
        }
        return this.f30662e;
    }
}
