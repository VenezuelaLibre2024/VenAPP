package oi;

import android.app.Activity;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f22649c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private PluginRegistry.RequestPermissionsResultListener f22650a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22651b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void onResult(String str, String str2);
    }

    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f22653b;

        c(b bVar) {
            this.f22653b = bVar;
        }

        @Override // oi.x.b
        public void onResult(String str, String str2) {
            x.this.f22651b = false;
            x.this.f22650a = null;
            this.f22653b.onResult(str, str2);
        }
    }

    public final PluginRegistry.RequestPermissionsResultListener c() {
        return this.f22650a;
    }

    public final int d(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
        return androidx.core.content.a.checkSelfPermission(activity, "android.permission.CAMERA") == 0 ? 1 : 2;
    }

    public final void e(Activity activity, ok.l<? super PluginRegistry.RequestPermissionsResultListener, ck.v> addPermissionListener, b callback) {
        kotlin.jvm.internal.n.e(activity, "activity");
        kotlin.jvm.internal.n.e(addPermissionListener, "addPermissionListener");
        kotlin.jvm.internal.n.e(callback, "callback");
        if (this.f22651b) {
            callback.onResult("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
            return;
        }
        if (d(activity) == 1) {
            callback.onResult(null, null);
            return;
        }
        if (this.f22650a == null) {
            y yVar = new y(new c(callback));
            this.f22650a = yVar;
            addPermissionListener.invoke(yVar);
        }
        this.f22651b = true;
        androidx.core.app.b.g(activity, new String[]{"android.permission.CAMERA"}, 1926);
    }
}
