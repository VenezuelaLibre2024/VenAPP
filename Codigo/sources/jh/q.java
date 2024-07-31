package jh;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19968a = "q";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Comparator<ih.p> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ih.p f19969a;

        a(ih.p pVar) {
            this.f19969a = pVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ih.p pVar, ih.p pVar2) {
            return Float.compare(q.this.c(pVar2, this.f19969a), q.this.c(pVar, this.f19969a));
        }
    }

    public List<ih.p> a(List<ih.p> list, ih.p pVar) {
        if (pVar == null) {
            return list;
        }
        Collections.sort(list, new a(pVar));
        return list;
    }

    public ih.p b(List<ih.p> list, ih.p pVar) {
        List<ih.p> a10 = a(list, pVar);
        String str = f19968a;
        Log.i(str, "Viewfinder size: " + pVar);
        Log.i(str, "Preview in order of preference: " + a10);
        return a10.get(0);
    }

    protected abstract float c(ih.p pVar, ih.p pVar2);

    public abstract Rect d(ih.p pVar, ih.p pVar2);
}
