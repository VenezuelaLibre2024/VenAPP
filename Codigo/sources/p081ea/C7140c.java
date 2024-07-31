package p081ea;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: ea.c */
/* loaded from: classes.dex */
public class C7140c {
    /* renamed from: A */
    public static void m21194A(Parcel parcel, int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeLongArray(jArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: B */
    public static void m21195B(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            m21207N(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            m21207N(parcel, i10, 0);
        }
    }

    /* renamed from: C */
    public static void m21196C(Parcel parcel, int i10, Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: D */
    public static void m21197D(Parcel parcel, int i10, List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcel parcel2 = list.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: E */
    public static void m21198E(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: F */
    public static void m21199F(Parcel parcel, int i10, short s10) {
        m21207N(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    /* renamed from: G */
    public static void m21200G(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeString(str);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: H */
    public static void m21201H(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeStringArray(strArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: I */
    public static void m21202I(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeStringList(list);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: J */
    public static <T extends Parcelable> void m21203J(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m21208O(parcel, t10, i11);
            }
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: K */
    public static <T extends Parcelable> void m21204K(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m21208O(parcel, t10, 0);
            }
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: L */
    private static int m21205L(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: M */
    private static void m21206M(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: N */
    private static void m21207N(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    /* renamed from: O */
    private static void m21208O(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m21209a(Parcel parcel) {
        return m21205L(parcel, 20293);
    }

    /* renamed from: b */
    public static void m21210b(Parcel parcel, int i10) {
        m21206M(parcel, i10);
    }

    /* renamed from: c */
    public static void m21211c(Parcel parcel, int i10, BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: d */
    public static void m21212d(Parcel parcel, int i10, BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: e */
    public static void m21213e(Parcel parcel, int i10, BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: f */
    public static void m21214f(Parcel parcel, int i10, BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: g */
    public static void m21215g(Parcel parcel, int i10, boolean z10) {
        m21207N(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: h */
    public static void m21216h(Parcel parcel, int i10, boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeBooleanArray(zArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: i */
    public static void m21217i(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            m21207N(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            m21207N(parcel, i10, 0);
        }
    }

    /* renamed from: j */
    public static void m21218j(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeBundle(bundle);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: k */
    public static void m21219k(Parcel parcel, int i10, byte b10) {
        m21207N(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    /* renamed from: l */
    public static void m21220l(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeByteArray(bArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: m */
    public static void m21221m(Parcel parcel, int i10, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: n */
    public static void m21222n(Parcel parcel, int i10, double d10) {
        m21207N(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    /* renamed from: o */
    public static void m21223o(Parcel parcel, int i10, double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeDoubleArray(dArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: p */
    public static void m21224p(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            m21207N(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            m21207N(parcel, i10, 0);
        }
    }

    /* renamed from: q */
    public static void m21225q(Parcel parcel, int i10, float f10) {
        m21207N(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    /* renamed from: r */
    public static void m21226r(Parcel parcel, int i10, float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeFloatArray(fArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: s */
    public static void m21227s(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            m21207N(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            m21207N(parcel, i10, 0);
        }
    }

    /* renamed from: t */
    public static void m21228t(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: u */
    public static void m21229u(Parcel parcel, int i10, int i11) {
        m21207N(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* renamed from: v */
    public static void m21230v(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeIntArray(iArr);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: w */
    public static void m21231w(Parcel parcel, int i10, List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
                return;
            }
            return;
        }
        int m21205L = m21205L(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        m21206M(parcel, m21205L);
    }

    /* renamed from: x */
    public static void m21232x(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            m21207N(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            m21207N(parcel, i10, 0);
        }
    }

    /* renamed from: y */
    public static void m21233y(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                m21207N(parcel, i10, 0);
            }
        } else {
            int m21205L = m21205L(parcel, i10);
            parcel.writeList(list);
            m21206M(parcel, m21205L);
        }
    }

    /* renamed from: z */
    public static void m21234z(Parcel parcel, int i10, long j10) {
        m21207N(parcel, i10, 8);
        parcel.writeLong(j10);
    }
}
