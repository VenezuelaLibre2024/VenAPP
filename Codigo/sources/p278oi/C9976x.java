package p278oi;

import android.app.Activity;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import ck.C2037v;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* renamed from: oi.x */
/* loaded from: classes3.dex */
public final class C9976x {

    /* renamed from: c */
    public static final a f24582c = new a(null);

    /* renamed from: a */
    private PluginRegistry.RequestPermissionsResultListener f24583a;

    /* renamed from: b */
    private boolean f24584b;

    /* renamed from: oi.x$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: oi.x$b */
    /* loaded from: classes3.dex */
    public interface b {
        void onResult(String str, String str2);
    }

    /* renamed from: oi.x$c */
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: b */
        final /* synthetic */ b f24586b;

        c(b bVar) {
            this.f24586b = bVar;
        }

        @Override // p278oi.C9976x.b
        public void onResult(String str, String str2) {
            C9976x.this.f24584b = false;
            C9976x.this.f24583a = null;
            this.f24586b.onResult(str, str2);
        }
    }

    /* renamed from: c */
    public final PluginRegistry.RequestPermissionsResultListener m29830c() {
        return this.f24583a;
    }

    /* renamed from: d */
    public final int m29831d(Activity activity) {
        C9322n.m27781e(activity, "activity");
        return C0854a.checkSelfPermission(activity, "android.permission.CAMERA") == 0 ? 1 : 2;
    }

    /* renamed from: e */
    public final void m29832e(Activity activity, InterfaceC9998l<? super PluginRegistry.RequestPermissionsResultListener, C2037v> addPermissionListener, b callback) {
        C9322n.m27781e(activity, "activity");
        C9322n.m27781e(addPermissionListener, "addPermissionListener");
        C9322n.m27781e(callback, "callback");
        if (this.f24584b) {
            callback.onResult("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
            return;
        }
        if (m29831d(activity) == 1) {
            callback.onResult(null, null);
            return;
        }
        if (this.f24583a == null) {
            C9977y c9977y = new C9977y(new c(callback));
            this.f24583a = c9977y;
            addPermissionListener.invoke(c9977y);
        }
        this.f24584b = true;
        C0777b.m3916g(activity, new String[]{"android.permission.CAMERA"}, 1926);
    }
}
