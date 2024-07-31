package ik;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class d<E extends Enum<E>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final a f17815b = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f17816a;

    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public d(E[] entries) {
        n.e(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        n.b(cls);
        this.f17816a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f17816a.getEnumConstants();
        n.d(enumConstants, "c.enumConstants");
        return b.a(enumConstants);
    }
}
