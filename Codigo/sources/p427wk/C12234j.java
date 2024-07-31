package p427wk;

import java.util.Iterator;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wk.j */
/* loaded from: classes3.dex */
public class C12234j extends C12233i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: wk.j$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC12228d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f32704a;

        public a(Iterator it) {
            this.f32704a = it;
        }

        @Override // p427wk.InterfaceC12228d
        public Iterator<T> iterator() {
            return this.f32704a;
        }
    }

    /* renamed from: c */
    public static <T> InterfaceC12228d<T> m39379c(Iterator<? extends T> it) {
        C9322n.m27781e(it, "<this>");
        return m39380d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> InterfaceC12228d<T> m39380d(InterfaceC12228d<? extends T> interfaceC12228d) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        return interfaceC12228d instanceof C12225a ? interfaceC12228d : new C12225a(interfaceC12228d);
    }
}
