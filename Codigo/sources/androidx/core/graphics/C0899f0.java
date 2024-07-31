package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import java.io.IOException;

/* renamed from: androidx.core.graphics.f0 */
/* loaded from: classes.dex */
public class C0899f0 extends C0901g0 {
    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.fonts.Font m4573h(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L13
            r7 = r3
            goto L14
        L13:
            r7 = r2
        L14:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = androidx.core.graphics.C0914s.m4640a(r6, r2)
            android.graphics.fonts.FontStyle r1 = androidx.core.graphics.C0881c0.m4497a(r7)
            int r1 = m4574i(r0, r1)
        L23:
            int r2 = androidx.core.graphics.C0915t.m4641a(r6)
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = androidx.core.graphics.C0914s.m4640a(r6, r3)
            android.graphics.fonts.FontStyle r4 = androidx.core.graphics.C0881c0.m4497a(r2)
            int r4 = m4574i(r0, r4)
            if (r4 >= r1) goto L39
            r7 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0899f0.m4573h(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    /* renamed from: i */
    private static int m4574i(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: a */
    public Typeface mo4575a(Context context, C0869d.c cVar, Resources resources, int i10) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (C0869d.d dVar : cVar.m4436a()) {
                try {
                    weight = new Font.Builder(resources, dVar.m4438b()).setWeight(dVar.m4441e());
                    slant = weight.setSlant(dVar.m4442f() ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(dVar.m4439c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(dVar.m4440d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m4573h(build, i10).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: b */
    public Typeface mo4576b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0961g.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m4778d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(bVar.m4779e());
                        slant = weight.setSlant(bVar.m4780f() ? 1 : 0);
                        ttcIndex = slant.setTtcIndex(bVar.m4777c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m4573h(build, i10).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: d */
    public Typeface mo4577d(Context context, Resources resources, int i10, String str, int i11) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i10).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0901g0
    /* renamed from: g */
    public C0961g.b mo4578g(C0961g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
