package p440xa;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import p081ea.AbstractC7138a;

/* renamed from: xa.b */
/* loaded from: classes2.dex */
public class C12395b extends AbstractC7138a {
    public static final Parcelable.Creator<C12395b> CREATOR = new C12409p();

    /* renamed from: a */
    private String f33272a;

    /* renamed from: b */
    private DataHolder f33273b;

    /* renamed from: c */
    private ParcelFileDescriptor f33274c;

    /* renamed from: d */
    private long f33275d;

    /* renamed from: e */
    private byte[] f33276e;

    /* renamed from: f */
    private byte[] f33277f;

    /* renamed from: r */
    private File f33278r;

    public C12395b() {
        this(null, null, null, 0L, null);
    }

    public C12395b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j10, byte[] bArr) {
        this.f33272a = str;
        this.f33273b = dataHolder;
        this.f33274c = parcelFileDescriptor;
        this.f33275d = j10;
        this.f33276e = bArr;
    }

    /* renamed from: z1 */
    private static final void m40055z1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: u1 */
    public ParcelFileDescriptor m40056u1() {
        return this.f33274c;
    }

    /* renamed from: v1 */
    public long m40057v1() {
        return this.f33275d;
    }

    /* renamed from: w1 */
    public DataHolder m40058w1() {
        return this.f33273b;
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
            android.os.ParcelFileDescriptor r0 = r4.f33274c
            r1 = 0
            if (r0 != 0) goto L60
            byte[] r0 = r4.f33277f
            if (r0 == 0) goto L60
            java.io.File r0 = r4.f33278r
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
            r4.f33274c = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
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
            byte[] r0 = r4.f33277f     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            byte[] r0 = r4.f33277f     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            r2.write(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5d
            m40055z1(r2)
            r6 = r6 | 1
            goto L60
        L58:
            r5 = move-exception
            m40055z1(r2)
            throw r5
        L5d:
            m40055z1(r2)
        L60:
            p440xa.C12409p.m40066a(r4, r5, r6)
            r4.f33274c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p440xa.C12395b.writeToParcel(android.os.Parcel, int):void");
    }

    /* renamed from: x1 */
    public String m40059x1() {
        return this.f33272a;
    }

    /* renamed from: y1 */
    public byte[] m40060y1() {
        return this.f33276e;
    }
}
