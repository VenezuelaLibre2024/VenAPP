package p480z5;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import p024b6.C1662a;
import p024b6.C1666e;
import p395v5.EnumC11629c;
import p435x5.C12291g;
import p458y5.AbstractC12603a;
import p458y5.C12605c;
import p458y5.InterfaceC12604b;

/* renamed from: z5.e */
/* loaded from: classes.dex */
public final class C12806e extends AbstractC12603a {

    /* renamed from: c */
    public static final a f34877c = new a(null);

    /* renamed from: z5.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: z5.e$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34878a;

        static {
            int[] iArr = new int[EnumC11629c.values().length];
            try {
                iArr[EnumC11629c.Denied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11629c.Authorized.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11629c.Limited.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34878a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [v5.c, T] */
    /* renamed from: p */
    private static final void m42441p(C9332x<EnumC11629c> c9332x, EnumC11629c enumC11629c) {
        T t10;
        EnumC11629c enumC11629c2 = c9332x.f22581a;
        if (enumC11629c2 == EnumC11629c.NotDetermined) {
            c9332x.f22581a = enumC11629c;
            return;
        }
        int i10 = b.f34878a[enumC11629c2.ordinal()];
        if (i10 == 1) {
            EnumC11629c enumC11629c3 = EnumC11629c.Limited;
            t10 = enumC11629c3;
            if (enumC11629c != enumC11629c3) {
                t10 = enumC11629c3;
                if (enumC11629c != EnumC11629c.Authorized) {
                    return;
                }
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            c9332x.f22581a = EnumC11629c.Limited;
            return;
        } else {
            EnumC11629c enumC11629c4 = EnumC11629c.Limited;
            t10 = enumC11629c4;
            if (enumC11629c != enumC11629c4) {
                t10 = enumC11629c4;
                if (enumC11629c != EnumC11629c.Denied) {
                    return;
                }
            }
        }
        c9332x.f22581a = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [v5.c, T] */
    @Override // p458y5.AbstractC12603a
    /* renamed from: a */
    public EnumC11629c mo41444a(Application context, int i10, boolean z10) {
        C9322n.m27781e(context, "context");
        C9332x c9332x = new C9332x();
        c9332x.f22581a = EnumC11629c.NotDetermined;
        C12291g c12291g = C12291g.f32938a;
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39685d = c12291g.m39685d(i10);
        if (c12291g.m39683b(i10)) {
            m42441p(c9332x, m41451j(context, "android.permission.READ_MEDIA_AUDIO") ? EnumC11629c.Authorized : EnumC11629c.Denied);
        }
        if (m39685d) {
            m42441p(c9332x, m41451j(context, "android.permission.READ_MEDIA_VIDEO") ? EnumC11629c.Authorized : m41450h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") ? EnumC11629c.Limited : EnumC11629c.Denied);
        }
        if (m39684c) {
            m42441p(c9332x, m41451j(context, "android.permission.READ_MEDIA_IMAGES") ? EnumC11629c.Authorized : m41450h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") ? EnumC11629c.Limited : EnumC11629c.Denied);
        }
        return (EnumC11629c) c9332x.f22581a;
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: d */
    public void mo41446d(C12605c permissionsUtils, Context context, String[] permissions, int[] grantResults, List<String> needToRequestPermissionsList, List<String> deniedPermissionsList, List<String> grantedPermissionsList, int i10) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        C9322n.m27781e(needToRequestPermissionsList, "needToRequestPermissionsList");
        C9322n.m27781e(deniedPermissionsList, "deniedPermissionsList");
        C9322n.m27781e(grantedPermissionsList, "grantedPermissionsList");
        if (i10 == 3002) {
            C1666e m41445b = m41445b();
            if (m41445b == null) {
                return;
            }
            m41456o(null);
            m41445b.m9148g(1);
            return;
        }
        boolean contains = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_IMAGES");
        boolean contains2 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VIDEO");
        boolean contains3 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_AUDIO");
        boolean contains4 = needToRequestPermissionsList.contains("android.permission.ACCESS_MEDIA_LOCATION");
        boolean m41447e = (contains || contains2 || needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) ? m41447e(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO") : true;
        if (contains3) {
            m41447e = m41447e && m41449g(context, "android.permission.READ_MEDIA_AUDIO");
        }
        if (contains4) {
            m41447e = m41447e && m41450h(context, "android.permission.ACCESS_MEDIA_LOCATION");
        }
        InterfaceC12604b m41463e = permissionsUtils.m41463e();
        if (m41463e == null) {
            return;
        }
        if (m41447e) {
            m41463e.mo33609a(needToRequestPermissionsList);
        } else {
            m41463e.mo33610b(deniedPermissionsList, grantedPermissionsList, needToRequestPermissionsList);
        }
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: f */
    public boolean mo41448f(Context context) {
        C9322n.m27781e(context, "context");
        return m41449g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: k */
    public boolean mo41452k() {
        return true;
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: l */
    public void mo41453l(C12605c permissionsUtils, Application context, int i10, C1666e resultHandler) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C9322n.m27781e(resultHandler, "resultHandler");
        m41456o(resultHandler);
        C12291g c12291g = C12291g.f32938a;
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39685d = c12291g.m39685d(i10);
        ArrayList arrayList = new ArrayList();
        if (m39685d || m39684c) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if (m39685d) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (m39684c) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        m41455n(permissionsUtils, arrayList);
    }

    @Override // p458y5.AbstractC12603a
    /* renamed from: m */
    public void mo41454m(C12605c permissionsUtils, Context context, int i10, boolean z10) {
        boolean m41450h;
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C1662a.m9132a("requestPermission");
        C12291g c12291g = C12291g.f32938a;
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39685d = c12291g.m39685d(i10);
        boolean m39683b = c12291g.m39683b(i10);
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        if (m39685d || m39684c) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            m41450h = m41450h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            if (z10) {
                arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                m41450h = m41450h && m41449g(context, "android.permission.ACCESS_MEDIA_LOCATION");
            }
            if (m39685d) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (m39684c) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
        } else {
            m41450h = true;
        }
        if (m39683b) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
            if (m41450h && m41449g(context, "android.permission.READ_MEDIA_AUDIO")) {
                z11 = true;
            }
            m41450h = z11;
        }
        C1662a.m9132a("Current permissions: " + arrayList);
        C1662a.m9132a("havePermission: " + m41450h);
        if (!m41450h) {
            m41455n(permissionsUtils, arrayList);
            return;
        }
        InterfaceC12604b m41463e = permissionsUtils.m41463e();
        if (m41463e != null) {
            m41463e.mo33609a(arrayList);
        }
    }
}
