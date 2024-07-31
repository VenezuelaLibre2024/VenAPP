package p236m8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7149e;
import p120g8.AbstractC7490h;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11173s;
import p363t8.C11175t;

/* renamed from: m8.a */
/* loaded from: classes.dex */
public final class C9552a extends AbstractC7490h {

    /* renamed from: q */
    private static final Pattern f23249q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f23250r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f23251o;

    /* renamed from: p */
    private final ArrayList<String> f23252p;

    public C9552a() {
        super("SubripDecoder");
        this.f23251o = new StringBuilder();
        this.f23252p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: B */
    private C7484b m28439B(Spanned spanned, String str) {
        char c10;
        char c11;
        C7484b.b m22778o = new C7484b.b().m22778o(spanned);
        if (str == null) {
            return m22778o.m22764a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            m22778o.m22775l(0);
        } else if (c10 == 3 || c10 == 4 || c10 == 5) {
            m22778o.m22775l(2);
        } else {
            m22778o.m22775l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            m22778o.m22772i(2);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            m22778o.m22772i(0);
        } else {
            m22778o.m22772i(1);
        }
        return m22778o.m22774k(m28441D(m22778o.m22767d())).m22771h(m28441D(m22778o.m22766c()), 0).m22764a();
    }

    /* renamed from: C */
    private Charset m28440C(C11146e0 c11146e0) {
        Charset m34672P = c11146e0.m34672P();
        return m34672P != null ? m34672P : C7149e.f16019c;
    }

    /* renamed from: D */
    static float m28441D(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    private static long m28442E(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) C11137a.m34603e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) C11137a.m34603e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: F */
    private String m28443F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f23250r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        C11175t c11175t = new C11175t();
        C11146e0 c11146e0 = new C11146e0(bArr, i10);
        Charset m28440C = m28440C(c11146e0);
        while (true) {
            String m34695t = c11146e0.m34695t(m28440C);
            int i11 = 0;
            if (m34695t == null) {
                break;
            }
            if (m34695t.length() != 0) {
                try {
                    Integer.parseInt(m34695t);
                    m34695t = c11146e0.m34695t(m28440C);
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (m34695t == null) {
                    C11173s.m34970i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f23249q.matcher(m34695t);
                if (matcher.matches()) {
                    c11175t.m34984a(m28442E(matcher, 1));
                    c11175t.m34984a(m28442E(matcher, 6));
                    this.f23251o.setLength(0);
                    this.f23252p.clear();
                    while (true) {
                        String m34695t2 = c11146e0.m34695t(m28440C);
                        if (TextUtils.isEmpty(m34695t2)) {
                            break;
                        }
                        if (this.f23251o.length() > 0) {
                            this.f23251o.append("<br>");
                        }
                        this.f23251o.append(m28443F(m34695t2, this.f23252p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f23251o.toString());
                    while (true) {
                        if (i11 >= this.f23252p.size()) {
                            str2 = null;
                            break;
                        }
                        str2 = this.f23252p.get(i11);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        i11++;
                    }
                    arrayList.add(m28439B(fromHtml, str2));
                    arrayList.add(C7484b.f17635C);
                } else {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb2.append(str);
                    sb2.append(m34695t);
                    C11173s.m34970i("SubripDecoder", sb2.toString());
                }
            }
        }
        return new C9553b((C7484b[]) arrayList.toArray(new C7484b[0]), c11175t.m34987d());
    }
}
