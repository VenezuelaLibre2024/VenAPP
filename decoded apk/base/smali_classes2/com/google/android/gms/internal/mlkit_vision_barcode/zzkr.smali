.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;

.field private static final zzb:Ljd/c;

.field private static final zzc:Ljd/c;

.field private static final zzd:Ljd/c;

.field private static final zze:Ljd/c;

.field private static final zzf:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;

    const-string v0, "inferenceCommonLogEvent"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzb:Ljd/c;

    const-string v0, "options"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzc:Ljd/c;

    const-string v0, "detectedBarcodeFormats"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzd:Ljd/c;

    const-string v0, "detectedBarcodeValueTypes"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zze:Ljd/c;

    const-string v0, "imageInfo"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzf:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;

    check-cast p2, Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzb:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzc:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;->zze()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzd:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zze:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzkr;->zzf:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpz;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzos;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method
