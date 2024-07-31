package p192k2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9322n;

/* renamed from: k2.z */
/* loaded from: classes.dex */
public interface InterfaceC9137z {

    /* renamed from: k2.z$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static void m26937a(InterfaceC9137z interfaceC9137z, String id2, Set<String> tags) {
            C9322n.m27781e(id2, "id");
            C9322n.m27781e(tags, "tags");
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                interfaceC9137z.mo26834b(new C9136y((String) it.next(), id2));
            }
        }
    }

    /* renamed from: a */
    List<String> mo26833a(String str);

    /* renamed from: b */
    void mo26834b(C9136y c9136y);

    /* renamed from: c */
    void mo26835c(String str, Set<String> set);
}
