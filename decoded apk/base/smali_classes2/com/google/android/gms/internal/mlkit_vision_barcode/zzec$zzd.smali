.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;


# instance fields
.field next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

.field final zzb:Ljava/lang/Runnable;

.field final zzc:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzb:Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzc:Ljava/util/concurrent/Executor;

    return-void
.end method

.method constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzb:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzc:Ljava/util/concurrent/Executor;

    return-void
.end method
