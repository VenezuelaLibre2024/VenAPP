.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;

.field private static final zzb:Ljd/c;

.field private static final zzc:Ljd/c;

.field private static final zzd:Ljd/c;

.field private static final zze:Ljd/c;

.field private static final zzf:Ljd/c;

.field private static final zzg:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;

    const-string v0, "appName"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzb:Ljd/c;

    const-string v0, "sessionId"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzc:Ljd/c;

    const-string v0, "startZoomLevel"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzd:Ljd/c;

    const-string v0, "endZoomLevel"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zze:Ljd/c;

    const-string v0, "durationMs"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzf:Ljd/c;

    const-string v0, "predictedArea"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzg:Ljd/c;

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

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;

    check-cast p2, Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzb:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzc:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzd:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zzc()Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zze:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zzb()Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzf:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zzd()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzmv;->zzg:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsg;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method
