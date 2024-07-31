package p480z5;

import android.app.Application;
import android.content.Context;
import dk.C7031r;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p395v5.EnumC11629c;
import p458y5.C12605c;
import p458y5.InterfaceC12604b;

/* renamed from: z5.b */
/* loaded from: classes.dex */
public final class C12803b extends C12802a {

    /* renamed from: d */
    public static final a f34874d = new a(null);

    /* renamed from: z5.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @Override // p480z5.C12802a, p458y5.AbstractC12603a
    /* renamed from: a */
    public EnumC11629c mo41444a(Application context, int i10, boolean z10) {
        C9322n.m27781e(context, "context");
        return m41451j(context, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") ? EnumC11629c.Authorized : EnumC11629c.Denied;
    }

    @Override // p480z5.C12802a, p458y5.AbstractC12603a
    /* renamed from: f */
    public boolean mo41448f(Context context) {
        C9322n.m27781e(context, "context");
        return m41449g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // p480z5.C12802a, p458y5.AbstractC12603a
    /* renamed from: m */
    public void mo41454m(C12605c permissionsUtils, Context context, int i10, boolean z10) {
        List<String> m20586n;
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        m20586n = C7031r.m20586n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        if (z10) {
            m20586n.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) m20586n.toArray(new String[0]);
        if (!m41451j(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            m41455n(permissionsUtils, m20586n);
            return;
        }
        InterfaceC12604b m41463e = permissionsUtils.m41463e();
        if (m41463e != null) {
            m41463e.mo33609a(m20586n);
        }
    }
}
