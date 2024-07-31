package dk;

import ck.C2028m;
import ck.C2033r;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p427wk.InterfaceC12228d;
import p450xk.C12516h;
import sk.AbstractC10933c;
import uk.C11579f;
import uk.C11585l;

/* renamed from: dk.z */
/* loaded from: classes3.dex */
public class C7042z extends C7041y {

    /* renamed from: dk.z$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC12228d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f15602a;

        public a(Iterable iterable) {
            this.f15602a = iterable;
        }

        @Override // p427wk.InterfaceC12228d
        public Iterator<T> iterator() {
            return this.f15602a.iterator();
        }
    }

    /* renamed from: dk.z$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AbstractC9323o implements InterfaceC9998l<Integer, T> {

        /* renamed from: a */
        final /* synthetic */ int f15603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f15603a = i10;
        }

        /* renamed from: a */
        public final T m20641a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f15603a + '.');
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return m20641a(num.intValue());
        }
    }

    /* renamed from: A */
    public static <T> List<T> m20599A(List<? extends T> list, int i10) {
        int m36293b;
        List<T> m20626b0;
        C9322n.m27781e(list, "<this>");
        if (i10 >= 0) {
            List<? extends T> list2 = list;
            m36293b = C11585l.m36293b(list.size() - i10, 0);
            m20626b0 = m20626b0(list2, m36293b);
            return m20626b0;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: B */
    public static final <T> T m20600B(Iterable<? extends T> iterable, int i10) {
        C9322n.m27781e(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) m20601C(iterable, i10, new b(i10));
    }

    /* renamed from: C */
    public static final <T> T m20601C(Iterable<? extends T> iterable, int i10, InterfaceC9998l<? super Integer, ? extends T> defaultValue) {
        int m20583k;
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0) {
                m20583k = C7031r.m20583k(list);
                if (i10 <= m20583k) {
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

    /* renamed from: D */
    public static <T> List<T> m20602D(Iterable<? extends T> iterable) {
        C9322n.m27781e(iterable, "<this>");
        return (List) m20603E(iterable, new ArrayList());
    }

    /* renamed from: E */
    public static final <C extends Collection<? super T>, T> C m20603E(Iterable<? extends T> iterable, C destination) {
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    /* renamed from: F */
    public static final <T> T m20604F(Iterable<? extends T> iterable) {
        Object m20605G;
        C9322n.m27781e(iterable, "<this>");
        if (iterable instanceof List) {
            m20605G = m20605G((List) iterable);
            return (T) m20605G;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: G */
    public static <T> T m20605G(List<? extends T> list) {
        C9322n.m27781e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: H */
    public static <T> T m20606H(List<? extends T> list) {
        C9322n.m27781e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: I */
    public static final <T> int m20607I(Iterable<? extends T> iterable, T t10) {
        C9322n.m27781e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                C7031r.m20589q();
            }
            if (C9322n.m27777a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: J */
    public static final <T, A extends Appendable> A m20608J(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
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
            C12516h.m41013a(buffer, t10, interfaceC9998l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: L */
    public static final <T> String m20610L(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m20608J(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: M */
    public static /* synthetic */ String m20611M(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
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
        return m20610L(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: N */
    public static final <T> T m20612N(Iterable<? extends T> iterable) {
        T next;
        Object m20613O;
        C9322n.m27781e(iterable, "<this>");
        if (iterable instanceof List) {
            m20613O = m20613O((List) iterable);
            return (T) m20613O;
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

    /* renamed from: O */
    public static <T> T m20613O(List<? extends T> list) {
        int m20583k;
        C9322n.m27781e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        m20583k = C7031r.m20583k(list);
        return list.get(m20583k);
    }

    /* renamed from: P */
    public static <T extends Comparable<? super T>> T m20614P(Iterable<? extends T> iterable) {
        C9322n.m27781e(iterable, "<this>");
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

    /* renamed from: Q */
    public static <T> List<T> m20615Q(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> m20616R;
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(elements, "elements");
        if (iterable instanceof Collection) {
            m20616R = m20616R((Collection) iterable, elements);
            return m20616R;
        }
        ArrayList arrayList = new ArrayList();
        C7039w.m20597u(arrayList, iterable);
        C7039w.m20597u(arrayList, elements);
        return arrayList;
    }

    /* renamed from: R */
    public static <T> List<T> m20616R(Collection<? extends T> collection, Iterable<? extends T> elements) {
        C9322n.m27781e(collection, "<this>");
        C9322n.m27781e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C7039w.m20597u(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: S */
    public static <T> List<T> m20617S(Collection<? extends T> collection, T t10) {
        C9322n.m27781e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    /* renamed from: T */
    public static <T> List<T> m20618T(Collection<? extends T> collection, T[] elements) {
        C9322n.m27781e(collection, "<this>");
        C9322n.m27781e(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        C7039w.m20598v(arrayList, elements);
        return arrayList;
    }

    /* renamed from: U */
    public static <T> T m20619U(Collection<? extends T> collection, AbstractC10933c random) {
        C9322n.m27781e(collection, "<this>");
        C9322n.m27781e(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) m20600B(collection, random.mo33398d(collection.size()));
    }

    /* renamed from: V */
    public static <T> T m20620V(Iterable<? extends T> iterable) {
        C9322n.m27781e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m20621W((List) iterable);
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

    /* renamed from: W */
    public static final <T> T m20621W(List<? extends T> list) {
        C9322n.m27781e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: X */
    public static <T> T m20622X(List<? extends T> list) {
        C9322n.m27781e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: Y */
    public static <T> List<T> m20623Y(List<? extends T> list, C11579f indices) {
        List<T> m20630f0;
        List<T> m20582j;
        C9322n.m27781e(list, "<this>");
        C9322n.m27781e(indices, "indices");
        if (indices.isEmpty()) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        m20630f0 = m20630f0(list.subList(indices.m36276o().intValue(), indices.m36275n().intValue() + 1));
        return m20630f0;
    }

    /* renamed from: Z */
    public static <T extends Comparable<? super T>> List<T> m20624Z(Iterable<? extends T> iterable) {
        List<T> m20435c;
        List<T> m20630f0;
        C9322n.m27781e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> m20631g0 = m20631g0(iterable);
            C7038v.m20595s(m20631g0);
            return m20631g0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            m20630f0 = m20630f0(iterable);
            return m20630f0;
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C7019l.m20446n((Comparable[]) array);
        m20435c = C7019l.m20435c(array);
        return m20435c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static <T> List<T> m20625a0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> m20435c;
        List<T> m20630f0;
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> m20631g0 = m20631g0(iterable);
            C7038v.m20596t(m20631g0, comparator);
            return m20631g0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            m20630f0 = m20630f0(iterable);
            return m20630f0;
        }
        Object[] array = collection.toArray(new Object[0]);
        C7019l.m20447o(array, comparator);
        m20435c = C7019l.m20435c(array);
        return m20435c;
    }

    /* renamed from: b0 */
    public static <T> List<T> m20626b0(Iterable<? extends T> iterable, int i10) {
        List<T> m20572e;
        List<T> m20630f0;
        List<T> m20582j;
        C9322n.m27781e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                m20630f0 = m20630f0(iterable);
                return m20630f0;
            }
            if (i10 == 1) {
                m20572e = C7029q.m20572e(m20604F(iterable));
                return m20572e;
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
        return C7031r.m20587o(arrayList);
    }

    /* renamed from: c0 */
    public static byte[] m20627c0(Collection<Byte> collection) {
        C9322n.m27781e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    /* renamed from: d0 */
    public static final <T, C extends Collection<? super T>> C m20628d0(Iterable<? extends T> iterable, C destination) {
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: e0 */
    public static int[] m20629e0(Collection<Integer> collection) {
        C9322n.m27781e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    /* renamed from: f0 */
    public static <T> List<T> m20630f0(Iterable<? extends T> iterable) {
        List<T> m20582j;
        List<T> m20572e;
        List<T> m20632h0;
        C9322n.m27781e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7031r.m20587o(m20631g0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        if (size != 1) {
            m20632h0 = m20632h0(collection);
            return m20632h0;
        }
        m20572e = C7029q.m20572e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        return m20572e;
    }

    /* renamed from: g0 */
    public static final <T> List<T> m20631g0(Iterable<? extends T> iterable) {
        List<T> m20632h0;
        C9322n.m27781e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return (List) m20628d0(iterable, new ArrayList());
        }
        m20632h0 = m20632h0((Collection) iterable);
        return m20632h0;
    }

    /* renamed from: h0 */
    public static <T> List<T> m20632h0(Collection<? extends T> collection) {
        C9322n.m27781e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: i0 */
    public static <T> Set<T> m20633i0(Iterable<? extends T> iterable) {
        C9322n.m27781e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m20628d0(iterable, new LinkedHashSet());
    }

    /* renamed from: j0 */
    public static <T> Set<T> m20634j0(Iterable<? extends T> iterable) {
        Set<T> m20573e;
        Set<T> m20567d;
        int m20418e;
        C9322n.m27781e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7030q0.m20576h((Set) m20628d0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            m20573e = C7030q0.m20573e();
            return m20573e;
        }
        if (size != 1) {
            m20418e = C7016j0.m20418e(collection.size());
            return (Set) m20628d0(iterable, new LinkedHashSet(m20418e));
        }
        m20567d = C7028p0.m20567d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        return m20567d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r5 = uk.C11585l.m36295d(r10, r0 - r2);
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.List<java.util.List<T>> m20635k0(java.lang.Iterable<? extends T> r9, int r10, int r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9322n.m27781e(r9, r0)
            dk.C7034s0.m20591a(r10, r11)
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
            int r5 = uk.C11583j.m36284d(r10, r5)
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
            java.util.Iterator r9 = dk.C7034s0.m20592b(r9, r10, r11, r12, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: dk.C7042z.m20635k0(java.lang.Iterable, int, int, boolean):java.util.List");
    }

    /* renamed from: l0 */
    public static <T, R> List<C2028m<T, R>> m20636l0(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int m20590r;
        int m20590r2;
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        m20590r = C7033s.m20590r(iterable, 10);
        m20590r2 = C7033s.m20590r(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(m20590r, m20590r2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C2033r.m10353a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static <T> InterfaceC12228d<T> m20637w(Iterable<? extends T> iterable) {
        C9322n.m27781e(iterable, "<this>");
        return new a(iterable);
    }

    /* renamed from: x */
    public static <T> boolean m20638x(Iterable<? extends T> iterable, T t10) {
        C9322n.m27781e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : m20607I(iterable, t10) >= 0;
    }

    /* renamed from: y */
    public static <T> List<T> m20639y(Iterable<? extends T> iterable) {
        Set m20633i0;
        List<T> m20630f0;
        C9322n.m27781e(iterable, "<this>");
        m20633i0 = m20633i0(iterable);
        m20630f0 = m20630f0(m20633i0);
        return m20630f0;
    }

    /* renamed from: z */
    public static <T> List<T> m20640z(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        List<T> m20572e;
        List<T> m20582j;
        List<T> m20630f0;
        C9322n.m27781e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            m20630f0 = m20630f0(iterable);
            return m20630f0;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            if (size == 1) {
                m20572e = C7029q.m20572e(m20612N(iterable));
                return m20572e;
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
        return C7031r.m20587o(arrayList);
    }
}
