.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;

.field private static final zzb:Ljd/c;

.field private static final zzc:Ljd/c;

.field private static final zzd:Ljd/c;

.field private static final zze:Ljd/c;

.field private static final zzf:Ljd/c;

.field private static final zzg:Ljd/c;

.field private static final zzh:Ljd/c;

.field private static final zzi:Ljd/c;

.field private static final zzj:Ljd/c;

.field private static final zzk:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;

    const-string v0, "durationMs"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzb:Ljd/c;

    const-string v0, "errorCode"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzc:Ljd/c;

    const-string v0, "isColdCall"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzd:Ljd/c;

    const-string v0, "autoManageModelOnBackground"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zze:Ljd/c;

    const-string v0, "autoManageModelOnLowMemory"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzf:Ljd/c;

    const-string v0, "isNnApiEnabled"

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

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzg:Ljd/c;

    const-string v0, "eventsCount"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzh:Ljd/c;

    const-string v0, "otherErrors"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzi:Ljd/c;

    const-string v0, "remoteConfigValueForAcceleration"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzj:Ljd/c;

    const-string v0, "isAccelerated"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzk:Ljd/c;

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

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;

    check-cast p2, Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzb:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;->zze()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzc:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzd:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;->zzd()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zze:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;->zzb()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzf:Ljd/c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzoy;->zzc()Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzg:Ljd/c;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzh:Ljd/c;

    invoke-interface {p2, p1, v0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzi:Ljd/c;

    invoke-interface {p2, p1, v0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzj:Ljd/c;

    invoke-interface {p2, p1, v0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzjw;->zzk:Ljd/c;

    invoke-interface {p2, p1, v0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method
