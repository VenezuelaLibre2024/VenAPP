package wk;

import ck.v;
import gk.Continuation;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import ok.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f30191a;

        public a(p pVar) {
            this.f30191a = pVar;
        }

        @Override // wk.d
        public Iterator<T> iterator() {
            Iterator<T> a10;
            a10 = h.a(this.f30191a);
            return a10;
        }
    }

    public static <T> Iterator<T> a(p<? super f<? super T>, ? super Continuation<? super v>, ? extends Object> block) {
        Continuation<? super v> a10;
        n.e(block, "block");
        e eVar = new e();
        a10 = hk.c.a(block, eVar, eVar);
        eVar.g(a10);
        return eVar;
    }

    public static <T> d<T> b(p<? super f<? super T>, ? super Continuation<? super v>, ? extends Object> block) {
        n.e(block, "block");
        return new a(block);
    }
}
