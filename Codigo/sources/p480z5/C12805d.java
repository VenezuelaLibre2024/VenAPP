package p480z5;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p395v5.EnumC11629c;
import p435x5.C12291g;
import p458y5.AbstractC12603a;
import p458y5.C12605c;
import p458y5.InterfaceC12604b;

/* renamed from: z5.d */
/* loaded from: classes.dex */
public final class C12805d extends AbstractC12603a {

    /* renamed from: c */
    public static final a f34876c = new a(null);

    /* renamed from: z5.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: a */
    public EnumC11629c mo41444a(Application context, int i10, boolean z10) {
        C9322n.m27781e(context, "context");
        return m42440p(context, i10) ? EnumC11629c.Authorized : EnumC11629c.Denied;
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: f */
    public boolean mo41448f(Context context) {
        C9322n.m27781e(context, "context");
        return m41449g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: m */
    public void mo41454m(C12605c permissionsUtils, Context context, int i10, boolean z10) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C12291g c12291g = C12291g.f32938a;
        boolean m39685d = c12291g.m39685d(i10);
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39683b = c12291g.m39683b(i10);
        ArrayList arrayList = new ArrayList();
        if (m39685d) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (m39684c) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        if (m39683b) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        }
        if (z10) {
            arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!m41451j(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            m41455n(permissionsUtils, arrayList);
            return;
        }
        InterfaceC12604b m41463e = permissionsUtils.m41463e();
        if (m41463e != null) {
            m41463e.mo33609a(arrayList);
        }
    }

    /* renamed from: p */
    public boolean m42440p(Context context, int i10) {
        C9322n.m27781e(context, "context");
        C12291g c12291g = C12291g.f32938a;
        boolean m39685d = c12291g.m39685d(i10);
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39683b = c12291g.m39683b(i10);
        boolean m41449g = m39685d ? m41449g(context, "android.permission.READ_MEDIA_VIDEO") : true;
        if (m39684c) {
            m41449g = m41449g && m41449g(context, "android.permission.READ_MEDIA_IMAGES");
        }
        if (m39683b) {
            return m41449g && m41449g(context, "android.permission.READ_MEDIA_AUDIO");
        }
        return m41449g;
    }
}
