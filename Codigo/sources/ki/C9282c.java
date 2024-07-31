package ki;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dk.C7031r;
import dk.C7033s;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: ki.c */
/* loaded from: classes3.dex */
public final class C9282c implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final PackageManager f22538a;

    /* renamed from: b */
    private final WindowManager f22539b;

    public C9282c(PackageManager packageManager, WindowManager windowManager) {
        C9322n.m27781e(packageManager, "packageManager");
        C9322n.m27781e(windowManager, "windowManager");
        this.f22538a = packageManager;
        this.f22539b = windowManager;
    }

    /* renamed from: a */
    private final List<String> m27690a() {
        int m20590r;
        FeatureInfo[] systemAvailableFeatures = this.f22538a.getSystemAvailableFeatures();
        C9322n.m27780d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        m20590r = C7033s.m20590r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m20590r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0 == false) goto L6;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m27691b() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = p450xk.C12515g.m40978E(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            kotlin.jvm.internal.C9322n.m27780d(r0, r5)
            boolean r0 = p450xk.C12515g.m40978E(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
        L1f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            kotlin.jvm.internal.C9322n.m27780d(r0, r5)
            boolean r1 = p450xk.C12515g.m40978E(r0, r1, r2, r3, r4)
            if (r1 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = p450xk.C12515g.m40978E(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = p450xk.C12515g.m40983J(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lb6
        Lb5:
            r2 = 1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C9282c.m27691b():boolean");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        List m20584l;
        List m20584l2;
        List m20584l3;
        String SERIAL;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (!call.method.equals("getDeviceInfo")) {
            result.notImplemented();
            return;
        }
        HashMap hashMap = new HashMap();
        String BOARD = Build.BOARD;
        C9322n.m27780d(BOARD, "BOARD");
        hashMap.put("board", BOARD);
        String BOOTLOADER = Build.BOOTLOADER;
        C9322n.m27780d(BOOTLOADER, "BOOTLOADER");
        hashMap.put("bootloader", BOOTLOADER);
        String BRAND = Build.BRAND;
        C9322n.m27780d(BRAND, "BRAND");
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        C9322n.m27780d(DEVICE, "DEVICE");
        hashMap.put("device", DEVICE);
        String DISPLAY = Build.DISPLAY;
        C9322n.m27780d(DISPLAY, "DISPLAY");
        hashMap.put("display", DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        C9322n.m27780d(FINGERPRINT, "FINGERPRINT");
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        C9322n.m27780d(HARDWARE, "HARDWARE");
        hashMap.put("hardware", HARDWARE);
        String HOST = Build.HOST;
        C9322n.m27780d(HOST, "HOST");
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, HOST);
        String ID = Build.ID;
        C9322n.m27780d(ID, "ID");
        hashMap.put(FacebookMediationAdapter.KEY_ID, ID);
        String MANUFACTURER = Build.MANUFACTURER;
        C9322n.m27780d(MANUFACTURER, "MANUFACTURER");
        hashMap.put("manufacturer", MANUFACTURER);
        String MODEL = Build.MODEL;
        C9322n.m27780d(MODEL, "MODEL");
        hashMap.put("model", MODEL);
        String PRODUCT = Build.PRODUCT;
        C9322n.m27780d(PRODUCT, "PRODUCT");
        hashMap.put("product", PRODUCT);
        int i10 = Build.VERSION.SDK_INT;
        String[] SUPPORTED_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
        C9322n.m27780d(SUPPORTED_32_BIT_ABIS, "SUPPORTED_32_BIT_ABIS");
        m20584l = C7031r.m20584l(Arrays.copyOf(SUPPORTED_32_BIT_ABIS, SUPPORTED_32_BIT_ABIS.length));
        hashMap.put("supported32BitAbis", m20584l);
        String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
        C9322n.m27780d(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
        m20584l2 = C7031r.m20584l(Arrays.copyOf(SUPPORTED_64_BIT_ABIS, SUPPORTED_64_BIT_ABIS.length));
        hashMap.put("supported64BitAbis", m20584l2);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        C9322n.m27780d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        m20584l3 = C7031r.m20584l(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length));
        hashMap.put("supportedAbis", m20584l3);
        String TAGS = Build.TAGS;
        C9322n.m27780d(TAGS, "TAGS");
        hashMap.put("tags", TAGS);
        String TYPE = Build.TYPE;
        C9322n.m27780d(TYPE, "TYPE");
        hashMap.put("type", TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!m27691b()));
        hashMap.put("systemFeatures", m27690a());
        HashMap hashMap2 = new HashMap();
        String BASE_OS = Build.VERSION.BASE_OS;
        C9322n.m27780d(BASE_OS, "BASE_OS");
        hashMap2.put("baseOS", BASE_OS);
        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        String SECURITY_PATCH = Build.VERSION.SECURITY_PATCH;
        C9322n.m27780d(SECURITY_PATCH, "SECURITY_PATCH");
        hashMap2.put("securityPatch", SECURITY_PATCH);
        String CODENAME = Build.VERSION.CODENAME;
        C9322n.m27780d(CODENAME, "CODENAME");
        hashMap2.put("codename", CODENAME);
        String INCREMENTAL = Build.VERSION.INCREMENTAL;
        C9322n.m27780d(INCREMENTAL, "INCREMENTAL");
        hashMap2.put("incremental", INCREMENTAL);
        String RELEASE = Build.VERSION.RELEASE;
        C9322n.m27780d(RELEASE, "RELEASE");
        hashMap2.put("release", RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i10));
        hashMap.put("version", hashMap2);
        Display defaultDisplay = this.f22539b.getDefaultDisplay();
        C9322n.m27780d(defaultDisplay, "getDefaultDisplay(...)");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("widthPx", Double.valueOf(displayMetrics.widthPixels));
        hashMap3.put("heightPx", Double.valueOf(displayMetrics.heightPixels));
        hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
        hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
        hashMap.put("displayMetrics", hashMap3);
        if (i10 >= 26) {
            try {
                SERIAL = Build.getSerial();
            } catch (SecurityException unused) {
                SERIAL = "unknown";
            }
            C9322n.m27778b(SERIAL);
        } else {
            SERIAL = Build.SERIAL;
            C9322n.m27780d(SERIAL, "SERIAL");
        }
        hashMap.put("serialNumber", SERIAL);
        result.success(hashMap);
    }
}
