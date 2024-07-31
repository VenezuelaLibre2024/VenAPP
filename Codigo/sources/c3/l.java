package c3;

import android.app.Activity;
import android.content.Context;
import c3.a;
import c3.q;
import c3.u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class l implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6814a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6815b;

    /* renamed from: c, reason: collision with root package name */
    private final q f6816c;

    /* renamed from: d, reason: collision with root package name */
    private final u f6817d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f6818e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, a aVar, q qVar, u uVar) {
        this.f6814a = context;
        this.f6815b = aVar;
        this.f6816c = qVar;
        this.f6817d = uVar;
    }

    public void i(Activity activity) {
        this.f6818e = activity;
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
                u uVar = this.f6817d;
                Context context = this.f6814a;
                Objects.requireNonNull(result);
                uVar.a(parseInt, context, new u.a() { // from class: c3.c
                    @Override // c3.u.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                }, new b() { // from class: c3.d
                    @Override // c3.b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                q qVar = this.f6816c;
                Activity activity = this.f6818e;
                Objects.requireNonNull(result);
                qVar.g(parseInt2, activity, new q.c() { // from class: c3.h
                    @Override // c3.q.c
                    public final void a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: c3.i
                    @Override // c3.b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                q qVar2 = this.f6816c;
                Context context2 = this.f6814a;
                Objects.requireNonNull(result);
                qVar2.c(parseInt3, context2, new q.a() { // from class: c3.e
                    @Override // c3.q.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                });
                return;
            case 3:
                a aVar = this.f6815b;
                Context context3 = this.f6814a;
                Objects.requireNonNull(result);
                aVar.a(context3, new a.InterfaceC0114a() { // from class: c3.j
                    @Override // c3.a.InterfaceC0114a
                    public final void a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: c3.k
                    @Override // c3.b
                    public final void onError(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 4:
                List<Integer> list = (List) methodCall.arguments();
                q qVar3 = this.f6816c;
                Activity activity2 = this.f6818e;
                Objects.requireNonNull(result);
                qVar3.f(list, activity2, new q.b() { // from class: c3.f
                    @Override // c3.q.b
                    public final void a(Map map) {
                        MethodChannel.Result.this.success(map);
                    }
                }, new b() { // from class: c3.g
                    @Override // c3.b
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
