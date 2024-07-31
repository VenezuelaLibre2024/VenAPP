package p325r4;

import android.text.TextUtils;
import dk.C7019l;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p450xk.C12512d;
import p450xk.C12514f;

/* renamed from: r4.j */
/* loaded from: classes.dex */
public final class C10622j {

    /* renamed from: a */
    public static final C10622j f26850a = new C10622j();

    private C10622j() {
    }

    /* renamed from: a */
    public static final File m32374a() {
        if (C0033a.m107d(C10622j.class)) {
            return null;
        }
        try {
            File file = new File(C7799e0.m23860l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10622j.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final Map<String, C10613a> m32375c(File file) {
        Map<String, C10613a> map;
        Map<String, C10613a> map2 = null;
        if (C0033a.m107d(C10622j.class)) {
            return null;
        }
        try {
            C9322n.m27781e(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i10 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = wrap.getInt();
                int i12 = i11 + 4;
                if (available < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, C12512d.f33913b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i13 = length - 1;
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        strArr[i14] = names.getString(i14);
                        if (i15 > i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                C7019l.m20446n(strArr);
                HashMap hashMap = new HashMap();
                int i16 = 0;
                while (i16 < length) {
                    String str = strArr[i16];
                    i16++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i17 = length2 - 1;
                        int i18 = 1;
                        if (i17 >= 0) {
                            while (true) {
                                int i19 = i10 + 1;
                                try {
                                    int i20 = jSONArray.getInt(i10);
                                    iArr[i10] = i20;
                                    i18 *= i20;
                                    if (i19 > i17) {
                                        break;
                                    }
                                    i10 = i19;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    map = null;
                                    C0033a.m105b(th, C10622j.class);
                                    return map;
                                }
                            }
                        }
                        int i21 = i18 * 4;
                        int i22 = i12 + i21;
                        if (i22 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i12, i21);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        C10613a c10613a = new C10613a(iArr);
                        wrap2.asFloatBuffer().get(c10613a.m32311a(), 0, i18);
                        hashMap.put(str, c10613a);
                        i12 = i22;
                        i10 = 0;
                        map2 = null;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = map2;
        }
    }

    /* renamed from: b */
    public final String m32376b(String str) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9322n.m27781e(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C9322n.m27782f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new C12514f("\\s+").m40971c(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            C9322n.m27780d(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public final int[] m32377d(String texts, int i10) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9322n.m27781e(texts, "texts");
            int[] iArr = new int[i10];
            String m32376b = m32376b(texts);
            Charset forName = Charset.forName("UTF-8");
            C9322n.m27780d(forName, "forName(\"UTF-8\")");
            if (m32376b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = m32376b.getBytes(forName);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            if (i10 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i11 < bytes.length) {
                        iArr[i11] = bytes[i11] & 255;
                    } else {
                        iArr[i11] = 0;
                    }
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
