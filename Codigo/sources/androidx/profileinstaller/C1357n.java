package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.C0743d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: androidx.profileinstaller.n */
/* loaded from: classes.dex */
public final class C1357n {

    /* renamed from: a */
    private static final C0743d<c> f5824a = C0743d.m3762A();

    /* renamed from: b */
    private static final Object f5825b = new Object();

    /* renamed from: c */
    private static c f5826c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.n$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static PackageInfo m7574a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.n$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a */
        final int f5827a;

        /* renamed from: b */
        final int f5828b;

        /* renamed from: c */
        final long f5829c;

        /* renamed from: d */
        final long f5830d;

        b(int i10, int i11, long j10, long j11) {
            this.f5827a = i10;
            this.f5828b = i11;
            this.f5829c = j10;
            this.f5830d = j11;
        }

        /* renamed from: a */
        static b m7575a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        /* renamed from: b */
        void m7576b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f5827a);
                dataOutputStream.writeInt(this.f5828b);
                dataOutputStream.writeLong(this.f5829c);
                dataOutputStream.writeLong(this.f5830d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5828b == bVar.f5828b && this.f5829c == bVar.f5829c && this.f5827a == bVar.f5827a && this.f5830d == bVar.f5830d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f5828b), Long.valueOf(this.f5829c), Integer.valueOf(this.f5827a), Long.valueOf(this.f5830d));
        }
    }

    /* renamed from: androidx.profileinstaller.n$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final int f5831a;

        /* renamed from: b */
        private final boolean f5832b;

        /* renamed from: c */
        private final boolean f5833c;

        c(int i10, boolean z10, boolean z11) {
            this.f5831a = i10;
            this.f5833c = z11;
            this.f5832b = z10;
        }
    }

    /* renamed from: a */
    private static long m7571a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.m7574a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    /* renamed from: b */
    private static c m7572b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f5826c = cVar;
        f5824a.mo3741w(cVar);
        return f5826c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        r3 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.C1357n.c m7573c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C1357n.m7573c(android.content.Context, boolean):androidx.profileinstaller.n$c");
    }
}
