package r4;

import android.text.TextUtils;
import dk.l;
import i4.e0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f24736a = new j();

    private j() {
    }

    public static final File a() {
        if (a5.a.d(j.class)) {
            return null;
        }
        try {
            File file = new File(e0.l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            a5.a.b(th2, j.class);
            return null;
        }
    }

    public static final Map<String, a> c(File file) {
        Map<String, a> map;
        Map<String, a> map2 = null;
        if (a5.a.d(j.class)) {
            return null;
        }
        try {
            n.e(file, "file");
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
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, xk.d.f31393b));
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
                l.n(strArr);
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
                                    a5.a.b(th, j.class);
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
                        a aVar = new a(iArr);
                        wrap2.asFloatBuffer().get(aVar.a(), 0, i18);
                        hashMap.put(str, aVar);
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

    public final String b(String str) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n.e(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = n.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
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
            Object[] array = new xk.f("\\s+").c(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            n.d(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final int[] d(String texts, int i10) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n.e(texts, "texts");
            int[] iArr = new int[i10];
            String b10 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            n.d(forName, "forName(\"UTF-8\")");
            if (b10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b10.getBytes(forName);
            n.d(bytes, "(this as java.lang.String).getBytes(charset)");
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
            a5.a.b(th2, this);
            return null;
        }
    }
}
