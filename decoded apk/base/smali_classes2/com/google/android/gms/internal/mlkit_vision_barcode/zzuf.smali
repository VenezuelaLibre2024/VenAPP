.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zztn;


# instance fields
.field private zza:Lee/b;

.field private final zzb:Lee/b;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;

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

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuc;-><init>(Lf6/g;)V

    invoke-direct {p2, v0}, Lpc/w;-><init>(Lee/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zza:Lee/b;

    :cond_0
    new-instance p2, Lpc/w;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzud;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzud;-><init>(Lf6/g;)V

    invoke-direct {p2, v0}, Lpc/w;-><init>(Lee/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzb:Lee/b;

    return-void
.end method

.method static zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;)Lf6/c;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;->zza()I

    move-result p0

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;->zza()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p1, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;->zze(IZ)[B

    move-result-object p0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lf6/c;->d(Ljava/lang/Object;)Lf6/c;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lf6/c;->e(Ljava/lang/Object;)Lf6/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;->zza()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zza:Lee/b;

    if-eqz v0, :cond_0

    :goto_0
    invoke-interface {v0}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;)Lf6/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lf6/f;->b(Lf6/c;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuf;->zzb:Lee/b;

    goto :goto_0
.end method
