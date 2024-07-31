package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public abstract class p3 implements o {

    /* renamed from: a, reason: collision with root package name */
    static final String f26354a = t8.r0.r0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final o.a<p3> f26355b = new o.a() { // from class: t6.o3
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            p3 c10;
            c10 = p3.c(bundle);
            return c10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static p3 c(Bundle bundle) {
        o.a aVar;
        int i10 = bundle.getInt(f26354a, -1);
        if (i10 == 0) {
            aVar = x1.f26588r;
        } else if (i10 == 1) {
            aVar = d3.f26042e;
        } else if (i10 == 2) {
            aVar = w3.f26576r;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Unknown RatingType: " + i10);
            }
            aVar = b4.f25868r;
        }
        return (p3) aVar.a(bundle);
    }
}
