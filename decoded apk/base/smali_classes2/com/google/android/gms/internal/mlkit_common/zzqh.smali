.class public final Lcom/google/android/gms/internal/mlkit_common/zzqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_common/zzpr;


# instance fields
.field private zza:Lee/b;

.field private final zzb:Lee/b;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_common/zzpt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_common/zzpt;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzpt;

    sget-object p2, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-static {p1}, Lh6/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p1

    invoke-virtual {p1, p2}, Lh6/u;->g(Lh6/f;)Lf6/g;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/datatransport/cct/a;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lpc/w;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzqe;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqe;-><init>(Lf6/g;)V

    invoke-direct {p2, v0}, Lpc/w;-><init>(Lee/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zza:Lee/b;

    :cond_0
    new-instance p2, Lpc/w;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzqf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqf;-><init>(Lf6/g;)V

    invoke-direct {p2, v0}, Lpc/w;-><init>(Lee/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzb:Lee/b;

    return-void
.end method

.method static zzb(Lcom/google/android/gms/internal/mlkit_common/zzpt;Lcom/google/android/gms/internal/mlkit_common/zzpq;)Lf6/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_common/zzpt;->zza()I

    move-result p0

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lcom/google/android/gms/internal/mlkit_common/zzpq;->zze(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lf6/c;->e(Ljava/lang/Object;)Lf6/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_common/zzpq;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzpt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzpt;->zza()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zza:Lee/b;

    if-eqz v0, :cond_0

    :goto_0
    invoke-interface {v0}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzpt;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzpt;Lcom/google/android/gms/internal/mlkit_common/zzpq;)Lf6/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lf6/f;->b(Lf6/c;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzqh;->zzb:Lee/b;

    goto :goto_0
.end method
