.class public final Lcg/f0;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfp;


# static fields
.field private static final zza:Lcg/f0;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Lcg/d0;

.field private zzk:Lcg/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/f0;

    invoke-direct {v0}, Lcg/f0;-><init>()V

    sput-object v0, Lcg/f0;->zza:Lcg/f0;

    const-class v1, Lcg/f0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzU(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcg/f0;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcg/f0;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcg/f0;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcg/f0;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcg/f0;->zzi:Ljava/lang/String;

    return-void
.end method

.method static synthetic c()Lcg/f0;
    .locals 1

    sget-object v0, Lcg/f0;->zza:Lcg/f0;

    return-object v0
.end method

.method public static d()Lcg/f0;
    .locals 1

    sget-object v0, Lcg/f0;->zza:Lcg/f0;

    return-object v0
.end method


# virtual methods
.method public final a()Lcg/d0;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzk:Lcg/d0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/d0;->f()Lcg/d0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final b()Lcg/d0;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzj:Lcg/d0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/d0;->f()Lcg/d0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method protected final zzg(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcg/f0;->zza:Lcg/f0;

    return-object p1

    :cond_1
    new-instance p1, Lcg/e0;

    invoke-direct {p1, p2}, Lcg/e0;-><init>(Lcg/b;)V

    return-object p1

    :cond_2
    new-instance p1, Lcg/f0;

    invoke-direct {p1}, Lcg/f0;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    sget-object p2, Lcg/f0;->zza:Lcg/f0;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1009\u0005\u0007\u1009\u0006"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzR(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfo;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/f0;->zze:Ljava/lang/String;

    return-object v0
.end method
