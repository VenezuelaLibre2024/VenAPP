.class final Lcom/google/android/recaptcha/internal/zzih;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/recaptcha/internal/zzih;


# instance fields
.field private final zzc:Lcom/google/android/recaptcha/internal/zzim;

.field private final zzd:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzih;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzih;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzih;->zzb:Lcom/google/android/recaptcha/internal/zzih;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzih;->zzd:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzhq;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzhq;-><init>()V

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzih;->zzc:Lcom/google/android/recaptcha/internal/zzim;

    return-void
.end method

.method public static zza()Lcom/google/android/recaptcha/internal/zzih;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzih;->zzb:Lcom/google/android/recaptcha/internal/zzih;

    return-object v0
.end method


# virtual methods
.method public final zzb(Ljava/lang/Class;)Lcom/google/android/recaptcha/internal/zzil;
    .locals 2

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/android/recaptcha/internal/zzgw;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzih;->zzd:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzil;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzih;->zzc:Lcom/google/android/recaptcha/internal/zzim;

    invoke-interface {v1, p1}, Lcom/google/android/recaptcha/internal/zzim;->zza(Ljava/lang/Class;)Lcom/google/android/recaptcha/internal/zzil;

    move-result-object v1

    invoke-static {p1, v0}, Lcom/google/android/recaptcha/internal/zzgw;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzgw;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzih;->zzd:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzil;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method
