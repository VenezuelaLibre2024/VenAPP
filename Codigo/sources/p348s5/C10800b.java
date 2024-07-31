package p348s5;

import dk.C7021m;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class C10800b {

    /* renamed from: a */
    public static final a f27261a = new a(null);

    /* renamed from: b */
    private static final String[] f27262b = {"fetchPathProperties", "getAssetPathList", "getAssetListPaged", "getAssetListRange", "getAssetCount", "getAssetsByRange"};

    /* renamed from: c */
    private static final String[] f27263c = {"getLatLngAndroidQ", "getFullFile", "getOriginBytes"};

    /* renamed from: s5.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final boolean m32910a(String method) {
            boolean m20488p;
            C9322n.m27781e(method, "method");
            m20488p = C7021m.m20488p(new String[]{"log", "openSetting", "forceOldApi", "systemVersion", "clearFileCache", "releaseMemoryCache", "ignorePermissionCheck"}, method);
            return m20488p;
        }

        /* renamed from: b */
        public final boolean m32911b(String method) {
            boolean m20488p;
            C9322n.m27781e(method, "method");
            m20488p = C7021m.m20488p(new String[]{"requestPermissionExtend", "presentLimited"}, method);
            return m20488p;
        }
    }
}
