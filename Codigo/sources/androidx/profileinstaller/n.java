package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f5070a = androidx.concurrent.futures.d.A();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5071b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f5072c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f5073a;

        /* renamed from: b, reason: collision with root package name */
        final int f5074b;

        /* renamed from: c, reason: collision with root package name */
        final long f5075c;

        /* renamed from: d, reason: collision with root package name */
        final long f5076d;

        b(int i10, int i11, long j10, long j11) {
            this.f5073a = i10;
            this.f5074b = i11;
            this.f5075c = j10;
            this.f5076d = j11;
        }

        static b a(File file) {
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

        void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f5073a);
                dataOutputStream.writeInt(this.f5074b);
                dataOutputStream.writeLong(this.f5075c);
                dataOutputStream.writeLong(this.f5076d);
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
            return this.f5074b == bVar.f5074b && this.f5075c == bVar.f5075c && this.f5073a == bVar.f5073a && this.f5076d == bVar.f5076d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f5074b), Long.valueOf(this.f5075c), Integer.valueOf(this.f5073a), Long.valueOf(this.f5076d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f5077a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5078b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5079c;

        c(int i10, boolean z10, boolean z11) {
            this.f5077a = i10;
            this.f5079c = z11;
            this.f5078b = z10;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f5072c = cVar;
        f5070a.w(cVar);
        return f5072c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.n.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.n.c(android.content.Context, boolean):androidx.profileinstaller.n$c");
    }
}
