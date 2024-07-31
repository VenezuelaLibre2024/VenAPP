package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private zzbwt f8599a;

    private final void a() {
        zzbwt zzbwtVar = this.f8599a;
        if (zzbwtVar != null) {
            try {
                zzbwtVar.zzx();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                if (!zzbwtVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbwt zzbwtVar2 = this.f8599a;
            if (zzbwtVar2 != null) {
                zzbwtVar2.zzi();
            }
        } catch (RemoteException e11) {
            zzcec.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzk(d.h2(configuration));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbwt m10 = x.a().m(this);
        this.f8599a = m10;
        if (m10 != null) {
            try {
                m10.zzl(bundle);
                return;
            } catch (RemoteException e10) {
                e = e10;
            }
        } else {
            e = null;
        }
        zzcec.zzl("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzm();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzo();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzq();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzr();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzs(bundle);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzt();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzu();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbwt zzbwtVar = this.f8599a;
            if (zzbwtVar != null) {
                zzbwtVar.zzv();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
