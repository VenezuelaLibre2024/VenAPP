package p154i6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i6.k */
/* loaded from: classes.dex */
class C7859k implements InterfaceC7853e {

    /* renamed from: a */
    private final a f18836a;

    /* renamed from: b */
    private final C7857i f18837b;

    /* renamed from: c */
    private final Map<String, InterfaceC7861m> f18838c;

    /* renamed from: i6.k$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Context f18839a;

        /* renamed from: b */
        private Map<String, String> f18840b = null;

        a(Context context) {
            this.f18839a = context;
        }

        /* renamed from: a */
        private Map<String, String> m24165a(Context context) {
            Bundle m24167d = m24167d(context);
            if (m24167d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m24167d.keySet()) {
                Object obj = m24167d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m24166c() {
            if (this.f18840b == null) {
                this.f18840b = m24165a(this.f18839a);
            }
            return this.f18840b;
        }

        /* renamed from: d */
        private static Bundle m24167d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), RecognitionOptions.ITF);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC7852d m24168b(String str) {
            String format;
            String format2;
            String str2 = m24166c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC7852d) Class.forName(str2).asSubclass(InterfaceC7852d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                e = e10;
                format2 = String.format("Class %s is not found.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7859k(Context context, C7857i c7857i) {
        this(new a(context), c7857i);
    }

    C7859k(a aVar, C7857i c7857i) {
        this.f18838c = new HashMap();
        this.f18836a = aVar;
        this.f18837b = c7857i;
    }

    @Override // p154i6.InterfaceC7853e
    public synchronized InterfaceC7861m get(String str) {
        if (this.f18838c.containsKey(str)) {
            return this.f18838c.get(str);
        }
        InterfaceC7852d m24168b = this.f18836a.m24168b(str);
        if (m24168b == null) {
            return null;
        }
        InterfaceC7861m create = m24168b.create(this.f18837b.m24161a(str));
        this.f18838c.put(str, create);
        return create;
    }
}
