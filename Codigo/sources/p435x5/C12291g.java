package p435x5;

import dk.C7042z;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9323o;
import p280ok.InterfaceC9998l;

/* renamed from: x5.g */
/* loaded from: classes.dex */
public final class C12291g {

    /* renamed from: a */
    public static final C12291g f32938a = new C12291g();

    /* renamed from: x5.g$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Integer, CharSequence> {

        /* renamed from: a */
        public static final a f32939a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m39687a(int i10) {
            return "media_type = " + i10;
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m39687a(num.intValue());
        }
    }

    private C12291g() {
    }

    /* renamed from: a */
    private final boolean m39682a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* renamed from: b */
    public final boolean m39683b(int i10) {
        return m39682a(i10, 4);
    }

    /* renamed from: c */
    public final boolean m39684c(int i10) {
        return m39682a(i10, 1);
    }

    /* renamed from: d */
    public final boolean m39685d(int i10) {
        return m39682a(i10, 2);
    }

    /* renamed from: e */
    public final String m39686e(int i10) {
        String m20611M;
        ArrayList arrayList = new ArrayList();
        if (m39684c(i10)) {
            arrayList.add(1);
        }
        if (m39683b(i10)) {
            arrayList.add(2);
        }
        if (m39685d(i10)) {
            arrayList.add(3);
        }
        m20611M = C7042z.m20611M(arrayList, " OR ", null, null, 0, null, a.f32939a, 30, null);
        return "( " + m20611M + " )";
    }
}
