package wk;

import java.util.Iterator;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class j extends i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f30192a;

        public a(Iterator it) {
            this.f30192a = it;
        }

        @Override // wk.d
        public Iterator<T> iterator() {
            return this.f30192a;
        }
    }

    public static <T> d<T> c(Iterator<? extends T> it) {
        n.e(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> d(d<? extends T> dVar) {
        n.e(dVar, "<this>");
        return dVar instanceof wk.a ? dVar : new wk.a(dVar);
    }
}
