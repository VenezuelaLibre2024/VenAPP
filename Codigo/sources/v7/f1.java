package v7;

import android.os.Bundle;
import java.util.ArrayList;
import t6.o;

/* loaded from: classes.dex */
public final class f1 implements t6.o {

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f28311d = new f1(new d1[0]);

    /* renamed from: e, reason: collision with root package name */
    private static final String f28312e = t8.r0.r0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final o.a<f1> f28313f = new o.a() { // from class: v7.e1
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            f1 e10;
            e10 = f1.e(bundle);
            return e10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f28314a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.collect.w<d1> f28315b;

    /* renamed from: c, reason: collision with root package name */
    private int f28316c;

    public f1(d1... d1VarArr) {
        this.f28315b = com.google.common.collect.w.s(d1VarArr);
        this.f28314a = d1VarArr.length;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f28312e);
        return parcelableArrayList == null ? new f1(new d1[0]) : new f1((d1[]) t8.c.b(d1.f28287s, parcelableArrayList).toArray(new d1[0]));
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f28315b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f28315b.size(); i12++) {
                if (this.f28315b.get(i10).equals(this.f28315b.get(i12))) {
                    t8.s.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f28312e, t8.c.d(this.f28315b));
        return bundle;
    }

    public d1 c(int i10) {
        return this.f28315b.get(i10);
    }

    public int d(d1 d1Var) {
        int indexOf = this.f28315b.indexOf(d1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f28314a == f1Var.f28314a && this.f28315b.equals(f1Var.f28315b);
    }

    public int hashCode() {
        if (this.f28316c == 0) {
            this.f28316c = this.f28315b.hashCode();
        }
        return this.f28316c;
    }
}
