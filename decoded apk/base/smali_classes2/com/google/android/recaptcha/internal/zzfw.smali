.class public final Lcom/google/android/recaptcha/internal/zzfw;
.super Lcom/google/android/recaptcha/internal/zzgo;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzhz;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzfw;


# instance fields
.field private zzd:J

.field private zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzfw;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzfw;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lcom/google/android/recaptcha/internal/zzfw;

    const-class v1, Lcom/google/android/recaptcha/internal/zzfw;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzgo;->zzC(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzgo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzgo;-><init>()V

    return-void
.end method

.method public static zzi()Lcom/google/android/recaptcha/internal/zzfv;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lcom/google/android/recaptcha/internal/zzfw;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgo;->zzp()Lcom/google/android/recaptcha/internal/zzgi;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzfv;

    return-object v0
.end method

.method static synthetic zzj()Lcom/google/android/recaptcha/internal/zzfw;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lcom/google/android/recaptcha/internal/zzfw;

    return-object v0
.end method

.method static synthetic zzk(Lcom/google/android/recaptcha/internal/zzfw;J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/recaptcha/internal/zzfw;->zzd:J

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/recaptcha/internal/zzfw;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzfw;->zze:I

    return-void
.end method


# virtual methods
.method public final zzf()I
    .locals 1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzfw;->zze:I

    return v0
.end method

.method public final zzg()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/recaptcha/internal/zzfw;->zzd:J

    return-wide v0
.end method

.method protected final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lcom/google/android/recaptcha/internal/zzfw;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzfv;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzfv;-><init>(Lcom/google/android/recaptcha/internal/zzfu;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/recaptcha/internal/zzfw;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzfw;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lcom/google/android/recaptcha/internal/zzfw;

    new-instance p3, Lcom/google/android/recaptcha/internal/zzij;

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004"

    invoke-direct {p3, p2, v0, p1}, Lcom/google/android/recaptcha/internal/zzij;-><init>(Lcom/google/android/recaptcha/internal/zzhy;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
