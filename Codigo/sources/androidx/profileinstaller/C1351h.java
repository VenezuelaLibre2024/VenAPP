package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.C1351h;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p284p1.ExecutorC10035b;

/* renamed from: androidx.profileinstaller.h */
/* loaded from: classes.dex */
public class C1351h {

    /* renamed from: a */
    private static final c f5815a = new a();

    /* renamed from: b */
    static final c f5816b = new b();

    /* renamed from: androidx.profileinstaller.h$a */
    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.C1351h.c
        /* renamed from: a */
        public void mo7465a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.C1351h.c
        /* renamed from: b */
        public void mo7466b(int i10, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.h$b */
    /* loaded from: classes.dex */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.C1351h.c
        /* renamed from: a */
        public void mo7465a(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.C1351h.c
        /* renamed from: b */
        public void mo7466b(int i10, Object obj) {
            Log.d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }
    }

    /* renamed from: androidx.profileinstaller.h$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo7465a(int i10, Object obj);

        /* renamed from: b */
        void mo7466b(int i10, Object obj);
    }

    /* renamed from: b */
    static boolean m7519b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m7520c(Context context, Executor executor, c cVar) {
        m7519b(context.getFilesDir());
        m7524g(executor, cVar, 11, null);
    }

    /* renamed from: d */
    static boolean m7521d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = readLong == packageInfo.lastUpdateTime;
                if (z10) {
                    cVar.mo7465a(2, null);
                }
                return z10;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    static void m7523f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    static void m7524g(Executor executor, final c cVar, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.g
            @Override // java.lang.Runnable
            public final void run() {
                C1351h.c.this.mo7465a(i10, obj);
            }
        });
    }

    /* renamed from: h */
    private static boolean m7525h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C1346c c1346c = new C1346c(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c1346c.m7494e()) {
            return false;
        }
        boolean m7497n = c1346c.m7495i().m7496m().m7497n();
        if (m7497n) {
            m7523f(packageInfo, file);
        }
        return m7497n;
    }

    /* renamed from: i */
    public static void m7526i(Context context) {
        m7527j(context, new ExecutorC10035b(), f5815a);
    }

    /* renamed from: j */
    public static void m7527j(Context context, Executor executor, c cVar) {
        m7528k(context, executor, cVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m7528k(Context context, Executor executor, c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z10 || !m7521d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (m7525h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                    z11 = true;
                }
            } else {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            }
            C1357n.m7573c(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.mo7465a(7, e10);
            C1357n.m7573c(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static void m7529l(Context context, Executor executor, c cVar) {
        try {
            m7523f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m7524g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            m7524g(executor, cVar, 7, e10);
        }
    }
}
