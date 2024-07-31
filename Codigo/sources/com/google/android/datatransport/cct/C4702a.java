package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p098f6.C7298b;
import p132h6.InterfaceC7637g;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C4702a implements InterfaceC7637g {

    /* renamed from: c */
    static final String f9091c;

    /* renamed from: d */
    static final String f9092d;

    /* renamed from: e */
    private static final String f9093e;

    /* renamed from: f */
    private static final Set<C7298b> f9094f;

    /* renamed from: g */
    public static final C4702a f9095g;

    /* renamed from: h */
    public static final C4702a f9096h;

    /* renamed from: a */
    private final String f9097a;

    /* renamed from: b */
    private final String f9098b;

    static {
        String m11804a = C4706e.m11804a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f9091c = m11804a;
        String m11804a2 = C4706e.m11804a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f9092d = m11804a2;
        String m11804a3 = C4706e.m11804a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f9093e = m11804a3;
        f9094f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C7298b.m21878b("proto"), C7298b.m21878b("json"))));
        f9095g = new C4702a(m11804a, null);
        f9096h = new C4702a(m11804a2, m11804a3);
    }

    public C4702a(String str, String str2) {
        this.f9097a = str;
        this.f9098b = str2;
    }

    /* renamed from: c */
    public static C4702a m11783c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C4702a(str2, str3);
    }

    @Override // p132h6.InterfaceC7637g
    /* renamed from: a */
    public Set<C7298b> mo11784a() {
        return f9094f;
    }

    /* renamed from: b */
    public byte[] m11785b() {
        String str = this.f9098b;
        if (str == null && this.f9097a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f9097a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m11786d() {
        return this.f9098b;
    }

    /* renamed from: e */
    public String m11787e() {
        return this.f9097a;
    }

    @Override // p132h6.InterfaceC7636f
    public byte[] getExtras() {
        return m11785b();
    }

    @Override // p132h6.InterfaceC7636f
    public String getName() {
        return "cct";
    }
}
