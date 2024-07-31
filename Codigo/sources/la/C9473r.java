package la;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C5276s;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: la.r */
/* loaded from: classes.dex */
public class C9473r {

    /* renamed from: a */
    private static String f23012a;

    /* renamed from: b */
    private static int f23013b;

    /* renamed from: a */
    public static String m28177a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f23012a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f23012a = processName;
            } else {
                int i10 = f23013b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f23013b = i10;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        str = "/proc/" + i10 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            C5276s.m13324j(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            C9467l.m28157a(bufferedReader2);
                            throw th;
                        }
                        C9467l.m28157a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f23012a = str2;
            }
        }
        return f23012a;
    }
}
