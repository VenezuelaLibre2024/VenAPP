package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C9322n;

/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: classes3.dex */
public final class C9301g {
    /* renamed from: a */
    private static final void m27747a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC9300f m27748b(AbstractC9295a abstractC9295a) {
        return (InterfaceC9300f) abstractC9295a.getClass().getAnnotation(InterfaceC9300f.class);
    }

    /* renamed from: c */
    private static final int m27749c(AbstractC9295a abstractC9295a) {
        try {
            Field declaredField = abstractC9295a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC9295a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m27750d(AbstractC9295a abstractC9295a) {
        String str;
        C9322n.m27781e(abstractC9295a, "<this>");
        InterfaceC9300f m27748b = m27748b(abstractC9295a);
        if (m27748b == null) {
            return null;
        }
        m27747a(1, m27748b.m27746v());
        int m27749c = m27749c(abstractC9295a);
        int i10 = m27749c < 0 ? -1 : m27748b.m27744l()[m27749c];
        String m27755b = C9303i.f22556a.m27755b(abstractC9295a);
        if (m27755b == null) {
            str = m27748b.m27742c();
        } else {
            str = m27755b + '/' + m27748b.m27742c();
        }
        return new StackTraceElement(str, m27748b.m27745m(), m27748b.m27743f(), i10);
    }
}
