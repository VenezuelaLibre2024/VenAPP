package p150i2;

import android.os.Build;
import kotlin.jvm.internal.C9322n;
import p094f2.EnumC7278k;
import p128h2.C7612b;
import p170j2.AbstractC8947h;
import p192k2.C9132u;

/* renamed from: i2.g */
/* loaded from: classes.dex */
public final class C7780g extends AbstractC7776c<C7612b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7780g(AbstractC8947h<C7612b> tracker) {
        super(tracker);
        C9322n.m27781e(tracker, "tracker");
    }

    @Override // p150i2.AbstractC7776c
    /* renamed from: b */
    public boolean mo23726b(C9132u workSpec) {
        C9322n.m27781e(workSpec, "workSpec");
        EnumC7278k m21744d = workSpec.f22014j.m21744d();
        return m21744d == EnumC7278k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && m21744d == EnumC7278k.TEMPORARILY_UNMETERED);
    }

    @Override // p150i2.AbstractC7776c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo23727c(C7612b value) {
        C9322n.m27781e(value, "value");
        return !value.m23128a() || value.m23129b();
    }
}
