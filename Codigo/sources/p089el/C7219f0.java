package p089el;

import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7217e0;

/* renamed from: el.f0 */
/* loaded from: classes3.dex */
public final class C7219f0<S extends AbstractC7217e0<S>> {
    /* renamed from: a */
    public static <S extends AbstractC7217e0<S>> Object m21568a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final S m21569b(Object obj) {
        if (obj == C7214d.f16183a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* renamed from: c */
    public static final boolean m21570c(Object obj) {
        return obj == C7214d.f16183a;
    }
}
