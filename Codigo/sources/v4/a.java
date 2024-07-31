package v4;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.i0;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import dg.g;
import dg.l;
import dg.v;
import i4.e0;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kg.b;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import xk.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27907a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f27908b = a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, NsdManager.RegistrationListener> f27909c = new HashMap<>();

    /* renamed from: v4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0456a implements NsdManager.RegistrationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27911b;

        C0456a(String str, String str2) {
            this.f27910a = str;
            this.f27911b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            n.e(serviceInfo, "serviceInfo");
            a aVar = a.f27907a;
            a.a(this.f27911b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            n.e(NsdServiceInfo, "NsdServiceInfo");
            if (n.a(this.f27910a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f27907a;
            a.a(this.f27911b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            n.e(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            n.e(serviceInfo, "serviceInfo");
        }
    }

    private a() {
    }

    public static final void a(String str) {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            f27907a.b(str);
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }

    private final void b(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = f27909c.get(str);
            if (registrationListener != null) {
                Object systemService = e0.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    n0 n0Var = n0.f7780a;
                    n0.j0(f27908b, e10);
                }
                f27909c.remove(str);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final Bitmap c(String str) {
        int j10;
        int m10;
        int[] iArr;
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (a5.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(g.class);
            enumMap.put((EnumMap) g.MARGIN, (g) 2);
            try {
                b a10 = new l().a(str, dg.a.QR_CODE, 200, 200, enumMap);
                j10 = a10.j();
                m10 = a10.m();
                iArr = new int[j10 * m10];
                if (j10 > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * m10;
                        if (m10 > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = a10.g(i13, i10) ? -16777216 : -1;
                                if (i14 >= m10) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= j10) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                createBitmap = Bitmap.createBitmap(m10, j10, Bitmap.Config.ARGB_8888);
            } catch (v unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, m10, 0, 0, m10, j10);
                return createBitmap;
            } catch (v unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return null;
        }
    }

    public static final String d(Map<String, String> map) {
        if (a5.a.d(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th2) {
                a5.a.b(th2, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        n.d(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        n.d(MODEL, "MODEL");
        map.put("model", MODEL);
        String jSONObject = new JSONObject(map).toString();
        n.d(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        if (a5.a.d(a.class)) {
            return false;
        }
        try {
            com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
            r f10 = com.facebook.internal.v.f(e0.m());
            if (f10 != null) {
                return f10.o().contains(i0.Enabled);
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (a5.a.d(a.class)) {
            return false;
        }
        try {
            if (e()) {
                return f27907a.g(str);
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return false;
        }
    }

    private final boolean g(String str) {
        String z10;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f27909c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            z10 = p.z(e0.B(), '.', '|', false, 4, null);
            String str2 = "fbsdk_" + n.k("android-", z10) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = e0.l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C0456a c0456a = new C0456a(str2, str);
            hashMap.put(str, c0456a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0456a);
            return true;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}
