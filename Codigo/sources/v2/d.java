package v2;

import android.location.Address;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class d implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private final v2.b f27884a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f27885b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f27886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27887b;

        a(MethodChannel.Result result, String str) {
            this.f27886a = result;
            this.f27887b = str;
        }

        @Override // v2.a
        public void onError(String str) {
            this.f27886a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // v2.a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f27886a.error("NOT_FOUND", String.format("No coordinates found for '%s'", this.f27887b), null);
            } else {
                this.f27886a.success(w2.b.c(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements v2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f27889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27890b;

        b(MethodChannel.Result result, String str) {
            this.f27889a = result;
            this.f27890b = str;
        }

        @Override // v2.a
        public void onError(String str) {
            this.f27889a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // v2.a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f27889a.error("NOT_FOUND", String.format("No coordinates found for '%s'", this.f27890b), null);
            } else {
                this.f27889a.success(w2.b.b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements v2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f27892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f27893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f27894c;

        c(MethodChannel.Result result, double d10, double d11) {
            this.f27892a = result;
            this.f27893b = d10;
            this.f27894c = d11;
        }

        @Override // v2.a
        public void onError(String str) {
            this.f27892a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // v2.a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f27892a.error("NOT_FOUND", String.format(Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(this.f27893b), Double.valueOf(this.f27894c)), null);
            } else {
                this.f27892a.success(w2.b.b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(v2.b bVar) {
        this.f27884a = bVar;
    }

    private void a(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.f27884a.f()));
    }

    private void b(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("address");
        if (str == null || str.isEmpty()) {
            result.error("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
        }
        this.f27884a.g(str, new a(result, str));
    }

    private void c(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("address");
        if (str == null || str.isEmpty()) {
            result.error("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
        }
        this.f27884a.g(str, new b(result, str));
    }

    private void d(MethodCall methodCall, MethodChannel.Result result) {
        double doubleValue = ((Double) methodCall.argument("latitude")).doubleValue();
        double doubleValue2 = ((Double) methodCall.argument("longitude")).doubleValue();
        this.f27884a.h(doubleValue, doubleValue2, new c(result, doubleValue, doubleValue2));
    }

    private void e(MethodCall methodCall, MethodChannel.Result result) {
        this.f27884a.i(w2.c.a((String) methodCall.argument("localeIdentifier")));
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(BinaryMessenger binaryMessenger) {
        if (this.f27885b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            g();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geocoding", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f27885b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        MethodChannel methodChannel = this.f27885b;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f27885b = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1276560131:
                if (str.equals("placemarkFromCoordinates")) {
                    c10 = 0;
                    break;
                }
                break;
            case -898056143:
                if (str.equals("isPresent")) {
                    c10 = 1;
                    break;
                }
                break;
            case -533029387:
                if (str.equals("locationFromAddress")) {
                    c10 = 2;
                    break;
                }
                break;
            case 769355766:
                if (str.equals("placemarkFromAddress")) {
                    c10 = 3;
                    break;
                }
                break;
            case 930278181:
                if (str.equals("setLocaleIdentifier")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                d(methodCall, result);
                return;
            case 1:
                a(methodCall, result);
                return;
            case 2:
                b(methodCall, result);
                return;
            case 3:
                c(methodCall, result);
                return;
            case 4:
                e(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
