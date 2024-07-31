package p166ik;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ik.d */
/* loaded from: classes3.dex */
public final class C8007d<E extends Enum<E>> implements Serializable {

    /* renamed from: b */
    private static final a f19478b = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Class<E> f19479a;

    /* renamed from: ik.d$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C8007d(E[] entries) {
        C9322n.m27781e(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        C9322n.m27778b(cls);
        this.f19479a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f19479a.getEnumConstants();
        C9322n.m27780d(enumConstants, "c.enumConstants");
        return C8005b.m24582a(enumConstants);
    }
}
