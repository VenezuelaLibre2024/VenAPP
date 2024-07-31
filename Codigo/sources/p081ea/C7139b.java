package p081ea;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ea.b */
/* loaded from: classes.dex */
public class C7139b {

    /* renamed from: ea.b$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static double m21151A(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 8);
        return parcel.readDouble();
    }

    /* renamed from: B */
    public static Double m21152B(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == 0) {
            return null;
        }
        m21166P(parcel, i10, m21163M, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: C */
    public static float m21153C(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 4);
        return parcel.readFloat();
    }

    /* renamed from: D */
    public static Float m21154D(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == 0) {
            return null;
        }
        m21166P(parcel, i10, m21163M, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: E */
    public static int m21155E(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: F */
    public static IBinder m21156F(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m21163M);
        return readStrongBinder;
    }

    /* renamed from: G */
    public static int m21157G(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: H */
    public static Integer m21158H(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == 0) {
            return null;
        }
        m21166P(parcel, i10, m21163M, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: I */
    public static void m21159I(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + m21163M);
    }

    /* renamed from: J */
    public static long m21160J(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: K */
    public static Long m21161K(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == 0) {
            return null;
        }
        m21166P(parcel, i10, m21163M, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: L */
    public static short m21162L(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: M */
    public static int m21163M(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* renamed from: N */
    public static void m21164N(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m21163M(parcel, i10));
    }

    /* renamed from: O */
    public static int m21165O(Parcel parcel) {
        int m21155E = m21155E(parcel);
        int m21163M = m21163M(parcel, m21155E);
        int m21190w = m21190w(m21155E);
        int dataPosition = parcel.dataPosition();
        if (m21190w != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m21155E))), parcel);
        }
        int i10 = m21163M + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
    }

    /* renamed from: P */
    private static void m21166P(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    /* renamed from: Q */
    private static void m21167Q(Parcel parcel, int i10, int i11) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + m21163M + " (0x" + Integer.toHexString(m21163M) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m21168a(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m21163M);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m21169b(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m21163M);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m21170c(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m21171d(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m21163M);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m21172e(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m21173f(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m21163M);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m21174g(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m21175h(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m21163M);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m21176i(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m21177j(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m21178k(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createIntArray;
    }

    /* renamed from: l */
    public static ArrayList<Integer> m21179l(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m21163M);
        return arrayList;
    }

    /* renamed from: m */
    public static long[] m21180m(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createLongArray;
    }

    /* renamed from: n */
    public static Parcel m21181n(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m21163M);
        parcel.setDataPosition(dataPosition + m21163M);
        return obtain;
    }

    /* renamed from: o */
    public static Parcel[] m21182o(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m21163M);
        return parcelArr;
    }

    /* renamed from: p */
    public static <T extends Parcelable> T m21183p(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m21163M);
        return createFromParcel;
    }

    /* renamed from: q */
    public static String m21184q(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m21163M);
        return readString;
    }

    /* renamed from: r */
    public static String[] m21185r(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m21163M);
        return createStringArray;
    }

    /* renamed from: s */
    public static ArrayList<String> m21186s(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m21163M);
        return createStringArrayList;
    }

    /* renamed from: t */
    public static <T> T[] m21187t(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m21163M);
        return tArr;
    }

    /* renamed from: u */
    public static <T> ArrayList<T> m21188u(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m21163M = m21163M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m21163M == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m21163M);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static void m21189v(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    /* renamed from: w */
    public static int m21190w(int i10) {
        return (char) i10;
    }

    /* renamed from: x */
    public static boolean m21191x(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: y */
    public static Boolean m21192y(Parcel parcel, int i10) {
        int m21163M = m21163M(parcel, i10);
        if (m21163M == 0) {
            return null;
        }
        m21166P(parcel, i10, m21163M, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: z */
    public static byte m21193z(Parcel parcel, int i10) {
        m21167Q(parcel, i10, 4);
        return (byte) parcel.readInt();
    }
}
