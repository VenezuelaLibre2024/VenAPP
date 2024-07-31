package p315qh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import p337rh.C10708a;

/* renamed from: qh.b */
/* loaded from: classes3.dex */
public class C10492b {

    /* renamed from: a */
    private final Context f26069a;

    /* renamed from: b */
    private boolean f26070b = true;

    public C10492b(Context context) {
        this.f26069a = context;
    }

    /* renamed from: m */
    private boolean m31545m(List<String> list) {
        PackageManager packageManager = this.f26069a.getPackageManager();
        boolean z10 = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                C10708a.m32587b(str + " ROOT management app detected!");
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    /* renamed from: o */
    private String[] m31546o() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            C10708a.m32586a(e10);
            return null;
        }
    }

    /* renamed from: p */
    private String[] m31547p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            C10708a.m32586a(e10);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m31548a() {
        return new RootBeerNative().m19538a();
    }

    /* renamed from: b */
    public boolean m31549b(String str) {
        boolean z10 = false;
        for (String str2 : C10491a.m31544a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                C10708a.m32591f(str3 + " binary detected!");
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public boolean m31550c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] m31547p = m31547p();
        if (m31547p == null) {
            return false;
        }
        boolean z10 = false;
        for (String str : m31547p) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        C10708a.m32591f(str2 + " = " + str3 + " detected!");
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: d */
    public boolean m31551d() {
        return m31549b("magisk");
    }

    /* renamed from: e */
    public boolean m31552e() {
        String[] m31546o = m31546o();
        int i10 = 0;
        if (m31546o == null) {
            return false;
        }
        int length = m31546o.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            String str = m31546o[i11];
            String[] split = str.split(" ");
            if (split.length < 6) {
                C10708a.m32587b("Error formatting mount line: " + str);
            } else {
                String str2 = split[2];
                String str3 = split[5];
                String[] strArr = C10491a.f26068e;
                int length2 = strArr.length;
                int i12 = i10;
                while (i12 < length2) {
                    String str4 = strArr[i12];
                    if (str2.equalsIgnoreCase(str4)) {
                        str3 = str3.replace("(", "").replace(")", "");
                        String[] split2 = str3.split(",");
                        int length3 = split2.length;
                        int i13 = i10;
                        while (true) {
                            if (i13 >= length3) {
                                break;
                            }
                            if (split2[i13].equalsIgnoreCase("rw")) {
                                C10708a.m32591f(str4 + " path is mounted with rw permissions! " + str);
                                z10 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    i12++;
                    i10 = 0;
                }
            }
            i11++;
            i10 = 0;
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m31553f() {
        if (!m31548a()) {
            C10708a.m32587b("We could not load the native library to test for root");
            return false;
        }
        String[] m31544a = C10491a.m31544a();
        int length = m31544a.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m31544a[i10] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f26070b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m31554g() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z10 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z10;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* renamed from: h */
    public boolean m31555h() {
        return m31556i(null);
    }

    /* renamed from: i */
    public boolean m31556i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C10491a.f26065b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m31545m(arrayList);
    }

    /* renamed from: j */
    public boolean m31557j() {
        return m31558k(null);
    }

    /* renamed from: k */
    public boolean m31558k(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C10491a.f26064a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m31545m(arrayList);
    }

    /* renamed from: l */
    public boolean m31559l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: n */
    public boolean m31560n() {
        return m31557j() || m31555h() || m31549b("su") || m31550c() || m31552e() || m31559l() || m31554g() || m31553f() || m31551d();
    }
}
