package p091f;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import dk.C7031r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: f.b */
/* loaded from: classes.dex */
public class C7256b extends AbstractC7255a<String, List<Uri>> {

    /* renamed from: a */
    public static final a f16256a = new a(null);

    /* renamed from: f.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final List<Uri> m21706a(Intent intent) {
            List<Uri> m20582j;
            C9322n.m27781e(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i10 = 0; i10 < itemCount; i10++) {
                    Uri uri = clipData.getItemAt(i10).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }
    }
}
