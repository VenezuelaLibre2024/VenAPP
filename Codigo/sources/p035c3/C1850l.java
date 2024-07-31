package p035c3;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p035c3.C1839a;
import p035c3.C1855q;
import p035c3.C1859u;

/* renamed from: c3.l */
/* loaded from: classes.dex */
final class C1850l implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final Context f7763a;

    /* renamed from: b */
    private final C1839a f7764b;

    /* renamed from: c */
    private final C1855q f7765c;

    /* renamed from: d */
    private final C1859u f7766d;

    /* renamed from: e */
    private Activity f7767e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1850l(Context context, C1839a c1839a, C1855q c1855q, C1859u c1859u) {
        this.f7763a = context;
        this.f7764b = c1839a;
        this.f7765c = c1855q;
        this.f7766d = c1859u;
    }

    /* renamed from: i */
    public void m9883i(Activity activity) {
        this.f7767e = activity;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                C1859u c1859u = this.f7766d;
                Context context = this.f7763a;
                Objects.requireNonNull(result);
                c1859u.m9916a(parseInt, context, new C1859u.a() { // from class: c3.c
                    @Override // p035c3.C1859u.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                }, new InterfaceC1840b() { // from class: c3.d
                    @Override // p035c3.InterfaceC1840b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                C1855q c1855q = this.f7765c;
                Activity activity = this.f7767e;
                Objects.requireNonNull(result);
                c1855q.m9899g(parseInt2, activity, new C1855q.c() { // from class: c3.h
                    @Override // p035c3.C1855q.c
                    /* renamed from: a */
                    public final void mo9874a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new InterfaceC1840b() { // from class: c3.i
                    @Override // p035c3.InterfaceC1840b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                C1855q c1855q2 = this.f7765c;
                Context context2 = this.f7763a;
                Objects.requireNonNull(result);
                c1855q2.m9897c(parseInt3, context2, new C1855q.a() { // from class: c3.e
                    @Override // p035c3.C1855q.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                });
                return;
            case 3:
                C1839a c1839a = this.f7764b;
                Context context3 = this.f7763a;
                Objects.requireNonNull(result);
                c1839a.m9871a(context3, new C1839a.a() { // from class: c3.j
                    @Override // p035c3.C1839a.a
                    /* renamed from: a */
                    public final void mo9872a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new InterfaceC1840b() { // from class: c3.k
                    @Override // p035c3.InterfaceC1840b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 4:
                List<Integer> list = (List) methodCall.arguments();
                C1855q c1855q3 = this.f7765c;
                Activity activity2 = this.f7767e;
                Objects.requireNonNull(result);
                c1855q3.m9898f(list, activity2, new C1855q.b() { // from class: c3.f
                    @Override // p035c3.C1855q.b
                    /* renamed from: a */
                    public final void mo9873a(Map map) {
                        MethodChannel.Result.this.success(map);
                    }
                }, new InterfaceC1840b() { // from class: c3.g
                    @Override // p035c3.InterfaceC1840b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
