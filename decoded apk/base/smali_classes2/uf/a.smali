.class public final enum Luf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Luf/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ENTITY_EXTRACTION:Luf/a;

.field public static final enum IMAGE_CAPTIONING:Luf/a;

.field public static final enum TOXICITY_DETECTION:Luf/a;

.field public static final enum TRANSLATE:Luf/a;

.field public static final enum zza:Luf/a;

.field public static final enum zzb:Luf/a;

.field private static final synthetic zzc:[Luf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Luf/a;

    const-string v1, "FACE_DETECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luf/a;->zza:Luf/a;

    new-instance v1, Luf/a;

    const-string v3, "SMART_REPLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Luf/a;->zzb:Luf/a;

    new-instance v3, Luf/a;

    const-string v5, "TRANSLATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Luf/a;->TRANSLATE:Luf/a;

    new-instance v5, Luf/a;

    const-string v7, "ENTITY_EXTRACTION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Luf/a;->ENTITY_EXTRACTION:Luf/a;

    new-instance v7, Luf/a;

    const-string v9, "TOXICITY_DETECTION"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Luf/a;->TOXICITY_DETECTION:Luf/a;

    new-instance v9, Luf/a;

    const-string v11, "IMAGE_CAPTIONING"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Luf/a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Luf/a;->IMAGE_CAPTIONING:Luf/a;

    const/4 v11, 0x6

    new-array v11, v11, [Luf/a;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Luf/a;->zzc:[Luf/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Luf/a;
    .locals 1

    sget-object v0, Luf/a;->zzc:[Luf/a;

    invoke-virtual {v0}, [Luf/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Luf/a;

    return-object v0
.end method
