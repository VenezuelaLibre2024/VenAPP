package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f20160f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f20161g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f20162a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f20163b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f20164c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f20165d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f20166e;

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class HandlerC0316a extends Handler {
        HandlerC0316a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f20168a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f20169b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f20168a = intent;
            this.f20169b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f20170a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f20171b;

        /* renamed from: c, reason: collision with root package name */
        boolean f20172c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20173d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f20170a = intentFilter;
            this.f20171b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
            sb2.append("Receiver{");
            sb2.append(this.f20171b);
            sb2.append(" filter=");
            sb2.append(this.f20170a);
            if (this.f20173d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f20162a = context;
        this.f20166e = new HandlerC0316a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f20160f) {
            if (f20161g == null) {
                f20161g = new a(context.getApplicationContext());
            }
            aVar = f20161g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f20163b) {
                size = this.f20165d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f20165d.toArray(bVarArr);
                this.f20165d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f20169b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f20169b.get(i11);
                    if (!cVar.f20173d) {
                        cVar.f20171b.onReceive(this.f20162a, bVar.f20168a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f20163b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f20163b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f20163b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f20164c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f20164c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f20163b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f20162a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f20164c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f20170a);
                    }
                    if (cVar.f20172c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f20170a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f20172c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f20172c = false;
                    }
                    this.f20165d.add(new b(intent, arrayList5));
                    if (!this.f20166e.hasMessages(1)) {
                        this.f20166e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f20163b) {
            ArrayList<c> remove = this.f20163b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f20173d = true;
                for (int i10 = 0; i10 < cVar.f20170a.countActions(); i10++) {
                    String action = cVar.f20170a.getAction(i10);
                    ArrayList<c> arrayList = this.f20164c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f20171b == broadcastReceiver) {
                                cVar2.f20173d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f20164c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
