package p251n8;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import p198k8.C9206a;
import p198k8.C9208c;
import p198k8.C9209d;
import p198k8.C9210e;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n8.f */
/* loaded from: classes.dex */
public final class C9680f {
    /* renamed from: a */
    public static void m29019a(Spannable spannable, int i10, int i11, C9681g c9681g, C9678d c9678d, Map<String, C9681g> map, int i12) {
        C9678d m29023e;
        Object c9208c;
        C9681g m29024f;
        Object absoluteSizeSpan;
        int i13;
        if (c9681g.m29048l() != -1) {
            spannable.setSpan(new StyleSpan(c9681g.m29048l()), i10, i11, 33);
        }
        if (c9681g.m29054s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c9681g.m29055t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c9681g.m29053q()) {
            C9209d.m27392a(spannable, new ForegroundColorSpan(c9681g.m29039c()), i10, i11, 33);
        }
        if (c9681g.m29052p()) {
            C9209d.m27392a(spannable, new BackgroundColorSpan(c9681g.m29038b()), i10, i11, 33);
        }
        if (c9681g.m29040d() != null) {
            C9209d.m27392a(spannable, new TypefaceSpan(c9681g.m29040d()), i10, i11, 33);
        }
        if (c9681g.m29051o() != null) {
            C9676b c9676b = (C9676b) C11137a.m34603e(c9681g.m29051o());
            int i14 = c9676b.f23774a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = c9676b.f23775b;
            }
            int i15 = c9676b.f23776c;
            if (i15 == -2) {
                i15 = 1;
            }
            C9209d.m27392a(spannable, new C9210e(i14, i13, i15), i10, i11, 33);
        }
        int m29046j = c9681g.m29046j();
        if (m29046j == 2) {
            C9678d m29022d = m29022d(c9678d, map);
            if (m29022d != null && (m29023e = m29023e(m29022d, map)) != null) {
                if (m29023e.m29014g() != 1 || m29023e.m29013f(0).f23795b == null) {
                    C11173s.m34967f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C11172r0.m34928j(m29023e.m29013f(0).f23795b);
                    C9681g m29024f2 = m29024f(m29023e.f23799f, m29023e.m29017l(), map);
                    int m29045i = m29024f2 != null ? m29024f2.m29045i() : -1;
                    if (m29045i == -1 && (m29024f = m29024f(m29022d.f23799f, m29022d.m29017l(), map)) != null) {
                        m29045i = m29024f.m29045i();
                    }
                    c9208c = new C9208c(str, m29045i);
                    spannable.setSpan(c9208c, i10, i11, 33);
                }
            }
        } else if (m29046j == 3 || m29046j == 4) {
            c9208c = new C9675a();
            spannable.setSpan(c9208c, i10, i11, 33);
        }
        if (c9681g.m29050n()) {
            C9209d.m27392a(spannable, new C9206a(), i10, i11, 33);
        }
        int m29042f = c9681g.m29042f();
        if (m29042f == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) c9681g.m29041e(), true);
        } else if (m29042f == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(c9681g.m29041e());
        } else if (m29042f != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(c9681g.m29041e() / 100.0f);
        }
        C9209d.m27392a(spannable, absoluteSizeSpan, i10, i11, 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m29020b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m29021c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    private static C9678d m29022d(C9678d c9678d, Map<String, C9681g> map) {
        while (c9678d != null) {
            C9681g m29024f = m29024f(c9678d.f23799f, c9678d.m29017l(), map);
            if (m29024f != null && m29024f.m29046j() == 1) {
                return c9678d;
            }
            c9678d = c9678d.f23803j;
        }
        return null;
    }

    /* renamed from: e */
    private static C9678d m29023e(C9678d c9678d, Map<String, C9681g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c9678d);
        while (!arrayDeque.isEmpty()) {
            C9678d c9678d2 = (C9678d) arrayDeque.pop();
            C9681g m29024f = m29024f(c9678d2.f23799f, c9678d2.m29017l(), map);
            if (m29024f != null && m29024f.m29046j() == 3) {
                return c9678d2;
            }
            for (int m29014g = c9678d2.m29014g() - 1; m29014g >= 0; m29014g--) {
                arrayDeque.push(c9678d2.m29013f(m29014g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C9681g m29024f(C9681g c9681g, String[] strArr, Map<String, C9681g> map) {
        int i10 = 0;
        if (c9681g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C9681g c9681g2 = new C9681g();
                int length = strArr.length;
                while (i10 < length) {
                    c9681g2.m29037a(map.get(strArr[i10]));
                    i10++;
                }
                return c9681g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c9681g.m29037a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    c9681g.m29037a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c9681g;
    }
}
