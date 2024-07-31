package p262o2;

import android.content.Intent;
import com.facebook.login.C4666g0;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import p152i4.C7824r;
import p152i4.InterfaceC7814m;
import p152i4.InterfaceC7818o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2.b */
/* loaded from: classes.dex */
public class C9771b implements InterfaceC7818o<C4666g0>, PluginRegistry.ActivityResultListener {

    /* renamed from: a */
    private final InterfaceC7814m f24082a;

    /* renamed from: b */
    private MethodChannel.Result f24083b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9771b(InterfaceC7814m interfaceC7814m) {
        this.f24082a = interfaceC7814m;
    }

    @Override // p152i4.InterfaceC7818o
    /* renamed from: a */
    public void mo24070a(C7824r c7824r) {
        m29317b("FAILED", c7824r.getMessage());
    }

    /* renamed from: b */
    void m29317b(String str, String str2) {
        MethodChannel.Result result = this.f24083b;
        if (result != null) {
            result.error(str, str2, null);
            this.f24083b = null;
        }
    }

    /* renamed from: c */
    void m29318c(Object obj) {
        MethodChannel.Result result = this.f24083b;
        if (result != null) {
            result.success(obj);
            this.f24083b = null;
        }
    }

    @Override // p152i4.InterfaceC7818o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSuccess(C4666g0 c4666g0) {
        m29318c(C9770a.m29310b(c4666g0.m11567a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m29320e(MethodChannel.Result result) {
        if (this.f24083b != null) {
            result.error("OPERATION_IN_PROGRESS", "The method login was called while another Facebook operation was in progress.", null);
            return false;
        }
        this.f24083b = result;
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return this.f24082a.onActivityResult(i10, i11, intent);
    }

    @Override // p152i4.InterfaceC7818o
    public void onCancel() {
        m29317b("CANCELLED", "User has cancelled login with facebook");
    }
}
