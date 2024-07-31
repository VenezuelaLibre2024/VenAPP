package dk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p450xk.C12516h;
import uk.C11585l;

/* renamed from: dk.m */
/* loaded from: classes3.dex */
public class C7021m extends C7019l {
    /* renamed from: A */
    public static <T> int m20448A(T[] tArr, T t10) {
        C9322n.m27781e(tArr, "<this>");
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
            if (C9322n.m27777a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: B */
    public static final <A extends Appendable> A m20449B(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Double, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(dArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            buffer.append(interfaceC9998l != null ? interfaceC9998l.invoke(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: C */
    public static final <A extends Appendable> A m20450C(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Float, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(fArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            buffer.append(interfaceC9998l != null ? interfaceC9998l.invoke(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: D */
    public static final <A extends Appendable> A m20451D(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Integer, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(iArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            buffer.append(interfaceC9998l != null ? interfaceC9998l.invoke(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: E */
    public static final <A extends Appendable> A m20452E(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Long, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(jArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            buffer.append(interfaceC9998l != null ? interfaceC9998l.invoke(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: F */
    public static final <T, A extends Appendable> A m20453F(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            C12516h.m41013a(buffer, t10, interfaceC9998l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: G */
    public static final <A extends Appendable> A m20454G(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Short, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(sArr, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            buffer.append(interfaceC9998l != null ? interfaceC9998l.invoke(Short.valueOf(s10)) : String.valueOf((int) s10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: H */
    public static final String m20455H(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Double, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(dArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20449B(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: I */
    public static final String m20456I(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Float, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(fArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20450C(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: J */
    public static final String m20457J(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Integer, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(iArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20451D(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: K */
    public static final String m20458K(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Long, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(jArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20452E(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: L */
    public static final <T> String m20459L(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20453F(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: M */
    public static final String m20460M(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super Short, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(sArr, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20454G(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: N */
    public static /* synthetic */ String m20461N(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20455H(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: O */
    public static /* synthetic */ String m20462O(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20456I(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: P */
    public static /* synthetic */ String m20463P(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20457J(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: Q */
    public static /* synthetic */ String m20464Q(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20458K(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: R */
    public static /* synthetic */ String m20465R(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20459L(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: S */
    public static /* synthetic */ String m20466S(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
            interfaceC9998l = null;
        }
        return m20460M(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: T */
    public static double m20467T(double[] dArr) {
        C9322n.m27781e(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[m20495w(dArr)];
    }

    /* renamed from: U */
    public static char m20468U(char[] cArr) {
        C9322n.m27781e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: V */
    public static <T> T m20469V(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: W */
    public static final <T> List<T> m20470W(T[] tArr, int i10) {
        List<T> m20572e;
        List<T> m20478e0;
        List<T> m20582j;
        C9322n.m27781e(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        int length = tArr.length;
        if (i10 >= length) {
            m20478e0 = m20478e0(tArr);
            return m20478e0;
        }
        if (i10 == 1) {
            m20572e = C7029q.m20572e(tArr[length - 1]);
            return m20572e;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    /* renamed from: X */
    public static final <T, C extends Collection<? super T>> C m20471X(T[] tArr, C destination) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    /* renamed from: Y */
    public static <T> HashSet<T> m20472Y(T[] tArr) {
        int m20418e;
        C9322n.m27781e(tArr, "<this>");
        m20418e = C7016j0.m20418e(tArr.length);
        return (HashSet) m20471X(tArr, new HashSet(m20418e));
    }

    /* renamed from: Z */
    public static List<Byte> m20473Z(byte[] bArr) {
        List<Byte> m20582j;
        List<Byte> m20572e;
        C9322n.m27781e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20480g0(bArr);
        }
        m20572e = C7029q.m20572e(Byte.valueOf(bArr[0]));
        return m20572e;
    }

    /* renamed from: a0 */
    public static List<Double> m20474a0(double[] dArr) {
        List<Double> m20582j;
        List<Double> m20572e;
        C9322n.m27781e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20481h0(dArr);
        }
        m20572e = C7029q.m20572e(Double.valueOf(dArr[0]));
        return m20572e;
    }

    /* renamed from: b0 */
    public static List<Float> m20475b0(float[] fArr) {
        List<Float> m20582j;
        List<Float> m20572e;
        C9322n.m27781e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20482i0(fArr);
        }
        m20572e = C7029q.m20572e(Float.valueOf(fArr[0]));
        return m20572e;
    }

    /* renamed from: c0 */
    public static List<Integer> m20476c0(int[] iArr) {
        List<Integer> m20582j;
        List<Integer> m20572e;
        C9322n.m27781e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20483j0(iArr);
        }
        m20572e = C7029q.m20572e(Integer.valueOf(iArr[0]));
        return m20572e;
    }

    /* renamed from: d0 */
    public static List<Long> m20477d0(long[] jArr) {
        List<Long> m20582j;
        List<Long> m20572e;
        C9322n.m27781e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20484k0(jArr);
        }
        m20572e = C7029q.m20572e(Long.valueOf(jArr[0]));
        return m20572e;
    }

    /* renamed from: e0 */
    public static <T> List<T> m20478e0(T[] tArr) {
        List<T> m20582j;
        List<T> m20572e;
        List<T> m20485l0;
        C9322n.m27781e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            m20485l0 = m20485l0(tArr);
            return m20485l0;
        }
        m20572e = C7029q.m20572e(tArr[0]);
        return m20572e;
    }

    /* renamed from: f0 */
    public static List<Short> m20479f0(short[] sArr) {
        List<Short> m20582j;
        List<Short> m20572e;
        C9322n.m27781e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (length != 1) {
            return m20486m0(sArr);
        }
        m20572e = C7029q.m20572e(Short.valueOf(sArr[0]));
        return m20572e;
    }

    /* renamed from: g0 */
    public static final List<Byte> m20480g0(byte[] bArr) {
        C9322n.m27781e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static final List<Double> m20481h0(double[] dArr) {
        C9322n.m27781e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static final List<Float> m20482i0(float[] fArr) {
        C9322n.m27781e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public static final List<Integer> m20483j0(int[] iArr) {
        C9322n.m27781e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public static final List<Long> m20484k0(long[] jArr) {
        C9322n.m27781e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static <T> List<T> m20485l0(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        return new ArrayList(C7031r.m20579g(tArr));
    }

    /* renamed from: m0 */
    public static final List<Short> m20486m0(short[] sArr) {
        C9322n.m27781e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public static final <T> Set<T> m20487n0(T[] tArr) {
        Set<T> m20573e;
        Set<T> m20567d;
        int m20418e;
        C9322n.m27781e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            m20573e = C7030q0.m20573e();
            return m20573e;
        }
        if (length != 1) {
            m20418e = C7016j0.m20418e(tArr.length);
            return (Set) m20471X(tArr, new LinkedHashSet(m20418e));
        }
        m20567d = C7028p0.m20567d(tArr[0]);
        return m20567d;
    }

    /* renamed from: p */
    public static <T> boolean m20488p(T[] tArr, T t10) {
        int m20448A;
        C9322n.m27781e(tArr, "<this>");
        m20448A = m20448A(tArr, t10);
        return m20448A >= 0;
    }

    /* renamed from: q */
    public static <T> List<T> m20489q(T[] tArr, int i10) {
        int m36293b;
        C9322n.m27781e(tArr, "<this>");
        if (i10 >= 0) {
            m36293b = C11585l.m36293b(tArr.length - i10, 0);
            return m20470W(tArr, m36293b);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: r */
    public static <T> List<T> m20490r(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        return (List) m20491s(tArr, new ArrayList());
    }

    /* renamed from: s */
    public static final <C extends Collection<? super T>, T> C m20491s(T[] tArr, C destination) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    /* renamed from: t */
    public static double m20492t(double[] dArr) {
        C9322n.m27781e(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    /* renamed from: u */
    public static <T> T m20493u(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    /* renamed from: v */
    public static Integer m20494v(int[] iArr) {
        C9322n.m27781e(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    /* renamed from: w */
    public static final int m20495w(double[] dArr) {
        C9322n.m27781e(dArr, "<this>");
        return dArr.length - 1;
    }

    /* renamed from: x */
    public static int m20496x(int[] iArr) {
        C9322n.m27781e(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: y */
    public static <T> int m20497y(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: z */
    public static <T> T m20498z(T[] tArr, int i10) {
        int m20497y;
        C9322n.m27781e(tArr, "<this>");
        if (i10 >= 0) {
            m20497y = m20497y(tArr);
            if (i10 <= m20497y) {
                return tArr[i10];
            }
        }
        return null;
    }
}
