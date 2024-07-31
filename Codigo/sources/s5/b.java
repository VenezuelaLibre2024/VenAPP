package s5;

import dk.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25142a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f25143b = {"fetchPathProperties", "getAssetPathList", "getAssetListPaged", "getAssetListRange", "getAssetCount", "getAssetsByRange"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f25144c = {"getLatLngAndroidQ", "getFullFile", "getOriginBytes"};

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a(String method) {
            boolean p10;
            n.e(method, "method");
            p10 = m.p(new String[]{"log", "openSetting", "forceOldApi", "systemVersion", "clearFileCache", "releaseMemoryCache", "ignorePermissionCheck"}, method);
            return p10;
        }

        public final boolean b(String method) {
            boolean p10;
            n.e(method, "method");
            p10 = m.p(new String[]{"requestPermissionExtend", "presentLimited"}, method);
            return p10;
        }
    }
}
