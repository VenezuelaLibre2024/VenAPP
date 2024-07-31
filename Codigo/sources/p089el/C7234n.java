package p089el;

import java.util.ArrayList;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: el.n */
/* loaded from: classes3.dex */
public final class C7234n<E> {
    /* renamed from: a */
    public static <E> Object m21618a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m21619b(Object obj, int i10, C9315g c9315g) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m21618a(obj);
    }

    /* renamed from: c */
    public static final Object m21620c(Object obj, E e10) {
        if (obj == null) {
            return m21618a(e10);
        }
        if (obj instanceof ArrayList) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e10);
            return m21618a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return m21618a(arrayList);
    }
}
