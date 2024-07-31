package p392v2;

import android.location.Address;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.List;
import java.util.Locale;
import p410w2.C12062b;
import p410w2.C12063c;

/* renamed from: v2.d */
/* loaded from: classes.dex */
final class C11618d implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final C11616b f30208a;

    /* renamed from: b */
    private MethodChannel f30209b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC11615a {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f30210a;

        /* renamed from: b */
        final /* synthetic */ String f30211b;

        a(MethodChannel.Result result, String str) {
            this.f30210a = result;
            this.f30211b = str;
        }

        @Override // p392v2.InterfaceC11615a
        public void onError(String str) {
            this.f30210a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // p392v2.InterfaceC11615a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f30210a.error("NOT_FOUND", String.format("No coordinates found for '%s'", this.f30211b), null);
            } else {
                this.f30210a.success(C12062b.m38733c(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.d$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC11615a {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f30213a;

        /* renamed from: b */
        final /* synthetic */ String f30214b;

        b(MethodChannel.Result result, String str) {
            this.f30213a = result;
            this.f30214b = str;
        }

        @Override // p392v2.InterfaceC11615a
        public void onError(String str) {
            this.f30213a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // p392v2.InterfaceC11615a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f30213a.error("NOT_FOUND", String.format("No coordinates found for '%s'", this.f30214b), null);
            } else {
                this.f30213a.success(C12062b.m38732b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.d$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC11615a {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f30216a;

        /* renamed from: b */
        final /* synthetic */ double f30217b;

        /* renamed from: c */
        final /* synthetic */ double f30218c;

        c(MethodChannel.Result result, double d10, double d11) {
            this.f30216a = result;
            this.f30217b = d10;
            this.f30218c = d11;
        }

        @Override // p392v2.InterfaceC11615a
        public void onError(String str) {
            this.f30216a.error("IO_ERROR", String.format(str, new Object[0]), null);
        }

        @Override // p392v2.InterfaceC11615a
        public void onGeocode(List<Address> list) {
            if (list == null || list.size() <= 0) {
                this.f30216a.error("NOT_FOUND", String.format(Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(this.f30217b), Double.valueOf(this.f30218c)), null);
            } else {
                this.f30216a.success(C12062b.m38732b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11618d(C11616b c11616b) {
        this.f30208a = c11616b;
    }

    /* renamed from: a */
    private void m36407a(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.f30208a.m36403f()));
    }

    /* renamed from: b */
    private void m36408b(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("address");
        if (str == null || str.isEmpty()) {
            result.error("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
        }
        this.f30208a.m36404g(str, new a(result, str));
    }

    /* renamed from: c */
    private void m36409c(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("address");
        if (str == null || str.isEmpty()) {
            result.error("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
        }
        this.f30208a.m36404g(str, new b(result, str));
    }

    /* renamed from: d */
    private void m36410d(MethodCall methodCall, MethodChannel.Result result) {
        double doubleValue = ((Double) methodCall.argument("latitude")).doubleValue();
        double doubleValue2 = ((Double) methodCall.argument("longitude")).doubleValue();
        this.f30208a.m36405h(doubleValue, doubleValue2, new c(result, doubleValue, doubleValue2));
    }

    /* renamed from: e */
    private void m36411e(MethodCall methodCall, MethodChannel.Result result) {
        this.f30208a.m36406i(C12063c.m38735a((String) methodCall.argument("localeIdentifier")));
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36412f(BinaryMessenger binaryMessenger) {
        if (this.f30209b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            m36413g();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geocoding", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f30209b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36413g() {
        MethodChannel methodChannel = this.f30209b;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f30209b = null;
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
                m36410d(methodCall, result);
                return;
            case 1:
                m36407a(methodCall, result);
                return;
            case 2:
                m36408b(methodCall, result);
                return;
            case 3:
                m36409c(methodCall, result);
                return;
            case 4:
                m36411e(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
