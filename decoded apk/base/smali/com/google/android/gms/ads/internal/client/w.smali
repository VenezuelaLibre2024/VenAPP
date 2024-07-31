.class abstract Lcom/google/android/gms/ads/internal/client/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/ads/internal/client/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Lcom/google/android/gms/ads/internal/client/v;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "com.google.android.gms.ads.internal.ClientApi"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/os/IBinder;

    if-nez v2, :cond_0

    const-string v1, "ClientApi class is not an instance of IBinder."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    check-cast v1, Landroid/os/IBinder;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "com.google.android.gms.ads.internal.client.IClientApi"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/ads/internal/client/f1;

    if-eqz v3, :cond_2

    check-cast v2, Lcom/google/android/gms/ads/internal/client/f1;

    :goto_0
    move-object v0, v2

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/google/android/gms/ads/internal/client/d1;

    invoke-direct {v2, v1}, Lcom/google/android/gms/ads/internal/client/d1;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "Failed to instantiate ClientApi class."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    :goto_1
    sput-object v0, Lcom/google/android/gms/ads/internal/client/w;->a:Lcom/google/android/gms/ads/internal/client/f1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/google/android/gms/ads/internal/client/w;->a:Lcom/google/android/gms/ads/internal/client/f1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/client/w;->b(Lcom/google/android/gms/ads/internal/client/f1;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Cannot invoke local loader using ClientApi class."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    const-string v0, "ClientApi class cannot be loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    return-object v1
.end method

.method private final f()Ljava/lang/Object;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/w;->c()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Cannot invoke remote loader."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
.end method

.method protected abstract b(Lcom/google/android/gms/ads/internal/client/f1;)Ljava/lang/Object;
.end method

.method protected abstract c()Ljava/lang/Object;
.end method

.method public final d(Landroid/content/Context;Z)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x1

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    const v1, 0xbdfcb8

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzcdv;->zzs(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    const-string p2, "Google Play Services is not available."

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzcec;->zze(Ljava/lang/String;)V

    move p2, v0

    :cond_0
    const-string v1, "com.google.android.gms.ads.dynamite"

    invoke-static {p1, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {p1, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x0

    if-le v2, v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    xor-int/2addr v1, v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhv;->zza:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    move p2, v3

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhv;->zzb:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    move p2, v0

    move v3, p2

    goto :goto_1

    :cond_3
    or-int/2addr p2, v1

    move v8, v3

    move v3, p2

    move p2, v8

    :goto_1
    if-eqz v3, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w;->e()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_7

    if-nez p2, :cond_7

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w;->f()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_5

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbij;->zza:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->e()Ljava/util/Random;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    if-nez v1, :cond_5

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v1, "action"

    const-string v2, "dynamite_load"

    invoke-virtual {v6, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "is_missing"

    invoke-virtual {v6, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->c()Lcom/google/android/gms/internal/ads/zzcei;

    move-result-object v0

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzcei;->zza:Ljava/lang/String;

    const-string v5, "gmob-apps"

    const/4 v7, 0x1

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzcdv;->zzn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    :cond_5
    if-nez p2, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w;->e()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_6
    move-object p1, p2

    :cond_7
    :goto_2
    if-nez p1, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/w;->a()Ljava/lang/Object;

    move-result-object p1

    :cond_8
    return-object p1
.end method