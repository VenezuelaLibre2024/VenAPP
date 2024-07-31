package p411w3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: w3.d */
/* loaded from: classes.dex */
public final class C12067d {

    /* renamed from: a */
    private final Context f32084a;

    public C12067d(Context context) {
        this.f32084a = context;
    }

    /* renamed from: a */
    private ApplicationInfo m38741a() {
        return this.f32084a.getPackageManager().getApplicationInfo(this.f32084a.getPackageName(), RecognitionOptions.ITF);
    }

    /* renamed from: c */
    private static InterfaceC12065b m38742c(String str) {
        Object obj;
        try {
            Class<?> cls = Class.forName(str);
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                m38743d(cls, e10);
                obj = null;
            }
            if (obj instanceof InterfaceC12065b) {
                return (InterfaceC12065b) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    /* renamed from: d */
    private static void m38743d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: b */
    public List<InterfaceC12065b> m38744b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo m38741a = m38741a();
            if (m38741a != null && m38741a.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + m38741a.metaData);
                }
                for (String str : m38741a.metaData.keySet()) {
                    if ("GlideModule".equals(m38741a.metaData.get(str))) {
                        arrayList.add(m38742c(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }
}
