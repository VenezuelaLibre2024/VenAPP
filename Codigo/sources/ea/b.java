package ea;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static double A(Parcel parcel, int i10) {
        Q(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double B(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        if (M == 0) {
            return null;
        }
        P(parcel, i10, M, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float C(Parcel parcel, int i10) {
        Q(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float D(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        if (M == 0) {
            return null;
        }
        P(parcel, i10, M, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int E(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder F(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + M);
        return readStrongBinder;
    }

    public static int G(Parcel parcel, int i10) {
        Q(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer H(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        if (M == 0) {
            return null;
        }
        P(parcel, i10, M, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void I(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + M);
    }

    public static long J(Parcel parcel, int i10) {
        Q(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long K(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        if (M == 0) {
            return null;
        }
        P(parcel, i10, M, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short L(Parcel parcel, int i10) {
        Q(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int M(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void N(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + M(parcel, i10));
    }

    public static int O(Parcel parcel) {
        int E = E(parcel);
        int M = M(parcel, E);
        int w10 = w(E);
        int dataPosition = parcel.dataPosition();
        if (w10 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(E))), parcel);
        }
        int i10 = M + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
    }

    private static void P(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    private static void Q(Parcel parcel, int i10, int i11) {
        int M = M(parcel, i10);
        if (M == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + M + " (0x" + Integer.toHexString(M) + ")", parcel);
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + M);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + M);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + M);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return createByteArray;
    }

    public static byte[][] h(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + M);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + M);
        return createDoubleArray;
    }

    public static float[] j(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + M);
        return createFloatArray;
    }

    public static int[] k(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + M);
        return createIntArray;
    }

    public static ArrayList<Integer> l(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + M);
        return arrayList;
    }

    public static long[] m(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + M);
        return createLongArray;
    }

    public static Parcel n(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, M);
        parcel.setDataPosition(dataPosition + M);
        return obtain;
    }

    public static Parcel[] o(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
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
        parcel.setDataPosition(dataPosition + M);
        return parcelArr;
    }

    public static <T extends Parcelable> T p(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + M);
        return createFromParcel;
    }

    public static String q(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + M);
        return readString;
    }

    public static String[] r(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + M);
        return createStringArray;
    }

    public static ArrayList<String> s(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + M);
        return createStringArrayList;
    }

    public static <T> T[] t(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + M);
        return tArr;
    }

    public static <T> ArrayList<T> u(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int M = M(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArrayList;
    }

    public static void v(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int w(int i10) {
        return (char) i10;
    }

    public static boolean x(Parcel parcel, int i10) {
        Q(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean y(Parcel parcel, int i10) {
        int M = M(parcel, i10);
        if (M == 0) {
            return null;
        }
        P(parcel, i10, M, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte z(Parcel parcel, int i10) {
        Q(parcel, i10, 4);
        return (byte) parcel.readInt();
    }
}
