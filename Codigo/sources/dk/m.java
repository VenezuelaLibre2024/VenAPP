package dk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public class m extends l {
    public static <T> int A(T[] tArr, T t10) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.n.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <A extends Appendable> A B(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A C(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(fArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A D(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A E(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(jArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T, A extends Appendable> A F(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            xk.h.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A G(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(sArr, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Short.valueOf(s10)) : String.valueOf((int) s10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String H(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) B(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String I(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(fArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) C(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String J(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) D(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String K(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(jArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) E(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> String L(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) F(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String M(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(sArr, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) G(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String N(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return H(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String O(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return I(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String P(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return J(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String Q(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return K(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String R(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return L(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String S(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return M(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static double T(double[] dArr) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[w(dArr)];
    }

    public static char U(char[] cArr) {
        kotlin.jvm.internal.n.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T V(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> W(T[] tArr, int i10) {
        List<T> e10;
        List<T> e02;
        List<T> j10;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            j10 = r.j();
            return j10;
        }
        int length = tArr.length;
        if (i10 >= length) {
            e02 = e0(tArr);
            return e02;
        }
        if (i10 == 1) {
            e10 = q.e(tArr[length - 1]);
            return e10;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C X(T[] tArr, C destination) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> HashSet<T> Y(T[] tArr) {
        int e10;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        e10 = j0.e(tArr.length);
        return (HashSet) X(tArr, new HashSet(e10));
    }

    public static List<Byte> Z(byte[] bArr) {
        List<Byte> j10;
        List<Byte> e10;
        kotlin.jvm.internal.n.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return g0(bArr);
        }
        e10 = q.e(Byte.valueOf(bArr[0]));
        return e10;
    }

    public static List<Double> a0(double[] dArr) {
        List<Double> j10;
        List<Double> e10;
        kotlin.jvm.internal.n.e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return h0(dArr);
        }
        e10 = q.e(Double.valueOf(dArr[0]));
        return e10;
    }

    public static List<Float> b0(float[] fArr) {
        List<Float> j10;
        List<Float> e10;
        kotlin.jvm.internal.n.e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return i0(fArr);
        }
        e10 = q.e(Float.valueOf(fArr[0]));
        return e10;
    }

    public static List<Integer> c0(int[] iArr) {
        List<Integer> j10;
        List<Integer> e10;
        kotlin.jvm.internal.n.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return j0(iArr);
        }
        e10 = q.e(Integer.valueOf(iArr[0]));
        return e10;
    }

    public static List<Long> d0(long[] jArr) {
        List<Long> j10;
        List<Long> e10;
        kotlin.jvm.internal.n.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return k0(jArr);
        }
        e10 = q.e(Long.valueOf(jArr[0]));
        return e10;
    }

    public static <T> List<T> e0(T[] tArr) {
        List<T> j10;
        List<T> e10;
        List<T> l02;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            l02 = l0(tArr);
            return l02;
        }
        e10 = q.e(tArr[0]);
        return e10;
    }

    public static List<Short> f0(short[] sArr) {
        List<Short> j10;
        List<Short> e10;
        kotlin.jvm.internal.n.e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            j10 = r.j();
            return j10;
        }
        if (length != 1) {
            return m0(sArr);
        }
        e10 = q.e(Short.valueOf(sArr[0]));
        return e10;
    }

    public static final List<Byte> g0(byte[] bArr) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List<Double> h0(double[] dArr) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final List<Float> i0(float[] fArr) {
        kotlin.jvm.internal.n.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final List<Integer> j0(int[] iArr) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final List<Long> k0(long[] jArr) {
        kotlin.jvm.internal.n.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static <T> List<T> l0(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        return new ArrayList(r.g(tArr));
    }

    public static final List<Short> m0(short[] sArr) {
        kotlin.jvm.internal.n.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final <T> Set<T> n0(T[] tArr) {
        Set<T> e10;
        Set<T> d10;
        int e11;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            e10 = q0.e();
            return e10;
        }
        if (length != 1) {
            e11 = j0.e(tArr.length);
            return (Set) X(tArr, new LinkedHashSet(e11));
        }
        d10 = p0.d(tArr[0]);
        return d10;
    }

    public static <T> boolean p(T[] tArr, T t10) {
        int A;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        A = A(tArr, t10);
        return A >= 0;
    }

    public static <T> List<T> q(T[] tArr, int i10) {
        int b10;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (i10 >= 0) {
            b10 = uk.l.b(tArr.length - i10, 0);
            return W(tArr, b10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> r(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        return (List) s(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C s(T[] tArr, C destination) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static double t(double[] dArr) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    public static <T> T u(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static Integer v(int[] iArr) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final int w(double[] dArr) {
        kotlin.jvm.internal.n.e(dArr, "<this>");
        return dArr.length - 1;
    }

    public static int x(int[] iArr) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> int y(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T z(T[] tArr, int i10) {
        int y10;
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (i10 >= 0) {
            y10 = y(tArr);
            if (i10 <= y10) {
                return tArr[i10];
            }
        }
        return null;
    }
}
