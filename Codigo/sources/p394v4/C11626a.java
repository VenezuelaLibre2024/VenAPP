package p394v4;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.facebook.internal.EnumC4624i0;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kg.C9264b;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p007a5.C0033a;
import p066dg.C6951l;
import p066dg.C6961v;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p152i4.C7799e0;
import p450xk.C12524p;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class C11626a {

    /* renamed from: a */
    public static final C11626a f30231a = new C11626a();

    /* renamed from: b */
    private static final String f30232b = C11626a.class.getCanonicalName();

    /* renamed from: c */
    private static final HashMap<String, NsdManager.RegistrationListener> f30233c = new HashMap<>();

    /* renamed from: v4.a$a */
    /* loaded from: classes.dex */
    public static final class a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f30234a;

        /* renamed from: b */
        final /* synthetic */ String f30235b;

        a(String str, String str2) {
            this.f30234a = str;
            this.f30235b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            C9322n.m27781e(serviceInfo, "serviceInfo");
            C11626a c11626a = C11626a.f30231a;
            C11626a.m36421a(this.f30235b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            C9322n.m27781e(NsdServiceInfo, "NsdServiceInfo");
            if (C9322n.m27777a(this.f30234a, NsdServiceInfo.getServiceName())) {
                return;
            }
            C11626a c11626a = C11626a.f30231a;
            C11626a.m36421a(this.f30235b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            C9322n.m27781e(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            C9322n.m27781e(serviceInfo, "serviceInfo");
        }
    }

    private C11626a() {
    }

    /* renamed from: a */
    public static final void m36421a(String str) {
        if (C0033a.m107d(C11626a.class)) {
            return;
        }
        try {
            f30231a.m36422b(str);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11626a.class);
        }
    }

    /* renamed from: b */
    private final void m36422b(String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = f30233c.get(str);
            if (registrationListener != null) {
                Object systemService = C7799e0.m23860l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    C4634n0.m11312j0(f30232b, e10);
                }
                f30233c.remove(str);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: c */
    public static final Bitmap m36423c(String str) {
        int m27606j;
        int m27609m;
        int[] iArr;
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (C0033a.m107d(C11626a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EnumC6946g.class);
            enumMap.put((EnumMap) EnumC6946g.MARGIN, (EnumC6946g) 2);
            try {
                C9264b mo10303a = new C6951l().mo10303a(str, EnumC6940a.QR_CODE, 200, 200, enumMap);
                m27606j = mo10303a.m27606j();
                m27609m = mo10303a.m27609m();
                iArr = new int[m27606j * m27609m];
                if (m27606j > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * m27609m;
                        if (m27609m > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = mo10303a.m27603g(i13, i10) ? -16777216 : -1;
                                if (i14 >= m27609m) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= m27606j) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                createBitmap = Bitmap.createBitmap(m27609m, m27606j, Bitmap.Config.ARGB_8888);
            } catch (C6961v unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, m27609m, 0, 0, m27609m, m27606j);
                return createBitmap;
            } catch (C6961v unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11626a.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m36424d(Map<String, String> map) {
        if (C0033a.m107d(C11626a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th2) {
                C0033a.m105b(th2, C11626a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        C9322n.m27780d(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        C9322n.m27780d(MODEL, "MODEL");
        map.put("model", MODEL);
        String jSONObject = new JSONObject(map).toString();
        C9322n.m27780d(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    /* renamed from: e */
    public static final boolean m36425e() {
        if (C0033a.m107d(C11626a.class)) {
            return false;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
            if (m11447f != null) {
                return m11447f.m11389o().contains(EnumC4624i0.Enabled);
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11626a.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m36426f(String str) {
        if (C0033a.m107d(C11626a.class)) {
            return false;
        }
        try {
            if (m36425e()) {
                return f30231a.m36427g(str);
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11626a.class);
            return false;
        }
    }

    /* renamed from: g */
    private final boolean m36427g(String str) {
        String m41045z;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f30233c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            m41045z = C12524p.m41045z(C7799e0.m23829B(), '.', '|', false, 4, null);
            String str2 = "fbsdk_" + C9322n.m27787k("android-", m41045z) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C7799e0.m23860l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            a aVar = new a(str2, str);
            hashMap.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
