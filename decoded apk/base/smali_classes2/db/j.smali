.class public final Ldb/j;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfp;


# static fields
.field private static final zza:Ldb/j;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

.field private zzg:I

.field private zzh:F

.field private zzi:F

.field private zzj:Ldb/g;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzei;

.field private zzl:I

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzht;

.field private zzn:I

.field private zzo:I

.field private zzp:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldb/j;

    invoke-direct {v0}, Ldb/j;-><init>()V

    sput-object v0, Ldb/j;->zza:Ldb/j;

    const-class v1, Ldb/j;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzU(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ldb/j;->zze:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    iput-object v0, p0, Ldb/j;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    const/16 v0, 0xa

    iput v0, p0, Ldb/j;->zzg:I

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Ldb/j;->zzh:F

    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, Ldb/j;->zzi:F

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzL()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzei;

    move-result-object v0

    iput-object v0, p0, Ldb/j;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzei;

    const/4 v0, 0x1

    iput v0, p0, Ldb/j;->zzl:I

    const/16 v0, 0x140

    iput v0, p0, Ldb/j;->zzn:I

    const/4 v0, 0x4

    iput v0, p0, Ldb/j;->zzo:I

    const/4 v0, 0x2

    iput v0, p0, Ldb/j;->zzp:I

    return-void
.end method

.method public static a()Ldb/i;
    .locals 1

    sget-object v0, Ldb/j;->zza:Ldb/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzF()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdx;

    move-result-object v0

    check-cast v0, Ldb/i;

    return-object v0
.end method

.method static synthetic b()Ldb/j;
    .locals 1

    sget-object v0, Ldb/j;->zza:Ldb/j;

    return-object v0
.end method

.method static synthetic c(Ldb/j;Ldb/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ldb/j;->zzj:Ldb/g;

    iget p1, p0, Ldb/j;->zzd:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ldb/j;->zzd:I

    return-void
.end method

.method static synthetic d(Ldb/j;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Ldb/j;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldb/j;->zzd:I

    iput-object p1, p0, Ldb/j;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    return-void
.end method


# virtual methods
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
    sget-object p1, Ldb/j;->zza:Ldb/j;

    return-object p1

    :cond_1
    new-instance p1, Ldb/i;

    invoke-direct {p1, p2}, Ldb/i;-><init>(Ldb/h;)V

    return-object p1

    :cond_2
    new-instance p1, Ldb/j;

    invoke-direct {p1}, Ldb/j;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

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

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzp"

    aput-object p3, p1, p2

    sget-object p2, Ldb/j;->zza:Ldb/j;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u100b\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1009\u0005\u0007\u0013\u0008\u1004\u0006\t\u1009\u0007\n\u1004\u0008\u000b\u1004\t\u000c\u1004\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzR(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfo;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
