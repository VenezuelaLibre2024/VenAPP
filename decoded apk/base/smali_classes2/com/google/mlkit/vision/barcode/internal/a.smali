.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zztw;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/a;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/a;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;-><init>()V

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/b;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    :goto_0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqa;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqa;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqa;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqa;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqc;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqc;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;

    move-result-object v0

    return-object v0
.end method
