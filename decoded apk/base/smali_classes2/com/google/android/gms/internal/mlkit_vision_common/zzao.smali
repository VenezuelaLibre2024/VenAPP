.class final Lcom/google/android/gms/internal/mlkit_vision_common/zzao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/g;


# instance fields
.field private zza:Z

.field private zzb:Z

.field private zzc:Ljd/c;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_common/zzak;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zza:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    return-void
.end method

.method private final zzb()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zza:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zza:Z

    return-void

    :cond_0
    new-instance v0, Ljd/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(D)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zza(Ljd/c;DZ)Ljd/e;

    return-object p0
.end method

.method public final add(F)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zzb(Ljd/c;FZ)Ljd/e;

    return-object p0
.end method

.method public final add(I)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zzd(Ljd/c;IZ)Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    return-object p0
.end method

.method public final add(J)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zze(Ljd/c;JZ)Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    return-object p0
.end method

.method public final add(Ljava/lang/String;)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zzc(Ljd/c;Ljava/lang/Object;Z)Ljd/e;

    return-object p0
.end method

.method public final add(Z)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zzd(Ljd/c;IZ)Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    return-object p0
.end method

.method public final add([B)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzak;->zzc(Ljd/c;Ljava/lang/Object;Z)Ljd/e;

    return-object p0
.end method

.method final zza(Ljd/c;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zza:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzc:Ljd/c;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzao;->zzb:Z

    return-void
.end method
