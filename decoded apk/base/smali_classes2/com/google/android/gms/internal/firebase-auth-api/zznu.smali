.class public final Lcom/google/android/gms/internal/firebase-auth-api/zznu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zznu;


# instance fields
.field private final zzb:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/firebase-auth-api/zznu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)Lcom/google/android/gms/internal/firebase-auth-api/zzbt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzov;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zznd;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzov;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzov;)Lcom/google/android/gms/internal/firebase-auth-api/zzch;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(TSerializationT;)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzch;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzov;)Lcom/google/android/gms/internal/firebase-auth-api/zzch;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzch;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzov;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzch;",
            "SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(TParametersT;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzch;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzov;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmu;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzmu<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmu;)Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbt;",
            "SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzmx<",
            "TKeyT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmx;)Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zznv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zznv<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznv;)Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zznz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzch;",
            "SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zznz<",
            "TParametersT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznz;)Lcom/google/android/gms/internal/firebase-auth-api/zzox;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzox;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzov;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzov;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzov;)Z

    move-result p1

    return p1
.end method
