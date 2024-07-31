.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeu;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;

.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeu;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    return-void
.end method


# virtual methods
.method final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    move-result-object v0

    return-object v0
.end method

.method final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final zzc(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzl(Ljava/lang/Throwable;)Z

    return-void
.end method

.method final synthetic zzd(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzm(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;)Z

    return-void
.end method

.method final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzey;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->isDone()Z

    move-result v0

    return v0
.end method
