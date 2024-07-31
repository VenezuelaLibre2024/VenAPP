package com.google.android.exoplayer2.p048ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.p048ui.C4772c;
import com.google.common.collect.AbstractC5911y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p198k8.C9206a;
import p198k8.C9208c;
import p198k8.C9210e;
import p363t8.C11137a;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.ui.c */
/* loaded from: classes.dex */
public final class C4772c {

    /* renamed from: a */
    private static final Pattern f9621a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f9622a;

        /* renamed from: b */
        public final Map<String, String> f9623b;

        private b(String str, Map<String, String> map) {
            this.f9622a = str;
            this.f9623b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e */
        private static final Comparator<c> f9624e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m12306e;
                m12306e = C4772c.c.m12306e((C4772c.c) obj, (C4772c.c) obj2);
                return m12306e;
            }
        };

        /* renamed from: f */
        private static final Comparator<c> f9625f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m12307f;
                m12307f = C4772c.c.m12307f((C4772c.c) obj, (C4772c.c) obj2);
                return m12307f;
            }
        };

        /* renamed from: a */
        public final int f9626a;

        /* renamed from: b */
        public final int f9627b;

        /* renamed from: c */
        public final String f9628c;

        /* renamed from: d */
        public final String f9629d;

        private c(int i10, int i11, String str, String str2) {
            this.f9626a = i10;
            this.f9627b = i11;
            this.f9628c = str;
            this.f9629d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m12306e(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f9627b, cVar.f9627b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f9628c.compareTo(cVar2.f9628c);
            return compareTo != 0 ? compareTo : cVar.f9629d.compareTo(cVar2.f9629d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ int m12307f(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f9626a, cVar.f9626a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f9628c.compareTo(cVar.f9628c);
            return compareTo != 0 ? compareTo : cVar2.f9629d.compareTo(cVar.f9629d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final List<c> f9630a = new ArrayList();

        /* renamed from: b */
        private final List<c> f9631b = new ArrayList();
    }

    /* renamed from: a */
    public static b m12294a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", AbstractC5911y.m15111k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(m12295b(charSequence), AbstractC5911y.m15111k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("bg_");
            sb2.append(intValue);
            hashMap.put(C4771b.m12292a(sb2.toString()), C11172r0.m34860C("background-color:%s;", C4771b.m12293b(intValue)));
        }
        SparseArray<d> m12296c = m12296c(spanned, f10);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < m12296c.size()) {
            int keyAt = m12296c.keyAt(i10);
            sb3.append(m12295b(spanned.subSequence(i11, keyAt)));
            d dVar = m12296c.get(keyAt);
            Collections.sort(dVar.f9631b, c.f9625f);
            Iterator it2 = dVar.f9631b.iterator();
            while (it2.hasNext()) {
                sb3.append(((c) it2.next()).f9629d);
            }
            Collections.sort(dVar.f9630a, c.f9624e);
            Iterator it3 = dVar.f9630a.iterator();
            while (it3.hasNext()) {
                sb3.append(((c) it3.next()).f9628c);
            }
            i10++;
            i11 = keyAt;
        }
        sb3.append(m12295b(spanned.subSequence(i11, spanned.length())));
        return new b(sb3.toString(), hashMap);
    }

    /* renamed from: b */
    private static String m12295b(CharSequence charSequence) {
        return f9621a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    private static SparseArray<d> m12296c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String m12298e = m12298e(obj, f10);
            String m12297d = m12297d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (m12298e != null) {
                C11137a.m34603e(m12297d);
                c cVar = new c(spanStart, spanEnd, m12298e, m12297d);
                m12299f(sparseArray, spanStart).f9630a.add(cVar);
                m12299f(sparseArray, spanEnd).f9631b.add(cVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    private static String m12297d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C9206a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C9210e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof C9208c) {
                String m12295b = m12295b(((C9208c) obj).f22331a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(m12295b).length() + 16);
                sb2.append("<rt>");
                sb2.append(m12295b);
                sb2.append("</rt></ruby>");
                return sb2.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    /* renamed from: e */
    private static String m12298e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return C11172r0.m34860C("<span style='color:%s;'>", C4771b.m12293b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return C11172r0.m34860C("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C9206a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f10;
            }
            return C11172r0.m34860C("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return C11172r0.m34860C("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return C11172r0.m34860C("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof C9208c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof C9210e)) {
                return null;
            }
            C9210e c9210e = (C9210e) obj;
            return C11172r0.m34860C("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m12301h(c9210e.f22333a, c9210e.f22334b), m12300g(c9210e.f22335c));
        }
        int i10 = ((C9208c) obj).f22332b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    /* renamed from: f */
    private static d m12299f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    /* renamed from: g */
    private static String m12300g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m12301h(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto Lf
            if (r4 == r1) goto Lc
            goto L14
        Lc:
            java.lang.String r4 = "open "
            goto L11
        Lf:
            java.lang.String r4 = "filled "
        L11:
            r0.append(r4)
        L14:
            if (r3 == 0) goto L29
            if (r3 == r2) goto L26
            if (r3 == r1) goto L23
            r4 = 3
            if (r3 == r4) goto L20
            java.lang.String r3 = "unset"
            goto L2b
        L20:
            java.lang.String r3 = "sesame"
            goto L2b
        L23:
            java.lang.String r3 = "dot"
            goto L2b
        L26:
            java.lang.String r3 = "circle"
            goto L2b
        L29:
            java.lang.String r3 = "none"
        L2b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p048ui.C4772c.m12301h(int, int):java.lang.String");
    }
}
