.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljd/e;

    sget p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;->zza:I

    new-instance p2, Ljd/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Couldn\'t find encoder for type "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw p2
.end method