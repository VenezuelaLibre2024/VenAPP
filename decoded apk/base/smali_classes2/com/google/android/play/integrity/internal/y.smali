.class public abstract Lcom/google/android/play/integrity/internal/y;
.super Lcom/google/android/play/integrity/internal/n;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/integrity/internal/z;


# direct methods
.method public static f2(Landroid/os/IBinder;)Lcom/google/android/play/integrity/internal/z;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/play/integrity/internal/z;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/play/integrity/internal/z;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/play/integrity/internal/x;

    invoke-direct {v0, p0}, Lcom/google/android/play/integrity/internal/x;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method