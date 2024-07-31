package com.google.android.exoplayer2.ui;

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
import com.google.android.exoplayer2.ui.c;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f8554a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f8555a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f8556b;

        private b(String str, Map<String, String> map) {
            this.f8555a = str;
            this.f8556b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0144c {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator<C0144c> f8557e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e10;
                e10 = c.C0144c.e((c.C0144c) obj, (c.C0144c) obj2);
                return e10;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator<C0144c> f8558f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f10;
                f10 = c.C0144c.f((c.C0144c) obj, (c.C0144c) obj2);
                return f10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f8559a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8560b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8561c;

        /* renamed from: d, reason: collision with root package name */
        public final String f8562d;

        private C0144c(int i10, int i11, String str, String str2) {
            this.f8559a = i10;
            this.f8560b = i11;
            this.f8561c = str;
            this.f8562d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(C0144c c0144c, C0144c c0144c2) {
            int compare = Integer.compare(c0144c2.f8560b, c0144c.f8560b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c0144c.f8561c.compareTo(c0144c2.f8561c);
            return compareTo != 0 ? compareTo : c0144c.f8562d.compareTo(c0144c2.f8562d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(C0144c c0144c, C0144c c0144c2) {
            int compare = Integer.compare(c0144c2.f8559a, c0144c.f8559a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c0144c2.f8561c.compareTo(c0144c.f8561c);
            return compareTo != 0 ? compareTo : c0144c2.f8562d.compareTo(c0144c.f8562d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0144c> f8563a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<C0144c> f8564b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", y.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), y.k());
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
            hashMap.put(com.google.android.exoplayer2.ui.b.a(sb2.toString()), r0.C("background-color:%s;", com.google.android.exoplayer2.ui.b.b(intValue)));
        }
        SparseArray<d> c10 = c(spanned, f10);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb3.append(b(spanned.subSequence(i11, keyAt)));
            d dVar = c10.get(keyAt);
            Collections.sort(dVar.f8564b, C0144c.f8558f);
            Iterator it2 = dVar.f8564b.iterator();
            while (it2.hasNext()) {
                sb3.append(((C0144c) it2.next()).f8562d);
            }
            Collections.sort(dVar.f8563a, C0144c.f8557e);
            Iterator it3 = dVar.f8563a.iterator();
            while (it3.hasNext()) {
                sb3.append(((C0144c) it3.next()).f8561c);
            }
            i10++;
            i11 = keyAt;
        }
        sb3.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb3.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f8554a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e10 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e10 != null) {
                t8.a.e(d10);
                C0144c c0144c = new C0144c(spanStart, spanEnd, e10, d10);
                f(sparseArray, spanStart).f8563a.add(c0144c);
                f(sparseArray, spanEnd).f8564b.add(c0144c);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof k8.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof k8.e)) {
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
            if (obj instanceof k8.c) {
                String b10 = b(((k8.c) obj).f20509a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 16);
                sb2.append("<rt>");
                sb2.append(b10);
                sb2.append("</rt></ruby>");
                return sb2.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return r0.C("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return r0.C("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof k8.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f10;
            }
            return r0.C("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return r0.C("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return r0.C("<span style='font-family:\"%s\";'>", family);
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
        if (!(obj instanceof k8.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof k8.e)) {
                return null;
            }
            k8.e eVar = (k8.e) obj;
            return r0.C("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f20511a, eVar.f20512b), g(eVar.f20513c));
        }
        int i10 = ((k8.c) obj).f20510b;
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

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String h(int r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.h(int, int):java.lang.String");
    }
}
