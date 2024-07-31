package p184jh;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p163ih.C7999p;

/* renamed from: jh.q */
/* loaded from: classes3.dex */
public abstract class AbstractC9066q {

    /* renamed from: a */
    private static final String f21747a = "q";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jh.q$a */
    /* loaded from: classes3.dex */
    public class a implements Comparator<C7999p> {

        /* renamed from: a */
        final /* synthetic */ C7999p f21748a;

        a(C7999p c7999p) {
            this.f21748a = c7999p;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C7999p c7999p, C7999p c7999p2) {
            return Float.compare(AbstractC9066q.this.mo26659c(c7999p2, this.f21748a), AbstractC9066q.this.mo26659c(c7999p, this.f21748a));
        }
    }

    /* renamed from: a */
    public List<C7999p> m26667a(List<C7999p> list, C7999p c7999p) {
        if (c7999p == null) {
            return list;
        }
        Collections.sort(list, new a(c7999p));
        return list;
    }

    /* renamed from: b */
    public C7999p m26668b(List<C7999p> list, C7999p c7999p) {
        List<C7999p> m26667a = m26667a(list, c7999p);
        String str = f21747a;
        Log.i(str, "Viewfinder size: " + c7999p);
        Log.i(str, "Preview in order of preference: " + m26667a);
        return m26667a.get(0);
    }

    /* renamed from: c */
    protected abstract float mo26659c(C7999p c7999p, C7999p c7999p2);

    /* renamed from: d */
    public abstract Rect mo26660d(C7999p c7999p, C7999p c7999p2);
}
