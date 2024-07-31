.class public Lx8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/ads/internal/client/q0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    invoke-virtual {v1, p1, p2, v2}, Lcom/google/android/gms/ads/internal/client/v;->c(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;)Lcom/google/android/gms/ads/internal/client/q0;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx8/g$a;->a:Landroid/content/Context;

    iput-object p1, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    return-void
.end method


# virtual methods
.method public a()Lx8/g;
    .locals 4

    :try_start_0
    new-instance v0, Lx8/g;

    iget-object v1, p0, Lx8/g$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    invoke-interface {v2}, Lcom/google/android/gms/ads/internal/client/q0;->zze()Lcom/google/android/gms/ads/internal/client/n0;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    invoke-direct {v0, v1, v2, v3}, Lx8/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/n0;Lcom/google/android/gms/ads/internal/client/y4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to build AdLoader."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/x3;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/x3;-><init>()V

    iget-object v1, p0, Lx8/g$a;->a:Landroid/content/Context;

    new-instance v2, Lx8/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/x3;->g2()Lcom/google/android/gms/ads/internal/client/n0;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    invoke-direct {v2, v1, v0, v3}, Lx8/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/n0;Lcom/google/android/gms/ads/internal/client/y4;)V

    return-object v2
.end method

.method public b(Lcom/google/android/gms/ads/nativead/b$c;)Lx8/g$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbwi;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzbwi;-><init>(Lcom/google/android/gms/ads/nativead/b$c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/q0;->zzk(Lcom/google/android/gms/internal/ads/zzbla;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add google native ad listener"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public c(Lx8/e;)Lx8/g$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/p4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/p4;-><init>(Lx8/e;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/q0;->zzl(Lcom/google/android/gms/ads/internal/client/h0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to set AdListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public d(Lcom/google/android/gms/ads/nativead/c;)Lx8/g$a;
    .locals 14

    :try_start_0
    iget-object v0, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    new-instance v13, Lcom/google/android/gms/internal/ads/zzbjb;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->e()Z

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->d()Z

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->a()I

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->c()Lx8/c0;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/n4;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->c()Lx8/c0;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/n4;-><init>(Lx8/c0;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v7, v1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->h()Z

    move-result v8

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->b()I

    move-result v9

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->f()I

    move-result v10

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->g()Z

    move-result v11

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->i()I

    move-result p1

    add-int/lit8 v12, p1, -0x1

    const/4 v2, 0x4

    const/4 v4, -0x1

    move-object v1, v13

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/zzbjb;-><init>(IZIZILcom/google/android/gms/ads/internal/client/n4;ZIIZI)V

    invoke-interface {v0, v13}, Lcom/google/android/gms/ads/internal/client/q0;->zzo(Lcom/google/android/gms/internal/ads/zzbjb;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "Failed to specify native ad options"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object p0
.end method

.method public final e(Ljava/lang/String;La9/n;La9/m;)Lx8/g$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzblr;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/ads/zzblr;-><init>(La9/n;La9/m;)V

    :try_start_0
    iget-object p2, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzblr;->zzd()Lcom/google/android/gms/internal/ads/zzbkt;

    move-result-object p3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzblr;->zzc()Lcom/google/android/gms/internal/ads/zzbkq;

    move-result-object v0

    invoke-interface {p2, p1, p3, v0}, Lcom/google/android/gms/ads/internal/client/q0;->zzh(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbkt;Lcom/google/android/gms/internal/ads/zzbkq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to add custom template ad listener"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public final f(La9/p;)Lx8/g$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzblu;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzblu;-><init>(La9/p;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/q0;->zzk(Lcom/google/android/gms/internal/ads/zzbla;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add google native ad listener"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public final g(La9/e;)Lx8/g$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lx8/g$a;->b:Lcom/google/android/gms/ads/internal/client/q0;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbjb;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzbjb;-><init>(La9/e;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/q0;->zzo(Lcom/google/android/gms/internal/ads/zzbjb;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to specify native ad options"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method
