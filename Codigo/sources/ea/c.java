package ea;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public static void A(Parcel parcel, int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeLongArray(jArr);
            M(parcel, L);
        }
    }

    public static void B(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            N(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            N(parcel, i10, 0);
        }
    }

    public static void C(Parcel parcel, int i10, Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            M(parcel, L);
        }
    }

    public static void D(Parcel parcel, int i10, List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
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
        M(parcel, L);
    }

    public static void E(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            M(parcel, L);
        }
    }

    public static void F(Parcel parcel, int i10, short s10) {
        N(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    public static void G(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeString(str);
            M(parcel, L);
        }
    }

    public static void H(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeStringArray(strArr);
            M(parcel, L);
        }
    }

    public static void I(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeStringList(list);
            M(parcel, L);
        }
    }

    public static <T extends Parcelable> void J(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                O(parcel, t10, i11);
            }
        }
        M(parcel, L);
    }

    public static <T extends Parcelable> void K(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                O(parcel, t10, 0);
            }
        }
        M(parcel, L);
    }

    private static int L(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void M(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    private static void N(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void O(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return L(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        M(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            M(parcel, L);
        }
    }

    public static void d(Parcel parcel, int i10, BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        M(parcel, L);
    }

    public static void e(Parcel parcel, int i10, BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            M(parcel, L);
        }
    }

    public static void f(Parcel parcel, int i10, BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        M(parcel, L);
    }

    public static void g(Parcel parcel, int i10, boolean z10) {
        N(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void h(Parcel parcel, int i10, boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeBooleanArray(zArr);
            M(parcel, L);
        }
    }

    public static void i(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            N(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            N(parcel, i10, 0);
        }
    }

    public static void j(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeBundle(bundle);
            M(parcel, L);
        }
    }

    public static void k(Parcel parcel, int i10, byte b10) {
        N(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void l(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeByteArray(bArr);
            M(parcel, L);
        }
    }

    public static void m(Parcel parcel, int i10, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        M(parcel, L);
    }

    public static void n(Parcel parcel, int i10, double d10) {
        N(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void o(Parcel parcel, int i10, double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeDoubleArray(dArr);
            M(parcel, L);
        }
    }

    public static void p(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            N(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            N(parcel, i10, 0);
        }
    }

    public static void q(Parcel parcel, int i10, float f10) {
        N(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void r(Parcel parcel, int i10, float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeFloatArray(fArr);
            M(parcel, L);
        }
    }

    public static void s(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            N(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            N(parcel, i10, 0);
        }
    }

    public static void t(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            M(parcel, L);
        }
    }

    public static void u(Parcel parcel, int i10, int i11) {
        N(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void v(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeIntArray(iArr);
            M(parcel, L);
        }
    }

    public static void w(Parcel parcel, int i10, List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                N(parcel, i10, 0);
                return;
            }
            return;
        }
        int L = L(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        M(parcel, L);
    }

    public static void x(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            N(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            N(parcel, i10, 0);
        }
    }

    public static void y(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                N(parcel, i10, 0);
            }
        } else {
            int L = L(parcel, i10);
            parcel.writeList(list);
            M(parcel, L);
        }
    }

    public static void z(Parcel parcel, int i10, long j10) {
        N(parcel, i10, 8);
        parcel.writeLong(j10);
    }
}
