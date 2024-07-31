.class public final Lua/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/maps/zzam;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/maps/zzam;

    iput-object p1, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzh()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzo()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzg()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzd()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public e()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zze()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lua/b0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    check-cast p1, Lua/b0;

    iget-object p1, p1, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzam;->zzn(Lcom/google/android/gms/internal/maps/zzam;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public f()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzp()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public g()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzi()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public h(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzam;->zzj(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0}, Lcom/google/android/gms/internal/maps/zzam;->zzf()I

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public i(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzam;->zzk(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzam;->zzl(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lua/b0;->a:Lcom/google/android/gms/internal/maps/zzam;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/maps/zzam;->zzm(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
