.class public final Lcom/google/android/play/integrity/internal/s;
.super Lcom/google/android/play/integrity/internal/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/integrity/internal/u;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-direct {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final E1(Landroid/os/Bundle;Lcom/google/android/play/integrity/internal/w;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/play/integrity/internal/a;->f2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/play/integrity/internal/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;->g2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final L1(Landroid/os/Bundle;Lcom/google/android/play/integrity/internal/w;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/play/integrity/internal/a;->f2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/play/integrity/internal/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;->g2(ILandroid/os/Parcel;)V

    return-void
.end method