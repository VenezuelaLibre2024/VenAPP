package bl;

import ck.v;
import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public final class f {
    public static final <E> d<E> a(int i10, a aVar, ok.l<? super E, v> lVar) {
        d<E> bVar;
        if (i10 != -2) {
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    return new l(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i10, lVar) : new l(i10, aVar, lVar) : new b(a.e.API_PRIORITY_OTHER, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b<>(0, lVar) : new l<>(1, aVar, lVar);
        } else {
            bVar = aVar == a.SUSPEND ? new b<>(d.f6760a.a(), lVar) : new l<>(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
