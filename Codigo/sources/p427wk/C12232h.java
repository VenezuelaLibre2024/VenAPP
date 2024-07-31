package p427wk;

import ck.C2037v;
import hk.C7751c;
import java.util.Iterator;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wk.h */
/* loaded from: classes3.dex */
public class C12232h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: wk.h$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC12228d<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10002p f32703a;

        public a(InterfaceC10002p interfaceC10002p) {
            this.f32703a = interfaceC10002p;
        }

        @Override // p427wk.InterfaceC12228d
        public Iterator<T> iterator() {
            Iterator<T> m39377a;
            m39377a = C12232h.m39377a(this.f32703a);
            return m39377a;
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39377a(InterfaceC10002p<? super AbstractC12230f<? super T>, ? super Continuation<? super C2037v>, ? extends Object> block) {
        Continuation<? super C2037v> m23653a;
        C9322n.m27781e(block, "block");
        C12229e c12229e = new C12229e();
        m23653a = C7751c.m23653a(block, c12229e, c12229e);
        c12229e.m39368g(m23653a);
        return c12229e;
    }

    /* renamed from: b */
    public static <T> InterfaceC12228d<T> m39378b(InterfaceC10002p<? super AbstractC12230f<? super T>, ? super Continuation<? super C2037v>, ? extends Object> block) {
        C9322n.m27781e(block, "block");
        return new a(block);
    }
}
