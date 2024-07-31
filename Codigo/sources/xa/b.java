package xa;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new p();

    /* renamed from: a */
    private String f30752a;

    /* renamed from: b */
    private DataHolder f30753b;

    /* renamed from: c */
    private ParcelFileDescriptor f30754c;

    /* renamed from: d */
    private long f30755d;

    /* renamed from: e */
    private byte[] f30756e;

    /* renamed from: f */
    private byte[] f30757f;

    /* renamed from: r */
    private File f30758r;

    public b() {
        this(null, null, null, 0L, null);
    }

    public b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j10, byte[] bArr) {
        this.f30752a = str;
        this.f30753b = dataHolder;
        this.f30754c = parcelFileDescriptor;
        this.f30755d = j10;
        this.f30756e = bArr;
    }

    private static final void z1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public ParcelFileDescriptor u1() {
        return this.f30754c;
    }

    public long v1() {
        return this.f30755d;
    }

    public DataHolder w1() {
        return this.f30753b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.f30754c
            r1 = 0
            if (r0 != 0) goto L60
            byte[] r0 = r4.f30757f
            if (r0 == 0) goto L60
            java.io.File r0 = r4.f30758r
            if (r0 != 0) goto Lf
        Ld:
            r2 = r1
            goto L3b
        Lf:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r3 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r4.f30754c = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            if (r0 == 0) goto L3b
            r0.delete()
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
            goto L2e
        L2d:
            r5 = move-exception
        L2e:
            if (r1 == 0) goto L33
            r1.delete()
        L33:
            throw r5
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto Ld
            r0.delete()
            goto Ld
        L3b:
            if (r2 == 0) goto L60
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.f30757f     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            byte[] r0 = r4.f30757f     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            r2.write(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            z1(r2)
            r6 = r6 | 1
            goto L60
        L58:
            r5 = move-exception
            z1(r2)
            throw r5
        L5d:
            z1(r2)
        L60:
            xa.p.a(r4, r5, r6)
            r4.f30754c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b.writeToParcel(android.os.Parcel, int):void");
    }

    public String x1() {
        return this.f30752a;
    }

    public byte[] y1() {
        return this.f30756e;
    }
}
