.class final Lcom/google/android/gms/internal/mlkit_common/zziy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_common/zziy;

.field private static final zzb:Ljd/c;

.field private static final zzc:Ljd/c;

.field private static final zzd:Ljd/c;

.field private static final zze:Ljd/c;

.field private static final zzf:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zziy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zziy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zza:Lcom/google/android/gms/internal/mlkit_common/zziy;

    const-string v0, "durationMs"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zzb:Ljd/c;

    const-string v0, "handledErrors"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zzc:Ljd/c;

    const-string v0, "partiallyHandledErrors"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zzd:Ljd/c;

    const-string v0, "unhandledErrors"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zze:Ljd/c;

    const-string v0, "httpResponseCode"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzbk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzbk;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zziy;->zzf:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zzog;

    check-cast p2, Ljd/e;

    const/4 p1, 0x0

    throw p1
.end method
