package q8;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import t6.o;
import t8.r0;
import v7.d1;

/* loaded from: classes.dex */
public final class w implements t6.o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f23730c = r0.r0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f23731d = r0.r0(1);

    /* renamed from: e, reason: collision with root package name */
    public static final o.a<w> f23732e = new o.a() { // from class: q8.v
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            w d10;
            d10 = w.d(bundle);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final d1 f23733a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.w<Integer> f23734b;

    public w(d1 d1Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= d1Var.f28288a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f23733a = d1Var;
        this.f23734b = com.google.common.collect.w.r(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w d(Bundle bundle) {
        return new w(d1.f28287s.a((Bundle) t8.a.e(bundle.getBundle(f23730c))), hb.e.c((int[]) t8.a.e(bundle.getIntArray(f23731d))));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f23730c, this.f23733a.a());
        bundle.putIntArray(f23731d, hb.e.l(this.f23734b));
        return bundle;
    }

    public int c() {
        return this.f23733a.f28290c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f23733a.equals(wVar.f23733a) && this.f23734b.equals(wVar.f23734b);
    }

    public int hashCode() {
        return this.f23733a.hashCode() + (this.f23734b.hashCode() * 31);
    }
}
