package p150i2;

import android.os.Build;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p094f2.EnumC7278k;
import p128h2.C7612b;
import p170j2.AbstractC8947h;
import p192k2.C9132u;

/* renamed from: i2.e */
/* loaded from: classes.dex */
public final class C7778e extends AbstractC7776c<C7612b> {

    /* renamed from: f */
    public static final a f18534f = new a(null);

    /* renamed from: g */
    private static final String f18535g;

    /* renamed from: i2.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    static {
        String m21769i = AbstractC7277j.m21769i("NetworkMeteredCtrlr");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f18535g = m21769i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7778e(AbstractC8947h<C7612b> tracker) {
        super(tracker);
        C9322n.m27781e(tracker, "tracker");
    }

    @Override // p150i2.AbstractC7776c
    /* renamed from: b */
    public boolean mo23726b(C9132u workSpec) {
        C9322n.m27781e(workSpec, "workSpec");
        return workSpec.f22014j.m21744d() == EnumC7278k.METERED;
    }

    @Override // p150i2.AbstractC7776c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo23727c(C7612b value) {
        C9322n.m27781e(value, "value");
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC7277j.m21767e().mo21770a(f18535g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (value.m23128a()) {
                return false;
            }
        } else if (value.m23128a() && value.m23129b()) {
            return false;
        }
        return true;
    }
}
