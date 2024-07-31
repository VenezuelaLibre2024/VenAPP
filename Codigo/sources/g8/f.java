package g8;

import android.os.Bundle;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.List;
import t6.o;
import t8.r0;

/* loaded from: classes.dex */
public final class f implements t6.o {

    /* renamed from: c, reason: collision with root package name */
    public static final f f16074c = new f(w.v(), 0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f16075d = r0.r0(0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f16076e = r0.r0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final o.a<f> f16077f = new o.a() { // from class: g8.e
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            f d10;
            d10 = f.d(bundle);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final w<b> f16078a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16079b;

    public f(List<b> list, long j10) {
        this.f16078a = w.r(list);
        this.f16079b = j10;
    }

    private static w<b> c(List<b> list) {
        w.a p10 = w.p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f16045d == null) {
                p10.a(list.get(i10));
            }
        }
        return p10.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f16075d);
        return new f(parcelableArrayList == null ? w.v() : t8.c.b(b.U, parcelableArrayList), bundle.getLong(f16076e));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f16075d, t8.c.d(c(this.f16078a)));
        bundle.putLong(f16076e, this.f16079b);
        return bundle;
    }
}
