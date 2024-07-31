package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.profileinstaller.m */
/* loaded from: classes.dex */
public class C1356m {

    /* renamed from: a */
    static final byte[] f5822a = {112, 114, 111, 0};

    /* renamed from: b */
    static final byte[] f5823b = {112, 114, 109, 0};

    /* renamed from: A */
    private static void m7530A(InputStream inputStream) {
        C1348e.m7505h(inputStream);
        int m7507j = C1348e.m7507j(inputStream);
        if (m7507j == 6 || m7507j == 7) {
            return;
        }
        while (m7507j > 0) {
            C1348e.m7507j(inputStream);
            for (int m7507j2 = C1348e.m7507j(inputStream); m7507j2 > 0; m7507j2--) {
                C1348e.m7505h(inputStream);
            }
            m7507j--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m7531B(OutputStream outputStream, byte[] bArr, C1347d[] c1347dArr) {
        if (Arrays.equals(bArr, C1358o.f5834a)) {
            m7543N(outputStream, c1347dArr);
            return true;
        }
        if (Arrays.equals(bArr, C1358o.f5835b)) {
            m7542M(outputStream, c1347dArr);
            return true;
        }
        if (Arrays.equals(bArr, C1358o.f5837d)) {
            m7540K(outputStream, c1347dArr);
            return true;
        }
        if (Arrays.equals(bArr, C1358o.f5836c)) {
            m7541L(outputStream, c1347dArr);
            return true;
        }
        if (!Arrays.equals(bArr, C1358o.f5838e)) {
            return false;
        }
        m7539J(outputStream, c1347dArr);
        return true;
    }

    /* renamed from: C */
    private static void m7532C(OutputStream outputStream, C1347d c1347d) {
        int i10 = 0;
        for (int i11 : c1347d.f5810h) {
            Integer valueOf = Integer.valueOf(i11);
            C1348e.m7513p(outputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    /* renamed from: D */
    private static C1359p m7533D(C1347d[] c1347dArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1348e.m7513p(byteArrayOutputStream, c1347dArr.length);
            int i10 = 2;
            for (C1347d c1347d : c1347dArr) {
                C1348e.m7514q(byteArrayOutputStream, c1347d.f5805c);
                C1348e.m7514q(byteArrayOutputStream, c1347d.f5806d);
                C1348e.m7514q(byteArrayOutputStream, c1347d.f5809g);
                String m7554j = m7554j(c1347d.f5803a, c1347d.f5804b, C1358o.f5834a);
                int m7508k = C1348e.m7508k(m7554j);
                C1348e.m7513p(byteArrayOutputStream, m7508k);
                i10 = i10 + 4 + 4 + 4 + 2 + (m7508k * 1);
                C1348e.m7511n(byteArrayOutputStream, m7554j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                C1359p c1359p = new C1359p(EnumC1349f.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return c1359p;
            }
            throw C1348e.m7500c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static void m7534E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f5822a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    private static void m7535F(OutputStream outputStream, C1347d c1347d) {
        m7538I(outputStream, c1347d);
        m7532C(outputStream, c1347d);
        m7537H(outputStream, c1347d);
    }

    /* renamed from: G */
    private static void m7536G(OutputStream outputStream, C1347d c1347d, String str) {
        C1348e.m7513p(outputStream, C1348e.m7508k(str));
        C1348e.m7513p(outputStream, c1347d.f5807e);
        C1348e.m7514q(outputStream, c1347d.f5808f);
        C1348e.m7514q(outputStream, c1347d.f5805c);
        C1348e.m7514q(outputStream, c1347d.f5809g);
        C1348e.m7511n(outputStream, str);
    }

    /* renamed from: H */
    private static void m7537H(OutputStream outputStream, C1347d c1347d) {
        byte[] bArr = new byte[m7555k(c1347d.f5809g)];
        for (Map.Entry<Integer, Integer> entry : c1347d.f5811i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                m7570z(bArr, 2, intValue, c1347d);
            }
            if ((intValue2 & 4) != 0) {
                m7570z(bArr, 4, intValue, c1347d);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    private static void m7538I(OutputStream outputStream, C1347d c1347d) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : c1347d.f5811i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C1348e.m7513p(outputStream, intValue - i10);
                C1348e.m7513p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* renamed from: J */
    private static void m7539J(OutputStream outputStream, C1347d[] c1347dArr) {
        C1348e.m7513p(outputStream, c1347dArr.length);
        for (C1347d c1347d : c1347dArr) {
            String m7554j = m7554j(c1347d.f5803a, c1347d.f5804b, C1358o.f5838e);
            C1348e.m7513p(outputStream, C1348e.m7508k(m7554j));
            C1348e.m7513p(outputStream, c1347d.f5811i.size());
            C1348e.m7513p(outputStream, c1347d.f5810h.length);
            C1348e.m7514q(outputStream, c1347d.f5805c);
            C1348e.m7511n(outputStream, m7554j);
            Iterator<Integer> it = c1347d.f5811i.keySet().iterator();
            while (it.hasNext()) {
                C1348e.m7513p(outputStream, it.next().intValue());
            }
            for (int i10 : c1347d.f5810h) {
                C1348e.m7513p(outputStream, i10);
            }
        }
    }

    /* renamed from: K */
    private static void m7540K(OutputStream outputStream, C1347d[] c1347dArr) {
        C1348e.m7515r(outputStream, c1347dArr.length);
        for (C1347d c1347d : c1347dArr) {
            int size = c1347d.f5811i.size() * 4;
            String m7554j = m7554j(c1347d.f5803a, c1347d.f5804b, C1358o.f5837d);
            C1348e.m7513p(outputStream, C1348e.m7508k(m7554j));
            C1348e.m7513p(outputStream, c1347d.f5810h.length);
            C1348e.m7514q(outputStream, size);
            C1348e.m7514q(outputStream, c1347d.f5805c);
            C1348e.m7511n(outputStream, m7554j);
            Iterator<Integer> it = c1347d.f5811i.keySet().iterator();
            while (it.hasNext()) {
                C1348e.m7513p(outputStream, it.next().intValue());
                C1348e.m7513p(outputStream, 0);
            }
            for (int i10 : c1347d.f5810h) {
                C1348e.m7513p(outputStream, i10);
            }
        }
    }

    /* renamed from: L */
    private static void m7541L(OutputStream outputStream, C1347d[] c1347dArr) {
        byte[] m7546b = m7546b(c1347dArr, C1358o.f5836c);
        C1348e.m7515r(outputStream, c1347dArr.length);
        C1348e.m7510m(outputStream, m7546b);
    }

    /* renamed from: M */
    private static void m7542M(OutputStream outputStream, C1347d[] c1347dArr) {
        byte[] m7546b = m7546b(c1347dArr, C1358o.f5835b);
        C1348e.m7515r(outputStream, c1347dArr.length);
        C1348e.m7510m(outputStream, m7546b);
    }

    /* renamed from: N */
    private static void m7543N(OutputStream outputStream, C1347d[] c1347dArr) {
        m7544O(outputStream, c1347dArr);
    }

    /* renamed from: O */
    private static void m7544O(OutputStream outputStream, C1347d[] c1347dArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m7533D(c1347dArr));
        arrayList.add(m7547c(c1347dArr));
        arrayList.add(m7548d(c1347dArr));
        long length2 = C1358o.f5834a.length + f5822a.length + 4 + (arrayList.size() * 16);
        C1348e.m7514q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1359p c1359p = (C1359p) arrayList.get(i10);
            C1348e.m7514q(outputStream, c1359p.f5841a.m7517h());
            C1348e.m7514q(outputStream, length2);
            if (c1359p.f5844d) {
                byte[] bArr = c1359p.f5843c;
                long length3 = bArr.length;
                byte[] m7499b = C1348e.m7499b(bArr);
                arrayList2.add(m7499b);
                C1348e.m7514q(outputStream, m7499b.length);
                C1348e.m7514q(outputStream, length3);
                length = m7499b.length;
            } else {
                arrayList2.add(c1359p.f5843c);
                C1348e.m7514q(outputStream, c1359p.f5843c.length);
                C1348e.m7514q(outputStream, 0L);
                length = c1359p.f5843c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    /* renamed from: a */
    private static int m7545a(C1347d c1347d) {
        Iterator<Map.Entry<Integer, Integer>> it = c1347d.f5811i.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().getValue().intValue();
        }
        return i10;
    }

    /* renamed from: b */
    private static byte[] m7546b(C1347d[] c1347dArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (C1347d c1347d : c1347dArr) {
            i11 += C1348e.m7508k(m7554j(c1347d.f5803a, c1347d.f5804b, bArr)) + 16 + (c1347d.f5807e * 2) + c1347d.f5808f + m7555k(c1347d.f5809g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, C1358o.f5836c)) {
            int length = c1347dArr.length;
            while (i10 < length) {
                C1347d c1347d2 = c1347dArr[i10];
                m7536G(byteArrayOutputStream, c1347d2, m7554j(c1347d2.f5803a, c1347d2.f5804b, bArr));
                m7535F(byteArrayOutputStream, c1347d2);
                i10++;
            }
        } else {
            for (C1347d c1347d3 : c1347dArr) {
                m7536G(byteArrayOutputStream, c1347d3, m7554j(c1347d3.f5803a, c1347d3.f5804b, bArr));
            }
            int length2 = c1347dArr.length;
            while (i10 < length2) {
                m7535F(byteArrayOutputStream, c1347dArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C1348e.m7500c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    /* renamed from: c */
    private static C1359p m7547c(C1347d[] c1347dArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c1347dArr.length; i11++) {
            try {
                C1347d c1347d = c1347dArr[i11];
                C1348e.m7513p(byteArrayOutputStream, i11);
                C1348e.m7513p(byteArrayOutputStream, c1347d.f5807e);
                i10 = i10 + 2 + 2 + (c1347d.f5807e * 2);
                m7532C(byteArrayOutputStream, c1347d);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            C1359p c1359p = new C1359p(EnumC1349f.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c1359p;
        }
        throw C1348e.m7500c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    private static C1359p m7548d(C1347d[] c1347dArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c1347dArr.length; i11++) {
            try {
                C1347d c1347d = c1347dArr[i11];
                int m7545a = m7545a(c1347d);
                byte[] m7549e = m7549e(c1347d);
                byte[] m7550f = m7550f(c1347d);
                C1348e.m7513p(byteArrayOutputStream, i11);
                int length = m7549e.length + 2 + m7550f.length;
                C1348e.m7514q(byteArrayOutputStream, length);
                C1348e.m7513p(byteArrayOutputStream, m7545a);
                byteArrayOutputStream.write(m7549e);
                byteArrayOutputStream.write(m7550f);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            C1359p c1359p = new C1359p(EnumC1349f.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c1359p;
        }
        throw C1348e.m7500c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    private static byte[] m7549e(C1347d c1347d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m7537H(byteArrayOutputStream, c1347d);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: f */
    private static byte[] m7550f(C1347d c1347d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m7538I(byteArrayOutputStream, c1347d);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: g */
    private static String m7551g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* renamed from: h */
    private static String m7552h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: i */
    private static C1347d m7553i(C1347d[] c1347dArr, String str) {
        if (c1347dArr.length <= 0) {
            return null;
        }
        String m7552h = m7552h(str);
        for (int i10 = 0; i10 < c1347dArr.length; i10++) {
            if (c1347dArr[i10].f5804b.equals(m7552h)) {
                return c1347dArr[i10];
            }
        }
        return null;
    }

    /* renamed from: j */
    private static String m7554j(String str, String str2, byte[] bArr) {
        String m7577a = C1358o.m7577a(bArr);
        if (str.length() <= 0) {
            return m7551g(str2, m7577a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m7551g(str2, m7577a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C1358o.m7577a(bArr) + str2;
    }

    /* renamed from: k */
    private static int m7555k(int i10) {
        return m7569y(i10 * 2) / 8;
    }

    /* renamed from: l */
    private static int m7556l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw C1348e.m7500c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw C1348e.m7500c("Unexpected flag: " + i10);
    }

    /* renamed from: m */
    private static int[] m7557m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += C1348e.m7505h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* renamed from: n */
    private static int m7558n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m7556l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m7556l(4, i10, i11)) ? i12 | 4 : i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static byte[] m7559o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, C1348e.m7501d(inputStream, bArr.length))) {
            return C1348e.m7501d(inputStream, C1358o.f5835b.length);
        }
        throw C1348e.m7500c("Invalid magic");
    }

    /* renamed from: p */
    private static void m7560p(InputStream inputStream, C1347d c1347d) {
        int available = inputStream.available() - c1347d.f5808f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += C1348e.m7505h(inputStream);
            c1347d.f5811i.put(Integer.valueOf(i10), 1);
            for (int m7505h = C1348e.m7505h(inputStream); m7505h > 0; m7505h--) {
                m7530A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C1348e.m7500c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static C1347d[] m7561q(InputStream inputStream, byte[] bArr, byte[] bArr2, C1347d[] c1347dArr) {
        if (Arrays.equals(bArr, C1358o.f5839f)) {
            if (Arrays.equals(C1358o.f5834a, bArr2)) {
                throw C1348e.m7500c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m7562r(inputStream, bArr, c1347dArr);
        }
        if (Arrays.equals(bArr, C1358o.f5840g)) {
            return m7564t(inputStream, bArr2, c1347dArr);
        }
        throw C1348e.m7500c("Unsupported meta version");
    }

    /* renamed from: r */
    static C1347d[] m7562r(InputStream inputStream, byte[] bArr, C1347d[] c1347dArr) {
        if (!Arrays.equals(bArr, C1358o.f5839f)) {
            throw C1348e.m7500c("Unsupported meta version");
        }
        int m7507j = C1348e.m7507j(inputStream);
        byte[] m7502e = C1348e.m7502e(inputStream, (int) C1348e.m7506i(inputStream), (int) C1348e.m7506i(inputStream));
        if (inputStream.read() > 0) {
            throw C1348e.m7500c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m7502e);
        try {
            C1347d[] m7563s = m7563s(byteArrayInputStream, m7507j, c1347dArr);
            byteArrayInputStream.close();
            return m7563s;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: s */
    private static C1347d[] m7563s(InputStream inputStream, int i10, C1347d[] c1347dArr) {
        if (inputStream.available() == 0) {
            return new C1347d[0];
        }
        if (i10 != c1347dArr.length) {
            throw C1348e.m7500c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m7505h = C1348e.m7505h(inputStream);
            iArr[i11] = C1348e.m7505h(inputStream);
            strArr[i11] = C1348e.m7503f(inputStream, m7505h);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C1347d c1347d = c1347dArr[i12];
            if (!c1347d.f5804b.equals(strArr[i12])) {
                throw C1348e.m7500c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c1347d.f5807e = i13;
            c1347d.f5810h = m7557m(inputStream, i13);
        }
        return c1347dArr;
    }

    /* renamed from: t */
    static C1347d[] m7564t(InputStream inputStream, byte[] bArr, C1347d[] c1347dArr) {
        int m7505h = C1348e.m7505h(inputStream);
        byte[] m7502e = C1348e.m7502e(inputStream, (int) C1348e.m7506i(inputStream), (int) C1348e.m7506i(inputStream));
        if (inputStream.read() > 0) {
            throw C1348e.m7500c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m7502e);
        try {
            C1347d[] m7565u = m7565u(byteArrayInputStream, bArr, m7505h, c1347dArr);
            byteArrayInputStream.close();
            return m7565u;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: u */
    private static C1347d[] m7565u(InputStream inputStream, byte[] bArr, int i10, C1347d[] c1347dArr) {
        if (inputStream.available() == 0) {
            return new C1347d[0];
        }
        if (i10 != c1347dArr.length) {
            throw C1348e.m7500c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C1348e.m7505h(inputStream);
            String m7503f = C1348e.m7503f(inputStream, C1348e.m7505h(inputStream));
            long m7506i = C1348e.m7506i(inputStream);
            int m7505h = C1348e.m7505h(inputStream);
            C1347d m7553i = m7553i(c1347dArr, m7503f);
            if (m7553i == null) {
                throw C1348e.m7500c("Missing profile key: " + m7503f);
            }
            m7553i.f5806d = m7506i;
            int[] m7557m = m7557m(inputStream, m7505h);
            if (Arrays.equals(bArr, C1358o.f5838e)) {
                m7553i.f5807e = m7505h;
                m7553i.f5810h = m7557m;
            }
        }
        return c1347dArr;
    }

    /* renamed from: v */
    private static void m7566v(InputStream inputStream, C1347d c1347d) {
        BitSet valueOf = BitSet.valueOf(C1348e.m7501d(inputStream, C1348e.m7498a(c1347d.f5809g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = c1347d.f5809g;
            if (i10 >= i11) {
                return;
            }
            int m7558n = m7558n(valueOf, i10, i11);
            if (m7558n != 0) {
                Integer num = c1347d.f5811i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                c1347d.f5811i.put(Integer.valueOf(i10), Integer.valueOf(m7558n | num.intValue()));
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static C1347d[] m7567w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, C1358o.f5835b)) {
            throw C1348e.m7500c("Unsupported version");
        }
        int m7507j = C1348e.m7507j(inputStream);
        byte[] m7502e = C1348e.m7502e(inputStream, (int) C1348e.m7506i(inputStream), (int) C1348e.m7506i(inputStream));
        if (inputStream.read() > 0) {
            throw C1348e.m7500c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m7502e);
        try {
            C1347d[] m7568x = m7568x(byteArrayInputStream, str, m7507j);
            byteArrayInputStream.close();
            return m7568x;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: x */
    private static C1347d[] m7568x(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new C1347d[0];
        }
        C1347d[] c1347dArr = new C1347d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m7505h = C1348e.m7505h(inputStream);
            int m7505h2 = C1348e.m7505h(inputStream);
            c1347dArr[i11] = new C1347d(str, C1348e.m7503f(inputStream, m7505h), C1348e.m7506i(inputStream), 0L, m7505h2, (int) C1348e.m7506i(inputStream), (int) C1348e.m7506i(inputStream), new int[m7505h2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C1347d c1347d = c1347dArr[i12];
            m7560p(inputStream, c1347d);
            c1347d.f5810h = m7557m(inputStream, c1347d.f5807e);
            m7566v(inputStream, c1347d);
        }
        return c1347dArr;
    }

    /* renamed from: y */
    private static int m7569y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    /* renamed from: z */
    private static void m7570z(byte[] bArr, int i10, int i11, C1347d c1347d) {
        int m7556l = m7556l(i10, i11, c1347d.f5809g);
        int i12 = m7556l / 8;
        bArr[i12] = (byte) ((1 << (m7556l % 8)) | bArr[i12]);
    }
}
