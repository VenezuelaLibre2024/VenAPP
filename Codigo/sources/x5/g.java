package x5;

import dk.z;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import ok.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30426a = new g();

    /* loaded from: classes.dex */
    static final class a extends o implements l<Integer, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30427a = new a();

        a() {
            super(1);
        }

        public final CharSequence a(int i10) {
            return "media_type = " + i10;
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private g() {
    }

    private final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public final boolean b(int i10) {
        return a(i10, 4);
    }

    public final boolean c(int i10) {
        return a(i10, 1);
    }

    public final boolean d(int i10) {
        return a(i10, 2);
    }

    public final String e(int i10) {
        String M;
        ArrayList arrayList = new ArrayList();
        if (c(i10)) {
            arrayList.add(1);
        }
        if (b(i10)) {
            arrayList.add(2);
        }
        if (d(i10)) {
            arrayList.add(3);
        }
        M = z.M(arrayList, " OR ", null, null, 0, null, a.f30427a, 30, null);
        return "( " + M + " )";
    }
}
