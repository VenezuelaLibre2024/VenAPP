package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p094f2.AbstractC7277j;

/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class C1522b {

    /* renamed from: b */
    private static final String f6561b = AbstractC7277j.m21769i("Data");

    /* renamed from: c */
    public static final C1522b f6562c = new a().m8538a();

    /* renamed from: a */
    Map<String, Object> f6563a;

    /* renamed from: androidx.work.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Map<String, Object> f6564a = new HashMap();

        /* renamed from: a */
        public C1522b m8538a() {
            C1522b c1522b = new C1522b((Map<String, ?>) this.f6564a);
            C1522b.m8530o(c1522b);
            return c1522b;
        }

        /* renamed from: b */
        public a m8539b(String str, Object obj) {
            if (obj == null) {
                this.f6564a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f6564a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f6564a.put(str, C1522b.m8523a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f6564a.put(str, C1522b.m8524b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f6564a.put(str, C1522b.m8527e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f6564a.put(str, C1522b.m8528f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f6564a.put(str, C1522b.m8526d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                    }
                    this.f6564a.put(str, C1522b.m8525c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m8540c(C1522b c1522b) {
            m8541d(c1522b.f6563a);
            return this;
        }

        /* renamed from: d */
        public a m8541d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m8539b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m8542e(String str, boolean z10) {
            this.f6564a.put(str, Boolean.valueOf(z10));
            return this;
        }

        /* renamed from: f */
        public a m8543f(String str, int i10) {
            this.f6564a.put(str, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public a m8544g(String str, long j10) {
            this.f6564a.put(str, Long.valueOf(j10));
            return this;
        }

        /* renamed from: h */
        public a m8545h(String str, String str2) {
            this.f6564a.put(str, str2);
            return this;
        }

        /* renamed from: i */
        public a m8546i(String str, String[] strArr) {
            this.f6564a.put(str, strArr);
            return this;
        }
    }

    C1522b() {
    }

    public C1522b(C1522b c1522b) {
        this.f6563a = new HashMap(c1522b.f6563a);
    }

    public C1522b(Map<String, ?> map) {
        this.f6563a = new HashMap(map);
    }

    /* renamed from: a */
    public static Boolean[] m8523a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m8524b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m8525c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m8526d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m8527e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m8528f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x005d -> B:16:0x0062). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C1522b m8529g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C1522b.f6561b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.C1522b.f6561b     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C1522b.f6561b
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.C1522b.f6561b
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.C1522b.f6561b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.C1522b.f6561b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1522b.m8529g(byte[]):androidx.work.b");
    }

    /* renamed from: o */
    public static byte[] m8530o(C1522b c1522b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c1522b.m8537n());
                    for (Map.Entry<String, Object> entry : c1522b.f6563a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f6561b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f6561b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f6561b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f6561b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f6561b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f6561b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f6561b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1522b.class != obj.getClass()) {
            return false;
        }
        C1522b c1522b = (C1522b) obj;
        Set<String> keySet = this.f6563a.keySet();
        if (!keySet.equals(c1522b.f6563a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f6563a.get(str);
            Object obj3 = c1522b.f6563a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m8531h(String str, boolean z10) {
        Object obj = this.f6563a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public int hashCode() {
        return this.f6563a.hashCode() * 31;
    }

    /* renamed from: i */
    public int m8532i(String str, int i10) {
        Object obj = this.f6563a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    /* renamed from: j */
    public Map<String, Object> m8533j() {
        return Collections.unmodifiableMap(this.f6563a);
    }

    /* renamed from: k */
    public long m8534k(String str, long j10) {
        Object obj = this.f6563a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    /* renamed from: l */
    public String m8535l(String str) {
        Object obj = this.f6563a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: m */
    public String[] m8536m(String str) {
        Object obj = this.f6563a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    /* renamed from: n */
    public int m8537n() {
        return this.f6563a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f6563a.isEmpty()) {
            for (String str : this.f6563a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f6563a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
