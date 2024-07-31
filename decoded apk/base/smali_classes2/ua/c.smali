.class public final Lua/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/google/android/gms/internal/maps/zzi;


# direct methods
.method public static a()Lua/b;
    .locals 2

    :try_start_0
    new-instance v0, Lua/b;

    invoke-static {}, Lua/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/maps/zzi;->zzd()Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static b(F)Lua/b;
    .locals 2

    :try_start_0
    new-instance v0, Lua/b;

    invoke-static {}, Lua/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zze(F)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)Lua/b;
    .locals 2

    const-string v0, "assetName must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lua/b;

    invoke-static {}, Lua/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zzf(Ljava/lang/String;)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static d(Landroid/graphics/Bitmap;)Lua/b;
    .locals 2

    const-string v0, "image must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lua/b;

    invoke-static {}, Lua/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zzg(Landroid/graphics/Bitmap;)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lua/v;

    invoke-direct {v0, p0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static e(Lcom/google/android/gms/internal/maps/zzi;)V
    .locals 1

    sget-object v0, Lua/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "delegate must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/maps/zzi;

    sput-object p0, Lua/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    return-void
.end method

.method private static f()Lcom/google/android/gms/internal/maps/zzi;
    .locals 2

    sget-object v0, Lua/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    const-string v1, "IBitmapDescriptorFactory is not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/maps/zzi;

    return-object v0
.end method
