package dk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class z extends y {

    /* loaded from: classes3.dex */
    public static final class a<T> implements wk.d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f14244a;

        public a(Iterable iterable) {
            this.f14244a = iterable;
        }

        @Override // wk.d
        public Iterator<T> iterator() {
            return this.f14244a.iterator();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T> extends kotlin.jvm.internal.o implements ok.l<Integer, T> {

        /* renamed from: a */
        final /* synthetic */ int f14245a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f14245a = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f14245a + '.');
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static <T> List<T> A(List<? extends T> list, int i10) {
        int b10;
        List<T> b02;
        kotlin.jvm.internal.n.e(list, "<this>");
        if (i10 >= 0) {
            List<? extends T> list2 = list;
            b10 = uk.l.b(list.size() - i10, 0);
            b02 = b0(list2, b10);
            return b02;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T B(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) C(iterable, i10, new b(i10));
    }

    public static final <T> T C(Iterable<? extends T> iterable, int i10, ok.l<? super Integer, ? extends T> defaultValue) {
        int k10;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0) {
                k10 = r.k(list);
                if (i10 <= k10) {
                    return (T) list.get(i10);
                }
            }
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        if (i10 >= 0) {
            int i11 = 0;
            for (T t10 : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return t10;
                }
                i11 = i12;
            }
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    public static <T> List<T> D(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return (List) E(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C E(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T> T F(Iterable<? extends T> iterable) {
        Object G;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (iterable instanceof List) {
            G = G((List) iterable);
            return (T) G;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T G(List<? extends T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T H(List<? extends T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> int I(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                r.q();
            }
            if (kotlin.jvm.internal.n.a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A J(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(buffer, "buffer");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static /* synthetic */ Appendable K(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
        return J(iterable, appendable, (i11 & 2) != 0 ? ", " : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String L(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(separator, "separator");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        kotlin.jvm.internal.n.e(postfix, "postfix");
        kotlin.jvm.internal.n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) J(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String M(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
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
        return L(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T N(Iterable<? extends T> iterable) {
        T next;
        Object O;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (iterable instanceof List) {
            O = O((List) iterable);
            return (T) O;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T O(List<? extends T> list) {
        int k10;
        kotlin.jvm.internal.n.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        k10 = r.k(list);
        return list.get(k10);
    }

    public static <T extends Comparable<? super T>> T P(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> Q(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> R;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        if (iterable instanceof Collection) {
            R = R((Collection) iterable, elements);
            return R;
        }
        ArrayList arrayList = new ArrayList();
        w.u(arrayList, iterable);
        w.u(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> R(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w.u(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> S(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> T(Collection<? extends T> collection, T[] elements) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        w.v(arrayList, elements);
        return arrayList;
    }

    public static <T> T U(Collection<? extends T> collection, sk.c random) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        kotlin.jvm.internal.n.e(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) B(collection, random.d(collection.size()));
    }

    public static <T> T V(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) W((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T W(List<? extends T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T X(List<? extends T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> Y(List<? extends T> list, uk.f indices) {
        List<T> f02;
        List<T> j10;
        kotlin.jvm.internal.n.e(list, "<this>");
        kotlin.jvm.internal.n.e(indices, "indices");
        if (indices.isEmpty()) {
            j10 = r.j();
            return j10;
        }
        f02 = f0(list.subList(indices.o().intValue(), indices.n().intValue() + 1));
        return f02;
    }

    public static <T extends Comparable<? super T>> List<T> Z(Iterable<? extends T> iterable) {
        List<T> c10;
        List<T> f02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> g02 = g0(iterable);
            v.s(g02);
            return g02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            f02 = f0(iterable);
            return f02;
        }
        Object[] array = collection.toArray(new Comparable[0]);
        l.n((Comparable[]) array);
        c10 = l.c(array);
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> a0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> c10;
        List<T> f02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> g02 = g0(iterable);
            v.t(g02, comparator);
            return g02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            f02 = f0(iterable);
            return f02;
        }
        Object[] array = collection.toArray(new Object[0]);
        l.o(array, comparator);
        c10 = l.c(array);
        return c10;
    }

    public static <T> List<T> b0(Iterable<? extends T> iterable, int i10) {
        List<T> e10;
        List<T> f02;
        List<T> j10;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            j10 = r.j();
            return j10;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                f02 = f0(iterable);
                return f02;
            }
            if (i10 == 1) {
                e10 = q.e(F(iterable));
                return e10;
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return r.o(arrayList);
    }

    public static byte[] c0(Collection<Byte> collection) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C d0(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static int[] e0(Collection<Integer> collection) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> f0(Iterable<? extends T> iterable) {
        List<T> j10;
        List<T> e10;
        List<T> h02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return r.o(g0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            j10 = r.j();
            return j10;
        }
        if (size != 1) {
            h02 = h0(collection);
            return h02;
        }
        e10 = q.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        return e10;
    }

    public static final <T> List<T> g0(Iterable<? extends T> iterable) {
        List<T> h02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return (List) d0(iterable, new ArrayList());
        }
        h02 = h0((Collection) iterable);
        return h02;
    }

    public static <T> List<T> h0(Collection<? extends T> collection) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> i0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) d0(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> j0(Iterable<? extends T> iterable) {
        Set<T> e10;
        Set<T> d10;
        int e11;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q0.h((Set) d0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            e10 = q0.e();
            return e10;
        }
        if (size != 1) {
            e11 = j0.e(collection.size());
            return (Set) d0(iterable, new LinkedHashSet(e11));
        }
        d10 = p0.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        return d10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r5 = uk.l.d(r10, r0 - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.List<java.util.List<T>> k0(java.lang.Iterable<? extends T> r9, int r10, int r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.n.e(r9, r0)
            dk.s0.a(r10, r11)
            boolean r0 = r9 instanceof java.util.RandomAccess
            r1 = 0
            if (r0 == 0) goto L55
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L55
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            int r2 = r0 / r11
            int r3 = r0 % r11
            r4 = 1
            if (r3 != 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r4
        L21:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = r1
        L28:
            if (r2 < 0) goto L2e
            if (r2 >= r0) goto L2e
            r5 = r4
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L54
            int r5 = r0 - r2
            int r5 = uk.j.d(r10, r5)
            if (r5 >= r10) goto L3b
            if (r12 == 0) goto L54
        L3b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r7 = r1
        L41:
            if (r7 >= r5) goto L4f
            int r8 = r7 + r2
            java.lang.Object r8 = r9.get(r8)
            r6.add(r8)
            int r7 = r7 + 1
            goto L41
        L4f:
            r3.add(r6)
            int r2 = r2 + r11
            goto L28
        L54:
            return r3
        L55:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            java.util.Iterator r9 = dk.s0.b(r9, r10, r11, r12, r1)
        L62:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r9.next()
            java.util.List r10 = (java.util.List) r10
            r0.add(r10)
            goto L62
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.z.k0(java.lang.Iterable, int, int, boolean):java.util.List");
    }

    public static <T, R> List<ck.m<T, R>> l0(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int r10;
        int r11;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        r10 = s.r(iterable, 10);
        r11 = s.r(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(r10, r11));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(ck.r.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> wk.d<T> w(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean x(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : I(iterable, t10) >= 0;
    }

    public static <T> List<T> y(Iterable<? extends T> iterable) {
        Set i02;
        List<T> f02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        i02 = i0(iterable);
        f02 = f0(i02);
        return f02;
    }

    public static <T> List<T> z(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        List<T> e10;
        List<T> j10;
        List<T> f02;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            f02 = f0(iterable);
            return f02;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                j10 = r.j();
                return j10;
            }
            if (size == 1) {
                e10 = q.e(N(iterable));
                return e10;
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return r.o(arrayList);
    }
}
