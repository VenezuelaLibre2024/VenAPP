package o2;

import android.content.Intent;
import com.facebook.login.g0;
import i4.m;
import i4.o;
import i4.r;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements o<g0>, PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    private final m f22149a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel.Result f22150b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(m mVar) {
        this.f22149a = mVar;
    }

    @Override // i4.o
    public void a(r rVar) {
        b("FAILED", rVar.getMessage());
    }

    void b(String str, String str2) {
        MethodChannel.Result result = this.f22150b;
        if (result != null) {
            result.error(str, str2, null);
            this.f22150b = null;
        }
    }

    void c(Object obj) {
        MethodChannel.Result result = this.f22150b;
        if (result != null) {
            result.success(obj);
            this.f22150b = null;
        }
    }

    @Override // i4.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSuccess(g0 g0Var) {
        c(a.b(g0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(MethodChannel.Result result) {
        if (this.f22150b != null) {
            result.error("OPERATION_IN_PROGRESS", "The method login was called while another Facebook operation was in progress.", null);
            return false;
        }
        this.f22150b = result;
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return this.f22149a.onActivityResult(i10, i11, intent);
    }

    @Override // i4.o
    public void onCancel() {
        b("CANCELLED", "User has cancelled login with facebook");
    }
}
